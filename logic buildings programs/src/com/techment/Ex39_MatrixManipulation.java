package com.techment;
import java.util.Scanner;

class Ex39_MatrixManipulation {

    public static void main(String[] args) {
        int row, col;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Number of Rows and Columns of Matrix : ");
        row = in.nextInt();
        col = in.nextInt();
        
        int M1[][] = new int[row][col];
        int M2[][] = new int[row][col];
        int resMatrix[][] = new int[row][col];
        
        System.out.print("Enter elements of First Matrix : ");
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                M1[i][j] = in.nextInt();
            }
        }
        System.out.println("First Matrix : " );
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" " +M1[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.print("Enter elements of Second Matrix : ");
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                M2[i][j] = in.nextInt();
            }
        }
        System.out.println("Second Matrix : " );
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" " +M2[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Addition logic 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                resMatrix[i][j] = M1[i][j] + M2[i][j];
            }
        }
        
        // Printing the result matrix 
        System.out.println("Result Matrix : " );
        for(int i = 0; i < resMatrix.length; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" " +resMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}