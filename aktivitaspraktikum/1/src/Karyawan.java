public class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok;
    private String departemen; 

    // Konstruktor buat ngisi ID dan Nama kalo objek dibuat (Soal 1)
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    // Getter dan Setter buat idKaryawan (Soal 1)
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    // Getter dan Setter buat nama (Soal 1)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter buat gajiPokok (Soal 2)
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gaji) {
        // Cek apa gaji yang diinput negatif (Soal 2)
        if (gaji >= 0) {
            this.gajiPokok = gaji;
        } else {
            System.out.println("Peringatan: Gaji tidak boleh kurang dari nol!");
        }
    }

    // Getter dan Setter buat departemen (Soal 3)
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Fitur buat cetak rangkuman profil karyawan (Soal 3)
    public void tampilkanDataKaryawan() {
        System.out.println("--- Laporan Data Karyawan ---");
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama        : " + nama);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Gaji Pokok  : " + gajiPokok);
    }
}