package id.ac.unand.fti.si.pbo;

public class MemberSilver extends Member implements CanGetDiskon, CanRequestDelivery{
    
    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer totalBayar = jumlahBelanja;
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar -= totalBayar * 1/100;
        } else if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar -= totalBayar * 3/100;
        } else if (totalBayar > 7000000){
            totalBayar -= totalBayar * 5/100;
        }
        
        getBonusPoin(totalBayar);

        return totalBayar;
    }

    public Integer hitungOngkir(Double jarakTujuan){
        Integer ongkir = 0;
        
        if (jarakTujuan >= 5.0) {
            jarakTujuan -= 5.0;
            while (jarakTujuan > 0.0) {
                ongkir += 1500;
                jarakTujuan -= 1.0;
            }
        }
        
        return ongkir;
    }
}
