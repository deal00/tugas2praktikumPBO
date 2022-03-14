/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2fadhil;

/**
 *
 * @author LENOVO
 */
public class lingkaran implements menghitungLuas{
    double jari;

    public lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void luas() {
        double hasil;
        hasil = 3.14*(jari*jari);
        System.out.println("Luas Lingkaran adalah    : " + hasil);
    }

    @Override
    public void keliling() {
        double hasil;
        hasil = 2*(3.14*jari);
        System.out.println("Keliling Lingkaran adalah : " + hasil);
    }
    
   
}
