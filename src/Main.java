public class Main {

    public static void main(String[] args) {
        VisitorImpl v = new VisitorImpl();

        A a = new A();
        a.f(v);

        B b = new B();
        b.f(v);
    }
}
