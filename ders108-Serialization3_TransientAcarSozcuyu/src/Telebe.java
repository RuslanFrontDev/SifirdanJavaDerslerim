
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
//    1. ornek

    /*
    bezi ozellikleri hec serilesdirmek istemirikse ve ya bezi ozellikler artiq yer tutacaqsa 
    kopyalamada ona transient acar kelimesini elave edirik. bunu elave etsek dosyanin boyutu gereksiz
    yereartmaz
     */
 /* private String ad;
//    transient yazib onu Main.java-da run file edib daha sonra ObjeyiOxu-da run file edirik 
    private transient int id;
    private transient String ixtisas;

    public Telebe(String ad, int id, String ixtisas) {
        this.ad = ad;
        this.id = id;
        this.ixtisas = ixtisas;
    }

    @Override
    public String toString() {
        return "Telebe{" + "ad=" + ad + ", id=" + id + ", ixtisas=" + ixtisas + '}';
    }*/
//    **********************************
//    2. ornek
    private String ad;
    private int id;
    private String ixtisas;

    private static int telebeSayisi = 0;
    
    public Telebe(String ad, int id, String ixtisas) {
        this.ad = ad;
        this.id = id;
        this.ixtisas = ixtisas;
    }

    @Override
    public String toString() {
        return "Telebe{" + "ad=" + ad + ", id=" + id + ", ixtisas=" + ixtisas + '}';
    }

    public static int getTelebeSayisi() {
        return telebeSayisi;
    }

    public static void setTelebeSayisi(int telebeSayisi) {
        Telebe.telebeSayisi = telebeSayisi;
    }
}
