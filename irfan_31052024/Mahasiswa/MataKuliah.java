/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.Mahasiswa;

/**
 *
 * @author ASUS
 */
public class MataKuliah {
    private String Nama;
    private String Nobp;
    private String Smt;
    private String Jurusan;
    private String Kelas;
    private String MK;
    private String Sks;

    public MataKuliah() {
    }

    public MataKuliah(String Nama, String Nobp, String Smt,String Jurusan, String Kelas, String MK,  String Sks) {
        this.Nama = Nama;
        this.Nobp = Nobp;
        this.Smt = Smt;
        this.Jurusan= Jurusan;
        this.Kelas = Kelas;
        this.MK = MK;
        this.Sks = Sks;
    }
    
    public String getNama() {
        return Nama;
    }

    public String getNobp() {
        return Nobp;
    }

    public String getSmt() {
        return Smt;
    }
    public String getJurusan() {
        return Jurusan;
    }
    public String getKelas() {
        return Kelas;
    }

    public String getMK() {
        return MK;
    }

    public String getSks() {
        return Sks;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNobp(String Nobp) {
        this.Nobp = Nobp;
    }

    public void setSmt(String Smt) {
        this.Smt = Smt;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public void setSks(String Sks) {
        this.Sks = Sks;
    }
    
    
}
