package com.example.yossefkulikowsky.hackaton.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.yossefkulikowsky.hackaton.R;

public class Register extends Fragment {
    EditText etPassword, etReTypePassword, etId;
    Button btnRegister;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_register, container, false);
        setPointer();


        return view;
    }

    private void setPointer() {
        etPassword = view.findViewById(R.id.etRegisterPassword);
        etReTypePassword = view.findViewById(R.id.etRegisterReTypePassword);
        etId = view.findViewById(R.id.etRegisterId);
        btnRegister = view.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etId.setText("");
                etPassword.setText("");
                etReTypePassword.setText("");
                FragmentManager fm = getFragmentManager();
                fm.popBackStack();
            }
        });

    }

}

