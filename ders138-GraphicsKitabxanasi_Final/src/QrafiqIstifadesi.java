
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class QrafiqIstifadesi extends JPanel {
    
    public QrafiqIstifadesi() {
        setBackground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        g.setColor(Color.blue);
        g.drawOval(200, 200, 30, 30);
        g.fillOval(300, 300, 40, 40);
        g.setColor(Color.MAGENTA);
        g.drawLine(100, 100, 300, 300);
    }
    
}
