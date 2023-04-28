import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(">>>>> Welcome to Market! <<<<<");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the value of your receipt!");
        double receipt = sc.nextDouble();
        System.out.printf("Insert %.2f Ron in the machine slot\n", receipt);
        double money = sc.nextDouble();
        double change = money - receipt;
        System.out.println("Your change is " + change + " Ron");
        System.out.print("Please pick up your change ");

        while (change >= 200) {
            System.out.print(200 + ", ");
            change -= 200;
        }
        while (change >= 100) {
            System.out.print(100 + ", ");
            change -= 100;
        }
        while (change >= 50) {
            System.out.print(50 + ", ");
            change -= 50;
        }
        while (change >= 10) {
            System.out.print(10 + ", ");
            change -= 10;
        }
        while (change >= 5) {
            System.out.print(5 + ", ");
            change -= 5;
        }
        while (change >= 1) {
            System.out.print(1 + ", ");
            change -= 1;
        }
        while (change >= 0.5) {
            System.out.print(0.5 + ", ");
            change -= 0.5;
        }
        while (change >= 0.1) {
            System.out.print(0.1 + ", ");
            change -= 0.1;
        }
        while (change >= 0.05) {
            System.out.print(0.05 + ", ");
            change -= 0.05;
        }
        while (change >= 0.01) {
            System.out.print(0.01 + ", ");
            change -= 0.01;
        }
    }
}