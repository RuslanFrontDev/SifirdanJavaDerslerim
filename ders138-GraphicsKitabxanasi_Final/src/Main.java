
import java.awt.HeadlessException;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Main extends JFrame {

    public static void main(String[] args) {

        QrafiqIstifadesi qrafik = new QrafiqIstifadesi();
        Main ekran = new Main("Qrafiq istifadesii");
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(800, 500);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.add(qrafik);
    }

    public Main(String title) throws HeadlessException {
        super(title);
    }
}
