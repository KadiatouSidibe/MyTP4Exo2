package com.example.mytp4exo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button carte;
    Button paypal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carte = findViewById(R.id.carte);
        paypal = findViewById(R.id.paypal);

        carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();

            }
        });

        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentPaiementPaypal alertDialog = FragmentPaiementPaypal.newInstance("Some title");
                alertDialog.show(fm2, "fragment_alert");


            }

        });


    }
    private void showAlertDialog() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentPaiementCarte alertDialog = FragmentPaiementCarte.newInstance("Some title");
        alertDialog.show(fm, "fragment_alert");

    }
    public void onOkClickDialog(String nom) {
        Toast.makeText(this, "Hi, " + nom, Toast.LENGTH_SHORT).show();
    }

}