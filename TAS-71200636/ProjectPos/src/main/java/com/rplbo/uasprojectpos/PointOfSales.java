package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PointOfSales {
    public void inputBarang(Barang barang) {
        arrBarang.add(barang);
    }
    private ArrayList<Barang> arrBarang = new ArrayList<Barang>();
    public PointOfSales() {
    }
    public void tampilDaftarBarang() {
        System.out.println("Kode Barang \t Nama Barang \t\t\t\t Stok \t\t\t Harga ");
        for (Barang i : arrBarang){
            System.out.println(i.getKode()+"\t\t\t"+i.getNama()+"\t\t\t"+i.getStok()+"\t\t\t"+"Rp "+i.getHarga());
        }
    }
    public void checkout(HashMap<Barang, Integer> keranjang, long nominal) {
        long harga_barang = 0;
        int keranjang1 = 0;
        for (Map.Entry<Barang, Integer> i : keranjang.entrySet()){
            harga_barang += i.getKey().getHarga() * i.getValue();;
            i.getKey().setStok(i.getKey().getStok() - i.getValue());
        }
        System.out.println("-----Transaksi Sukses----");
        System.out.println("Total Tagihan: Rp "+harga_barang);
        System.out.println("Total Bayar: Rp "+nominal);
        System.out.println("Total Kembalian: Rp "+(nominal - harga_barang));
    }
}
