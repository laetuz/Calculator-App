package com.neotica.vsga7calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHasil;
    EditText et1, et2;
    Button btnTambah, btnKurang, btnBagi, btnKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tvHasil = findViewById(R.id.tvHasil);

        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

    }

    public void tambah(View view){
        double angka1 = Double.parseDouble(et1.getText().toString());
        double angka2 = Double.parseDouble(et2.getText().toString());
        double result = angka1 +angka2;
        tvHasil.setText(Double.toString(result));
    }

    public void kurang(View view){
        double angka1 = Double.parseDouble(et1.getText().toString());
        double angka2 = Double.parseDouble(et2.getText().toString());
        double result = angka1 -angka2;
        tvHasil.setText(Double.toString(result));
    }

    public void kali(View view){
        double angka1 = Double.parseDouble(et1.getText().toString());
        double angka2 = Double.parseDouble(et2.getText().toString());
        double result = angka1 *angka2;
        tvHasil.setText(Double.toString(result));
    }

    public void bagi(View view){
        double angka1 = Double.parseDouble(et1.getText().toString());
        double angka2 = Double.parseDouble(et2.getText().toString());
        double result = angka1 /angka2;
        tvHasil.setText(Double.toString(result));
    }

    public void clear(View view){
        tvHasil.setText("");
    }
}