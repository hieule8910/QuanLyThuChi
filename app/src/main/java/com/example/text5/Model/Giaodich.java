package com.example.text5.Model;

public class Giaodich {
    private int idgd;
    private int idthuchi;
    private int sotien;
    private String ngay;
    private String mota;

    public Giaodich(int idgd, int idthuchi, int sotien, String ngay, String mota) {
        this.idgd = idgd;
        this.idthuchi = idthuchi;
        this.sotien = sotien;
        this.ngay = ngay;
        this.mota = mota;
    }

    public Giaodich(int idthuchi, int sotien, String ngay, String mota) {
        this.idthuchi = idthuchi;
        this.sotien = sotien;
        this.ngay = ngay;
        this.mota = mota;
    }

    public int getIdgd() {
        return idgd;
    }

    public int getIdthuchi() {
        return idthuchi;
    }

    public int getSotien() {
        return sotien;
    }

    public String getNgay() {
        return ngay;
    }

    public String getMota() {
        return mota;
    }
}
