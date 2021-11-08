/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul5;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String NIM;
    String dosenPA;
    int tahunLahir;
    String angkatan;
    String jurusan;
    int semester;
    int umur;
    double ipk = 2.25;
    Scanner sc = new Scanner(System.in);
    
    Mahasiswa(){
        menu();
    }
    int menu(){
        System.out.println("Menu");
        String pilih[] = {"Input data ","Dosen","Mahasiswa berhasil seleksi mawapres","Exit"};
        for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s \n",i+1,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                tambahData();
                break;
            case 2:
//                dosen();
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
    void tambahData(){
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        NIM = sc.next();
        char[] simpan = new char[NIM.length()];
        for(int i = 0; i < NIM.length(); i++){
        simpan[i] = NIM.charAt(i);
        }
        angkatan = Character.toString(simpan[4]);
        angkatan = angkatan + Character.toString(simpan[5]);
        
        System.out.print("Masukkan kode dosen PA: ");
        dosenPA = sc.next();
        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = sc.nextInt();
        umur = 2021 - tahunLahir;
        jurusan = "teknik Informatika";
        semester = semesterx(angkatan);
        System.out.println("\nNama : " + nama);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk);
        System.out.println("dosen Pengampu : " + dosenPA);
        System.out.println("Umur : " + umur);
    }
    void inputData(Mahasiswa siswa[]){
        for (int i = 0; i<siswa.length;i++ ){
            siswa[i] = new Mahasiswa();
            System.out.print("\nTambah data lagi? (y/n) ");
            char lagi = sc.next().charAt(0);
            if(lagi == 'y'){
                System.out.println("");
                tambahData();
            }
            else{
                menu();
            }
        }
    }
    int semesterx(String x){
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
    
}

public class JurnalModul5 {
    public static void main(String[] args) {
        Mahasiswa siswa = new Mahasiswa();

    }  
}
