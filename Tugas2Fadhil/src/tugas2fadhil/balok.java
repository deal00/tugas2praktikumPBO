/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2fadhil;

/**
 *
 * @author LENOVO
 */
public class balok implements menghitungRuang{
    double p,l,tbalok;

    public balok(double p, double l, double tbalok) {
        this.p = p;
        this.l = l;
        this.tbalok = tbalok;
    }
    @Override
    public void Volume() {
        double hasil;
        hasil = p*l*tbalok;
        System.out.println("Volume Balok       : " + hasil);
    }

    @Override
    public void luasPermukaan() {
        double hasil;
        hasil = 2*((p*l)+(p*tbalok)+(l*tbalok));
        System.out.println("Luas Permukaan Balok : " + hasil);
    }
    
}
