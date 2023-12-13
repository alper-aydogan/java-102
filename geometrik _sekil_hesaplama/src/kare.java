public class kare extends şekil {
    private int kenar;

    public kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + "alanı" + (kenar * kenar));

    }
}
