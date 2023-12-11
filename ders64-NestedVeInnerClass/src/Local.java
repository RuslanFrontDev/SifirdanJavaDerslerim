/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Local {

    public void run() {
        class MetodSinifi {

            int a;

            public MetodSinifi(int a) {
                this.a = a;
            }

            public void print() {
                System.out.println(a);
            }
        }
        MetodSinifi local = new MetodSinifi(10);
        local.print();
    }
}
