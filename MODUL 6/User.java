/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmodul6;

public class User {
    String nama;
    int umur;
    String[] teman = new String[5];
    
    void setNama(String nama){
        this.nama = nama;
    }
    void setUmur(int umur){
        this.umur = umur;
    }
    
    String getNama(){
        return nama;
    }
    
    int getUmur(){
        return umur;
    } 
}
