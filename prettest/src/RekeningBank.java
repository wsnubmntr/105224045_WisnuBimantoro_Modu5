public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        // setter agar validasi langsung berlaku
        setSaldo(saldo);
    }

    // Getter nomorRekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Setter nomorRekening
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter saldo — hanya update jika nilai TIDAK negatif
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Gagal: Saldo tidak boleh negatif!");
        }
    }

    //  untuk testing
    public static void main(String[] args) {
        RekeningBank rek = new RekeningBank("1234567890", 500000);

        System.out.println("Nomor Rekening : " + rek.getNomorRekening());
        System.out.println("Saldo Awal     : " + rek.getSaldo());

        //  isi saldo dengan nilai valid
        rek.setSaldo(750000);
        System.out.println("Saldo Diperbarui: " + rek.getSaldo());

        //  isi saldo dengan nilai negatif (harus ditolak)
        rek.setSaldo(-100000);
        System.out.println("Saldo Setelah Percobaan Negatif: " + rek.getSaldo());
    }
}