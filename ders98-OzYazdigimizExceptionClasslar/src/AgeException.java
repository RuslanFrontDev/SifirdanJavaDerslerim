
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
/*public class AgeException extends ArithmeticException {

    public AgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Yasa gore Exception firlatmaq");
    }

}*/
//4. ornek
public class AgeException extends IOException {

    public AgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Yasa gore Exception firlatmaq");
    }

}