
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

    /*
    əgər dəyişməsini istəmədiyimiz dosyanın dəyərini 1000 olaraq yazıb qeyd edib oxutsaq
    o zaman serialVersionUID. əgər 1000 olaraq dosyanı yazsaq(Main-e gelib run file edib) daha sonra
     private static final long serialVersionUID = 2000; olaraq oxutsaq burada İOExc xətası gələcəkdir
     */
    private static final long serialVersionUID = 1000;
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
