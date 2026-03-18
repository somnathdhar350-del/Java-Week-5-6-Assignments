import java.util.Scanner;

public class Lev1Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ages[] = new int[10];

        System.out.println("Enter age of 10 students:");

        // Taking input
        for(int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        for(int i = 0; i < ages.length; i++) {

            if(ages[i] < 0) {
                System.out.println("Invalid age");
            }
            else if(ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }

        }

        sc.close();
    }
}