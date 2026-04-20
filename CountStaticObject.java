public class CountStaticObject {

    private static int countObject = 0;

    CountStaticObject() {
        countObject++;
    }

    public static int getCountObject() {
        return countObject;
    }

    public static void main(String args[]) {

        new CountStaticObject();
        new CountStaticObject();
        new CountStaticObject();
        new CountStaticObject();

        System.out.println("Total objects created: " + CountStaticObject.getCountObject());
    }
}