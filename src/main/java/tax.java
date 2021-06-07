/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */
import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the order amount");
        double tax = 0.055;
        int orderAmount = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the state?");
        String state = scan.nextLine();
        if (state.equals("WI"))
        {
            System.out.println("The tax is $" +(tax * orderAmount) +".\nThe total is $" + (orderAmount + (tax * orderAmount)));
        }
        else
        {
            System.out.println("The total is $" + orderAmount);
        }
    }
}
