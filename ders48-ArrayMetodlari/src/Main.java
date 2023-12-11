
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//        1. forEach metodu 
        int[] a = new int[2];
        a[0] = 5;
        a[1] = 10;
//        for ( int i : a ) {
//            System.out.println(i);
//        }
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("*****************************");
//    2. length
//        String[] people = {"hekim", "polis"};
//        System.out.println(people.length);
        int[] number1 = {1, 2, 3, 4};
        for (int i = 0; i < number1.length; i++) {
            number1[i] = i + i;
        }
        int[] number2 = new int[number1.length];
        for (int i = 0; i < number1.length; i++) {
            number2[i] = number1[i];
        }
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        System.out.println("*****************************");
//        3. Array.sort metodu
        int[] num = {1, 5, 99, 8};
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        String[] number = {"bir", "iki", "dord", "alti"};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("*****************************");

//       4. Arrays.binarySearch metodu
        String adamlar[] = {"Ruslan", "Eli", "Veli"};
        Arrays.sort(adamlar);
//        burda ele bele yoxlama etdim siralamaya gore yer deyisdi
//        for (int i = 0; i < adamlar.length; i++) {
//            System.out.println(adamlar[i]);
//        }
        int deyer = Arrays.binarySearch(adamlar, "Eli");
        System.out.println(deyer);
        System.out.println("*****************************");
//        5. Arrays.equels 
        char c1[] = {'a'};
        char c2[] = {'a'};
        System.out.println(Arrays.equals(c1, c2));
        System.out.println("*****************************");
        // 6. Arrays.asList
        String soz1[] = {"Soz1", "Soz2", "Soz3", "Soz4"};
        Integer soz2[] = {22, 43, 45, 98};
        List listQurumu = new ArrayList();
        List listQurumu1 = new ArrayList();
        listQurumu = Arrays.asList(soz1);
        listQurumu1 = Arrays.asList(soz2);
        System.out.println("");
        System.out.println(listQurumu.get(1));
        System.out.println(listQurumu);
        System.out.println(listQurumu1.get(0));
        System.out.println(listQurumu1);
        System.out.println("*****************************");
        // 6. Arrays.copyOf
        char[] charArrays = {'A', 'E', 'O', 'Y'};
        char[] newChar = {};
        System.out.print("Kopyalanacaq array: ");
        for (int i = 0; i < charArrays.length; i++) {
            System.out.print(charArrays[i]);
        }
        newChar = Arrays.copyOf(charArrays, 3);
        System.out.println("");
        System.out.print("Yeni Array: ");
        for (int i = 0; i < newChar.length; i++) {
            System.out.print(newChar[i]);
        }
        System.out.println("");
//         7. Arrays.copyOfRange
        Integer numArr[] = {14, 22, 25, 26, 55, 20, 99};
        Integer newNumArr[] = {};
        System.out.print("Kopyalanacaq Array: ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
        newNumArr = Arrays.copyOfRange(numArr, 2, 5);
        System.out.println("");
        System.out.print("Yeni Array: ");
        for (int j = 0; j < newNumArr.length; j++) {
            System.out.print(newNumArr[j]);
        }
        System.out.println("");
        System.out.println("*********************************");
//         Arrays.fill
        Integer arrNumber[] = {0, 0, 0, 0, 0};
        Integer arrNumber1[] = {1, 1, 1, 1, 1};
        Arrays.fill(arrNumber, 1);
        Arrays.fill(arrNumber1, 2, 4, 0);
        System.out.println("1. Deyerler Doldurulur");
        for (int j = 0; j < arrNumber.length; j++) {
            System.out.print(arrNumber[j]);
        }
        System.out.println("");
         System.out.println("2. Deyerler Doldurulur");
         for (int j = 0; j < arrNumber1.length; j++) {
            System.out.print(arrNumber1[j]);
        }
    }
}
