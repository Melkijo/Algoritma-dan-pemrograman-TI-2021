/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul4no2;

import java.util.Scanner;

public class JurnalModul4No2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ABECEDARIAN AND PALINDROME PROGRAM");
        System.out.print("Nama Panggilan anda : ");
        String nama = sc.next();
        System.out.println("Hai " + nama + ", Selamat datang di ABECEDARIAN AND PALINDROME PROGRAM ");
        
        batas();
        
        System.out.println("ABECEDARIAN PROGRAM");
        System.out.print("MASUKKAN KATA: ");
        String abece = sc.next();
        abece = abece.toLowerCase();
        char[] pecah = new char[abece.length()];
        
        for (int i = 0; i < abece.length(); i++) {
            pecah[i] = abece.charAt(i);
        }
        
        int tes = 0;
        for (int i = 0; i < pecah.length-1; i++) {
            if(pecah[i] > pecah[i+1]){
                System.out.println("TIDAK termasuk Abecedarian");
                tes ++;
                break;
            }
        }
        if(tes == 0){
            System.out.println("Termasuk Abecedarian");
        }
        
        batas();
        
        System.out.println("PALINDROME PROGRAM");
        System.out.print("MASUKKAN TEKS: ");
        String poli = sc.next();
        poli = poli.toLowerCase();
        
        char[] pecah2 = new char[poli.length()];
        char[] pecah2Reverse = new char[poli.length()];
        
        int tes2 = 0;
        for (int i = 0; i < poli.length(); i++) {
            pecah2[i] = poli.charAt(i);
        }
        
        int x = 0;
        for(int i = pecah2Reverse.length-1; i>=0;i--){  
            pecah2Reverse[x] = poli.charAt(i);
            x++;
        }
        for(int i =  0; i < poli.length(); i++){
            if(pecah2[i] != pecah2Reverse[i]){
                System.out.println("TIDAK Termasuk Palindrome");
                tes2 ++;
                break;
            }
        }
        
        if(tes2 == 0){
            System.out.println("Termasuk Palindrome");
        }
         
    } 
    
    public static void batas(){
        System.out.println("============================================");
    }
    
}
