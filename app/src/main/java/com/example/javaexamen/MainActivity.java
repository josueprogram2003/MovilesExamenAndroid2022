package com.example.javaexamen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.javaexamen.Adapter.AdapterProductoRecyclerView;
import com.example.javaexamen.Model.Libro;
import com.example.javaexamen.Utils.Apis;
import com.example.javaexamen.Utils.LibroService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private List<Libro> listarProducto;
    LibroService libroService;
    private RecyclerView rc;
    private AdapterProductoRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance();
        rc.setAdapter(adapter);
        rc.setLayoutManager(new LinearLayoutManager(getApplicationContext(), rc.VERTICAL,false));
        Listar();
    }

    private void instance(){
        listarProducto = new ArrayList<>();
        rc = findViewById(R.id.listaProductos);
       // adapter = new AdapterProductoRecyclerView(listarProducto,this);
    }

    public void Listar(){
        libroService = Apis.getLibroService();
        Call<List<Libro>> call=libroService.getLibros();
        call.enqueue(new Callback<List<Libro>>(){

            @Override
            public void onResponse(Call<List<Libro>> call, Response<List<Libro>> response) {
                if(response.isSuccessful()) {
                    listarProducto = response.body();
                    adapter = new AdapterProductoRecyclerView(listarProducto,MainActivity.this);
                    rc.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Libro>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error de conexion",Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void changeViewAddProduct(View v){
       Intent i = new Intent(MainActivity.this, CrudActivity.class);
       startActivity(i);
    }


}