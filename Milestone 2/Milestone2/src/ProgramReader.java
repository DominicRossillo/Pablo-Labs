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
 * ProgramReader
 *
 * This function works as a DFA the reads a string 
 * This is done by using a for loop that goes through a string
 * that is fetched from the driverDFA class and stepped though
 * testing each input to see if its valid and giving it a newstate. 
 * This will return a final state which will be test to see whether
 * it is valid or not in driverProgramReaderDFA.java
 *   
 * 
 */
public class ProgramReader {
  
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
private static final int q11 = 11;
private static final int q12 = 12;
private static final int q13 = 13;
private static final int q14 = 14;
private static final int q15 = 15;
private static final int q16 = 16;
private static final int q17 = 17;
private static final int q18 = 18;
private static final int q19 = 19;
private static final int q20 = 20;
private static final int q21 = 21;
private static final int q22 = 22;
private static final int q23 = 23;
private static final int q24 = 24;
private static final int q25 = 25;
private static final int q26 = 26;
private static final int q27 = 27;
private static final int q28 = 28;
private static final int q29 = 29;
private static final int q30 = 30;
private static final int q31 = 31;
private static final int q32 = 32;
private static final int q33 = 33;
private static final int q34 = 34;
private static final int q35 = 35;
private static final int Error= 36;
public static int state;
private static int newState;
  
  public static void reset() {  
  state = q0;
//System.out.println(state);
  }
  
     
        
//return value is a boolean that checks to see if the final state matches the success state
public static boolean accepted() {
  // TODO Auto-generated method stub
  //System.out.println(state==q7);
  if (state==q11||state==q23||state==q27||state==q35){
    return true;
  }
  else return false;
}
/*
 * definition of the multi dimesional array that acts as the DFA paths
 * called DFAARRAY
 */
static private int[][] DFAARRAY = 
 {
  {q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q19  ,q1  ,q19  ,q19  ,q19  ,q19  ,q19  ,q28  ,q19  ,q19  ,q19  ,q19  ,q0  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q32  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q2  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q20  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q3  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q4  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q5  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q6  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q7  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q8  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,q17  ,Error  ,q9  ,q9  ,q9  ,q9  ,q9  ,q9  ,q9  ,q9  ,q9  ,q9  ,Error  ,Error  ,q12  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q10  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q8  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q11  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q0  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q13  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q14  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q13  ,q14  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q15  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q16  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q11  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q18  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q11  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q20  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q21},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q22  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,Error  ,q23  ,q23  ,q23  ,q23  ,q23  ,q23  ,q23  ,q23  ,q23  ,q23  ,Error  ,Error  ,q24  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q0  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q22  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q25  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q26  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q25  ,q26  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q27  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q0  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q29  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q20  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q30  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q31  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,q27  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q33  ,Error  ,Error  ,Error  ,Error  ,Error},
  {q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q34  ,q33  ,q33  ,q33  ,q33  ,q33},
  {q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33  ,q35  ,q33  ,q33  ,q33  ,q33  ,q33  ,q33},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,q0  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error},
  {Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error  ,Error}

 };
 
 /**
  * This is the process function that moves through DFAARRAY
  * and determine what state the string parameters gets you 
  * takes testString as a parameter which is determined by a user input in driverDFA.
 * @return 
  */
      
 public static  String process(String testString) {
  // makes it so all new liines get replaced with ~
  
  System.out.println(testString);
   boolean errorFree = true;
//for loop that checks if the value is a certain value at a desired index to properly advance the dfa  
  for (int i = 0; i < testString.length(); i++)  {
      //System.out.println("currentstate: " +state);
       System.out.println("curchar: " +testString.charAt(i));
    if (testString.charAt(i)=='a'){
    newState=0;
  }
    else if (testString.charAt(i)=='b'){
    newState=1;
  }
    else if (testString.charAt(i)=='c'){
    newState=2;
  }
    else if (testString.charAt(i)=='d'){
    newState=3;
  }
    else if (testString.charAt(i)=='e'){
      newState=4;
    }
    else if (testString.charAt(i)=='f'){
      newState=5;
    }
    else if (testString.charAt(i)=='g'){
      newState=6;
    }
    else if (testString.charAt(i)=='h'){
      newState=7;
    }
    else if (testString.charAt(i)=='i'){
        newState=8;
      }
    else if (testString.charAt(i)=='j'){
        newState=9;
      }
    else if (testString.charAt(i)=='k'){
        newState=10;
      }
    else if (testString.charAt(i)=='l'){
        newState=11;
      }
    else if (testString.charAt(i)=='m'){
          newState=12;
        }
    else if (testString.charAt(i)=='n'){
          newState=13;
        }
    else if (testString.charAt(i)=='o'){
          newState=14;
        }
    else if (testString.charAt(i)=='p'){
          newState=15;
        }
    else if (testString.charAt(i)=='q'){
            newState=16;
          }
    else if (testString.charAt(i)=='r'){
      newState=17;
    }
      else if (testString.charAt(i)=='s'){
      newState=18;
    }
      else if (testString.charAt(i)=='t'){
      newState=19;
    }
      else if (testString.charAt(i)=='u'){
        newState=20;
      }
      else if (testString.charAt(i)=='v'){
        newState=21;
      }
      else if (testString.charAt(i)=='w'){
        newState=22;
      }
      else if (testString.charAt(i)=='x'){
        newState=23;
      }
      else if (testString.charAt(i)=='y'){
          newState=24;
        }
      else if (testString.charAt(i)=='z'){
          newState=25;
        }
      else if (testString.charAt(i)==' '){
          newState=26;
        }
      else if (testString.charAt(i)=='0'){
          newState=27;
        }
      else if (testString.charAt(i)=='1'){
          newState=28;
        }
      else if (testString.charAt(i)=='2'){
          newState=29;
        }
      else if (testString.charAt(i)=='3'){
            newState=30;
          }
      else if (testString.charAt(i)=='4'){
            newState=31;
          }
      else if (testString.charAt(i)=='5'){
            newState=32;
          }
      else if (testString.charAt(i)=='6'){
            newState=33;
          }
      else if (testString.charAt(i)=='7'){
              newState=34;
            }
      else if (testString.charAt(i)=='8'){
        newState=35;
      }
      else if (testString.charAt(i)=='9'){
        newState=36;
      }
      else if (testString.charAt(i)=='*'){
        newState=37;
      }
      else if (testString.charAt(i)=='-'){
        newState=38;
      }
      else if (testString.charAt(i)=='\"'){
          newState=39;
        }
      else if (testString.charAt(i)=='('){
        newState=40;
      }
      else if (testString.charAt(i)==')'){
        newState=41;
      }
      else if (testString.charAt(i)=='+'){
        newState=42;
      }
      else if (testString.charAt(i)=='='){
        
        newState=43;
      }
      else if (testString.charAt(i)=='\n'){
        //testString= new StringBuilder(testString).insert(i, " ").toString();
       
       // i=i+1;
        System.out.println("test");
      }
      else newState=Error;
   //makes comments green
    if (state==q32){
      testString= new StringBuilder(testString).insert(i-1,
                    "<font color='green'>").toString();
    }
      
  //makes variables purple
    if (state==q31||state==q19){
      testString= new StringBuilder(testString).insert(i-1,
              "<font color='purple'>").toString();
      i=i+21;
    }
    
    if (state==q20 && (testString.charAt(i-2)=='p' 
                 ||testString.charAt(i-2)=='v' )){
      System.out.println("yep");
      testString= new StringBuilder(testString).insert(i-2, 
                  "<font color='purple'>").toString();
      i=i+21;
    }
    if (state==q2){
      testString= new StringBuilder(testString).insert(i-2, 
                  "<font color='blue'>").toString();
      i=i+19;
    }
    if (state==q12|| state==q24){
      testString= new StringBuilder(testString).insert(i-1, 
                  "<font color='orange'>").toString();
      i=i+21;
    }
  //stops making letters colors
    if (state==q27||state==q20|| state==q35|| state==q6 || state==q15){
      testString= new StringBuilder(testString).
              insert(i, "</font>").toString();
      System.out.print(i);
      i=i+7;
    }
    
  if (state == Error && errorFree ){
    testString= new StringBuilder(testString).insert(i-1, 
            "<font color='red'>").toString();
    errorFree = false;
  }
    
               
  try {
    
     System.out.println(state);
       System.out.println(newState);
    // System.out.print(state = DFAARRAY[state][newState]);
    state = DFAARRAY[state][newState];
  
    //System.out.println("end state:" + state);
              }
  
  catch (ArrayIndexOutOfBoundsException ex) {
    testString= new StringBuilder(testString).insert(i-1, 
            "<font color='red'>").toString();
    state = Error;      
   }
         
        }
  if (state==Error){
    testString= new StringBuilder(testString).insert(testString.length(), 
            "</font>").toString();
  }
  return testString;
        
      }
  

}
