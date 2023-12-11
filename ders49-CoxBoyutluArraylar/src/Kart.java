
public class Kart {
    private boolean texmin = false;
    private char herf;

    public Kart(char herf) {
        this.herf = herf;
    }

    public boolean isTexmin() {
        return texmin;
    }

    public void setTexmin(boolean texmin) {
        this.texmin = texmin;
    }

    public char getHerf() {
        return herf;
    }

    public void setHerf(char herf) {
        this.herf = herf;
    }
}
