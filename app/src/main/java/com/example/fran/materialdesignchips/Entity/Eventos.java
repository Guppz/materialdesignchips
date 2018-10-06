package com.example.fran.materialdesignchips.Entity;

public class Eventos {
    public int id;
    public String nombreEvento;

    public Eventos(int id, String nombreEvento) {
        this.id = id;
        this.nombreEvento = nombreEvento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreEvento() {
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
}
