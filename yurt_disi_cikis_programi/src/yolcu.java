import java.util.Scanner;

public class yolcu implements yurtDısı_kuralları {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public yolcu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("yatırdığınız harç bedeli?:");
        this.harc = scan.nextInt();
        scan.nextLine();
        System.out.print("siyasi yasağığnız var mı?:");
        String cevap = scan.nextLine();
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }
        System.out.println("vizieniz bulunuyor mu?");
        String cevap2 = scan.nextLine();
        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtdısıHarcıKontrol() {
        if (this.harc < 3460) {
            System.out.println("lütfen yurt dışı çıkış harcını tam yatırın");
            return false;
        } else {
            System.out.println("yurtdışı harc işlemi tamam");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("vize işlemleri: tamam");
            return true;
        } else {
            System.out.println("gideceğiniz ülke için vizeniz bulunmamaktadır");
            return false;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("siyasi yasağınız bulunnuyor yurtdışına çıkamazsınız");
            return false;
        } else {
            System.out.println("siyasi yasağınız bulunmuyor");
            return true;
        }

    }
}
