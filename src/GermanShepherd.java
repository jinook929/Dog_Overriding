public class GermanShepherd extends Dog{
    public GermanShepherd(String name, String nickName) {
        super(name, nickName);
    }

    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
