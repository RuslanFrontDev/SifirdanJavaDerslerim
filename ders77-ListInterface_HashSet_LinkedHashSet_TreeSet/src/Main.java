
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
//        Set İnterfeysi və List İnterfeysi arasındakı fərq
//List interfeysini implement edən siniflər bir elementdən bir neçə dəfə saxlaya bilərlər,
//əks halda Set interfeysini implement edən siniflər yalnız bir element saxlarlar.
//
//HashSet Sinifi
//
//HashSet AbstractSet'i genişləndirir və Set İnterfeysini genişləndirir Collection İnterfeysini genişləndirir Iterable'i genişləndirir
//
//1. HashSet elementləri "hashing" yəni hash cədvəlinə uyğun şəkildə saxlayır
//(Hər bir element müəyyən bir açarı əsasında saxlanılır.)
//
//2. HashSet bir elementi yalnız bir dəfə saxlayır (Set İnterfeysi)
//
//3. Elementləri əlavə etmə sırasına görə saxlamaz.
//
//LinkedHashSet Sinifi
//
//LinkedHashSet HashSet'i genişləndirir AbstractSet'i genişləndirir və Set İnterfeysini genişləndirir Collection İnterfeysini genişləndirir Iterable'i genişləndirir
//
//1. LinkedHashSet həm HashTable həm də Set İnterfeysinin LinkedList implementasiyası kimi davranır.
//
//2. HashSetdə olduğu kimi bir elementi yalnız bir dəfə saxlayır (Set İnterfeysi)
//
//3. Elementləri əlavə etmə sırasına görə saxlayarr.
//
//TreeSet Sinifi
//
//TreeSet sinifi NavigableSet interfeysini implemente edir və AbstractSet sinifindan miras alır. 
//NavigableSet interfeysi SortedSet interfeysindən miras alır.
//
//1. Elementləri saxlamaq üçün Tree yəni Ağac strukturasını istifadə edir.
//
//2. Elementləri əlifbaya əsasən sıralayır.
//
//HashSet vs LinkedHashSet vs TreeSet
//
//HashSet, Hash Table mexanizmasını tətbiq etdiyindən elementlər sıralı deyildir. Əlavə etmə, çıxarma və
//axtarış metodları sabit vaxtda (Zaman Slopu : O(1)) çalışır.
//
//TreeSet, elementləri ağac strukturasına uyğun saxlayır. Əlavə etmə, çıxarma və
//axtarış metodları O(log(n)) kompleksliyi ilə çalışır.
//
//LinkedHashSet sinifi hashtable və linked list strukturasını istifadə edərək elementləri saxlayır. Bu səbəbdən,
//elementlər əlavə etmə sırasına görə saxlanılır. Əlavə etmə, çıxarma və axtarış metodları
//sabit vaxtda (Zaman Slopu: O(1)) çalışır.
//   .............................................................................................

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
//        2. ornek isEmpty
//         System.out.println(set1.isEmpty());

        // HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Javascript");
        set1.add("Php");
        // LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Javascript");
        set2.add("Php");
        // TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Javascript");
        set3.add("Php");

        set3.add("Php");

        System.out.println("HashSet*******************************");
        for (String s : set1) {
            System.out.println(s);

        }
        System.out.println("LinkedHashSet*******************************");
        for (String s : set2) {
            System.out.println(s);

        }
        System.out.println("TreeSet*******************************");
        for (String s : set3) {
            System.out.println(s);

        }
//        3. ornek contains
        System.out.println(set1.contains("Laravel"));
        System.out.println(set1.contains("Java"));
//        4. ornek remove
        set1.remove("Java");
        for (String s : set1) {
            System.out.println(s);

        }
//        5. ornek qarsilasdirib deyerin oldugunu yoxlamaq
        Set<String> set4 = new HashSet<String>();
        Set<String> set5 = new HashSet<String>();

        set4.add("Java");
        set4.add("C++");
        set4.add("Python");
        set4.add("Javascript");
        set4.add("Php");

        set5.add("Laravel");
        set5.add("Java");
        set5.add("CSS");
        Set<String> fark = new HashSet<String>(set5);

        System.out.println(fark.removeAll(set4));
        System.out.println(fark);
        System.out.println("********************");        
//        6. ornek kesisme
        Set<String> kesisim = new HashSet<String>(set5);
        System.out.println(kesisim.retainAll(set4));
        System.out.println(kesisim);
    }
}
