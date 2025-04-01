public class Section2 {
   public static void main(String[] args) {
   drawFigure();
   }
   public static void drawFigure(){
   // need a loop that draws either /, * or both
  //  row  /  \  *
//    1  16 16 0
//    2  12 12 8
//    3  8  8  16
//    4  4  4  24
//    5  0  0  32
//    
//    forwardSlash = -4 * row + 20
//    backSlash =  -4 * row + 20
//    star = 8 * row - 8
   
   // start with 5 rows
   for (int row = 1; row <= 5; row++){
      // and j is either / \ or * 
      for (int fSlash = 1; fSlash <= -4 * row + 20; fSlash++){
         System.out.print("/");
      }
      for (int star = 1; star <= 8 * row - 8; star++){
         System.out.print("*");
      }
      for (int bSlash = 1; bSlash <= -4 * row + 20; bSlash++){
         System.out.print("\\");
      }
      System.out.println();
   }
   
   }
   
}