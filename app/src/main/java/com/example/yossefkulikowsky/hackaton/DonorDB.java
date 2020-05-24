package com.example.yossefkulikowsky.hackaton;


public class DonorDB {
    public String tafkid;
    public String pass;
    public String homeAddress;
    public String emailAddress;
    public String phoneNum;
    public String fullName;
    public String _id;
    public String _rev;

    public DonorDB(){}

    public DonorDB(String tafkid, String pass, String homeAddress, String emailAddress, String phoneNum, String fullName, String _id, String _rev) {
        this.tafkid = tafkid;
        this.pass = pass;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.phoneNum = phoneNum;
        this.fullName = fullName;
        this._id = _id;
        this._rev = _rev;
    }
}
