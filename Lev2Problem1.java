import java.util.Scanner;

public class Lev2Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String names[] = {"Amar", "Akbar", "Anthony"};
        int age[] = new int[3];
        double height[] = new double[3];

        // Input age and height
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding youngest and tallest
        for(int i = 1; i < 3; i++) {

            if(age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if(height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("Youngest friend is: " + names[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex]);

        sc.close();
    }
}