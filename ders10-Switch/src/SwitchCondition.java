
public class SwitchCondition {

    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            case 5:
                System.out.println("1. case");
                break;
            case 4:
                System.out.println("2. case");
                break;
            default:
                throw new AssertionError();
        }
    }
}
