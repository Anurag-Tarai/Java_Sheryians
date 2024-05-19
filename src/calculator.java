import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'''Welcome To Calculator'''");
        int n = 0;
        while (n == 0) {
            System.out.println("enter two numbers : ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("choose a choice");
            System.out.println("1.Addition \n2.Multiplication\n3.Division\n4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Addition = "+(n1+n2));
                    break;
                }
                case 2: {
                    System.out.println("Addition = "+(n1*n2));
                    break;
                }
                case 3: {
                    System.out.println("Addition = "+(n1/n2));
                    break;
                }
                case 4: {
                    n = 1;
                    System.out.println("exiting the calculator......");
                    break;
                }
            }
        }
    }
}
