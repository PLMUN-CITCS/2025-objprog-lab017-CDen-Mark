import java.util.Scanner;

public class GradeCalculator {
    
    // Get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;
        
        while (score < 0 || score > 100) { // Make sure it's between 0-100
            System.out.print("Enter your score (0-100): ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100.");
                }
            } else {
                System.out.println("Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        return score;
    }
    
    // Figure out the letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Main method
    public static void main(String[] args) {
        double score = getStudentScore(); // Get the score
        String grade = calculateGrade(score); // Get the grade
        System.out.println("Your Grade is: " + grade); // Show the result
    }
}