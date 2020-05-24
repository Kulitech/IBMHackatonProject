package com.example.yossefkulikowsky.hackaton;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.example.yossefkulikowsky.hackaton.Fragments.AboutUs;
import com.example.yossefkulikowsky.hackaton.Fragments.Login;

public class Main extends AppCompatActivity {
    Context context;
    ImageView imgLogo;
    final String API_KEY = "surstrubjecalleffirbeeds";
    final String API_SECRET = "ad192e0a35d83eae12470e0e7aa61fcdbe519338";
    final String API_GATEWAY = "09d1db72-9c09-41ba-a945-5731f3c7fe60-bluemix";
    final String API_DB = "donor";
    public CloudantClient client;
    public Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setCloudant(); //Build Cloudent Client and Database
        setFragment();
        setPointer();
    }

    private void setPointer() {
        this.context=this;
        CloudentCRUD cloudentCRUD=new CloudentCRUD(db);
        cloudentCRUD.loadAttachment(context);

        /*
        List<Object> productsDBList=new ArrayList<>();
        productsDBList.add(new ProductsDB("7290013083661","מטרנה EXTRA CARE שלב 1"));
        productsDBList.add(new ProductsDB("7290013083678","מטרנה EXTRA CARE שלב 2"));
        productsDBList.add(new ProductsDB("7290011447267","מטרנה חלבי שלב 1"));
        productsDBList.add(new ProductsDB("7290011447281","מטרנה חלבי שלב 2"));
        productsDBList.add(new ProductsDB("7290011447359","מטרנה מהדרין שלב 1"));
        productsDBList.add(new ProductsDB("7290011447373","מטרנה מהדרין שלב 2"));
        productsDBList.add(new ProductsDB("7290014258723","מטרנה צמחי מגיל לידה עד גיל שנה"));
        productsDBList.add(new ProductsDB("7290014258716","מטרנה צמחי מגיל לידה ואילך"));
        productsDBList.add(new ProductsDB("7290014258914","מטרנה Extra Care Comfort"));

        CloudentCRUD cloudentCRUD=new CloudentCRUD(db);
        cloudentCRUD.saveEntry(productsDBList);*/

    }


    private void setCloudant() {
        client = ClientBuilder
                .account(API_GATEWAY)
                .username(API_KEY)
                .password(API_SECRET)
                .build();

        db = client.database(API_DB, false);
    }

    private void setFragment() {
        this.context=this;
        imgLogo=findViewById(R.id.imgLogo);
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.main_login,new AboutUs());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();
            }
        });

        //Load login Fragment to Main Activity as default Fragment
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.main_login,new Login());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.commit();



    }
}
