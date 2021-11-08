 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul5no1;

import java.util.Scanner;
//class Mahasiswa {
//    String nama;
//    String NIM;
//    String dosenPA;
//    int tahunLahir;
//}
public class JurnalModul5No1 {

    public static Scanner sc = new Scanner(System.in);
    public static double ipk = 2.55;
    public static String[] dosen,nama,panggilDosen;
    public static int simpanDosen;
    public static void main(String[] args) {
        simpanDosen = 0;
        dosen = new String[50];
        nama = new String[50];
        panggilDosen = new String[50];
        for(int i = 0; i<dosen.length;i++){
            dosen[i] = "";
            nama[i]="";
            panggilDosen[i] = "";
        }
        menu();
        
    }
    public static int menu(){
        System.out.println("Menu");
        String pilih[] = {"Input data ","Dosen","Mahasiswa berhasil seleksi mawapres","Exit"};
        for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s \n",i+1,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                inputData();
                break;
            case 2:
                dosenPa();
                break;
            case 3:
//                mawapres();
                break;
            case 4:
                System.out.println("Terima kasih");
                System.exit(0);
                break;
            default:
                System.out.println("Input salah");
                return menu();
        }
        return 0;
    }
    
    public static void inputData(){
        System.out.print("Masukkan nama: ");
        sc.nextLine();
        nama[simpanDosen] = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String NIM = sc.next();
        char[] simpan = new char[NIM.length()];
        for(int i = 0; i < NIM.length(); i++){
        simpan[i] = NIM.charAt(i);
        }
        String angkatan = Character.toString(simpan[4]);
        angkatan = angkatan + Character.toString(simpan[5]);
        
        System.out.print("Masukkan kode dosen PA: ");
        dosen[simpanDosen] = sc.next();
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = sc.nextInt();
        int umur = 2021 - tahunLahir;
        String jurusan = "teknik Informatika";
        int semester = semesterx(angkatan);
        System.out.println("\nNama : " + nama[simpanDosen]);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk);
        ipk = ipk + 0.15;
        System.out.println("dosen Pengampu : " + dosen[simpanDosen]);
        System.out.println("Umur : " + umur);
        simpanDosen++;
        System.out.print("\nTambah data lagi? (y/n) ");
        char lagi = sc.next().charAt(0);
        if(lagi == 'y'){
            System.out.println("");
            inputData();
        }
        else{
            menu();
        }
    }
    
    public static int dosenPa(){
        int angka = 1;
        for(int i=0; i<dosen.length;i++){
            if(!"".equals(dosen[i])){
                if(!dosen[i].equals(dosen [i+1])){
                   System.out.printf("%d. %s\n",angka,dosen[i]);
                   angka++; 
                } 
            }
        }
        int banyakDosen = dosen.length;
        System.arraycopy(panggilDosen, 0, dosen, 0, dosen.length);
        banyakDosen = removeDuplicateElements(dosen, banyakDosen);  
        System.out.printf("%d. kembali\n",angka);
        System.out.print("Opsi: ");
        int lagi = sc.nextInt();
        int hitung = 1;
        if(lagi == angka){
            return menu();
        }
        System.out.println("");
        for(int i = 0; i<dosen.length;i++){
            if(dosen[lagi-1].equals(panggilDosen[i])){
                 System.out.printf("%d. %s\n",hitung,nama[i]);
                 hitung++;
            }
           
        }
        System.out.println("");
        return dosenPa();
    }
    
    public static int semesterx(String x){
        int hasil = 0;
         int convert =Integer.parseInt(x);
         for(int i = 20; i >= convert; i--){
             if(i == convert){
                 hasil = hasil + 2;
                 return hasil;
             }
             hasil = hasil +2;
         }
         return 0;
    }
    public static int removeDuplicateElements(String arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        String[] temp = new String[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (!arr[i].equals(arr[i+1])){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    } 
}
