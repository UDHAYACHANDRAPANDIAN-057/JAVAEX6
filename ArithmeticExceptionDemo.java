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
public class ArithmeticExceptionDemo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a,b,result = 0;
        System.out.println("Enter First num:");
        a=obj.nextInt();
        System.out.println("Enter Second num:");
        b=obj.nextInt();
        try
        {
            result=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by Zero");
        }
        System.out.println("Result:"+result);
    }
    
}
