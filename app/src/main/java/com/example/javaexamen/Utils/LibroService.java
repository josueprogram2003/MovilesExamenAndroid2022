package com.example.javaexamen.Utils;

import com.example.javaexamen.Model.Libro;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface LibroService {
    @GET("listar")
    Call<List<Libro>> getLibros();

    @POST("agregar")
    Call<Libro>addPersona(@Body Libro persona);

    @POST("actualizar/{id}")
    Call<Libro>updatePersona(@Body Libro persona,@Path("id") int id);

    @POST("eliminar/{id}")
    Call<Libro>deletePersona(@Path("id")int id);
}
