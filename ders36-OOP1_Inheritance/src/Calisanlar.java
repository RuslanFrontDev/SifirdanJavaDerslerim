/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Calisanlar extends MudurMuavini {

    public Calisanlar(String proyekt, int gun) {
        super(proyekt, gun);
    }
//2.ornek OverRide Detayi
    //    parametr mutleq verilmeliidir

    public void mudurunGosterisi(String proyekt) {
        System.out.println(proyekt + "bu olacaq!!!");
    }

    @Override
    public void mudurunGosterisi() {
        mudurunGosterisi("SK"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
//1. ornek OverRide Detayi
//    @Override
//    public void mudurunGosterisi() {
//        super.mudurunGosterisi();
//    }
    @Override
    public String getProyekt() {
        return super.getProyekt(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getVaxt() {
        return super.getVaxt(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setProyekt(String proyekt) {
        super.setProyekt(proyekt); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setVaxt(int vaxt) {
        super.setVaxt(vaxt); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
