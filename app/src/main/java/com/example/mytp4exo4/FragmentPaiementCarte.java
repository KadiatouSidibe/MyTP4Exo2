package com.example.mytp4exo4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

public class FragmentPaiementCarte extends DialogFragment {

    private EditText nom, prenom, numeroCarte, code, date;
    private FragmentPaiementCarte listener;
    private Button btn;


    public FragmentPaiementCarte() {
        // le fragment est créé par la méthode newInstance
    }

    public static FragmentPaiementCarte newInstance(String title) {

        FragmentPaiementCarte frag = new FragmentPaiementCarte();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_paiementcarte, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        nom =view.findViewById(R.id.nomE);
        prenom=view.findViewById(R.id.prenomE);
        numeroCarte=view.findViewById(R.id.numCarteE);
        code=view.findViewById(R.id.codeE);
        date=view.findViewById(R.id.dataE );

    }
}
