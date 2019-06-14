package com.trivedi;

import java.util.Scanner;

public class Test1 {

    public static void main(String args[]) {
//        System.out.println("Enter String: ");
//        Scanner in = new Scanner(System.in);
//        String scanner="";
//        String original = in.nextLine();
//        int len = original.length();
//
//        for(int i=len-1; i>=0;i--) {
//            char a = original.charAt(i);
//            scanner = scanner + a;
//
//        }
//        if(original.equals(scanner)) {
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//
//        System.out.println("You Enter : "+original);
//        System.out.println("Reverse  : "+scanner);
//
//
//    }


//        int num, a = 0, b = 0, c = 1;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of times");
//
//        num = in.nextInt();
//
//        System.out.println("Fibonacci Series of the number is:");
//
//        for (int i = 0; i <= num; i++) {
//
//            a = b;
//
//            b = c;
//
//            c = a + b;
//
//            System.out.println(a + "");    //if you want to print on the same line, use print()
//
//        }
//    }

        {
            int arr[] = {14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
            int largest = arr[0];
            int secondLargest = arr[0];
            System.out.println("The given array is:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];

                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
            System.out.println("\nSecond largest number is: " + secondLargest);
        }
    }}
