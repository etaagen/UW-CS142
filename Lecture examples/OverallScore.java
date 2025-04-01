// Program to compute a student's overall score in cse142 given their homework
// scores and exam scores.

public class OverallScore {
    public static void main(String[] args) {
        // hw1=10, hw2=16, hw3-8 = 20, section=20
        int totalPoints = 10 + 16 + 6 * 20 + 20;
        int actualPoints = 8 + 14 + 6 * 18 + 20;
        // to get a double as the output from int 
        // you have to make the truncated division work AND make it a double (100 vs 100.0)
        double hwScore = 100.0 * actualPoints / totalPoints;
                
        int mid = 81;
        int fin = 74;
                
        double overall = 0.4 * hwScore + 0.2 * mid + 0.4 * fin;
        System.out.println("overall = " + overall);
    }
}

//(72 + 6) % 10 / 3 - 5 * 7/4 % 10
// 78 % 10 / 3 - 5 * 7/4 % 10
// 8 / 3 - 5 * 7/4 % 10
// 2 - 5 * 7/4 % 10 // be mindful even without a space of the order of op! 
// 2 - 35/4 % 10
// 2 - 8 % 10
// 2 - 8
// -6