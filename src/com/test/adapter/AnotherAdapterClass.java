package com.test.adapter;

public class AnotherAdapterClass {
    public static void main(String[] args) {
        ChargePhone chargePhone = new ChargePhone();
        chargePhone.chargeAndroid(new Xiaomi());
        chargePhone.chargeAndroid(new AdapterToIphone(new Iphone7()));
    }
}

interface Android{ void charge();}
class Xiaomi implements Android{
    @Override
    public void charge() { System.out.println("Xiaomi charge"); }
}
class ChargePhone{
    private Android android;
    public void chargeAndroid(Android android){
        android.charge();
    }
}

interface Iphone{void charge();}
class Iphone7 implements Iphone{
    @Override
    public void charge() { System.out.println("Iphone7 charge"); }
}
class AdapterToIphone implements Android{
    private final Iphone iphone;
    public AdapterToIphone(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void charge() {
        iphone.charge();
    }
}