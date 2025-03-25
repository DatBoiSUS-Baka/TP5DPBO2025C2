public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String makananFavorit;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String makananFavorit) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.makananFavorit = makananFavorit;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMakananFavorit(String makanan){ this.makananFavorit = makanan; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getMakananFavorit(){ return this.makananFavorit; }
}
