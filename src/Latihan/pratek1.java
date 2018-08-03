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
    
                   System.out.println("\nIF...ELSE...1");
                   if(apa<5) {
                       System.out.println("Isi Variebel A "+apa);
                       System.out.println("NILAI A KURANG DARI 5");
                   }else 
                       System.out.println("NILAI A LEBIH DARI ATAU SAMA DENGAN 5");
                   System.out.println("Bilangan "+apa);
                   
       if(apa<5) {
                 System.out.println("NILAI A KURANG DARI 5");
       }else if(apa==5) {
           System.out.println("NILAI A SAMA DENGAN 5");
       } else
        System.out.println("NILAI A LEBIH DARI 5");
       {
   System.out.println("\nIF..ELSE..IF..1");
   if (apa<2){
       System.out.println("NILAI KURANG DARI 2");
   } else if(apa<4) {
        System.out.println("NILAI KURANG DARI 4");
        } else if(apa<6) {
        System.out.println("NILAI KURANG DARI 6");
        } else if(apa==6) {
        System.out.println("NILAI SAMA DENGAN 6");
        } else {
             System.out.println("NILAI LEBIH DARI 6");
             
            
   }
   System.out.println("\nNested IF..");
   if (apa<7) {
       System.out.println("NILAI A KURANG DARI 7");
         if (apa>2) 
       System.out.println("NILAI A LEBIH DARI 2");
         if (apa<4) 
       System.out.println("NILAI A Kurang Dari 4");
       
   
       
   }
           
}    
    }
    }