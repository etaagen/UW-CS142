// lecture 5
// nested for loops and class constants
// preview of hw 2 - mirors of different sizes 
// need a nested loops approach 

public class lecture5 {
   // class constant
   public static final int SIZE = 8; 
   // all uppercase for constants 
   // don't start with the constant, get it to work for one size first 
   // SIZE  ='s
   // 3     12
   // 4     16
   // need 4 * SIZE // now add this to your ='s in drawLine()
   public static void main(String[] args){
   drawLine();
   drawHalf1();
   drawHalf2();
   drawLine();
   }
   
   // development strategy, write out the strucutre 
   // pseudocode, describe what you're trying to do 
   // start with the easiest step, drawLine()
   // print #, print 16 = signs, print #, println
   // not so complicated, one loop
   public static void drawLine() {
      System.out.print("#");
      for(int i = 1; i <= (4 * SIZE); i++) {
         System.out.print("=");
      }
      System.out.print("#");
      System.out.println(); // go to the beginning of the next line
   }
   
   // now we have a pattern that needs a nested loop
   // because not all lines have the same output
   // we have 4 lines
   // print | 
   // print some spaces (possibly 0)
   // print <>
   // print . (possibly 0)
   // print <>
   // print spaces // look some redundancy, come back to this in future lecture
   // print | 
   // println 
   
//line     spaces      dots     
//1        6           0        
//2        4           4
//3        2           8
//4        0           12

//line goes up by 1
//spaces goes down by 2 (-2 * line + 8) 
//dots goes up by 4 (4 * line - 4)



   public static void drawHalf1() {
      // bc we have 4 lines/row
      for (int line = 1; line <= SIZE; line++) {          
         // there is always 1 line
         System.out.print("|"); 
         // the spaces are variable depending on line
         for (int space = 1; space <= (-2 * line + 2 * SIZE); space++){ 
            System.out.print(" "); 
         }
         // there is always one diamond
         System.out.print("<>");   
         // the dot are variable depending on line
         for (int dot = 1; dot <= (4 * line - 4); dot++) {
            System.out.print("."); 
         } 
         // there is always 1 diamond
         System.out.print("<>"); 
         // the spaces are variable depending on line
         for (int space = 1; space <= (-2 * line + 2 * SIZE); space++){ 
            System.out.print(" "); 
         }
         // there is always 1 line
         // System.out.print("|");
         // cleaner to make this one row
         System.out.println("|");

      }
      
   }
   
   public static void drawHalf2() {
         // bc we have 4 lines/row
      for (int line = SIZE; line >= 1; line--) {          
         // there is always 1 line
         System.out.print("|"); 
         // the spaces are variable depending on line
         for (int space = (-2 * line + 2 * SIZE); space >= 1; space--){ 
            System.out.print(" "); 
         }
         // there is always one diamond
         System.out.print("<>");   
         // the dot are variable depending on line
         for (int dot = (4 * line - 4); dot >= 1; dot--) {
            System.out.print("."); 
         } 
         // there is always 1 diamond
         System.out.print("<>"); 
         // the spaces are variable depending on line
         for (int space = (-2 * line + 2 * SIZE); space >= 1; space--){ 
            System.out.print(" "); 
         }
         // there is always 1 line
         // System.out.print("|");
         // cleaner to make this one row
         System.out.println("|");

      }
   }
}