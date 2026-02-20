class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen02() { 
    }
    public Dosen02 (String id, String nm, boolean status, int thn, String bidang) {
        idDosen = id;
        nama = nm;
        this.statusAktif = status;
        this.tahunBergabung = thn;
        bidangKeahlian = bidang;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " +idDosen);
        System.out.println("Nama Dosen: " +nama);
        System.out.println("Menampilkan Status Dosen: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " +tahunBergabung);
        System.out.println("Bidang Keahlian: " +bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
    if (status == true) {
        statusAktif = true;
    } else {
        statusAktif = false;
        }   
    }
    void hitungMasaKerja(int thnSkrg) {
        int masaKerja = 2026 - tahunBergabung;
        System.out.println("Masa Kerja: " +masaKerja +" Tahun");
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
