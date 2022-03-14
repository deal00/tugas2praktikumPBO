/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2fadhil;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih,ulang=1,cek=0;
        double p,l,tbalok,jari,ttabung;
        Scanner input = new Scanner (System.in);
        
        do {
            System.out.println("----------");
            System.out.println("MENU UTAMA");
            System.out.println("----------");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.print("Input Panjang : ");
                p = input.nextDouble();
                System.out.print("Input Lebar   : ");
                l = input.nextDouble();
                System.out.print("Input Tinggi  : ");
                tbalok = input.nextDouble();
                persegiPanjang persegiPanjang = new persegiPanjang(p,l);
                balok balok = new balok(p,l,tbalok);
                persegiPanjang.luas();
                persegiPanjang.keliling();
                balok.Volume();
                balok.luasPermukaan();
            }
            else if (pilih == 2) {
                System.out.print("Input Jari Jari : ");
                jari = input.nextDouble();
                System.out.print("Input Tinggi    : ");
                ttabung = input.nextDouble();
                lingkaran lingkaran = new lingkaran(jari);
                tabung tabung = new tabung(jari,ttabung);
                lingkaran.luas();
                lingkaran.keliling();
                tabung.Volume();
                tabung.luasPermukaan();
            }
            else if (pilih == 3) {
                cek = 1;
                ulang = 0;
            }
            else {
                System.out.println("Input yang anda masukan salah!");
            }
            if (cek == 0) {
                System.out.print("Apakah anda ingin mengulang? [Yes = 1 || No = 0] : ");
                ulang = input.nextInt();
            }
        } while (ulang == 1);
            
        
    }
    
}
