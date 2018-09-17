/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Praktikum3 {
    public static void main(String[] args){
            BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
                    String nama="";
                    String NIS="";
                    String TL="";
                    String TGLL="";
                    String jenisk="";
                    String almt ="";
                    String motto ="";
                    int jumlah= 1;
                    int count= 0;
                    while ( count < jumlah)
                    {
                    System.out.print("Nama Anda:");
                     try{
                    nama=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.print("NIS:");
                    try{
                    NIS=masukan.readLine();
                    }catch(IOException e){
                    System.out.print("Error!");
                    }
                    System.out.print("Tempat Lahir:");
                    try{TL=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.print("Tanggal Lahir:");
                    try{TGLL=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.print("Jenis Kelamin:");
                    try{jenisk=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.print("Alamat di Malang:");
                    try{almt=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.print("Motto Hidup:");
                    try{motto=masukan.readLine();
                    }catch(IOException e){
                    System.out.println("Error!");
                    }
                    System.out.println("\nBiodata Anda");
                    System.out.println("Nama:"+nama);
                    System.out.println("NIS:"+NIS);                        
                    System.out.println("Tempat Lahir:"+TL);
                    System.out.println("Tanggal lahir:"+TGLL);
                    System.out.println("Jenis Kelamin:"+jenisk);
                    System.out.println("Alamat di Malang:"+almt);
                        System.out.println("Motto Hidup:"+motto);
                      count++;
                    }
}

}