import java.util.Scanner;
public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int attempts = 5;



        while (attempts > 0) {
            System.out.println("INPUT NUMB (0-100) (remain " + attempts + " attempts)");
            int guess = scanner.nextInt();
            if ((guess < 0) || (guess > 100)) {
                if ((guess < 0) || (guess > 100)){
                    System.out.println("write from 0 to 100");
                    attempts++;
                }
            }



                if (guess < number) {
                    System.out.println("HIGH");
                } else {
                    if (guess > number) {
                        System.out.println("LESS");
                    } else {
                        System.out.println("CONGRATS u guess number " + number + " | u need " + (5 - attempts) + " attempts");
                        return;
                    }

                }

                attempts--;


        }
            System.out.println("u not guess | number is - " + number);


        }
}
