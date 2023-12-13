public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("..........Corendon Park Havalimanına Hoşgeldiniz......");
        String şartlar = "yurt dışı çıkış kuralları.....:\n"
                + "1. herhangi bir siyasi yasağınız olmamalı...\n"
                + "2. yurt dışı harcını tam olarak ödemelisiniz.....\n"
                + "3. gideceğiniz ğlkeye vizeniz olmalı...\n";
        String mesaj = "yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        while (true) {
            System.out.println("**************************************************");
            System.out.println(şartlar);
            System.out.println("**************************************************");

            yolcu yolcu = new yolcu();
            System.out.println("harc bedeli kontrol ediliyor:");

            Thread.sleep(3000);//programımız 3 saniye beklicek
            if (yolcu.yurtdısıHarcıKontrol() == false) {
                System.out.println(mesaj);
                continue;
                //düngünün en başına gider
            }
            System.out.println("siyasi yasak kontrol ediliyor....");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor....");
            Thread.sleep(3000);
            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("işlemleriniz tamam yurt dışına çıkabilirsiniz");
            break;
        }
    }
}
