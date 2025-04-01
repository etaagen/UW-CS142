// Ellie Taagen
// 3/22/25
// CSE142
// TA: Alex Melnik
// Assignment #2 

// Part A: ASCII Art (2 points)
// this program prodcues as output my first original AsciiArt 

public class AsciiArt {
   public static void main(String[] args){
      drawMartini(); 
   }
   
   public static void olive(){
      System.out.println("          /");
   }
   
   public static void glass(){
      System.out.println("#############");
      System.out.println("   ######");
      System.out.println("    ####");
   }
   
   public static void stem(){
      System.out.println("     ||");
      System.out.println("     ||");
      System.out.println("     ||");
      System.out.println("    ____");
   }
   
   public static void drawMartini(){
   olive();
   glass();
   stem();
   }
}

