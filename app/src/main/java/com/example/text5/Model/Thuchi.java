package com.example.text5.Model;

public class Thuchi {
    private String idthuchi;
    private String tenthuchi;
    private String loai;

    public Thuchi(String idthuchi, String tenthuchi, String loai) {
        this.idthuchi = idthuchi;
        this.tenthuchi = tenthuchi;
        this.loai = loai;
    }

    public Thuchi(String tenthuchi, String loai) {
        this.tenthuchi = tenthuchi;
        this.loai = loai;
    }

    public String getIdthuchi() {
        return idthuchi;
    }

    public String getTenthuchi() {
        return tenthuchi;
    }

    public String getLoai() {
        return loai;
    }
}
