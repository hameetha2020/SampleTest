package mvcexample;

/**
 *
 * @author Hameetha
 */
// Launcher for application
//This is done by Hameetha on 11 Feb 2021 3.40pm


public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c2 = new Controller2(model); // Create second controller
        
    } // main
  
} // Main
