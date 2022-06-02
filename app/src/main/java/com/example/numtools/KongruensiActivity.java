package com.example.numtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class KongruensiActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kongruensi);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.kembali);

        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            this.finish();
        });
    }

    public void kongruensi(View view){

        String[] stringsNumbers = editText.getText().toString().split(" ");
        Integer[] integersNumbers = new Integer[stringsNumbers.length];

        for (int i=0; i<stringsNumbers.length; i++){
            integersNumbers[i] = Integer.parseInt(stringsNumbers[i]);
        }

        Arrays.sort(integersNumbers);

        int a = integersNumbers[2];
        int b = integersNumbers[0];
        int n = integersNumbers[1];


        int hasil = (a-b) % n;

        if (hasil == 0){
            textView.setText(String.valueOf("True"));
        }else {
            textView.setText(String.valueOf("False"));
        }

    }

}