/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.Mahasiswa;

/**
 *
 * @author ASUS
 */
public class Dosen {
    private String nama;
    private String nip;
    private String alamat;
    private String nohp;
    private String email;
    private String tgllahir;
    private String jenisKelamin;
   

    public Dosen(){
        
    }
    
    public Dosen(String nama, String nip, String alamat, String nohp, String email, String jenisKelamin, String tgllahir) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.nohp = nohp;
        this.email = email;
        this.tgllahir = tgllahir;
        this.jenisKelamin = jenisKelamin;
       
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public String getEmail() {
        return email;
    }
    public String getTgllahir() {
        return tgllahir;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }

  

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setTglalhir(String tgllahir) {
        this.tgllahir = tgllahir;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

   
}
