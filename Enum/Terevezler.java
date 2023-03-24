package Enum;

public enum Terevezler {
    PAMIDOR(100, "qirmizi"), BIBER(200, "yasil"), BADIMCAN(300, "qara");

    int qiymet;
    String reng;

    Terevezler(int qiymet, String reng) {
        this.qiymet = qiymet;
        this.reng = reng;

    }



}
