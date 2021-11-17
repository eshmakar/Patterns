package com.test.syngleton;

//SYNGLETON - ОДИНОЧКА
//для получения только одного экземпляра класса
public class Syngleton {
    private static Syngleton syngleton;

    public static Syngleton getInstance() {
        if (syngleton == null)
            syngleton = new Syngleton();

        return syngleton;
    }

    public static void main(String[] args) {
        Syngleton s = Syngleton.getInstance();
        Syngleton s2 = Syngleton.getInstance();
        System.out.println(s);
        System.out.println(s2);
    }
}
