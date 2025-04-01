// Ellie Taagen
// 3/17/25
// CSE142
// TA: Alex Melnik
// Assignment #1
//
// This program produces as output a cumulative song using static methods
// This was my first attempt
// I interpred the assignment / lecture where redundancy is defined as 2 identical lines of code
// While this draft solution has fewer lines of code, it is less readable than the HW answer
// I re-read the assignment and I had missed this instruction: "use only one println statement for each distinct line of the song"

public class Song_Draft {
   public static void main(String[] args){
   // include the 7 method calls for the 7 verses
   verse1();
   verse2();
   verse3();
   verse4();
   verse5();
   verse6();
   verse7();
   }
   
   public static void verse1() {
      // this is a method that prints the first verse 
      System.out.println("There was an old woman who swallowed a fly.");
      idk();
   }
   
   public static void verse2() {
      // this is a method that prints the second verse 
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      System.out.println("She swallowed the spider to catch the fly,");
      idk();
   }
   
   public static void verse3() {
      // this is a method that prints the third verse 
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      idk();
   }
   
   public static void verse4() {
      // this is a method that prints the fourth verse 
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catBirdSpiderFly();
      idk();
   }
   
   public static void verse5() {
      // this is a method that prints the fifth verse 
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      System.out.println("She swallowed the dog to catch the cat,");
      catBirdSpiderFly();
      idk();
   }
   
   public static void verse6() {
      // this is a method that prints the sixth verse 
      System.out.println("There was an old woman who swallowed a leash,");
      System.out.println("How niche to swallow a leash.");
      System.out.println("She swallowed the leash to catch the dog,");
      System.out.println("She swallowed the dog to catch the cat,");
      catBirdSpiderFly();
      idk();
   }

   public static void verse7() {
      // this is a method that prints the seventh verse 
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }

   ///// Redundancy methods /////

   
   public static void idk() {
      // this is a method that prints the repeated last two lines that start with "I don't know"
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   
   public static void catBirdSpiderFly() {
      // this is a method that prints the repeated line about catching cat, bird, spider, and fly
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
   }

}