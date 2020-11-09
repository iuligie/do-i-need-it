package com.emanuelg.ppw1.doineedit;


import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.google.android.material.snackbar.Snackbar;

public class ViewModel extends androidx.lifecycle.ViewModel {



    public final String name;
    public static Drawable image;
    public final String size;
    public final String color;
    public final String price;
    static Uri url;
    public static boolean Owned = false;

    public ViewModel(String name, String size, String color, String price, Uri url, boolean owned) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        this.url = url;
        Owned = owned;
    }

    public static boolean IsOwned() {
        return Owned;
    }

    public static void setIsOwned(boolean Owned) {
        ViewModel.Owned = Owned;
    }


    //private com.emanuelg.ppw1.doineedit.RecyclerAdapter swipeHandler;



    public void onClickDelete() {
        Snackbar.make(null, "Item should be deleted now", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

    }

    public void onClickUndo() {
        Snackbar.make(null, "Last action has been undone", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public String getName() {
        return name;
    }

    public static Drawable getImage() {
        return image;
    }

    public static void setImage(Drawable image) {
        ViewModel.image = image;
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

    public Uri getUrl() {
        return url;
    }

    public void setUrl(Uri url) {
        ViewModel.url = url;
    }
}