public class Dog {

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }

    public void bark() {
        System.out.println("woof");
    }

    public void bark(int number) {
        for(int i =0; i < number; i++) {
            System.out.println("woof ");
        }
    }
}
