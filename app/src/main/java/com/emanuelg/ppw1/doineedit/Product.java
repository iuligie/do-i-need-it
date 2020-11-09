package com.emanuelg.ppw1.doineedit;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public final String name;
    int image;
    public final String size;
    public final String color;
    public final String price;
    Uri url;
    boolean Owned = false;
    public static List<Product> list = new ArrayList<>();
    public boolean isOwned() {
        return Owned;
    }

    void setOwned(boolean owned) {
        Owned = owned;
    }

    public Product(String name,  String size, String color, String price){//, Uri url) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        //this.url = url;
    }
    public void onClickDelete() {
        System.out.println("Item Deleted");
    }

    public void onClickUndo() {
        System.out.println("Action undone");
    }

    public static List<Product> getProducts() {

        list.add(
                new Product("Shiorsat", "price", "color", "$10"));
        list.add(new Product("Shirts", "price", "color",
                "$20"));
        list.add(
                new Product("Socks",  "price", "color", "$10"));
        list.add(new Product("Shirts",  "price", "color",
                "$20"));
        list.add(
                new Product("Socks",  "price", "color", "$10"));
        list.add(new Product("Shirts",  "price", "color",
                "$20"));
        list.add(
                new Product("Socks",  "price", "color", "$10"));
        list.add(new Product("Shirts",  "price", "color",
                "$20"));

        return list;
    }
    public String getName() {
        return name;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public  Uri getUrl() {
        return url;
    }

    public  void setUrl(Uri url) {
        this.url = url;
    }
}
