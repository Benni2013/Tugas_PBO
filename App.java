package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        //membuat objek member bertipe Member dalam bentuk Member
        Member member = new Member();

        //membuat objek memberPlat bertipe Member dalam bentuk MemberPlatinum
        Member memberPlat = new MemberPlatinum();
        /*bentuk polimorfisme, yang mana nanti subclass MemberPlatinum akan melakukan override
          terhadap method hitungTotalBayar() sehingga hasil kalkulasinya nanti akan mengikuti method
          pada subclass MemberPlatinum namun tidak dapat memanggil method lain yang ada pada subclass
          MemberPlatinum, seperti method deposit(), cekSaldo(), dll.*/

        //membuat objek memberPlatinum bertipe MemberPlatinum dalam bentuk MemberPlatinum
        MemberPlatinum memberPlatinum = new MemberPlatinum(); //dapat memanggil method MemberPlatinum lainnya
        
        System.out.println("Total bayar member: " + member.hitungTotalBayar(2000000));
        System.out.println("Total bayar memberPlat: " + memberPlat.hitungTotalBayar(2000000));
        System.out.println("Total bayar memberPlatinum: " + memberPlatinum.hitungTotalBayar(2000000));

        //menampilkan hasil dari method lain pada MemberPlatinum 
        System.out.println("--------------------------------------------");
        System.out.println("Saldo awal dari objek memberPlatinum: " + memberPlatinum.cekSaldo());
        memberPlatinum.deposit(200000);
        System.out.println("Saldo setelah deposit 200000: " + memberPlatinum.cekSaldo());
        memberPlatinum.tarikTunai(50000);
        System.out.println("Saldo setelah tarik tunai 50000: " + memberPlatinum.cekSaldo());
    }
    
}
