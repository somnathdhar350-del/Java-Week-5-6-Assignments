import java.util.Scanner;

public class Lev3Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }

        int digits[] = new int[count];
        int freq[] = new int[10];

        temp = number;
        int index = 0;

        // Store digits in array
        while(temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Calculate frequency
        for(int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");

        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}