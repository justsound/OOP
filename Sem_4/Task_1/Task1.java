public class Task1 {
    public static void main(String[] args) {
        Jen<Integer> iob = new Jen<Integer>(88);
        iob.showType();
        
        int v = iob.getOb();
        System.out.println("Значение iob: " + v);

        Jen<String> text = new Jen<String>("test");
        text.showType();
        String s = text.getOb();
        System.out.println("Значение текста: " + s);
    }
}
