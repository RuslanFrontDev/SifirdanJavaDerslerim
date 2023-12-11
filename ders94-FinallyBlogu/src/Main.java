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
        /*
        Finally bloğu xəta versədə-verməsədə belə mütləq və mütləq Ekranda göstərmək və ya
        dosya bağlama və ya veri tabanı bağlantısını kəsmək kimi işləmləri həyata keçirməkdə
        finally bloğu olduqca əlverişlidir
         */
//        1. ornek xetasiz 
        /*try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println("xeta var");
        }
        finally{
            System.out.println("Xeta yoxdur ancaq calisir");
        }*/
//        2. ornek xetali
        /*try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("xeta var");
        } finally {
            System.out.println("Xeta var ancaq calisir");
        }*/
//        3. ornek deyek ki xetayi basqa cure yazdiq
        /*try {
            int a = 30 / 0;
             System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
         finally{
             System.out.println("Int yerine Array-in xetasini verdik");
         }
         System.out.println("Calisacaqmi?");*/
//         3.1 ornek
 try {
            int a = 30 / 0;
             System.out.println(a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
         finally{
             System.out.println("Int yerine Array-in xetasini verdik");
         }
         System.out.println("Calisacaqmi?");
    }
}
