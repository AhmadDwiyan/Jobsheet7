/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;


public class pratek1 {
    public static void main(String[] args){
      String datasiswa = "Ahmad Dwiyan Anugrah Putra / X RPL 5 / 3";
        System.out.println("Identitas "+datasiswa );
        Scanner scan = new Scanner(System.in);
   //KITA COBA YA ????
   System.out.println("Masukan Nilai a");
   int apa = scan.nextInt();
   System.out.println("\nIF....1");
   if (apa<5)System.out.println("NILAI A KURANG DARI 5");
   System.out.println("\nIF..........2");
           if(apa==5)System.out.println("NILAI A SAMA DENGAN 5");
           System.out.println("\nIF.........3");
                   if(apa>5)System.out.println("NILAI A LEBIH DARI 5");
                   int nilai;
                   System.out.println("\nNilai Anda?");
                   nilai = scan.nextInt();
                   
                   String kelas = (nilai <75) ? "Belum Kompeten" : "KOMPETEN";
                   System.out.println(nilai +"=> "+kelas);
}
}