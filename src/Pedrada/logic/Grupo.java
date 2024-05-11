package Pedrada.logic;

import java.time.LocalDateTime;

public class Grupo {
    private int id;
    private LocalDateTime data;
    private String estado;

    public Grupo(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }
}
