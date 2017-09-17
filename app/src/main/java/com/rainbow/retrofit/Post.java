package com.rainbow.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sugar on 9/17/2017.
 */

public class Post {

    @SerializedName("id")
    int id;
    @SerializedName("product_name")
    String name;
    @SerializedName("prodcut_price")
    int price;
    @SerializedName("product_description")
    String description;
    @SerializedName("post_owner_name")
    String owner;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
}
