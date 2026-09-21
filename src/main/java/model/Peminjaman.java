/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Alat;

/**
 *
 * @author HP
 */
public class Peminjaman {
    protected final int idPeminjaman;
    protected String namaPetugas;
    protected String namaAlat;
    protected int jumlahPinjam;
    protected String status;
    
    //konstruktor
    public Peminjaman(int idPeminjaman, String namaPetugas, String namaAlat, int jumlahPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.namaPetugas = namaPetugas;
        this.namaAlat = namaAlat;
        this.jumlahPinjam = jumlahPinjam;
        this.status = "Dipinjam";
    }
    
    //getter
    public int getIdPeminjaman() {
        return idPeminjaman;
    }
    public String getNamaPetugas() {
        return namaPetugas;
    }
    public String getNamaAlat() {
        return namaAlat;
    }
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    public String getStatus() {
        return status;
    }
    
    //setter
    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    //method
    public void tampilkanPeminjaman() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Nama Alat: " + namaAlat);
        System.out.println("Jumlah Pinjam: " + jumlahPinjam);
        System.out.println("Status: " + status);
    }
    public void kembalikanAlat(Alat alat) {
        if (status.equals("Dipinjam")) {
            alat.tambahStok(jumlahPinjam);
            status = "Dikembalikan";
        }
    }
    public void pinjamAlat(Alat alat) {
        if(jumlahPinjam > 0 && jumlahPinjam <= alat.getStokAlat()) {
            alat.kurangiStok(jumlahPinjam);
            status = "Dipinjam";
        }
    }
    
}
