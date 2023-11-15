public class VirtualDemo{
    public static void main(String[] args) {
        System.out.println("Menyusun Pegawai");
        
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Amin", "Samarinda", 2, 2500.00);
        Pegawai n = new Pegawai("Budi", "Padang", 1);
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji--");
        s.mailCheck();
        String info = s.info;
        System.out.println(info);

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
        info = e.info;
        System.out.println(info);

        System.out.println("\nMemanggil mailCheck Berdasarkan Class Pegawai--");
        n.mailCheck();
        info = n.info;
        System.out.println(info);
    }
}