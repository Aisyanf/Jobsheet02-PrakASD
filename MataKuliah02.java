class MataKuliah02 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah02() { 
    }
    public MataKuliah02 (String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " +kodeMK);
        System.out.println("Nama Mata Kuliah: " +nama);
        System.out.println("Tampilkan jumlah SKS: " +sks);
        System.out.println("Jumlah total waktu pertemuan dalam satu Minggu: " +jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }
}
