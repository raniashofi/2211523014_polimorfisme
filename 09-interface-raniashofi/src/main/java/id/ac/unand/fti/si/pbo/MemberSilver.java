package id.ac.unand.fti.si.pbo;

public class MemberSilver extends Member implements CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 1/100); 
        }
        else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 3/100); 
        }
        else if (jumlahBelanja > 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 5/100); 
        }
        else {
            this.totalBayar = jumlahBelanja; 
        }
        
        return this.totalBayar;
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 5){
            jarakTujuan =  jarakTujuan - 4.3;
            this.ongkir = jarakTujuan * 1500.0;
        }

        return this.ongkir;
    }

}
