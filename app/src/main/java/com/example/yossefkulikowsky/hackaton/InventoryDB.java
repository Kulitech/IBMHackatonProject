package com.example.yossefkulikowsky.hackaton;


import java.util.HashSet;

public class InventoryDB {
    public String _id; //Machsan name
    public String _rev;
    public HashSet<Integer> productAmount; //K=barcode V=quantity

    public InventoryDB() {
    }

    public InventoryDB(String _id, String _rev, HashSet<Integer> productAmount) {
        this._id = _id;
        this._rev = _rev;
        this.productAmount = productAmount;
    }
}
