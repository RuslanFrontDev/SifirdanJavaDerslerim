
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class MusteriOdemeleri {

    private double manat = 1000;

    public double getManat() {
        return manat;
    }

    public void setManat(double manat) {
        this.manat = manat;
    }

    public void pulCek(double manatInput) {
        manat += manatInput;
        setManat(manat);

    }

    public void pulYatir(double manatInput) {
        
            manat -= manatInput;
            setManat(manat);
    }
}
