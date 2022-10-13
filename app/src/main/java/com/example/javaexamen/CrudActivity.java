package com.example.javaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CrudActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] operaciones = {"Lacteo","Abarrotes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,operaciones);
        spinner.setAdapter(adaptador);
    }


    public void changeViewListProduct(View v){
        Intent i = new Intent(CrudActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void crear(View v){

    }

    public void eliminar(view v){

    }


}