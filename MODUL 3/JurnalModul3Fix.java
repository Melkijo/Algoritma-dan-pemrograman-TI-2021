/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul3fix;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class JurnalModul3Fix {

    public static int getTanggal, getBulan, getTahun;
    public static int tanggalBatas, bulanBatas, tahunBatas;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String tanggal;
        getTanggal = 23;
        getBulan = 4;
        getTahun = 2021;
        int pasien = 1500000;
        System.out.println("Program menghitung pengurangan pasien covid 19");
        System.out.println("Tanggal sekarang 23 April 2021");
        System.out.println("Total pasien covid 19 : " + pasien);
        
        System.out.print("Masukan tanggal akhir yang ingin dicari : ");
        tanggal = sc.nextLine();
        pecahTanggal(tanggal);
        covid19(pasien);
        
    }
    
    static void tanggal(int hari, int bulan, int tahun){
        if(hari == 28 && bulan ==2){
            getTanggal =1;
            getBulan = 3;
        }
        else if (hari == 30 && (bulan == 4 || bulan == 6 || bulan == 9 || bulan ==11)){
            getTanggal = 1;
            getBulan +=1;
        }
        else if(hari == 31 && bulan ==12){
            getTanggal =1;
            getBulan = 1;
            getTahun+=1;
        }
        else if(hari ==31){
            getTanggal =1;
            getBulan +=1;
        }
        else{
            getTanggal+=1;
        }
    }
    static void pecahTanggal(String tanggal){
        int cek = 0;
        String save = "";
        
        for(int i=0 ; i<tanggal.length() ;i++){
            if(tanggal.charAt(i) == '/'){
                switch(cek){
                    case 0:
                        tanggalBatas = Integer.parseInt(save);
                        break;
                    case 1:
                        bulanBatas = Integer.parseInt(save);
                        break;
                }
                save = "";
                cek++;
            }else{
                save+=tanggal.charAt(i);
            }
        }
        tahunBatas = Integer.parseInt(save);
    }
    
    static void covid19(int positifCovid){
        int pengurangan = 0, segitiga = 0, penambahan = 0;
        tanggal(getTanggal, getBulan, getTahun);
        for(int j = 1; segitiga<= 31; j++){ //1,3,6,10,15,21,28
            if(getTanggal == segitiga){
                penambahan = (int) (positifCovid * 0.003);
                positifCovid += penambahan;
            }
            segitiga+=j;
        }
        if(getTanggal%2==0){
            pengurangan = (int) (positifCovid*0.005);
            positifCovid-=pengurangan;
        }
        else{
            pengurangan = (int) (positifCovid * 0.01);
            positifCovid-=pengurangan;
        }
        System.out.println("Pasien covid pada tanggal "+getTanggal+ " " + getBulan+ " "
        + getTahun+ " = " + positifCovid);
        if(getTanggal == tanggalBatas && getBulan == bulanBatas && getTahun == tahunBatas){
            return;        
        }
        else{
            covid19(positifCovid);
        }
    }
    
}
