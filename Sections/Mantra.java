// Section 1

//////// 2)
// Mantra
// 
// public class Mantra {
//    public static void main(String[] args){
//    myMantra();
//    System.out.println();
//    myMantra();
//    }
//    
//    // method to avoid redundancy
//    public static void myMantra(){
//       System.out.println("There's one thing every coder must understand:");
//       System.out.println("The System.out.println command.");
//    }
//       
// }

//////// 3)
// public class Mantra {
//    public static void main(String[] args) {
//       System.out.println("Dear \"DoubleSlash\" magazine,");
//       System.out.println();
//       System.out.println("\tYour publication confuses me. Is it ");
//       System.out.println("a \\\\ slash or a //// slash?");
//       System.out.println("\nSincerely,");
//       System.out.println("Susan \"Suzy\" Smith");
//    }
// }

// Dear "DoubleSlash" magazine, 
// 
//    Your publication confuses me. Is it 
// a \\ slash or a //// slash?
//
// Sincerely,
// Susan "Suzy" Smith  

//////// 4)

// public class Mantra {
//    public static void main(String[] args){
//    System.out.println("What is the difference between");
//    System.out.println("a ' and a \"? Or between a \" and a \\\"?");
//    System.out.println("One is what we see when we're typing our program.");
//    System.out.println("The other is what appears on the \"console.\"");
//    }
// }

//////// 5)
// I am method 1.
// I am method 1.
// I am method 2.
// I am method 3.
// I am method 1.
// I am method 1.
// I am method 2.
// I am method 1.
// I am method 2.
// I am method 3.
// I am method 1.

//////// 6) - I already did this

//////// 7)
public class Mantra {
   public static void main(String[] args){
   figure1();
   System.out.println();
   figure2();
   System.out.println();
   figure3();
   }
   
   public static void twoRows(){
      System.out.println("*****");
      System.out.println("*****");
   }
   
   public static void x(){
      System.out.println(" * * ");
      System.out.println("  *  ");
      System.out.println(" * * ");
   }   
   
   public static void vertical(){
      System.out.println("  *  ");
      System.out.println("  *  ");
      System.out.println("  *  ");
   }
   
      
   public static void figure1(){
      twoRows();
      x();
   }
   
   public static void figure2(){
      twoRows();
      x();
      twoRows();
   }
   
   public static void figure3(){
      vertical();
      twoRows();
      x();
   }
}