public class KamarHotel {

    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar,
                      int kapasitasMaksimal, double hargaPerMalam) {

        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean getIsTersedia() {
        return isTersedia;
    }

    public void setTipeKamar(String tipeKamar) {

        if (tipeKamar.equalsIgnoreCase("Reguler") ||
            tipeKamar.equalsIgnoreCase("Premium") ||
            tipeKamar.equalsIgnoreCase("Suite")) {

            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe kamar tidak valid, Diubah menjadi Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double hargaPerMalam) {

        if (hargaPerMalam < 50000) {
            System.out.println("Harga terlalu rendah, Diubah menjadi 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar berhasil dipesan.");
        } else {
            System.out.println("Kamar sudah terisi!");
        }
    }

    public void pesanKamar(int jumlahTamu) {

        if (!isTersedia) {
            System.out.println("Kamar sudah dipesan");
            return;
        }

        if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Jumlah tamu melebihi kapasitas, Pesanan ditolak.");
        } else {
            isTersedia = false;
            System.out.println("Pemesanan berhasil untuk "
                    + jumlahTamu + " tamu.");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("Pesanan dibatalkan, kamar tersedia kembali.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * hargaPerMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {

        double total = jumlahMalam * hargaPerMalam;

        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            System.out.println("Voucher berhasil, Diskon 20% diberikan.");
            return total * 0.8;
        } else {
            System.out.println("Voucher gagal digunakan.");
            return total;
        }
    }

    public void cetakInfo() {
        System.out.println("===== STRUK INFORMASI KAMAR =====");
        System.out.println("Nomor Kamar      : " + nomorKamar);
        System.out.println("Tipe Kamar       : " + tipeKamar);
        System.out.println("Kapasitas Maks   : " + kapasitasMaksimal);
        System.out.println("Harga / Malam    : " + hargaPerMalam);
        System.out.println("Status Tersedia  : " + isTersedia);
        System.out.println("----------------------------------");
    }
}