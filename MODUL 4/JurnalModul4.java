/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul4;

import java.util.Scanner;

public class JurnalModul4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jika diperoleh dua buah matriks dengan ukuran axa, maka masukan nilai a : ");
        int n1 = sc.nextInt();
        int matriks1[][] = new int [n1][n1];
        for(int i = 0;i<matriks1.length;i++){
            for(int j=0; j< matriks1.length; j++){
                System.out.printf("Matriks[%d][%d] : ",i,j);
                matriks1[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Kemudian, masukkan nilai pada matriks 2 : ");
        int n2 = sc.nextInt();
        int matriks2[][] = new int [n2][n2];
        for(int i = 0;i<matriks2.length;i++){
            for(int j=0; j< matriks2.length; j++){
                System.out.printf("Matriks[%d][%d] : ",i,j);
                matriks2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sehingga diperoleh matriks berdasarkan inputan : ");
        System.out.println("Matriks 1 : ");
        tampil(matriks1);
        System.out.println("Matriks 2 : ");
        tampil(matriks2);
        
        batas();
        
        System.out.println("Matriks setelah diurutkan : ");
        int temp;
        for(int i=0;i<matriks1.length;i++){
            for(int j=0; j<matriks1.length;j++){
                for(int k =0; k<matriks1.length;k++){
                    for(int l = 0; l<matriks1.length; l++){
                        if(matriks1[i][j] < matriks1[k][l]){
                        temp = matriks1[k][l];
                        matriks1[k][l] = matriks1[i][j];
                        matriks1[i][j]=temp;
                        }
                    }   
                }
            }
        }
        for(int i=0;i<matriks2.length;i++){
            for(int j=0; j<matriks2.length;j++){
                for(int k =0; k<matriks2.length;k++){
                    for(int l = 0; l<matriks2.length; l++){
                        if(matriks2[i][j] < matriks2[k][l]){
                        temp = matriks2[k][l];
                        matriks2[k][l] = matriks2[i][j];
                        matriks2[i][j]=temp;
                        }
                    }
                    
                }
            }
        }
        System.out.println("Matriks 1 : ");
        tampil(matriks1);
        System.out.println("Matriks 2 : ");
        tampil(matriks2);
        
        batas();
        
        System.out.println("hasil penjumlahan matriks1 dan matriks2 setelah diurutkan adalah : ");
        int matriksx[][] = new int[n1][n1];
        for(int i =0;i<matriksx.length;i++){
            for(int j=0; j<matriksx.length;j++){
                matriksx[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        tampil(matriksx);
        
        batas();
        
        System.out.println("hasil pengurangan matriks1 dan matriks2 setelah diurutkan adalah : ");
        for(int i =0;i<matriksx.length;i++){
            for(int j=0; j<matriksx.length;j++){
                matriksx[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        tampil(matriksx);
        batas();
        
        int matriksy[][] = new int[matriks1.length][matriks2[0].length];
        System.out.println("hasil perkalian matriks1 dan matriks2 setelah diurutkan adalah : ");
        for(int i = 0; i<matriks1.length;i++){
            for(int j=0; j<matriks2[0].length;j++){
                for(int k=0; k<matriks1[0].length;k++){
                    matriksy[i][j] = matriksy[i][j] + (matriks1[i][k] * matriks2[k][j]);
                }
            }
        }
        tampil(matriksy);
        batas();
        
        System.out.println("Angka terbesar dari matriks1 dan matriks 2 adalah : ");
        if(matriks1[n1-1][n1-1] == matriks2 [n2-1][n2-1]){
             System.out.println(matriks1[n1-1][n1-1]+", pada matriks1 dan matriks2");
        }
        else if(matriks1[n1-1][n1-1] > matriks2 [n2-1][n2-1]){
            System.out.println(matriks1[n1-1][n1-1]+", pada matriks1");
        }
        else{
            System.out.println(matriks2[n2-1][n2-1]+", pada matriks2");
        }
        
        batas();
        
        System.out.println("Angka terkecil dari matriks1 dan matriks 2 adalah : ");
        if(matriks1[0][0] == matriks2 [0][0]){
             System.out.println(matriks1[0][0]+", pada matriks1 dan matriks2");
        }
        else if(matriks1[0][0] < matriks2 [0][0]){
            System.out.println(matriks1[0][0]+", pada matriks1");
        }
        else{
            System.out.println(matriks2[0][0]+", pada matriks2");
        }
        
        batas();
        
        System.out.println("Hasil konversi matriks setelah diurutkan ke dalam romawi : ");
        System.out.println("Matriks1 : ");
        integerToRoman(matriks1);
        System.out.println("Matriks2 : ");
        integerToRoman(matriks2);
    }
    
    public static void batas(){
        System.out.println("========================================================");
    }
    
    public static void tampil(int x[][]){
        for(int i = 0;i<x.length;i++){
            for(int j=0; j< x.length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
     public static void integerToRoman(int num[][]) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();
        for(int i = 0;i<num.length;i++){
            for(int j=0; j< num.length; j++){
                for(int k=0;k<values.length;k++) {
                    while(num[i][j] >= values[k]) {
                        num[i][j] -= values[k];
                        roman.append(romanLiterals[k]);
                    }
                }
                System.out.print(roman.toString() + " ");
                roman.delete(0, roman.length());
            }
            System.out.println("");
        }
    }
}
