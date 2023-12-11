
import java.io.Serializable;


public class Kart implements Serializable{
    private char deyer;
    private boolean texmin = false;

    public Kart(char deyer) {
        this.deyer = deyer;
    }

    public char getDeyer() {
        return deyer;
    }

    public void setDeyer(char deyer) {
        this.deyer = deyer;
    }

    public boolean isTexmin() {
        return texmin;
    }

    public void setTexmin(boolean texmin) {
        this.texmin = texmin;
    }
    
}
