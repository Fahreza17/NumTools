package com.example.numtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class FaktorPrimaActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktor_prima);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.kembali);

        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            this.finish();
        });
    }

    public void faktorPrima(View view){

        String[] stringsNumbers = editText.getText().toString().split(" ");
        Integer[] integersNumbers = new Integer[stringsNumbers.length];

        for (int i=0; i<stringsNumbers.length; i++){
            integersNumbers[i] = Integer.parseInt(stringsNumbers[i]);
        }

        Arrays.sort(integersNumbers);

        int[] hsl = new int [10];
        int index = 0;
        textView.setText(String.valueOf(" "));

        for(int i = 2; i< integersNumbers[0]; i++) {
            while(integersNumbers[0]%i == 0) {
                hsl[index] = i;
                integersNumbers[0] = integersNumbers[0]/i;
                index++;
            }
        }
        if(integersNumbers[0] >2) {
            hsl[index] = integersNumbers[0];
            index++;
            // System.out.println(number);
        }

        for(int k = 0; k < index; k++){

            textView.append(hsl[k] + " ");
        }



//        for(int i = 2; i< integersNumbers[0]; i++) {
//            while(integersNumbers[0]%i == 0) {
//                textView.setText(String.valueOf(i + " "));
//                integersNumbers[0] = integersNumbers[0]/i;
//            }
//        }
//        if(integersNumbers[0] >2) {
//            textView.setText(String.valueOf(integersNumbers[0]));
//        }
    }
}