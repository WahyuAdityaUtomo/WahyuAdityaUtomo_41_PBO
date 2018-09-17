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
public class FungsiRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, hasil;
        System.out.print("Masukan suatu bilangan : ");
        bil = input.nextInt();
        hasil = faktorial(bil);
        System.out.print("Nilai Faktorial " + bil + " adalah " +hasil);
    }
    private static int faktorial(int a){
        if(a==1){
        return 1;
    }else
        return(a*faktorial(a-1));
    }
}
