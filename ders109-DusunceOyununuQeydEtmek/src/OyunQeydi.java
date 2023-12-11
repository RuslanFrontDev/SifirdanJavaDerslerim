
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OyunQeydi {

    public static void oyunQeydet(Kart[][] kartlar) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("qeyd.bin"))) {
            System.out.println("Oyun Qeyd edilir...");
            out.writeObject(kartlar);
        } catch (IOException ex) {
            System.out.println("xeta");
        }
    }

    ;
    public static Kart[][] qeydAl(Kart[][] kartlar) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("qeyd.bin"))) {
            Kart[][] cixdi = null;
            try {
                cixdi = (Kart[][]) in.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OyunQeydi.class.getName()).log(Level.SEVERE, null, ex);
            }
            return cixdi;

        } catch (IOException ex) {
            System.out.println("xeta");
        }
        return null;
    }
}
