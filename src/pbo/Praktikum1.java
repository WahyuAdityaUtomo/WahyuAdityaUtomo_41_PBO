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
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jari-jari :");
        double jari = input.nextDouble();
        System.out.print("Luas permukaan bola adalah ="+jari*jari*22/7*4);
    }
}
