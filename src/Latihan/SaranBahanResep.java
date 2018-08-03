/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;
public class SaranBahanResep {
    public static void main(String[] args) {
        String identitas="Ahmad Dwiyan Anugrah Putra / RPL 5 /3";
        System.out.println("Identitas"+identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("BAHAN PERTAMA: ");
         System.out.println("Bahan 1: Pisang");
         System.out.println("BAHAN 2 :Telur");
         System.out.print("MASUKAN PILIHANMU");
         int bahan1 = masukan.nextInt();
         if(bahan1 == 1 || bahan1 == 2)
         {
        System.out.println("BAHAN KEDUA:");
        if(bahan1 == 1) {
            System.out.println("1. Susu");
             System.out.println(" 2.Minyak Gorng");
         System.out.println("3.Tidak Ada");
         System.out.println("Masukan Pilihan Mu");
         int bahan2 = masukan.nextInt();
           
        }else
            System.out.println("Mohon Maaf Pilihan Tidak Ditemukan"+"Tidak dapat memberikan Saran Resep");
         
        
            
        }
        
}
}
}