/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2fadhil;

/**
 *
 * @author LENOVO
 */
public class tabung implements menghitungRuang {
    double jari,ttabung;

    public tabung(double jari, double ttabung) {
        this.jari = jari;
        this.ttabung = ttabung;
    }
    @Override
    public void Volume() {
        double hasil;
        hasil = 3.14*(jari*jari)*ttabung;
        System.out.println("Volume Tabung       : " + hasil);
    }

    @Override
    public void luasPermukaan() {
        double hasil;
        hasil = (2*3.14*jari)*(jari+ttabung);
        System.out.println("Luas Permukaan Tabung : " + hasil);
    }
    
}
