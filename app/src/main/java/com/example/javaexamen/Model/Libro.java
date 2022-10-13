package com.example.javaexamen.Model;

public class Libro {

    private int idlibro;
    private String titulo;
    private String autor;
    private int paginas;
    private String edicion;
    private int ideditorial;
    private String nombreEditorial;

    public Libro(int idlibro, String titulo, String autor, int paginas, String edicion, int ideditorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.edicion = edicion;
        this.ideditorial = ideditorial;
    }

    public Libro(int idlibro, String titulo, String autor, int paginas, String edicion, String nombre) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.edicion = edicion;
        this.nombreEditorial = nombre;
    }

    public Libro(){}

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
}
