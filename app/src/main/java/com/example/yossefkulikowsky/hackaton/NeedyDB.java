package com.example.yossefkulikowsky.hackaton;


public class NeedyDB {

    public String pass;
    public String homeAddress;
    public String emailAddress;
    public String phoneNum;
    public String fullName;
    public String _id;
    public String _rev;

    public NeedyDB(){}

    public NeedyDB(String pass, String homeAddress, String emailAddress, String phoneNum, String fullName, String _id, String _rev) {
        this.pass = pass;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.phoneNum = phoneNum;
        this.fullName = fullName;
        this._id = _id;
        this._rev=_rev;
    }


}