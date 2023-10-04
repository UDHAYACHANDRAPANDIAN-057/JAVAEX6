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
public class calculatorDemo2 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n;
        char op;
        int num1,num2,result;
        String a,b;
        System.out.println("Enter the no of problems: ");
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the First num:");
            a=obj.next();
            System.out.println("Enter the Second num:");
            b=obj.next();
            System.out.println("Enter the Operator:");
            op=obj.next().charAt(0);
            try
            {
                num1=Integer.parseInt(a);
                num2=Integer.parseInt(b);
                if(num1<1 || num1>5000 || num2<1 || num2>5000) 
                {
                    throw new RangeOutException("Range Out");
                }
                if(num1==num2)
                {
                     throw new SameNumException("Numbers are Same");
                }
                switch(op)
                {
                    case '+':
                    {
                        result=num1+num2;
                        System.out.println("Addition Result:"+result);
                        break;
                    }
                    case '-':
                    {
                        result=num1-num2;
                        System.out.println("Subtraction Result:"+result);
                        break;
                    }
                    case '*':
                    {
                        result=num1*num2;
                        System.out.println("Multiplication Result:"+result);
                        break;
                    }
                    case '/':
                    {
                        result=num1/num2;
                        System.out.println("Division Result:"+result);
                        break;
                    }
                    case '%':
                    {
                        result=num1%num2;
                        System.out.println("Modulus Result:"+result);
                        break;
                    }
                    default:
                    {
                        throw new IllegalArgumentException("Invalid Input");
                    }
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Input is not an Integer");
            }
            catch(RangeOutException e)
            {
                System.out.println(e);
            }
            catch(SameNumException e)
            {
                System.out.println(e);
            }
        }
    }
}

class RangeOutException extends Exception
{
    RangeOutException(String msg)
    {
        super(msg);
    }
}
class SameNumException extends Exception
{
    SameNumException(String msg)
    {
        super(msg);
    }
}