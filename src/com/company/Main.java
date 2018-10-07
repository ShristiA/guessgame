package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner src =  new Scanner(System.in);

 int a = 0;
    System.out.print("I have chosen a number between 1 and 10. Try to guess it.");
    a = src.nextInt();

    int secretnumber = 6;
    while(secretnumber != a){
        System.out.println("your guess " + a);
        a = 0;
        System.out.println("This is incorrect. Guess again");
        int userguess = src.nextInt();
        a = userguess;


    }System.out.println("That's right! You're a good guesser.");


            }

}
