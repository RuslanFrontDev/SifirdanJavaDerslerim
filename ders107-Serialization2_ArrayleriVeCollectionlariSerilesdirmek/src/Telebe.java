
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Telebe implements Serializable {
    private String ad;
    private int id;
    private String ixtisas;

    public Telebe(String ad, int id, String ixtisas) {
        this.ad = ad;
        this.id = id;
        this.ixtisas = ixtisas;
    }

    @Override
    public String toString() {
        return "Telebe{" + "ad=" + ad + ", id=" + id + ", ixtisas=" + ixtisas + '}';
    }

}
