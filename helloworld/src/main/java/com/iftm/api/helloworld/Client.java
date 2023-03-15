package com.iftm.api.helloworld;
import java.util.List;

public class Client {

    private String name;

    private int age;

    private List Product;

    public Client(String name, int age, List product) {
        this.name = name;
        this.age = age;
        Product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getProduct() {
        return Product;
    }

    public void setProduct(List product) {
        Product = product;
    }
}

