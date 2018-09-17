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
public class PilihanMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\nMenu luas Bangun\n");
            System.out.println("1. Menghitung luas persegi ");
            System.out.println("2. Menghitung luas persegi panjang");
            System.out.println("keluar");
            System.out.println("Masukan pilihan anda : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 : luasPersegi();break;
                case 2 : luasPersegiPanjang();break;
            }
        }while(pilihan != 3);
    }
    private static void luasPersegi(){
        Scanner input = new Scanner(System.in);
        float sisi,luas;
        System.out.print("Masukan nilai sisi : ");
        sisi = input.nextFloat();
        luas = sisi*sisi;
        System.out.println("Luas persegi adalah: "+ luas);
    }
    private static void luasPersegiPanjang(){
        Scanner input = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.print("Masukan nilai panjang : ");
        panjang = input.nextFloat();
        System.out.print("Masukan nilai lebar : ");
        lebar = input.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: "+ luas);
    }
}

