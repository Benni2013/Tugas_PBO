package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member implements CanGetDiskon, CanRequestDelivery, CanRequestCicilan, CanDeposit{
    
    public Integer saldo = 0;

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer totalBayar = jumlahBelanja;
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar -= totalBayar * 3/100;
        } else if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar -= totalBayar * 5/100;
        } else if (totalBayar > 7000000 && totalBayar <= 10000000){
            totalBayar -= totalBayar * 7/100 + 1;
        } else if (totalBayar > 10000000) {
            totalBayar -= totalBayar * 7/100;
        }
        
        getBonusPoin(totalBayar);
        
        return totalBayar;
    }

    public Integer hitungOngkir(Double jarakTujuan){
        Integer ongkir = 0;
        
        if (jarakTujuan >= 10.0) {
            jarakTujuan -= 10.0;
            while (jarakTujuan > 0.0) {
                ongkir += 1000;
                jarakTujuan -= 1.0;
            }
        }
        
        return ongkir;
    }

    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan){
        Integer cicilan = 0;
        cicilan = totalBelanja / jumlahBulan;
        return cicilan;
    }

    public void deposit(Integer jumlahDeposit){
        saldo += jumlahDeposit;
    }

    public void tarikTunai(Integer jumlahTarikTunai){
        if (saldo > jumlahTarikTunai) {
            saldo -= jumlahTarikTunai;
        }
    }
    
    public Integer cekSaldo(){
        return this.saldo;
    }
}
