package com.example.numtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class ListPrimaActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_prima);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.kembali);

        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            this.finish();
        });
    }

    public void listPrima(View view){

        String[] stringsNumbers = editText.getText().toString().split(" ");
        Integer[] integersNumbers = new Integer[stringsNumbers.length];

        for (int i=0; i<stringsNumbers.length; i++){
            integersNumbers[i] = Integer.parseInt(stringsNumbers[i]);
        }

        Arrays.sort(integersNumbers);

        int awal, akhir, bil;
        textView.setText(String.valueOf(" "));

        awal = integersNumbers[0];
        akhir = integersNumbers[1];

        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                textView.append(i + " ");
                textView.setMovementMethod(new ScrollingMovementMethod());
            }
        }

    }
}