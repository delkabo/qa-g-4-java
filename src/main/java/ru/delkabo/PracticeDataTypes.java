package ru.delkabo;

public class PracticeDataTypes {
    public static void main(String[] args) {
        boolean aTrue = true, aFalse = false;
        String aString= "значение ";
        int b = 2, c = 8, d = 12;
        float eFloat = 2.7F;

        System.out.println("1 " + aString + ((b + c)/2));
        System.out.println("2 " + aString + d/c);
        System.out.println("3 " + aString + "остатка равно " + d%c);
        System.out.println("4 " + aString + "истина " + (d > c));
        System.out.println("5 " + aString + "ложно " + (aTrue == aFalse));
        System.out.println("6 " + aString + "ложно " + ((d > c)&&(aTrue == aFalse)));
        System.out.println("7 " + aString + "истина " + ((d > c)||(aTrue == aFalse)));
        System.out.println("8 " + aString + "истина " +  ((d > b)||(aTrue != aFalse)));
        System.out.println("9 " + aString + eFloat + eFloat);
        System.out.println(eFloat + eFloat);

    }
}
