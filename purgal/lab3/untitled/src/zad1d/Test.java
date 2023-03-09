package zad1d;


public class Test {
    public static void main(String[] args) {
        Triangle triangle = Triangle.loadFromKeyboard();

        if (triangle == null) {
            System.out.println("Z podanych odcinków, nie da się zbudować trójkąta");
            return;
        }

        System.out.println("Z podanych odcinków, da się zbudować trójkąt " +  triangle.typeByAngle() + " " + triangle.typeBySide());
    }
}
