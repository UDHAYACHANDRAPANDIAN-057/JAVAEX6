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
public class StringIndexOutOfBoundExceptionDemo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String a;
        System.out.println("Enter the String:");
        a=obj.next();
        char b[]=a.toCharArray();
        try
        {
            System.out.println(a.substring(10));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("String Array Index Value is Out of Range");
        }
    }
}