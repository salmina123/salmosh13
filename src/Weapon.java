public class Weapon {
    public void setAvtomat(String avtomat) {
        this.avtomat = avtomat;
    }

    public void setADSM(String ADSM) {
        this.ADSM = ADSM;
    }

    public String getAvtomat() {
        return avtomat;
    }

    public String getADSM() {
        return ADSM;
    }

    private String avtomat; // тип оружия
    private String ADSM; // название оружия
}
