/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Alat {
    protected final String idAlat;
    protected String namaAlat;
    protected String kondisiAlat;
    protected int stokAlat;
    
    //konstruktor
    public Alat(String idAlat, String namaAlat, String kondisiAlat, int stokAlat) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisiAlat = kondisiAlat;
        this.stokAlat = stokAlat;
    }
    
    //getter
    public String getNamaAlat() {
        return namaAlat;
    }
    public String getKondisiAlat() {
        return kondisiAlat;
    }
    public int getStokAlat() {
        return stokAlat;
    }
    
    //setter
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public void setKondisiAlat(String kondisiAlat) {
        this.kondisiAlat = kondisiAlat;
    }
    public void setStokAlat(int stokAlat) {
        this.stokAlat = stokAlat;
    }
    
    //method
    public void tampilkanAlatLab() {
        System.out.println("ID Alat: " + idAlat);
        System.out.println("Nama Alat: " + namaAlat);
        System.out.println("Kondisi Alat: " + kondisiAlat);
        System.out.println("Stok Alat: " + stokAlat);
    }
    public void kurangiStok(int jumlahPinjam) {
        if(jumlahPinjam > 0 && jumlahPinjam <= stokAlat) {
            stokAlat -= jumlahPinjam;
        }
    }
    public void tambahStok(int jumlah) {
        stokAlat += jumlah;
    }
}
