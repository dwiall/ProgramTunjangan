package si_regpagi_22166030_latihan17_ptunjangan;
import java.util.Scanner;
/**
 *
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Program ini berisi tentang program tunjangan yang bertujuan untuk mengetahui total gaji karyawan yang sudah maupun belum menikah. 
 * Dengan ketentuan, jika karyawan sudah menikah, maka akan mendapatkan gaji pokok + tunjangan 35%, dan jika belum, maka karyawan tersebut hanya mendapatkan gaji pokok dan tidak mendapatkan tunjangan.
 */
public class SI_RegPagi_22166030_Latihan17_PTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("=================Program Tunjangan=================\n");
        String status;
        int gaji_pokok = 6000000, Tunjangan = 0, Total;
        String developed;
   
        System.out.println("Berapa gaji pokok anda perbulan? \t: Rp. " + gaji_pokok);
        System.out.print("Status Anda? Menikah/Belum \t\t: ");
        status = input.next();
        if("Menikah".equals(status)) {
        Tunjangan = 35 *(gaji_pokok) /100;
        System.out.println("Anda mendapatkan tunjangan 35% dari Rp. " + gaji_pokok);
        }else {
        System.out.println("Anda tidak mendapat tunjangan");
        }
        System.out.println("");
        // proses output
        System.out.println("=============Hasil Perhitungan Gaji Anda=============\n");
        System.out.println("Gaji pokok \t: Rp. " + gaji_pokok);
        System.out.println("Tunjangan \t: Rp. " + Tunjangan);
        Total = gaji_pokok + Tunjangan;
        System.out.println("Total Gaji \t: Rp. " + Total);
        System.out.print("(Developed by : ");
    }
    
}
