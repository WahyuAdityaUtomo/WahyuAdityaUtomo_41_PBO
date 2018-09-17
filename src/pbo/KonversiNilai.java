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
public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai web :");
        int nilai = input.nextInt();
        if (nilai >= 90)
            System.out.println("nilai A");
        else if (nilai >= 75)
            System.out.println("nilai B");
        else if (nilai >= 50)
            System.out.println("niali C");
        else if (nilai >= 35)
            System.out.println("nilai D");
        else 
            System.out.println("nilai E");
    }
}
