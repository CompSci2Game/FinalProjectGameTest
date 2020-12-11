package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

	public class fxcontroller {

	    @FXML
	    private AnchorPane Form1MainGame;

	    @FXML
	    private ImageView chapterImage;

	    @FXML
	    private Button nextbutton;

	    @FXML
	    void onClick(ActionEvent event) {

	    }

    
    @FXML
    public void initialize() {
        
    	Chapterclass chapter1 = new Chapterclass();
    	chapter1.ImageBackg = "@../FinalPrjctImages/1.Background.png";
    	chapter1.ImageFrame = "@../FinalPrjctImages/1.Frame.png";
    	
    	String[] storyline1 = new String[20];
    	
    	storyline1[0] = "Your eyes slowly peel open to a ray of sunshine blinding you.";
    	storyline1[1] = "You: *yawn*";
    	storyline1[2] = "You: “Welp, time to get ready, got a big day ahead of me.”";
    	storyline1[3] = "You: “Ok, I said I’d pick Dominique and Albert up by 10:00am, I should get going.”";
    	storyline1[4] = "You arrive at Dominique’s house where Albert and her are staying.";
    	storyline1[5] = "They emerge carrying all their camping gear with big smiles on their faces. ";
    	storyline1[6] = "Dominique: “You ready to get this started!?”";
    	storyline1[7] = "Albert: “How’re you doin buddy? It’s been so long!”";
    	storyline1[8] = "After introductions, you all pile in your car and start driving to the edge of town.";
    	storyline1[9] = "You: “Hey I need to get gas at the station, one more stop before we leave town.”";
    	storyline1[10] = "Albert: “Yes that’s a good idea, I should get a snack and another lighter.”";
    	storyline1[11] = "You: “Oh shit I forgot my wallet! (You have $10)”";
    	storyline1[12] = "Everyone makes it back out to the car by the time you finish getting gas.";
    	storyline1[13] = "Annie is your 5 year dead dog, a black labradoodle that lived a great life.";
    	storyline1[14] = "You: “Yes. She’s in a better place.”";
    	storyline1[15] = "Albert: “Alright you two ready to go? Everyone used the bathroom?”";
    	storyline1[16] = "Everyone piles back into your car as you head to the camping grounds.";
    	   	
    		
    	Chapterclass chapter2 = new Chapterclass();
    	chapter2.ImageBackg = "@../FinalPrjctImages/2.Background.png";
    	chapter2.ImageFrame = "@../FinalPrjctImages/2.Frame.png";
    	
    	String[] storyline2 = new String[20];
    	
    	storyline2[0] = "About an hour and a half into the drive you arrive at the parking lot and start walking the trail to the camping ground.";
    	storyline2[1] = "As the trees clear the sun hits your face with the birds singing and it is nothing less than marvelous.";
    	storyline2[2] = "This camping ground truly is beautiful.";
    	storyline2[3] = "Since it’s 2:30 everyone starts preparing for nightfall.";
    	storyline2[4] = "Dominique sets up the fire, Albert sets up the tent, and your task is to fetch some water.";
    	storyline2[5] = "The stream is not very far and within 15 minutes you’re on your way back.";
    	storyline2[6] = "While walking the almost setting sun lights up the leaves to a golden color, and the bir-";
    	storyline2[7] = "There are no birds, the forest is silent.";
    	storyline2[8] = "Everything is still so bright yet you hear nothing moving, as if nature itself is scared to make a noise.";
    	storyline2[9] = "*BANG* Your heart jumps out of your throat as you hear a loud crash behind you to the left.";
    	storyline2[10] = "You don’t even stop to look, you sprint back to the camping grounds while holding your pail of water.";    			
    	
    }
}







