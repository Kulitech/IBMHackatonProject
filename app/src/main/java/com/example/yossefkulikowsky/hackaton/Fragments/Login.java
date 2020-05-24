package com.example.yossefkulikowsky.hackaton.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.yossefkulikowsky.hackaton.Main;
import com.example.yossefkulikowsky.hackaton.R;

public class Login extends Fragment {
    Button btnNotRegistered;
    EditText etId, etPass;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.frag_login,container,false);
        setPointer();

        return view;
    }

    private void setPointer() {
        etId=view.findViewById(R.id.etId);
        etPass=view.findViewById(R.id.etPassword);
        btnNotRegistered=view.findViewById(R.id.btnNotRegistered);
        btnNotRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etId.setText("");
                etPass.setText("");
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.replace(R.id.main_login, new Register(),"REGISTER");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.commit();
            }
        });
    }
}
