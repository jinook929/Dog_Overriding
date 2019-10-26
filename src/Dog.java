public class Dog {

    private static String name;
    private String nickName;

    public Dog(String name, String nickName) {
        Dog.name = name;
        this.nickName = nickName;
    }

    public void printName() {
        System.out.println("name= " + name);
    }

    public void printNickName() {
        System.out.println("nickName= " + nickName);
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
