/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalno2modul2;

import java.util.Scanner;

public class JurnalNo2Modul2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan nilai akhir (a) : ");
        int a = sc.nextInt();
        System.out.print("Masukan selisih (b) : ");
        int b = sc.nextInt();
        System.out.print("Masukan banyak barisan (n) : ");
        int n = sc.nextInt();
        int hasil = 0;
        
        // a
        System.out.print("\nSeluruh bilangan aritmatika :");
        for(int i=n; i>=a;i-=b){
            System.out.print(i + " ");
            hasil = hasil + i;
        }
        System.out.println("\nJumlah : " + hasil);
        hasil = 0;
        
        //b
        System.out.print("Seluruh bilangan genap : ");
        for(int i=n; i>=a;i-=b){
            if( (i % 2) ==  0){
                System.out.print(i + " ");
                hasil = hasil + i;
            }
        }
        System.out.println("\njumlah : " + hasil);
        hasil = 0;

        //c
        System.out.print("Seluruh bilangan ganjil : ");
        for(int i=n; i>=a;i-=b){
            if( (i % 2) ==  1){
                System.out.print(i + " ");
                hasil = hasil + i;
            }
        }
        System.out.println("\njumlah : " + hasil);
        hasil = 0;
        
        //d
        int hitung = 0;
        System.out.print("Seluruh bilangan prima : ");
        for(int i=n; i>=a;i-=b){
            for(int j = 1; j<=i;j++){
                int simpan = i%j;
                if(simpan==0){
                    hitung = hitung + 1;
                }
            }
            if(hitung==2){
                System.out.print(i + " ");
                hasil = hasil + i;
            }
            else{
                System.out.print("");
            }
            hitung = 0;
        } 
        System.out.println("\njumlah : " + hasil);
        hasil = 0;
        
        //e
        int x_0 = 0;
        int x_1 = 1;
        int hasilfibo;
        System.out.print("Seluruh bilangan fibonaci : ");
        for(int i = n; i>=a; i-=b){
           for(int j = 0; j<= i; j++){
               
                hasilfibo = x_0 + x_1;
                x_0 = x_1;
                x_1 = hasilfibo;
                if(hasilfibo == i){
                    if( i == 1){
                        System.out.print(i + " ");
                        System.out.print(i + " ");
                        hasil = hasil + i + i;
                    }
                    else{
                        System.out.print(i + " ");
                        hasil = hasil + i;
                    }
                }
           }
           x_0 = 0;
           x_1 = 1;
        }
        System.out.println("\njumlah : "+hasil);
        hasil = 0;

        
        //f
        double hasilSegitiga;
        System.out.print("Seluruh bilangan segitiga : ");
        for(int i = n; i>=a; i-=b){
            for(int j = 1; j<= i;j++){
                hasilSegitiga =(0.5 * j) *(j+1);
                if((double)hasilSegitiga == i){
                    System.out.print(i + " ");
                    hasil = hasil + i;
                }
            }
        }
        System.out.println("\njumlah : "+hasil);
    } 
}
