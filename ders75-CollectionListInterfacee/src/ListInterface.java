
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//       1. ornek elave etmek
        list.add("Ruslan");
        list.add("eli");
        list.add("Veli");
        System.out.println(list.get(1));
//        System.out.println(list.get(3));
//       2. ornek silme
        list.remove(2);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.nextIndex() + " .inci deyerimiz ");
            System.out.println(iterator.next());
        }
//      3. ornek siralamaq
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(15);
        listNumber.add(9);
        listNumber.add(5);
        System.out.println("Siralanmamis: " + listNumber);
        Collections.sort(listNumber);
        System.out.println("Siralanmis: " + listNumber);
//     3.1 Adlari siralamaq
        List<String> listName = new ArrayList<>();
        listName.add("Ruslan");
        listName.add("Azer");
        listName.add("Elif");
        listName.add("Polat");
         System.out.println("Siralanmamis: " + listName);
         listName.sort((name1, name2) -> name1.compareTo(name2));
          System.out.println("Siralanmis: " + listName);
    }
}
