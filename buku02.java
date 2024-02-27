public class buku02 {
    
    String judul, pengarang;
    int halaman, stok, harga;
    int hargaTotal, diskon, hargaBayar;

    public buku02() {
    }

    public buku02(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok habis, tidak dapat menjual buku.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jmlTerjual) {
        hargaTotal = harga * jmlTerjual;
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = (int) (0.12 * hargaTotal);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int) (0.05 * hargaTotal);
        } else {
            diskon = 0;
        }
    }

    void hitungHargaBayar() {
        hargaBayar = hargaTotal - diskon;
    }
}
