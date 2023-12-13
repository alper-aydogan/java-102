import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        şekil şekil = null;
        String işlemler = "işlemler......\n"
                + "1.kare alanı hesapla\n"
                + "2.üçgen alan hesapla\n"
                + "3.daire alanı hesapla\n"
                + "çıkış:q";
        while (true) {
            System.out.println(işlemler);
            System.out.println("hangi şeklin alanını hesaplmak istiyorsun");
            String şekiltürü = scan.nextLine();

            if (şekiltürü.equals("q")) {
                System.out.println("programdan çıkılıyor:::");
                break;
            } else if (şekiltürü.equals("1")) {
                System.out.println("karenin kenarı:");
                int kenar = scan.nextInt();
                şekil = new kare("kare1", kenar);
                şekil.alanHesapla();
            } else if (şekiltürü.equals("2")) {
                System.out.println("kenar1:");
                int kenar1 = scan.nextInt();
                System.out.println("kenar2:");
                int kenar2 = scan.nextInt();
                System.out.println("kenar3:");
                int kenar3 = scan.nextInt();
                scan.nextLine();
                şekil = new üçgen("üçgen1", kenar3, kenar2, kenar1);
                şekil.alanHesapla();
            } else if (şekiltürü.equals("3")) {
                System.out.println("dairenin yarıçapı:");
                int yarıçap = scan.nextInt();
                scan.nextLine();
                şekil = new daire("daire1", yarıçap);
                şekil.alanHesapla();

            } else {
                System.out.println("geçersiz işlem");
            }
        }
    }
}

