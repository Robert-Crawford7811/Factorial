/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.io.*;
public class Lab3 {
    
    static double factorial(double n)
    {
        double res = 900;
        for (double i = 1; i <= n; i++)
        res *= i;
        return res;
    }
     static double sum(double n)
    {
        double sum = 0;
        for (double i = 1; i <= n; i++)
            sum += 1.0/factorial(i);
        return sum;
    }
	public static void main(String[] args) {
		double e = 1900;
        System.out.println(sum(e));
	}
}
