// Ellie Taagen
// 3/17/25
// CSE142
// TA: Alex Melnik
// Assignment #1
//
// This program produces as output a cumulative song using static methods


public class Song {
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
      swallow_fly();
      idk_line();
   }
   
   public static void verse2() {
      // this is a method that prints the second verse 
      swallow_spider();
      catch_fly();
      idk_line();
   }
   
   public static void verse3() {
      // this is a method that prints the third verse 
      swallow_bird();
      catch_spider();
      idk_line();
   }
   
   public static void verse4() {
      // this is a method that prints the fourth verse 
      swallow_cat();
      catch_bird();
      idk_line();
   }
   
   public static void verse5() {
      // this is a method that prints the fifth verse 
      swallow_dog();
      catch_cat();
      idk_line();
   }
   
   public static void verse6() {
      // this is a method that prints the sixth verse 
      swallow_leash();
      catch_dog();
      idk_line();
   }

   public static void verse7() {
      // this is a method that prints the seventh verse 
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }

   ///// Redundancy methods /////
   // HW instruction: use only one println statement for each distinct line of the song.
   
   public static void idk_line() {
      // this is a method that prints the repeated last two lines that start with "I don't know"
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   
   public static void swallow_fly() {
      System.out.println("There was an old woman who swallowed a fly.");
   }
   
   public static void swallow_spider() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
   }
   
   public static void catch_fly() {
      System.out.println("She swallowed the spider to catch the fly,");
   }

   public static void swallow_bird() { 
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
   }
   
   public static void catch_spider() {
      System.out.println("She swallowed the bird to catch the spider,");
      catch_fly();
   }
   
   public static void swallow_cat() { 
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
   }
   
   public static void catch_bird() {
      System.out.println("She swallowed the cat to catch the bird,");
      catch_spider();
   }
   
   public static void swallow_dog() { 
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
   }
   
   public static void catch_cat() {
      System.out.println("She swallowed the dog to catch the cat,");
      catch_bird();
   }
   
   public static void swallow_leash() {
      System.out.println("There was an old woman who swallowed a leash,");
      System.out.println("How niche to swallow a leash.");
   }
   
   public static void catch_dog() {
      System.out.println("She swallowed the leash to catch the dog,");
      catch_cat();
   }

}