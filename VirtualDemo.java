public class VirtualDemo{
    public static void main(String[] args) {
        System.out.println("Menyusun Pegawai");
        
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Amin", "Samarinda", 2, 2500.00);
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji--");
        s.mailCheck();
        System.out.println(s.info);

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
        System.out.println(e.info);

    }
}