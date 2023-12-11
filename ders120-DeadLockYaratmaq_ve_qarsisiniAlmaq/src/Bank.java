/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Bank {
    private int pulunuz = 10000;
    
    
    public void pulCek(int miqdar){
        pulunuz-=miqdar;
    }
    public void pulYatir(int miqdar){
        pulunuz+=miqdar;
    }
    public static void pulTansferi(Bank bank1, Bank bank2, int miqdar){
       bank1.pulCek(miqdar);
       bank2.pulYatir(miqdar);
    };

    public int getPulunuz() {
        return pulunuz;
    }

    public void setPulunuz(int pulunuz) {
        this.pulunuz = pulunuz;
    }
    
}
