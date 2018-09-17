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
public class Inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Masukan Nilai a :");
        a = input.nextInt();
        System.out.print("Masukan nilai a :");
        b = input.nextInt();
        System.out.println();
        System.out.println("Hasil Variabel yang ada pada progam :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
