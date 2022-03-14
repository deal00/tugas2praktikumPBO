/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2fadhil;

/**
 *
 * @author LENOVO
 */
public class persegiPanjang implements menghitungLuas{
    double p,l;

    public persegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }
    
    
    @Override
    public void luas() {
        double hasil;
        hasil = p*l;
        System.out.println("Luas Persegi Panjang    : " + hasil);
    }

    @Override
    public void keliling() {
        double hasil;
        hasil = 2*(p*l);
        System.out.println("Keliling Persegi Panjang : " + hasil);
    }
    
}
