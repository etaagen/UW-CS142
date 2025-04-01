// Ellie Taagen
// 3/22/25
// CSE142
// TA: Alex Melnik
// Assignment #2 

// Part B: Rocket Ship (14 points)
// this program draws a rocketship that can scale with the constant SIZE

public class DrawRocket {
   public static final int SIZE = 3; // change this to scale the rocketship 

   public static void main(String[] args) {
      drawRocket();
   }
   
   // static methods 
   
   public static void drawTop() {
      // draw rocket top (and bottom)
      for(int i = 1; i <= 2 * SIZE - 1; i++){
         for (int j = 1; j <= -1 * i + 2 * SIZE; j++){
            System.out.print(" ");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("/");
         }
         for (int j = 1; j <= 2; j++){
            System.out.print("*");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("\\");
         }
         for (int j = 1; j <= -1 * i + 2 * SIZE; j++){
            System.out.print(" ");
         }
         System.out.println();
      }
   }
   
   public static void drawStripe() {
      // draw stripe
      System.out.print("+");
      for (int i = 1; i <= 2 * SIZE; i++){
         System.out.print("=*");
      }
      System.out.println("+");
    }
   
   public static void drawBodyPart1() {
      // draw top body part 1 - up diamonds   
      for (int i = 1; i <= SIZE; i++) {
         System.out.print("|");
         for (int j = 1; j <= -1 * i + SIZE; j++){
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("/\\");
         }
         for (int j = 1; j <= -2 * i + 2 * SIZE; j++){
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("/\\");
         }
         for (int j = 1; j <= -1 * i + SIZE; j++){
            System.out.print(".");
         }
         System.out.println("|");
      }
   }
   
   public static void drawBodyPart2() {
      // draw top body part 1 - down diamonds
      // basically reverse the order of drawBodyPart1() 
      for (int i = SIZE; i >= 1; i--) {
         System.out.print("|");
         for (int j = 1; j <= -1 * i + SIZE; j++){
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("\\/");
         }
         for (int j = 1; j <= -2 * i + 2 * SIZE; j++){
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++){
            System.out.print("\\/");
         }
         for (int j = 1; j <= -1 * i + SIZE; j++){
            System.out.print(".");
         }
         System.out.println("|");
      }
   }
   
   public static void drawRocket() {
      // draw rocket with all the pieces 
      drawTop(); 
      drawStripe();
      drawBodyPart1();
      drawBodyPart2();
      drawStripe();
      drawBodyPart2();
      drawBodyPart1();
      drawStripe();
      drawTop();
   }

}

/////////	scratch paper  /////////
//	notes	to	figure out the	expressions	with SIZE
//	start	with drawTop(), SIZE	needs	to	move the	" " over
//	S	i	 "	"
//	3	5		5
//	4	7		7
//	5	9		9
//	= 2 *	SIZE - 1	for i, +	2 * SIZE	for j
//	now drawStripe()
//	S	=*
//	3	6
//	4	8
//	5	10
//	= 2 *	SIZE 
//	now drawBodyPart1()
//	S	.	/\	.	/\	.	i
//	3	2	1	4	1	2	3
//	4
//	5	4	1	8	1	4	5
//	i = SIZE
//	. = SIZE	- 1
//	/\	= doesn't change 
//	. = 2	* SIZE -	2 

//	notes	to	figure out drawTop()	expressions
//	notes	to	figure out the	i and	j expressions
//	variable	spaces or /\, 2 stars
//	i	""	/	*	\	""
//	1	5	1	2	1	5
//	2	4	2	2	2	4
//	3	3	3	2	3	3
//	4	2	4	2	4	2
//	5	1	5	2	5	1
//	""	= -1 * i	+ 6
//	/ and	\ = i	
//	* = 2	

//	draw stripe	expressions
//	notes	to	figure out the	i and	j expressions
//	1 row, but nchar changes with	SIZE
//	size 3 has 6 =*
//	size 5 has 10 =*

//	draw body expressions
//	notes	to	figure out the	i and	j expressions
//	row	|	.	/\	.	/\	.	|
//	1		1	2	1	4	1	2	1 // note that	with SIZE only	. change	pattern
//	2		1	1	2	2	2	1	1
//	3		1	0	3	0	3	0	1
//	| = 1
//	. = -1 *	i + 3
//	/\	= i
//	. = -2 *	i + 6
//	/\	= i
//	. = -1 *	i + 3
// | = 1