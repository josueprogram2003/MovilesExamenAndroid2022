package com.example.javaexamen.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaexamen.Model.Libro;
import com.example.javaexamen.R;

import java.util.ArrayList;
import java.util.List;


public class AdapterProductoRecyclerView extends RecyclerView.Adapter<AdapterProductoRecyclerView.MiHolder> {

    List<Libro> listaProductos;
    Context context;

    public AdapterProductoRecyclerView(List<Libro> listaProductos, Context context) {
        this.listaProductos = listaProductos;
        this.context = context;
    }


    //Crear La vista
    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contentlist,parent,false);
        MiHolder miholder = new MiHolder(view);
        return miholder;
    }
    //Agregar Los datos a la lista
    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {
    Libro producto = listaProductos.get(position);
    holder.tv1.setText("Libro: "+producto.getTitulo());
        holder.tv2.setText("Autor: "+producto.getAutor());
        holder.tv3.setText("Páginas: "+producto.getPaginas());
        holder.tv4.setText("Editorial: "+producto.getNombreEditorial());
    }
    //La longitud de la lista
    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    //Instaciar la lista
    public class MiHolder extends RecyclerView.ViewHolder{
        TextView tv1,tv2,tv3,tv4;
        public MiHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_libro);
            tv2 = itemView.findViewById(R.id.tv_autor);
            tv3 = itemView.findViewById(R.id.tv_paginas);
            tv4 = itemView.findViewById(R.id.tv_editorial);
        }
    }
}
