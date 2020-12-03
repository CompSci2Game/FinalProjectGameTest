package finprojgamecodetest1;

import java.util.Scanner;
import java.util.Random;

public class maingamecode {

	public static void main(String[] args) {
		
		// System Objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		// Game Variables
		String [] enemies = { "Giant Spider", "Skeleton", "Werewolf", "Vampire", "Wild Beast", "Minatour", "Bandit" };
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;
		
		// Player Variables
		int health =  100;
		int attackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 30; // Percentage
		
		// Condition for running game
		boolean running = true;
		
		// Introduction Statement to Game
		System.out.println("Welcome to The Dark Forest");
		
		// Main Game Mechanics
		GAME:
		while(running) {
			System.out.println("----------------------------------------------------------");
			
			// Enemy Mech: Random enemy appears with random stats
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " appeared! #\n");
			//				# Skeleton has appeared! #
			
			// Combat Mech: Player chooses action/response after an enemy appears.
			while(enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat Would you like to do?");
				System.out.println("\t1. Attack!");
				System.out.println("\t2. Drink health potion.");
				System.out.println("\t3. Run!");
				
				String input = in.nextLine();
				
				// Combat Mech 1: Player chooses to attack enemy
				if (input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
					System.out.println("\t> You recieve " + damageTaken + " in retaliation!");
					
					// Combat Mech 1.a: Player's health becomes 0, breaks to Exit Mech
					if (health < 1) {
						System.out.println("\t> You have taken too much damage, you are too weak to go on!");
						break;
					}
				}
				
				// Combat Mech 2: Player heals with potion and remaining potion count is displayed
				else if (input.equals("2")) {
					 if (numHealthPotions > 0) {
						 health += healthPotionHealAmount;
						 numHealthPotions--;
						 System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount
								 			+ "\n\t> You now have " + health + " HP."
								 			+ "\n\t> You have " + numHealthPotions + " health potions left.\n");
					 }
				}
				
				// Combat Mech 3: Player runs away from enemy
				else if (input.equals("3")) {
					System.out.println("\tYou run away from the " + enemy + " !");
					continue GAME;
				}
				
				// Input Cleanser
				else {
					System.out.println("\tInvalid Command!");
				}
			}
			
			// Exit Mech: Player's health is 0, game ends.
			if (health < 1) {
				System.out.println("You limp out of The Dark Forest, weak from battle.");
				break;
			}
			
			// Combat Mech 1.b: Player defeats enemy, health is displayed, possibility potions will be dropped
			System.out.println("----------------------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! # ");
			System.out.println(" # You have " + health + " HP left. #");
			if (rand.nextInt(100) < healthPotionDropChance) {
				numHealthPotions++;
				System.out.println(" # The " + enemy + " dropped a health potion! # ");
				System.out.println(" # You now have " + numHealthPotions + " health potions(s). # ");
			}
			
			// Story Mech: Player is given the option to continue or exit game.
			System.out.println("----------------------------------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1. Continue fighting.");
			System.out.println("2. Exit The Dark Forest.");
		
			String input = in.nextLine();
			
			while(!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid Command!");
				input = in.nextLine();
			}
		
			if (input.equals("1")) {
				System.out.println("You continue on your adventure!");
			}
			else if (input.equals("2")) {
				System.out.println("You exit The Dark Forest, successful from your adventures!");
				break;
			}
		}
		
		// Exit Mech: Final game message displayed
		System.out.println("#######################");
		System.out.println("# Thanks for playing! #");
		System.out.println("#######################");

	}

}
