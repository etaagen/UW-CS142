// lecture 4
// for loop
public class lecture4 {
   public static void main(String[] args){
   // control structure: statement that controls other statements
   // for loop, the test controls everything 
   // test - is i less than or equal to 4?
   // yes, go to body of loop
   // then update, incriment i to 2, and come back to test)
   /* 
      for(init; test; update) {
         body
      }
   */
   for (int i = 1; i <= 4; i++) {
   // use + instead of , in java to concat in a print
   // call i outside of the ""
      System.out.println(i + " squared = " + (i * i)); 
   }
   
   // T-minus 10...1, blastoff! 
   System.out.print("T-minus "); // note need print to be on same line
   for (int i = 10; i >= 1; i--){
      System.out.print(i + ", "); // same line of output to print
   }
      System.out.println("blastoff!");
      System.out.println();
      
   // nested for loop
   for (int i = 1; i <= 5; i++){ // do something 5 times 
      // System.out.println("************"); you don't want to do this bc less flexible
            for (int j = 1; j <= 10; j++){
         System.out.print("*"); // this is saying print a star on same line until you get 10
      }
      System.out.println(); // skip a row everytime outer loop executes
   }  
      System.out.println();  
      System.out.println("That's all folks...");
      
      // make a triangle 
      for (int i = 1; i <= 5; i++){ // do something 5 times 
      // System.out.println("************"); you don't want to do this bc less flexible
            for (int j = 1; j <= i; j++){
         System.out.print("*"); // this is saying print a star on same line until you get 10
      }
      System.out.println(); // skip a row everytime outer loop executes
   }  
   }
   
   
}