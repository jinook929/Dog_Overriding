public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rex", "rexie");
        Dog fluffy = new Dog("fluffy", "fluff");
        rex.bark();
        rex.printName();
        fluffy.printName();
        rex.printNickName();
        fluffy.printNickName();
    }
}
