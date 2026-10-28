import java.util.Scanner;

public class siakadFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, highest = 0, lowest = 100;
        int pass = 0, notpass = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            if (score >= 60){
                pass++;
            } else {
                notpass++;
            }
            
        }
        if (pass >= 1){
            System.out.println("student that pass: " + pass );
        }
        if(notpass >= 1) {
            System.out.println("Student not pass: " + notpass);
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
