package Backjoon;

import java.util.Scanner;

public class B_9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score = in.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score <= 89 && score >= 80) {
            System.out.println("B");
        }else if(score <= 79 && score >= 70) {
            System.out.println("C");
        }else if(score <= 69 && score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
