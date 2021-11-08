/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul6;

import java.util.Scanner;

public class JurnalModul6 {

    public static Scanner sc = new Scanner(System.in);
    public static User[] user = new User[10];
    public static int nomorLogin;
    
    public static void main(String[] args) {
        
        for(int i = 0; i<user.length;i++){
            user[i] = new User();
            user[i].setNama("");
            user[i].setUmur(0);
            for(int j = 0; j< user[i].teman.length;j++){
                user[i].teman[j] = "";
            }
        }
        
        String[] dataNama = {"rizqi","adit","ajem","rifqi","dika"};
        int[] dataUmur = {18,12,31,41,22};
        user[2].teman[0] = dataNama[0];
        user[2].teman[1] = dataNama[1];
        user[2].teman[2] = dataNama[3];
        user[2].teman[3] = dataNama[4];
        user[0].teman[0] = dataNama[1];
        user[3].teman[0] = dataNama[4];
        for(int i = 0; i<dataNama.length;i++){
            user[i].setNama(dataNama[i]);
            user[i].setUmur(dataUmur[i]);
        }
        for(int i = 0; i<user.length;i++){
            for(int j = 0; j<user[i].teman.length;j++){
                for(int k = 0; k<user[i].teman.length;k++){
                    if(user[j].teman[k] == user[i].getNama()){
                        user[i].teman[j] = user[j].getNama();
                    }
                }
            }
        }
        utama();
    }
    
    public static void home(){
        System.out.println("Home");
        String[] home = {"Tambah teman","Lihat teman","Saran pertemanan","Kembali"};
        for(int i = 0; i<home.length;i++){
            System.out.printf("%d. %s\n",i+1,home[i]);
        }
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        switch(pilih){
            case 1:
                tambahTeman();
                break;
            case 2:
                lihatTeman();
                break;
            case 3:
                saranTeman2();
                break;
            case 4:
                utama();
                break;
            default:
                System.out.println("Input Salah");
                home();
        } 
    }
    
    public static void utama(){
        System.out.println("Menu Utama");
        String[] utama = {"Login","Buat akun","Semua akun","Data pertemanan","Saran pertemanan"};
        for(int i = 0; i<utama.length;i++){
            System.out.printf("%d. %s\n",i+1,utama[i]);
        }
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        switch(pilih){
            case 1:
                login();
                break;
            case 2:
                buatAkun();
                break;
            case 3:
                tampilData();
                break;
            case 4:
                dataTeman();
                break;
            case 5:
                saranTeman();
                break;
            default:
                System.out.println("Input Salah");
                utama();
        }
    }
    
    public static void login(){
        System.out.print("Nama : ");
        sc.nextLine();
        String sign = sc.nextLine();
        
        for(int i = 0;i<user.length;i++){
            if(user[i].getNama().equals(sign)){
                nomorLogin = i;
                home();
                
            }
        }
        System.out.println("\nNAMA SALAH \n");
        utama();
    }
    
    public static void buatAkun(){
        System.out.print("Nama : ");
        sc.nextLine();
        String namaBaru = sc.nextLine();
        System.out.print("Umur : ");
        int umurBaru = sc.nextInt();
        for(int i = 0; i<user.length;i++){
            if("".equals(user[i].getNama())){
                user[i].setNama(namaBaru);
                user[i].setUmur(umurBaru);
                for(int j = 0; j< user[i].teman.length;j++){
                    user[i].teman[j] = "";
                }
                break;
            }
        }
        
        utama();
    }
    public static void tampilData(){
        for(int i = 0; i<user.length;i++){
            if("".equals(user[i].getNama())){
                break;
            }
            System.out.printf("%d. %-10s %d\n",i+1,user[i].getNama(),user[i].getUmur());
        }
        utama();
    }
    
    public static void dataTeman(){ 
        for(int i = 0; i<user.length;i++){
            if(user[i].getNama() == ""){
                break;
            }
            System.out.print(user[i].getNama()+ " : ");
            for(int j = 0; j<user[i].teman.length;j++){
                System.out.printf("%s ",user[i].teman[j]);
            }
            System.out.println("");
        }
        utama();
    }
    
    public static void saranTeman(){
        System.out.println("\nON PROGRESS....\n");
        utama();
    }
    public static void saranTeman2(){
        System.out.println("\nON PROGRESS....\n");
        home();
    }
    
    public static void tambahTeman(){
        for(int i = 0; i<user.length;i++){
            if("".equals(user[i].getNama())){
                break;
            }
            System.out.printf("%d. %-10s \n",i+1,user[i].getNama());
        }
        System.out.print("Pilih : ");
        int temp = 0;
        int pilih = sc.nextInt();
        pilih = pilih -1;
        String temanPilih = user[pilih].getNama();
        for(int j = 0; j<user[0].teman.length;j++){
            if(user[nomorLogin].teman[j] == temanPilih){
                temp = temp + 2;
            }
        }
        for(int i = 0; i<user[0].teman.length; i++){
            if(temp == 0){
                if(user[nomorLogin].teman[i] == ""){
                    user[nomorLogin].teman[i] = temanPilih;
                    temp = temp + 1;
                    break;
                } 
            } 
        }
        for(int i = 0; i< user[0].teman.length;i++){
            if(temp == 1){
                if(user[pilih].teman[i] == ""){
                    user[pilih].teman[i] = user[nomorLogin].getNama();
                    break;
                }
            }
        }
        home();
    }
    
    public static void lihatTeman(){   
    System.out.print(user[nomorLogin].getNama()+ " : ");
        for(int j = 0; j<user[0].teman.length;j++){
            System.out.printf("%s ",user[nomorLogin].teman[j]);
        }
        System.out.println("");
        home();
    } 
}
