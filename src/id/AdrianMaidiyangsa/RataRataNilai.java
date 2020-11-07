/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program menghitung rata-rata nilai, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class RataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    int nilai, i, banyakMahasiswa;
    double rata = 0;
    double jumlah = 0;
    Scanner scanner = new Scanner(System.in);  
    
    public void masukkanJumlah(){    
        System.out.print("Masukan Banyaknya Mahasiswa : " );
        banyakMahasiswa = scanner.nextInt();
    }
    
    public double hitungRataRata(){
        for(i=1; i<=banyakMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = scanner.nextInt();
            jumlah += nilai;
            rata = jumlah/banyakMahasiswa;
        }
        return rata;
    }
    
    public void tampilRataRata(){
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata);
        System.out.println("Developed by : Adrian Maidiyangsa");
    }
}
