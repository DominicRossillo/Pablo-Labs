/**
 * file: ManWolf.java
 * author: Dominic Rossillo
 * course: CMPT 440
 * assignment: Lab2
 * due date: Feb 15
 * version: 1
 * 
 * This file contains the implementation of a DFA
 * that checks strings to see if they a valid for the 
 * five DFA.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ManWolf
 *
 * This function works as a DFA the reads a string 
 * This is done by using a for loop that goes through a string
 * that is fetched from the driverDFA class and stepped though
 * testing each input to see if its valid and giving it a newstate. 
 * This will return a final state which will be test to see whether
 * it is true or false in driverDFA.java
 *   
 * 
 */

public class ManWolf {

	
private static final int q0 = 0;
private static final int q1 = 1;
private static final int q2 = 2;
private static final int q3 = 3;
private static final int q4 = 4;
private static final int q5 = 5;
private static final int q6 = 6;
private static final int q7 = 7;
private static final int q8 = 8;
private static final int q9 = 9;
private static final int q10 = 10;
public int state;
private int newState;
	
  public void reset() {	
  state = q0;
//System.out.println(state);
  }
	
		 
			  
//return value is a boolean that checks to see if the final state matches the success state
public boolean accepted() {
  // TODO Auto-generated method stub
  //System.out.println(state==q7);
  return state==q7;
}
/*
 * definition of the multidimesional array that acts as the DFA paths
 * called DFAARRAY
 */
static private int[][] DFAARRAY = 
 {{q10,q1,q10,q10},
 {q10,q0,q10,q2},				
 {q8,q10,q3,q2},
 {q10,q4,q2,q10},
 {q5,q3,q10,q10},				
 {q4,q10,q8,q6},			
 {q10,q7,q10,q5},			
 {q10,q6,q10,q10},				
 {q2,q9,q10,q10},
 {q10,q8,q5,q10},
 {q10,q10,q10,q10}};
 /**
  * This is the process function that moves through DFAARRAY
  * and determine what state the string parameters gets you 
  * takes testString as a parameter which is determined by a user input in driverDFA.
  */
		  
 public void process(String testString) {
	 
  for (int i = 0; i < testString.length(); i++)  {
	  	//System.out.println("currentstate: " +state);
	   	//System.out.println("curchar: " +testString.charAt(i));
    if (testString.charAt(i)=='w'){
	  newState=0;
	}
	if (testString.charAt(i)=='g'){
	  newState=1;
	}
	if (testString.charAt(i)=='c'){
	  newState=2;
	}
	if (testString.charAt(i)=='n'){
	  newState=3;
	}
				    	 
	try {
	  // System.out.println(newState);
	  // System.out.println(state);
      // System.out.println(newState);
	  // System.out.print(state = DFAARRAY[state][newState]);
	  state = DFAARRAY[state][newState];
				      
	  //System.out.println("end state:" + state);
				      }
	catch (ArrayIndexOutOfBoundsException ex) {
	   state = q10;      
	 }
		     
		    }
		    
		  }
		  
		 

	    
	

	
}

