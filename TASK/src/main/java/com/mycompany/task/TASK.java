/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task;

import java.util.Scanner;

/**
 *
 * @author Home™
 */
public class TASK {

    
public static int math(int j){
        for (int i = 0; i < j; i++) {
                System.out.println("opp");

        }
        return j;
    }
    public static float math(float num){
        System.out.println("multiplication:"+num*3);
        return num;
    }
    public static String math(String name){
        System.out.println("Hello "+name);
        return name;
    }

   public static void Array(int[]arr2){
         
        for (int i = 0; i < 4; i++) {
            arr2[i] += 5;
        }
     }
    public static void main(String[] args) {


   
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");
        int num = input.nextInt();
        String[] week = {"Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int ind = num - 1;  
        System.out.println("The day of the week is: " + week[ind]);
        switch (ind) {
        case 0: {int i, j, k; 
        for (i = 0; i < 5; i++) { 
            for (j = 0; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
     }
            
        case 1,2: 
        System.out.println("Enter a number (N): ");
        int N = input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter a number: ");
            array[i] = input.nextInt();
        }

        double average = 0;

        for (int i = 0; i < N; i++) {
            average = average+array[i]; 
        }

        average = average/N;

        System.out.println("Ave==" + average);

        break; 
         case 3: 
         break; 
         case 4:
         System.out.println("Enter of row: "); 
         int row = input.nextInt(); 
           System.out.println("Enter of colum: "); 
         int col = input.nextInt(); 

         int[][] mat = new int[row][col]; 
             
         for (int rowIndex = 0; rowIndex <row ; rowIndex++) { 
             for (int colIndex = 0; colIndex < col; colIndex++) { 
                 System.out.println("Enter a number: ");  

                 mat[rowIndex][colIndex] = input.nextInt();  
             }           
         }  
               
         for (int rowIndex = 0; rowIndex < row; rowIndex++) { 
             for (int colIndex = 0; colIndex < col; colIndex++) {     
                 System.out.print(mat[rowIndex][colIndex] + " ");
             }     
               System.out.println(); 
           }      
         case 5:
            int[] arr2= new int[4];
             for (int i = 0; i < 4; i++) { 
                 System.out.println("Enter a array: ");  
                     arr2[i] = input.nextInt(); 
             } 
               Array(arr2);
               for (int i = 0; i < 4; i++) {
                   System.out.print(arr2[i]+" ");
             }
         case 6:
             System.out.println("enter print:");
              Scanner in = new Scanner(System.in);
                 int j=in.nextInt();
                 math(j);
                System.out.println("enter number:");
                float n=in.nextFloat();
                math(n);
                System.out.println("enter text:");
                String name=in.next();
                math(name);
                
             

        }

            

    }
  }

