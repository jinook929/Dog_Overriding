public class GermanShepherd extends Dog{
    public GermanShepherd(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
