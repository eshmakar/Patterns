package com.test.prototype;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        PizzaImpl smallPizza = new PizzaImpl();
        smallPizza.setTesto("bezDrojjei");
        smallPizza.setKolbasa("konchenaya");
        System.out.println(smallPizza);//PizzaImpl{testo='bezDrojjei', kolbasa='konchenaya', sous='null', syr='null'}

        PizzaImpl mediumPizza = (PizzaImpl) smallPizza.make();
        mediumPizza.setSous("ketchup");
        System.out.println(mediumPizza);//PizzaImpl{testo='bezDrojjei', kolbasa='konchenaya', sous='ketchup', syr='null'}

        PizzaImpl bigPizza = (PizzaImpl) mediumPizza.make();
        bigPizza.setSyr("mozzarello");
        System.out.println(bigPizza);//PizzaImpl{testo='bezDrojjei', kolbasa='konchenaya', sous='ketchup', syr='mozzarello'}
    }
}

interface Pizza extends Cloneable{
    Pizza make() throws CloneNotSupportedException;
}

class PizzaImpl implements Pizza{
    String testo;
    String kolbasa;
    String sous;
    String syr;

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getKolbasa() {
        return kolbasa;
    }

    public void setKolbasa(String kolbasa) {
        this.kolbasa = kolbasa;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public String getSyr() {
        return syr;
    }

    public void setSyr(String syr) {
        this.syr = syr;
    }

    @Override
    public String toString() {
        return "PizzaImpl{" +
                "testo='" + testo + '\'' +
                ", kolbasa='" + kolbasa + '\'' +
                ", sous='" + sous + '\'' +
                ", syr='" + syr + '\'' +
                '}';
    }

    @Override
    public Pizza make() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }
}