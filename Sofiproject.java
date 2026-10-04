/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sofiproject;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Sofiproject {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double bilangan1, bilangan2, hasil;
        int pilihan;
        
        System.out.println("================================");
        System.out.println("       KALKULATOR SEDERHANA     ");
        System.out.println("================================");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Pangkat");
        System.out.println("================================");
        
        System.out.print("Masukkan pilihan: ");
        pilihan = sc.nextInt();
        
         if (pilihan >= 1 && pilihan <= 5) {

            System.out.print("Masukkan bilangan pertama: ");
            bilangan1 = sc.nextDouble();
            
            System.out.print("Masukkan bilangan kedua: ");
            bilangan2 = sc.nextDouble();
            
            switch (pilihan) {

                case 1:
                    hasil = bilangan1 + bilangan2;
                    System.out.println("Hasil penjumlahan = " + hasil);
                    break;
                    
                case 2:
                    hasil = bilangan1 - bilangan2;
                    System.out.println("Hasil pengurangan = " + hasil);
                    break;
                
                case 3:
                    hasil = bilangan1 * bilangan2;
                    System.out.println("Hasil perkalian = " + hasil);
                    break;
                
                case 4:
                    if (bilangan2 == 0) {
                        System.out.println("Pembagian dengan angka 0 tidak diperbolehkan.");
                    } else {
                        hasil = bilangan1 / bilangan2;
                        System.out.println("Hasil pembagian = " + hasil);
                    }
                    break;
                 
                case 5:
                    hasil = Math.pow(bilangan1, bilangan2);
                    System.out.println("Hasil perpangkatan = " + hasil);
                    break;
            }
            
          } else {
            System.out.println("Pilihan menu tidak valid!");
        }

        sc.close();   
    }
}
