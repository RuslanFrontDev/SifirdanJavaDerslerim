/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Pult implements  ITelevizor{
    private String tvKanal;

    public Pult(String tvKanal) {
        this.tvKanal = tvKanal;
    }

    @Override
    public String kanal() {
        return tvKanal;
    };
    
}
