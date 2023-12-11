/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Dragon extends Beyblade {

    private String kutsalCanavar;
    private String gizliYeteneyi;

    public Dragon(String kutsalCanavar, String gizliYeteneyi, String beybladeci, int donusSureti, int hucumGucu) {
        super(beybladeci, donusSureti, hucumGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYeteneyi = gizliYeteneyi;
    }

    @Override
    public void ozellikleriniGoster() {
        super.ozellikleriniGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
        System.out.println("Gizli yeteneyi: " + gizliYeteneyi);
    }

    @Override
    public void kutsalCanavar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "-i ortaya cixarir");
        System.out.println(getBeybladeci() + "-in hucumu: Xeyalet Qasirgasi");
    }

}
