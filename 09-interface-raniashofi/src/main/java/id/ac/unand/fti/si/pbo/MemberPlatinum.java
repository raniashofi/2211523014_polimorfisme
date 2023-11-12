package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member implements CanDeposit, CanRequestCicilan, CanRequestDelivery {
    Integer saldo = 0;

    @Override
    public Integer deposit(Integer jumlahDeposit) {
        this.saldo = this.saldo + jumlahDeposit;
        return this.saldo;
    }

    @Override
    public Integer tarikTunai(Integer jumlahTarikTunai) {
        this.saldo = this.saldo - jumlahTarikTunai;
        return this.saldo;
    }

    @Override
    public Integer getSaldo() {
        return getSaldo();
    }

    public Integer cekSaldo(){
        return this.saldo;
    }

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 3 / 100) ;
        } 
        else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 5 / 100);
        } 
        else if (jumlahBelanja > 7000000 && jumlahBelanja <= 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100) - 1;
        } 
        else if (jumlahBelanja > 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100);
        } 
        else {
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
        if(jarakTujuan > 10){
            jarakTujuan = (jarakTujuan - 9.3) * 1000.0;
            this.ongkir = Math.round(jarakTujuan * 10.0) / 10.0;
        }

        return this.ongkir;
    }
    
}
