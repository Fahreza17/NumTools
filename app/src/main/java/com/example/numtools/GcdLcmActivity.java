package com.example.numtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class GcdLcmActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcd_lcm);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.kembali);

        button.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            this.finish();
        });
    }

    public void calculateButton(View view){

        String[] stringsNumbers = editText.getText().toString().split(" ");
        Integer[] integersNumbers = new Integer[stringsNumbers.length];

        for (int i=0; i<stringsNumbers.length; i++){
            integersNumbers[i] = Integer.parseInt(stringsNumbers[i]);
        }

        Arrays.sort(integersNumbers);

        int GCD = 1;
        int intRemainder;
        int lcm = 1;

        //GCD
        for (int i = 2; i<=integersNumbers[0]; i++){
            intRemainder = 0;

            for(int j=0;j<integersNumbers.length; j++){
                if(integersNumbers[j]%i != 0){
                    intRemainder = 1;
                    break;
                }
            }

            if (intRemainder == 0){
                GCD = i;
            }
        }

        //LCM
        for (int a = 0; a< integersNumbers.length; a++){
            lcm = lcm * integersNumbers[a];
        }

        int hasil = lcm/GCD;

        textView.setText(String.valueOf("GCD"+ "\n" + GCD + "\nLCM"+ "\n" +hasil));

    }
}