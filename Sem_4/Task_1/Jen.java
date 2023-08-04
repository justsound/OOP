public class Jen <E> {
    E ob;

    public Jen(E o){
        ob = o;
    }

    public E getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Тип это:" + ob.getClass().getName());
    }
}
