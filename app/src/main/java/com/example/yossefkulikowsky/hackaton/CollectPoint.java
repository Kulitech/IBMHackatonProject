package com.example.yossefkulikowsky.hackaton;


public class CollectPoint {
    public String _id;
    public String _rev;
    public String address;
    public String tel;

    public CollectPoint() {
    }

    public CollectPoint(String _id, String address, String tel) {
        this._id = _id;
        this.address = address;
        this.tel = tel;
    }
}
