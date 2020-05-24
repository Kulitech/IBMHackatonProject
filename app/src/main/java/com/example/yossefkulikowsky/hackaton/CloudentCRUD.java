package com.example.yossefkulikowsky.hackaton;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;

import com.cloudant.client.api.Database;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CloudentCRUD {
    private Database db;

    public CloudentCRUD(Database db) {
        this.db = db;
    }

    @SuppressLint("StaticFieldLeak")
    void saveEntry(final List<Object> object) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                db.bulk(object);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    void loadDocument(final List<Object> object) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                db.bulk(object);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    void loadAttachment(final Context context) {
        new AsyncTask<Void, Void, Drawable>() {
            @Override
            protected Drawable doInBackground(Void... voids) {
                InputStream inputStream=db.getAttachment("7290011447267","MaternaChalaviMitkadem1.png");
                return BitmapDrawable.createFromStream(inputStream,"src");

            }

            @Override
            protected void onPostExecute(Drawable drawable) {

                //Bitmap bitmap=BitmapFactory.decodeStream(inputStream);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                View view=View.inflate(context,R.layout.my_icon,null);
                ImageView imageView=view.findViewById(R.id.ivIcon);
                //Drawable drawable=BitmapDrawable.createFromStream(inputStream,"png");
                imageView.setImageDrawable(drawable);
                alertDialog.setView(view);
                alertDialog.show();

            }


        }.execute();
    }



}
