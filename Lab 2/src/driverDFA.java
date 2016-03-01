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

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * driverDFA
 *
 * This class is used to act as a front end for the 
 * ManWolf.java class using a class call of man wolf when the user clicks on a button.
 * It also has text filed that 
 * 
 * 
 *   
 * 
 */

//this class hold the details for the Jframe which is used for the user to interact with to enter the string to test with the dfa
public class driverDFA extends JFrame {

  private JPanel contentPane;
  private final JLabel lblWriteAString = new JLabel("Write a string to test if it works:");
  private final JButton btnTestString = new JButton("Test string");
  private final JTextField DFAtestStringTF = new JTextField();
  private static String testString;
  private final JLabel DFAReturnLabel = new JLabel("");
	/**
	 * Launch the application.
	 */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          driverDFA frame = new driverDFA();
          frame.setVisible(true);
          
          ManWolf ManWolf = new ManWolf();
          String testString = System.console().readLine();
          ManWolf.reset();
          ManWolf.process(testString);
			}
					
        catch (Exception e) {
		  e.printStackTrace();
			}
		}
    });
  }

	/**
	 * Create the frame.
	 */
  public driverDFA() {
    DFAtestStringTF.setBounds(326, 109, 276, 22);
    DFAtestStringTF.setColumns(10);
    jbInit();
  }
	//this method holds information about the dimensions and other attributes of the frame/ window for the application
  private void jbInit() {
    setTitle("Lab2 DFA Driver");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 722, 472);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    lblWriteAString.setFont(new Font("Tahoma", Font.PLAIN, 17));
    lblWriteAString.setBounds(54, 105, 260, 26);
		
    contentPane.add(lblWriteAString);

    btnTestString.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_btnTestString_actionPerformed(e);
      }
});
    btnTestString.setBounds(260, 297, 97, 25);
		
    contentPane.add(btnTestString);
		
    contentPane.add(DFAtestStringTF);
    DFAReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
    DFAReturnLabel.setBounds(84, 209, 518, 40);
		
    contentPane.add(DFAReturnLabel);
  }
	//this is the action event that occurs when the button is pressed.
	//this will result in the ManWolf. reset, process, and accepted functions
	//being run along with an if statement to test weather the result of accepted is a true or a false
	// and printing out to the user information saying if the string they entered worked or not.
  protected void do_btnTestString_actionPerformed(ActionEvent e) {
    testString= DFAtestStringTF.getText();
    ManWolf ManWolf = new ManWolf();
    ManWolf.reset();
    ManWolf.process(testString);
    if(ManWolf.accepted() == true){
      DFAReturnLabel.setText("This statement works for the problem");
      System.out.println();
      }
    else  DFAReturnLabel.setText("This Statement does not work for the problem");
			
		
	}
}
