package com.example.yossefkulikowsky.hackaton;


import android.graphics.Bitmap;

public class ProductsDB {
        public String _id; // barcode
        public String _rev;
        public String description;

    public ProductsDB() {
    }

    public ProductsDB(String _id, String description) {
        this._id = _id;
        this.description = description;
    }
}

