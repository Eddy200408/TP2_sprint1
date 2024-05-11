package Pedrada.logic;

import java.time.LocalDateTime;

public class Comentario {
    private String texto;
    private LocalDateTime DataHora;
    private int gostos;

    public Comentario(String texto, String dataHora, int gostos) {
        this.texto = texto;
        dataHora = dataHora;
        this.gostos = gostos;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getDataHora() {
        return DataHora;
    }

    public int getGostos() {
        return gostos;
    }

    public void comentario(){
    }
    public void gostos(){

    }
    public void tragostos(){

    }
}
