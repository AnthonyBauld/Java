import model.WineCollection;

public class Main {

    public static void main(String[] args) {
        WineCollection wc = new WineCollection(12);
        System.out.println(wc.toString());
        wc.age();
        System.out.println(wc.toString());
    }
}
