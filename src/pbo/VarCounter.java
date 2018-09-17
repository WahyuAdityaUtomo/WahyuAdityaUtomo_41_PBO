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
public class VarCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan batas Bilangan :");
        int batas = input.nextInt();
        int hasil = 0;
        for(int i=1; i<batas; i++)
            hasil += i;
        System.out.println("Totasl Jumlahnya Adalah : "+ hasil);
    }
}
