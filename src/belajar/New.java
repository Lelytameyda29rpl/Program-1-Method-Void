/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author MOKLET-2
 */
public class New {
    //Mendeklarasikan Variabel Instance
    int alas;
    int tinggi;
    int hasil;
    
    //Konstruktor(Nama class sama dengan method)
    void New (int alas, int tinggi){//Yang terdapat di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.alas = alas;
        this.tinggi = tinggi;
        
    }
    //Method kedua untuk mencetak hasil
    void hitung(){
    //Rumus Luas Segitiga
        hasil = alas*tinggi/2;
    //Perintah untuk menghasilkan output luas segitiga
        System.out.println("Hasil Luas Segitiga Adalah: "+hasil);
        
    }
    
}
