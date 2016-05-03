import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.html.HTMLTextAreaElement;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.*;
/**
 * file: driverDFA.java
 * author: Dominic Rossillo
 * course: CMPT 440
 * assignment: Lab2
 * due date: Feb 15
 * version: 1
 * 
 * This file contains the front end for a DFA allowing a user
 * to input a string and find out weather it is a valid input 
 * for the given DFA.
 */


/**
 * driverDFA
 *
 * This class is used to act as a front end for the 
 * ProgramREader.java class using a class call of man wolf when the user clicks on a button.
 * It also has text filed that 
 * 
 * 
 *   
 * 
 */


//this class hold the details for the Jframe which is used for the user to interact with to enter the string to test with the dfa
public class driverProgramReaderDFA extends Application implements EventHandler<ActionEvent> {
	Stage primaryStage;
	//button player clicks to test code
	Button btn= new Button("Test Code");
	//label that changes depending on the results
	Label resultsTitle= new Label("Test Results:");
	Label userPrompt= new Label("Enter code below to check if it works.");
	
	HTMLEditor HTMLArea= new HTMLEditor();
	
  
 
	/**
	 * Launch the application.
	 * @throws IOException 
	 */

  

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("Code Reader");
		
		
		
		//sets up properties of my pane for the gui
		VBox layout= new VBox(4);
		layout.setPadding(new Insets(10, 10,10,10));
		layout.setPrefSize(800, 600);
		layout.setAlignment(Pos.CENTER);
	
		//alignment of title and results
		resultsTitle.setAlignment(Pos.TOP_LEFT);
		
		
		//creates Scroll pane to use with the HTML editor
		ScrollPane sp = new ScrollPane();
		sp.setContent(HTMLArea);
		sp.setFitToWidth(true);
		//set ip action listener to call the dfa processor when button is click or user types
		btn.setOnAction(this);
		
		//HTML edditor location
		
		
		HTMLArea.setPrefSize(600,600);
		HTMLArea.setStyle(  "-fx-font:12 Arial;");
	
		
		
		
		layout.getChildren().addAll(userPrompt,resultsTitle,HTMLArea,btn);
		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	
	  private void addNode(VBox layout, Label testResults2, int i) {
		    Label label = new Label();
		    VBox.setMargin(label, new Insets(0, 0, 0, 20));
		    layout.getChildren().add(label);
		
	}


	public static void main(String[] args)  {
			
		  
		  launch(args);
		  		
		  }

//Event handler for button press
	  @Override
	  public void handle(ActionEvent event) {
		
			try{
				  ProgramReader.reset();
				  HTMLArea.setHtmlText(ProgramReader.process(stripHTMLTags(HTMLArea.getHtmlText())));
				  
				  }
				  catch(Exception e) {
					  e.printStackTrace();
				  }
				  if(ProgramReader.accepted() == true){
					  resultsTitle.setText("Test Resultes: This Program works");
				      
		
				      }
				  else  {resultsTitle.setText("Test Results: This Program does not work");
				
			
			
		}
				  
				  
		
	}
//This function strips tags used by html from a string so that the program can read it	
	  private String stripHTMLTags(String htmlText) 
		{
			String getTags = htmlText.replaceAll("<p>", "");	
			String getSpace = getTags.replaceAll("&nbsp;", " ");
	        Pattern pattern = Pattern.compile("<[^>]*>");
	        Matcher matcher = pattern.matcher(getSpace);
	        final StringBuffer stringbuffer = new StringBuffer(getSpace.length());
	        while(matcher.find()) 
	        {
	            matcher.appendReplacement(stringbuffer, "");
	        }
	        matcher.appendTail(stringbuffer);
	        return stringbuffer.toString().trim();
	    }
}


