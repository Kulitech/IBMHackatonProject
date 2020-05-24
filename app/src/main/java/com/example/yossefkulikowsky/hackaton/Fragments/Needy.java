package com.example.yossefkulikowsky.hackaton.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.yossefkulikowsky.hackaton.R;


public class Needy extends Fragment {
    View view;
    EditText etName, etId, etEmail, etAddress, etTel, etPass, etRePass;
    Button btnRegister;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_register,container,false);
        setPointer();
        return view;
    }

    private void setPointer() {
        etName=view.findViewById(R.id.etNeedyName);
        etId=view.findViewById(R.id.etNeedyId);
        etEmail=view.findViewById(R.id.etNeedyEmail);
        etAddress=view.findViewById(R.id.etNeedyAddress);
        etTel=view.findViewById(R.id.etNeedyTel);
        etPass=view.findViewById(R.id.etNeedyPassword);
        etRePass=view.findViewById(R.id.etNeedyReTypePassword);
        btnRegister=view.findViewById(R.id.btnNeedyRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
