package Task;

abstract class abstractClass {
    abstract void abstractMethod();

    void concreteMethod() { 
        System.out.println("This is a concrete method.\n");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("\nB's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    void abstractMethod() {
        System.out.println("\nC's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void main(String[] args) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
