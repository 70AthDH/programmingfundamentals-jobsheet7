import java.util.Scanner;
public class siakadWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, count, i = 0;
        System.out.print("Enter the number of students: ");
        count = sc.nextInt();
        while ( i < count ){
            System.out.println("Enter Score for student " + (i + 1) + ": ");
            score = sc.nextInt();
            if (score<0||score>100){
                System.out.println("Invalid score, enter correct score");
                continue;
            }
            if (score > 80 && score <= 100) {
                System.out.println("The grade of student " + (i + 1) + " is A");
            } else if (score > 73 && score <= 80) {
                System.out.println("The grade of student " + (i + 1) + " is B+");
            } else if (score > 65 && score <= 73) {
                System.out.println("The grade of student " + (i + 1) + " is B");
            } else if (score > 60 && score <= 65) {
                System.out.println("The grade of student " + (i + 1) + " is C+");
            } else if (score > 50 && score <= 60) {
                System.out.println("The grade of student " + (i + 1) + " is C");
            } else if (score > 39 && score <= 50) {
                System.out.println("The grade of student " + (i + 1) + " is D");
            } else {
                System.out.println("The grade of student " + (i + 1) + " is E");
            }
            i++;
        }
    }
}
