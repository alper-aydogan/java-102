public class daire extends şekil {
    private int yarıçap;

    public daire(String isim, int yarıçap) {
        super(isim);
        this.yarıçap = yarıçap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + "alanı:" + Math.PI * yarıçap * yarıçap);

    }
}
