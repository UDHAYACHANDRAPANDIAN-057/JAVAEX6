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
public class NumberFormatExceptionDemo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String a,b;
        int n,m,result=0;
        System.out.println("Enter First num:");
        a=obj.next();
        System.out.println("Enter Second num:");
        b=obj.next();
        try
        {
            n=Integer.parseInt(a);
            m=Integer.parseInt(b);
            result=n+m;
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException Occurs");
        }
        System.out.println("Result:"+result);
    }
}
