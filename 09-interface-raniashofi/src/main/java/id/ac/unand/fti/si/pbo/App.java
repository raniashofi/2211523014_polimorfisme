package id.ac.unand.fti.si.pbo;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis member: ");
        System.out.println("1. Reguler");
        System.out.println("2. Silver");
        System.out.println("3. Gold");
        System.out.println("4. Platinum");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        //menentukan pilihan member
        switch (pilihan) {
            case 1:
                handleMemberReguler(scanner);
                break;
            case 2:
                handleMemberSilver(scanner);
                break;
            case 3:
                handleMemberGold(scanner);
                break;
            case 4:
                handleMemberPlatinum(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
    //jika memilih case 1, maka method ini yang terbaca
    private static void handleMemberReguler(Scanner scanner) {
        //polimorfisme
        Member reguler = new MemberReguler();
        
        System.out.println("Member = Reguler");

        System.out.print("Masukkan jumlah belanja : ");
        int belanjaReguler = scanner.nextInt();
        int totalBayarReguler = reguler.hitungTotalBayar(belanjaReguler);

        System.out.println("Total bayar member reguler: " + totalBayarReguler);
    }

    //jika memilih case 2, maka method ini yang terbaca
    private static void handleMemberSilver(Scanner scanner) {
        //polimorfisme
        Member silver = new MemberSilver();
        MemberSilver memberSilver = new MemberSilver();

        System.out.println("Member = Silver");

        System.out.print("Masukkan jumlah belanja : ");
        int belanjaSilver = scanner.nextInt();
        int totalBayarSilver = silver.hitungTotalBayar(belanjaSilver);

        System.out.print("Masukkan jarak tujuan (km): ");
        double jarakSilver = scanner.nextDouble();
        double ongkirSilver = memberSilver.hitungOngkir(jarakSilver);

        System.out.println("Total bayar member silver: " + totalBayarSilver);
        System.out.println("Ongkir Member Silver: " + ongkirSilver);
    }

    //jika memilih case 3, maka method ini yang terbaca
    private static void handleMemberGold(Scanner scanner) {
        //polimorfisme
        Member gold = new MemberGold();
        MemberGold memberGold = new MemberGold();

        System.out.println("Member = Gold");

        System.out.print("Masukkan jumlah belanja : ");
        int belanjaGold = scanner.nextInt();
        int totalBayarGold = gold.hitungTotalBayar(belanjaGold);

        System.out.print("Masukkan jarak tujuan (km): ");
        double jarakGold = scanner.nextDouble();
        double ongkirGold = memberGold.hitungOngkir(jarakGold);
        double cicilanGold = totalBayarGold /12;

        System.out.println("Total bayar member gold: " + totalBayarGold);
        System.out.println("Ongkir Member Gold: " + ongkirGold);
        System.out.println("Cicilan PerBulan: Rp. " + cicilanGold + "/bulan");
    }

    //jika memilih case 4, maka method ini yang terbaca
    private static void handleMemberPlatinum(Scanner scanner) {
        //polimorfisme
        Member platinum = new MemberPlatinum();
        MemberPlatinum memberPlatinum = new MemberPlatinum();

        System.out.println("Member = Platinum");

        System.out.print("Masukkan jumlah belanja : ");
        int belanjaPlatinum = scanner.nextInt();
        int totalBayarPlatinum = platinum.hitungTotalBayar(belanjaPlatinum);

        System.out.print("Masukkan jarak tujuan (km): ");
        double jarakPlatinum = scanner.nextDouble();
        double ongkirPlatinum = memberPlatinum.hitungOngkir(jarakPlatinum);
        double cicilanPlatinum = totalBayarPlatinum /12;

        System.out.print("Masukkan jumlah deposit : ");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = memberPlatinum.deposit(depositPlatinum);

        System.out.println("Total bayar member platinum: " + totalBayarPlatinum);
        System.out.println("Ongkir Member Platinum: " + ongkirPlatinum);
        System.out.println("Cicilan PerBulan: Rp. " + cicilanPlatinum + "/bulan");
        System.out.println("Saldo Member Platinum setelah deposit: " + saldoPlatinum);
    }
}
