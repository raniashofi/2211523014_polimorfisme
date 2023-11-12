package id.ac.unand.fti.si.pbo;

public class MemberReguler extends Member{

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 1/100); 
        }
        else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 2/100); 
        }
        else if (jumlahBelanja > 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 3/100); 
        }
        else {
            this.totalBayar = jumlahBelanja; 
        }
    
        return this.totalBayar;
    }

    
}
