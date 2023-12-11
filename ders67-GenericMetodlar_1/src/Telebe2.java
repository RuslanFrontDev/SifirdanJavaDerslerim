public class Telebe2 extends TelebeBase {

    public Telebe2(String name, int Riyaziyyat, int Tarix, int Fizika, int Kimya) {
        super(name, Riyaziyyat, Tarix, Fizika, Kimya);
    }

    public double secondTelebeNeticesi() {
        return (super.getFizika() * super.getKimya() * super.getRiyaziyyat() * super.getTarix());
    }
}