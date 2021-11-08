/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalno2fix;

import java.util.Scanner;

public class JURNALNO2FIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double danaAwal,hotel,pesawatKazak,tiket,olehOleh,danaSisa;
       int ion = 13;
       int cal = 21;
       danaAwal = 110;
       System.out.println("Masukan biaya dalam satuan pon");
       System.out.print("biaya Hotel: ");
       hotel = sc.nextDouble();
       hotel = hotel * 3;
       System.out.print("biaya pesawat Ke kazaktan: ");
       pesawatKazak = sc.nextDouble();
       System.out.print("biaya tiket meet and greet: ");
       tiket = sc.nextDouble();
       System.out.print("biaya beli oleh oleh: ");
       olehOleh = sc.nextDouble();
       danaSisa = danaAwal - (hotel+olehOleh+pesawatKazak+tiket);
       System.out.println("Sisa dana Ijang adalah: " + danaSisa +" pon");
       
       danaAwal = danaAwal * ion;
       hotel = hotel * ion;
       pesawatKazak = pesawatKazak * ion;
       tiket = tiket * ion;
       olehOleh = olehOleh * ion;
       danaSisa = danaAwal - (hotel+olehOleh+pesawatKazak+tiket);
       System.out.println("Sisa dana Ijang adalah: " + danaSisa +" ion");
       
       danaAwal = danaAwal * cal;
       hotel = hotel * cal;
       pesawatKazak = pesawatKazak * cal;
       tiket = tiket * cal;
       olehOleh = olehOleh * cal;
       danaSisa = danaAwal - (hotel+olehOleh+pesawatKazak+tiket);
       System.out.println("Sisa dana Ijang adalah: " + danaSisa +" cal");
       
       danaSisa = danaSisa / (ion * cal); //cal ke pon
       System.out.println("\nSoal nomer 2B");
       double pesawatIndo,gajiSehari,potongan,hari;
       System.out.print("harga pesawat pulang ke Indonesia(dalam pon) : ");
       pesawatIndo = sc.nextDouble();
       gajiSehari = 10; 
       potongan = 1250 / (ion * cal);
       
       hari = (pesawatIndo-danaSisa) / (gajiSehari - potongan);
       hari = Math.ceil(hari); // pembulatan ke atas
       System.out.println("Ijang membutuhkan " + hari +" hari bekerja untuk pulang ke indonesia");
       
       System.out.println("\nSoal No 2 C");
       double gajiKotor = gajiSehari * hari;
       gajiKotor = Math.ceil(gajiKotor); // pembulatan ke atas
       potongan = potongan * hari;
       potongan = Math.ceil(potongan); // pembulatan ke atas
       
       System.out.println("Gaji kotor yang diterima Ijang selama bekerja adalah " + gajiKotor +" pon");
       System.out.println("potongan sewa makan dan uang kos Ijang selama bekerja adalah " + potongan + " pon\n");
       
       System.out.println("Soal no 2 D");
       System.out.println("Ijang bisa pulang keindonesia jika ia bekerja selama " + hari+" hari");
    }
}
