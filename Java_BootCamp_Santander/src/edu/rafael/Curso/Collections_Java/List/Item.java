package edu.rafael.Curso.Collections_Java.List;

public class Item {

    private String name;
    private double price;
    private int quantityEspec;

    //Constructor para obter o nome, preço e quantidade especificada
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantityEspec = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityEspec() {
        return quantityEspec;
    }

    //Metodo toString
    public String toString(double value){
        return Double.toString(value);
    }
}
