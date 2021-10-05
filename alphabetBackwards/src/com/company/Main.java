package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println("What letter do you want to start from");
        String startingLetter = input.next();
        System.out.println("How many backwards do you want to go");
        int countBack = input.nextInt();
        countBack = countBack - 1;
        int arrayCount = 0;
        int count = 0;
        int startingPos = 0;
        String findStartingPos = "yes";
        
        do{
            if (startingLetter.equals(alphabet[arrayCount])){
                startingPos = arrayCount;
                System.out.println("");
                count = startingPos - countBack;
                for (int i = startingPos; i >= count; i--) {
                    if (i < 0){
                        count = count + 26;
                        i = i +26;
                    }
                    System.out.print(alphabet[i]);
                }
                findStartingPos = "no";
            }
            else{
                arrayCount = arrayCount + 1;
            }
        }while (findStartingPos == "yes");

    }
}
