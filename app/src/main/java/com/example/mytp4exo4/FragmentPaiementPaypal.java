package com.example.mytp4exo4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentPaiementPaypal extends DialogFragment {
    private EditText psoeudo,mdp;
    private FragmentPaiementPaypal listener;
    private Button btn;


    public FragmentPaiementPaypal() {
        // le fragment est créé par la méthode newInstance
    }

    public static FragmentPaiementPaypal newInstance(String title) {

        FragmentPaiementPaypal frag = new FragmentPaiementPaypal();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_paiement_paypal, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        psoeudo =view.findViewById(R.id.psoeudoE);
        mdp=view.findViewById(R.id.mdpE);
    }
}
