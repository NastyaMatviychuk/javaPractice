package Enum;

public class Main {
    public static void main(String[] args) {
        Month[] values = Month.values();
        for (Month value : values) {
            System.out.println(value.ordinal() + ". " + value);
        }
    }
}
