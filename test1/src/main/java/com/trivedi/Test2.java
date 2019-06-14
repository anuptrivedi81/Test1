package com.trivedi;

import java.util.Scanner;

public class Test2 {


 public static void main(String[] args){

     System.out.println("Enter integer: ");
     Scanner scan = new Scanner(System.in);
     int index = Integer.parseInt(scan.nextLine());
     fib(index);
 }

 public static void fib(int index){

     for(int i =0;i<index;i++){
         System.out.print(recursive(i)+", ");
     }
 }

 public static int recursive(int i){

     if(i==0)
         return 0;

     if(i==1)
         return 1;

     return (recursive(i-1)+ recursive(i-2));
 }

}
