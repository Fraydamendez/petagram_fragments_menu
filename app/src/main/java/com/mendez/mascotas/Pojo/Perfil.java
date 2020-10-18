package com.mendez.mascotas.Pojo;

public class Perfil {

    public Perfil(int imagenperf, String puntuacionperf) {
        this.puntuacionperf = puntuacionperf;
        this.imagenperf = imagenperf;
    }

    private int imagenperf;
    private String puntuacionperf;

    public int getImagenperf() {
        return imagenperf;
    }



    public void setImagenperf(int imagenperf) {
        this.imagenperf = imagenperf;
    }

    public String getPuntuacionperf() {
        return puntuacionperf;
    }

    public void setPuntuacionperf(String puntuacionperf) {
        this.puntuacionperf = puntuacionperf;
    }
}
