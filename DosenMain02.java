public class DosenMain02 {
    public static void main(String[] args) {
        
        Dosen02 d1 = new Dosen02();

        d1.idDosen = "D0123";
        d1.nama = "Pramana Yoga Saputra, S.Kom., MMT.";
        d1.statusAktif = true;
        d1.tahunBergabung = 2010;
        d1.bidangKeahlian = "Algoritma dan Struktur Data";

        d1.tampilkanInformasi();
        d1.hitungMasaKerja(2026);

        d1.ubahKeahlian("Dasar Pemrograman");

        d1.tampilkanInformasi();
        d1.hitungMasaKerja(2026);

        Dosen02 d2 = new Dosen02 ("Dosen321", "Adevian Fairuz Pratama,S.S.T., M.Eng.", false, 2020, "Matematika Lanjut");
        d2.tampilkanInformasi();
        d2.hitungMasaKerja(2026);
    }
}