package example;

public class Constructor1 {
    int number;
    String nmae;
    public Constructor1(){
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Constructor1 c2 = new Constructor1();
        System.out.println(c2.number);
        System.out.println(c2.nmae);
    }
}
