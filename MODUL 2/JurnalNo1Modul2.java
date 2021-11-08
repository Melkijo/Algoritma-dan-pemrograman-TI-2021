/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalno1modul2;

import java.util.Scanner;

public class JurnalNo1Modul2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Program penghitung tinggi air\n");
       System.out.print("Masukan tahun : ");
       int tahun = sc.nextInt();
       int airLaut = 0;
       int i;
       int hitung = 0;
       for(i =1; i<=tahun;i++){
           for(int j = 1; j <=i ; j++){
               int simpan = i%j;
                if(simpan==0){
                    hitung ++;
                }
           }               
        if(hitung==2){
            airLaut = airLaut + 7;
            System.out.println("Air laut naik dalam " + i + " tahun : " + airLaut + " cm");
        }
        else{
            airLaut = airLaut + 5;
            System.out.println("Air laut naik dalam " + i + " tahun : " + airLaut + " cm");
        }
        hitung = 0;
       } 
       i = i-1;
       System.out.println("\nKenaikan air laut selama " + i +" tahun : " + airLaut + " cm");
    } 
}
