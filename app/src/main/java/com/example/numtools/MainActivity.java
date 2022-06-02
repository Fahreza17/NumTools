package com.example.numtools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CardView cvGcdLcm, cvCoPrimes, cvFaktorisasiPrima, cvListPrima, cvKongruensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvGcdLcm = findViewById(R.id.cv_gcd_lcm);
        cvCoPrimes = findViewById(R.id.cv_co_primes);
        cvFaktorisasiPrima = findViewById(R.id.cv_faktorisasi_prima);
        cvListPrima = findViewById(R.id.cv_list_prima);
        cvKongruensi = findViewById(R.id.cv_kongruensi_modulo);

        cvGcdLcm.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), GcdLcmActivity.class));
            this.finish();
        });

        cvCoPrimes.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), CoPrimeActivity.class));
            this.finish();
        });

        cvFaktorisasiPrima.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), FaktorPrimaActivity.class));
            this.finish();
        });

        cvListPrima.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ListPrimaActivity.class));
            this.finish();
        });

        cvKongruensi.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), KongruensiActivity.class));
            this.finish();
        });
    }
}