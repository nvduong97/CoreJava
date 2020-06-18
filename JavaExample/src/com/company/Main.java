package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "12345,3474377";
        String s2 = "12345";
        
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        while (true){
            System.out.println("------MENU-----");
            System.out.println("1: Tính tổng");
            System.out.println("2: Tìm UCLN");
            System.out.println("3: Exit");
            System.out.println("--------------");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Tổng: " + sum(a,b));
                    break;
                case 2:
                    System.out.println("UCLN: " + UCLN(a,b));
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int UCLN(int a, int b){
        while (a!=b){
            if(a>b) a -= b;
            else b -= a;
        }
        return a;
    }
}
