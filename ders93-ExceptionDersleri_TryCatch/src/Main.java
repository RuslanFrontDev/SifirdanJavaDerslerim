

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Main {

    public static void main(String[] args) {
        /*Exception-lara aiddir:::                               Error-lara Aiddir::::
        1. IOException                                   1.StackOverflowError  
        2.SQLException                                   2.VirtualMachineErr
        3.ClassNOtFoundException                         3.OutOfMemoryErr
        4.RunTimeException
        Runtime-da asagidakilardir
        4.1 AritmaticEx
        4.2NullPointerEx
        4.3NumberFormatEx
        4.4 IndexOutOfBoundsEx
        IndexOutOfBoundsEx-da asagidakilardir
        4.4.1 ArrayIndexOutOfBoundsEx
        4.4.2 StringIndexOutOfBoundsEx
         */
//       1. ornek
        /*int a = 30/0;
         System.out.println(a);*/
//       2. ornek
        /*int[] arr = {1,2,3,4,5};
        System.out.println(arr[6]);*/
//        3. ornek try-catch
        try {
            int a = 30 / 0;
            System.out.println(a);
        } //        3.1 ornek üst class Exception olduğuna görə 
        /*catch (Exception e) {
            System.out.println("0-a bolme yoxdur");
        }*/ //      3.2 ornek Exception-nun alt Class-ı olduğuna görə
        /*catch (RuntimeException e) {
         System.out.println("0-a bolme yoxdur");
        }*/ //      3.2 ornek RuntimeException-nun alt Class-ı olduğuna görə
        catch (ArithmeticException e) {
            System.out.println("0-a bolme yoxdur");
        }
        System.out.println("Xeta olsa bele kodlariniz calisir");
//        4. ornek printStackTrace ile xetaya baxmaq
        /* System.out.println("4444444444444444444444444444444444444444444");

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[6]);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //        5. ornek her iki deyer xeta verse:: 5.1 ornekde birinci hansi xeta gelirse onu yazacaq eger 5.2 ornekde ikinci de xeta verse 2 defe catch yazacagiq
        System.out.println("555555555555555555555555555555555555");
//        5.1 ornek
        /*try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[6]);
            int a = 30 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //        5.2 ornek
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[2]);
            int a = 30 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
//      QEYD!!!  bu Sekilde 2 Exception yazmaq xetali
        /*try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[2]);
            int a = 30 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }*/
//  QEYD!!!  bu sekilde 1.üst class 2. alt class yazmaq xetalı özəl xetadan-general xetaya dogru
/*try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[2]);
            int a = 30 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/
    }
}
