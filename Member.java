package id.ac.unand.fti.si.pbo;

public class Member {
    protected Integer poin = 0;
    
    public Integer getPoin(){
        return poin;
    }

    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer tambahPoin = (int) (totalBayar / 10000);
        return poin += tambahPoin;
    }

    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer totalBayar = jumlahBelanja;
        
        if (totalBayar >= 500000){
            totalBayar -= totalBayar * 1/100;
        }
        
        getBonusPoin(totalBayar);
        
        return totalBayar;
    }
}
