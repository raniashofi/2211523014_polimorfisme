package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanRequestCicilan, CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 2/100); 
        }
        else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 4/100); 
        }
        else if (jumlahBelanja > 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 6/100); 
        }
        else{
        this.totalBayar = jumlahBelanja; 
        }

        return this.totalBayar;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
        return hitungCicilanPerBulan(totalBelanja, jumlahBulan);
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 7){
            jarakTujuan = (jarakTujuan - 6.3) * 1000.0;
            this.ongkir = Math.round(jarakTujuan * 10.0) / 10.0;
            
        }

        return this.ongkir;
    }
    
}
