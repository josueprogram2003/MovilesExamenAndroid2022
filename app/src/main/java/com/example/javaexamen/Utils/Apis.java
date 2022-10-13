package com.example.javaexamen.Utils;

public class Apis {

    public static final String url = "http://172.17.7.23:3000/libros/";

    public static LibroService getLibroService(){
        return Cliente.getCliente(url).create(LibroService.class);
    }
}
