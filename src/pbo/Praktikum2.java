/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,r,f,k;
        System.out.print("Masukan Celcius =");
        c = input.nextDouble();
        r = 4*c/5;
        f = (9*c/5)+32;
        k = c + 273;
        System.out.println("=====Konversi=====");
        System.out.println("Reamur = " +r);
        System.out.println("Fahrenheit = " +f);
        System.out.println("Kelvin = " +k);
    }
}
