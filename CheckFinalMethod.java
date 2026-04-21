class Parent {

    final void show() {
        System.out.println("This is final method in Parent");
    }
}

class Child extends Parent {

   /* // ❌ Trying to override final method
    void show() {
        System.out.println("This is Child method");
    } */
}

public class CheckFinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}