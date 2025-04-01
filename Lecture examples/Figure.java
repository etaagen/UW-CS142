// Ellie Taagen
// Lecture 2 
// This is a program that draws four shapes 

public class Figure {
   public static void main(String[] args) {
      // commands
      // escape sequences: \\ \" \.
      // the order to execute is defined here in main
      egg();
      teacup();
      stopSign();
      hat();
      // we have 8 methods in the Class (main, egg, teacup, stopSign, hat, and 3 redudancy fixes)
      // note that for the redundancy methods we don't call them in main! 
   }  
   
      
   public static void egg() {  
   // this is a method that draws an egg  
      eggTop();
      eggBottom();
      System.out.println();
   }
   
   public static void teacup(){
   // this is a method that draws a teacup
      eggBottom();
      line();
      System.out.println();
   }
   
   public static void stopSign(){ 
   // this is a method that draws a stop sign      
      eggTop();
      System.out.println("|  STOP  |");
      eggBottom();
      System.out.println();
   }
   
   public static void hat(){ 
   // this is a method that draws a hat         
      eggTop();
      line();
   }
   
   // first redundancy fix
   public static void eggBottom(){
      System.out.println("\\......../");
      System.out.println(" \\______/");
   
   }
   
   // second redundancy fix
   public static void eggTop(){
      System.out.println("  ______");
      System.out.println(" /......\\");
      System.out.println("/........\\");
   }
   
   // third redundancy fix
   public static void line(){
   System.out.println("+--------+");
   }

}