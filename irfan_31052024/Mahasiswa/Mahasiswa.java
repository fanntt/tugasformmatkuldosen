
package irfan_31052024.Mahasiswa;


public class Mahasiswa 
{
    private String nobp;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private String tglalhir;
    
    public Mahasiswa()
    { 
    }

    public Mahasiswa(String nobp, String nama, String alamat, String jenisKelamin, String tglalhir) {
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.tglalhir = tglalhir;
    }

    

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTglalhir() {
        return tglalhir;
    }

    public void setTglalhir(String tglalhir) {
        this.tglalhir = tglalhir;
    }
}
