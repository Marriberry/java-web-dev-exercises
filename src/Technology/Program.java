package Technology;

public class Program {
    public static void main(String[] args) {
        Computer apple = new Computer(2, 3, true);
        System.out.println(apple.toString());

        Laptop dell = new Laptop(2, 2, true, 10);
        System.out.println(dell.isClunky());
        dell.increaseStorage(10);
        System.out.println(dell.getStorage());

        SmartPhone iphone = new SmartPhone(64, 20, false, 44);
        iphone.takeSelfie();
        System.out.println(iphone.getNumberOfSelfies());

        AbstractEntitySubClass nameId = new AbstractEntitySubClass("Jake");
        nameId.myId();
        System.out.println(nameId.getId());
    }
}
