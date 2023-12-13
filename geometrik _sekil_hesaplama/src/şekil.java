public abstract class şekil {
    private String isim;

    public şekil(String isim) {
        this.isim = isim;
    }
    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
