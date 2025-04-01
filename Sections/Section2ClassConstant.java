public class Section2ClassConstant {

   // all uppercase for constants
   public static final int SIZE = 7; 
   // 2nd row (forward or back slash)
   // SIZE  /    \      *
   // 3     4     4     8
   // 5     12    12    8
   // 7     20    20    8
   // need 4 * SIZE // now add this to the methods / and \ AND number or rows, but not *
   // thought 8 but it is every other size here, so 4
   
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
   for (int row = 1; row <= SIZE; row++){
      // and j is either / \ or * 
      for (int fSlash = 1; fSlash <= (-4 * row) + (4 * SIZE); fSlash++){
         System.out.print("/");
      }
      for (int star = 1; star <= 8 * row - 8; star++){
         System.out.print("*");
      }
      for (int bSlash = 1; bSlash <= (-4 * row) + (4 * SIZE); bSlash++){
         System.out.print("\\");
      }
      System.out.println();
   }
   
   }
   
}