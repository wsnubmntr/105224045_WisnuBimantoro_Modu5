public class Main {
    public static void main(String[] args) {

        KamarHotel kamar1 =
                new KamarHotel("101", "Reguler", 3);

        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerMalam(-10000);

        KamarHotel kamar2 =
                new KamarHotel("202", "Premium", 2, 300000);

        kamar2.pesanKamar(4);

        kamar2.pesanKamar(2);

        kamar2.pesanKamar();

        System.out.println("\nTagihan kamar1:");
        double total1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total bayar: " + total1);

        System.out.println("\nTagihan kamar2:");
        double total2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total bayar: " + total2);
        
        kamar1.cetakInfo();
        kamar2.cetakInfo();
    }
}