package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;
    public Monster(String nama) {
        this.nama = nama;
    }
    public String bersuara(){
        return "Suara";
    }
    public void getInfo(){
        System.out.println("Nama: "+nama);
        System.out.println("Suara: "+bersuara());
        System.out.println("Gerak: "+nama+ " "+ bergerak());
    }
    public String getNama() {
        return nama;
    }
}