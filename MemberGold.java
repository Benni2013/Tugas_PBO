package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanRequestDelivery, CanRequestCicilan{
    
    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer totalBayar = jumlahBelanja;
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar -= totalBayar * 2/100;
        } else if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar -= totalBayar * 4/100;
        } else if (totalBayar > 7000000){
            totalBayar -= totalBayar * 6/100;
        }
        
        getBonusPoin(totalBayar);
        
        return totalBayar;
    }

    public Integer hitungOngkir(Double jarakTujuan){
        Integer ongkir = 0;
        
        if (jarakTujuan >= 7.0) {
            jarakTujuan -= 7.0;
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
}
