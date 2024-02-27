public class bukuMain02 {
    public static void main(String [] args) {

        buku02 bk1  = new buku02();
        bk1.judul  = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku02 bk2 = new buku02("self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku02 bukualfitrohsn = new buku02("Cara Menjadi Kaya Tanpa Bekerja", "Alfitroh Syacy Novalino", 200, 10, 50000);
        bukualfitrohsn.tampilInformasi();
    }   
}