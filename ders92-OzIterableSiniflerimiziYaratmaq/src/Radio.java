
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
//1. ornek
/*public class Radio {
    private ArrayList<String> kanallarListi = new ArrayList<>();

    public Radio( String[] kanallar) {
        for(String kanal : kanallar){
        kanallarListi.add(kanal);
        }
    }
     
            
}*/
//2. ornek 
/*public class Radio implements Iterable<String>{
    private ArrayList<String> kanallarListi = new ArrayList<>();

    public Radio( String[] kanallar) {
        for(String kanal : kanallar){
        kanallarListi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return kanallarListi.iterator();
    }
     
            
}*/
//3. ornek
public class Radio implements Iterable<String> {

    private ArrayList<String> kanallarListi = new ArrayList<>();

    public class RadioIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < kanallarListi.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String deyer = kanallarListi.get(index);
            index++;
            return deyer;
        }

    }

    public Radio(String[] kanallar) {
        for (String kanal : kanallar) {
            kanallarListi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new RadioIterator();
    }

}
