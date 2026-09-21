/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatBedah extends Alat {
    protected String bahan;
    
    //konstruktor
    public AlatBedah(String idAlat, String namaAlat, String kondisiAlat, int stokAlat, String bahan) {
        super(idAlat, namaAlat, kondisiAlat, stokAlat);
        this.bahan = bahan;
    }
    
    //getter
    public String getBahan() {
        return bahan;
    }
    
    //setter
    public void setBahan(String bahan) {
        tampilkanAlatLab();
        System.out.println("Bahan: " + bahan);
    }
}
