/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import java.util.ArrayList;
import model.Peminjaman;
import model.Alat;
import model.AlatBedah;

/**
 *
 * @author HP
 */
public class TugasPBOLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Alat> daftarAlat = new ArrayList<>();
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
        
        //Data alat
        daftarAlat.add(new Alat("A001", "Mikroskop", "Baik", 10));
        daftarAlat.add(new Alat("A002", "Labu Erlenmeyer", "Baik", 8));
        daftarAlat.add(new Alat("A003", "Petri Dish", "Baik", 20));
        daftarAlat.add(new AlatBedah("A004", "Pinset", "Baik", 5, "Stainless Steel"));

        boolean berjalan = true;
        int idPeminjaman = 1;
        
        while (berjalan) {
            System.out.println("\n== SISTEM PEMINJAMAN ALAT LABORATORIUM ==");
            System.out.println("1. Tampilkan Alat");
            System.out.println("2. Tambahkan Peminjaman");
            System.out.println("3. Tampilkan Riwayat Peminjaman");
            System.out.println("4. Kembalikan Alat");
            System.out.println("5. Keluar");
            System.out.println("Pilih Menu (1-5): ");
            
            try {
                int pilihan = input.nextInt();
                input.nextLine();
                
                switch(pilihan) {
                    case 1 ->{
                        System.out.println("\n-- DAFTAR ALAT LABORATORIUM --");
                        for (Alat alat : daftarAlat) {
                            alat.tampilkanAlatLab();
                            
                            if (alat instanceof AlatBedah) {
                                AlatBedah alatBedah = (AlatBedah) alat;
                                System.out.println("Bahan: " + alatBedah.getBahan());
                            }
                            System.out.println("-------------------------");
                        }
                    }
                    case 2 ->{
                        System.out.println("\n-- TAMBAHKAN PEMINJAMAN --");
                        
                        System.out.println("Nama Petugas: ");
                        String namaPetugas = input.nextLine();
                        
                        System.out.println("Nama Alat: ");
                        String namaAlat = input.nextLine();
                        
                        Alat alatDipinjam = null;
                        
                        for (Alat alat : daftarAlat) {
                            if (alat.getNamaAlat().equalsIgnoreCase(namaAlat)) {
                                alatDipinjam = alat;
                                break;
                            }
                        }
                        if (alatDipinjam == null) {
                            System.out.println(">> Alat tidak ditemukan.");
                            break;
                        }
                        int jumlahPinjam;
                        
                        while(true) {
                            System.out.println("Jumlah Pinjam: ");
                            
                            try {
                                jumlahPinjam = input.nextInt();
                                input.nextLine();
                                
                                if (jumlahPinjam <= 0) {
                                    System.out.println(">> Jumlah pinjam harus lebih dari 0.");
                                } else if (jumlahPinjam > alatDipinjam.getStokAlat()) {
                                    System.out.println(">> Stok tidak mencukupi. Stok tersedia: " + alatDipinjam.getStokAlat());
                                } else {
                                    break;
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println(">> Jumlah pinjam harus berupa angka.");
                                input.nextLine();
                            }
                        }
                        Peminjaman peminjaman = new Peminjaman(idPeminjaman, namaPetugas, namaAlat, jumlahPinjam);
                        
                        peminjaman.pinjamAlat(alatDipinjam);
                        
                        daftarPeminjaman.add(peminjaman);
                        
                        idPeminjaman++;
                        
                        System.out.println(">> Peminjaman berhasil ditambahkan!");
                        System.out.println("Stok " + alatDipinjam.getNamaAlat() + " " + "sekarang: " + alatDipinjam.getStokAlat());
                    }
                    case 3 ->{
                        System.out.println("\n-- RIWAYAT PEMINJAMAN --");
                        
                        if (daftarPeminjaman.isEmpty()) {
                            System.out.println(">> Belum ada riwayat peminjaman.");
                        } else {
                            for (Peminjaman peminjaman : daftarPeminjaman) {
                                peminjaman.tampilkanPeminjaman();
                                System.out.println("-------------------------");
                            }
                        }
                    }
                    case 4 ->{
                        System.out.println("\n-- KEMBALIKAN ALAT --");
                        
                        if (daftarPeminjaman.isEmpty()){
                            System.out.println(">> Belum ada peminjaman.");
                            break;
                        }
                        System.out.println("Masukkan ID Peminjaman: ");
                        
                        try{
                            int idKembali = input.nextInt();
                            input.nextLine();
                            
                            Peminjaman peminjamanDitemukan = null;
                            
                            for (Peminjaman peminjaman : daftarPeminjaman) {
                                if(peminjaman.getIdPeminjaman() == idKembali) {
                                    peminjamanDitemukan = peminjaman;
                                    break;
                                }
                            }
                            if (peminjamanDitemukan == null) {
                                System.out.println(">> ID peminjaman tidak ditemukan.");
                                break;
                            }
                            if (peminjamanDitemukan.getStatus().equals("Dikembalikan")) {
                                System.out.println(">> Alat sudah dikembalikan");
                                break;
                            }
                            Alat alatDikembalikan = null;
                            
                            for (Alat alat : daftarAlat) {
                                if (alat.getNamaAlat().equalsIgnoreCase(peminjamanDitemukan.getNamaAlat())) {
                                    alatDikembalikan = alat;
                                    break;
                                }
                            }
                            if (alatDikembalikan != null) {
                                peminjamanDitemukan.kembalikanAlat(alatDikembalikan);
                                
                                System.out.println(">> Alat berhasil dikembalikan.");
                                System.out.println("Stok " + alatDikembalikan.getNamaAlat() + " " + "sekarang: " + alatDikembalikan.getStokAlat());
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println(">> ID Peminjaman harus berupa angka.");
                            input.nextLine();
                        }
                    }
                    case 5 -> {
                        berjalan = false;
                        System.out.println("Program Selesai.");
                    }
                    default -> {
                        System.out.println(">> Menu hanya tersedia dari 1 sampai 5.");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(">> Input harus berupa angka.");
                input.nextLine();
            }
        }
        input.close();
    }
}
