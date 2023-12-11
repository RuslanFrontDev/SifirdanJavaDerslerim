/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String kutsalCanavar, String beybladeci, int donusSureti, int hucumGucu) {
        super(beybladeci, donusSureti, hucumGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

     @Override
    public void ozellikleriniGoster() {
        super.ozellikleriniGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "-i ortaya cixarir");
        System.out.println(getBeybladeci() + "-in mudafie: Savunma");
    }
    
}
