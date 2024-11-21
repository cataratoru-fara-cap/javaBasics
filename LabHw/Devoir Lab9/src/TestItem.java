public class TestItem {
    public static void main(String[] args) throws Exception {
        Item i1 = new Item("Vodka", "Une bouteille de Vodka", 5483918746738L, 75.5);
        Item i3 = new Item("Fillet de citron 200g", 5473664615361L, 3.25);
        System.out.println(i1.toString());
        System.out.println(i3.toString());
    }
}
