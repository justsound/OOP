public class task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(11, "Murka");
        Owner owner = new Owner("Alex");
        cat1.getAge();
        cat1.getName();
        cat1.greet();
        cat1.setOwner(owner);
        cat1.greet();
    }
}
