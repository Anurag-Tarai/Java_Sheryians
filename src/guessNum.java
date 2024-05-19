import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.floor(Math.random() * (100 - 1 + 1)) + 1);
        System.out.println("               Welcome to Guess Number !\n     you have only 5 chances to guess the number");

        int b = 10;
        while (b > 0) {
            b--;
            System.out.println("enter a number ");
            int guessNum = sc.nextInt();
            //System.out.println("you entered number is " + guessNum);
            if (guessNum == num) {
                System.out.println("Yesssss You Guessed It Right");
                return;
            } else if (guessNum < num) {
                System.out.println("Toooo Small");
            } else if (guessNum > num) {
                System.out.println("Toooo Large");
            }
        }
        System.out.println("Nice Try ! Thank You For Playing, Good Luck Next Time :) ");
    }
}

