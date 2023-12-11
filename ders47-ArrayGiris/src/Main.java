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
//     1. yazilisi
        int arr[] = {1, 2, 3, 4};
        String str[] = {"ruslan", "eli", "ayse"};
        Object obj[] = {"ruslan", 2, 10.f};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println("************************");
//   2. yazilisi
        int[] arrr = {1, 2, 3, 4};
        String[] strr = {"ruslan", "eli", "ayse"};
        Object[] objj = {"ruslan", 2, 10.f};
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }

        for (int i = 0; i < strr.length; i++) {
            System.out.println(strr[i]);
        }

        for (int i = 0; i < objj.length; i++) {
            System.out.println(objj[i]);
        }
        System.out.println("****************************");
//      3. yazilisi
        int[] arrrr = new int[3];
        arrrr[0] = 2;
        arrrr[1] = 5;
        arrrr[2] = 5;
        for (int i = 0; i < arrrr.length; i++) {
            System.out.println(arrrr[i]);
        }
        System.out.println("********************");
//        4. yazilisi
        int[] arrrrr = new int[]{10, 5};
        for (int i = 0; i < arrrrr.length; i++) {
            System.out.println(arrrrr[i]);
        }
        System.out.println("444**********************************444");
//         5. indekse gore deyeri yazmaq
        int[] a = new int[]{10, 5};
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
