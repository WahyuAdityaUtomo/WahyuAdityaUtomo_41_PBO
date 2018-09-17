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
public class KondisiGanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai TPA :");
        int TPA = input.nextInt();
        System.out.println("Masukan nilai Bahasa Inggris :");
        int BIG = input.nextInt();
        if ((TPA > 85) && (BIG > 80))
            System.out.println("Siswa dapat beasiswa");
        else
            System.out.println("Siswa tidak dapat beasiswa");
    }
}
