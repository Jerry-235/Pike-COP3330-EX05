/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int numberone = input1.nextInt();

        System.out.println("Enter a number: ");
        int numbertwo = input1.nextInt();

        System.out.println(numberone + " + " + numbertwo + " = " + (numbertwo + numberone));
        System.out.println(numberone + " - " + numbertwo + " = " + (numbertwo - numberone));
        System.out.println(numberone + " * " + numbertwo + " = " + (numbertwo * numberone));
        System.out.println(numberone + " / " + numbertwo + " = " + (numbertwo / numberone));


    }
}