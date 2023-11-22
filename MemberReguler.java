package id.ac.unand.fti.si.pbo;

public class MemberReguler extends Member implements CanGetDiskon{
    
    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer totalBayar = jumlahBelanja;
        
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar -= totalBayar * 1/100;
        } else if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar -= totalBayar * 2/100;
        } else if (totalBayar > 7000000){
            totalBayar -= totalBayar * 3/100;
        }
        
        getBonusPoin(totalBayar);
        
        return totalBayar;
    }
}
