package Enum;

public class TestMain {
    public static void main(String args[]) {

        // values()
        for (Terevezler s : Terevezler.values()) {
            System.out.println(s);
        }

        // ordinal()
        System.out.println(Terevezler.PAMIDOR.ordinal());
        System.out.println(Terevezler.BIBER.ordinal());
        System.out.println(Terevezler.BADIMCAN.ordinal());

        for (Terevezler s : Terevezler.values()) {
            System.out.println(s.ordinal());
        }

        // Enumun elementlərinin qiymətlərindən program daxilində necə istifadə edə
        // bilərik?
        for (Terevezler f : Terevezler.values()) {
            System.out.println(f.name() + " : " + f.qiymet + " : " + f.reng
        );
        }

    }
}