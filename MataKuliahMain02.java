public class MataKuliahMain02 {
    public static void main(String[] args) {

        MataKuliah02 mk1 = new MataKuliah02();

        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        MataKuliah02 mk2 = new MataKuliah02("BD", "Basis Data", 4, 12);
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
        mk2.tampilkanInformasi();
    }
}
