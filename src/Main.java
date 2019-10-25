import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer;
        String loopAnswer;
        loopAnswer = "yes";
        boolean isPrime = false;
        while (loopAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            String sel = scan.nextLine();
            if (sel.equalsIgnoreCase("I")) {
                System.out.println("Please enter a number:");
                int num = scan.nextInt();
                for (int i = 2; i <= num / 2; i++) {
                    answer = num % i;
                    if (answer == 0) {
                        isPrime = true;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is not a Prime number");
                } else {
                    System.out.println(num + " is a Prime number");
                }
           /* System.out.println("Would you like to generate a random number or input a number? (R/I)");
            sel = scan.next();*/
            }
            if (sel.equalsIgnoreCase("R")) {
                int high = 250;
                int low = 1;
                int rand = new Random().nextInt(high - low) + low;
                for (int i = 2; i <= rand / 2; i++) {
                    answer = rand % i;
                    if (answer == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(rand + " is a Prime number");
                } else {
                    System.out.println(rand + " is not a Prime number");
                }
                System.out.println("Would you like to repeat? (yes/no)");
                loopAnswer = scan.next();
            }
        }
    }
}