public class Main {
    public static void main(String[] args) {
        // 1. Instansiasi objek Karyawan baru (Soal 4)
        Karyawan staff = new Karyawan("105224045", "Wisnu Bimantoro");

        // 2. Mengisi data departemen lewat Setter (Soal 4)
        staff.setDepartemen("Software Engineering");

        // 3. Tes keamanan (Soal 4)
        System.out.println("Mencoba input gaji negatif");
        staff.setGajiPokok(-2500000);

        // 4. Perbaiki input gaji dengan angka yg benar (Soal 4)
        System.out.println("\nMemperbaiki input gaji ke angka positif");
        staff.setGajiPokok(8000000);

        // 5. Tampilin profil lengkap karyawan (Soal 4)
        System.out.println();
        staff.tampilkanDataKaryawan();
    }
}