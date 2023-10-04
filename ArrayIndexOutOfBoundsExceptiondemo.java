/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author 22cseb57
 */
public class ArrayIndexOutOfBoundsExceptiondemo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n,b;
        System.out.println("Enter no of elements:");
        n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element"+i+":");
            b=obj.nextInt();
            a[i]=b;
        }
        try
        {
            System.out.println("Enter the position to change value:");
            int c=obj.nextInt();
            System.out.println("Enter the Element:");
            int d=obj.nextInt();
            a[c]=d;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index value is out of range");
        }
    }
    
}