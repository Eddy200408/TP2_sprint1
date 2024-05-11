package Pedrada.logic;

import java.util.List;

public class PedradaEvento extends Pedrada{
    private String tipo;
    private String data;
    private String local;
    private String entrada;
    private boolean status;

    public PedradaEvento(int id, String username, int carimboTempo, int gostos, List<Comentario> comentarios, String tipo, String data, String local, String entrada, boolean status) {
        super(username, carimboTempo, gostos, comentarios);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public boolean isStatus() {
        return status;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public void gosto() {
        super.gosto();
    }

    @Override
    public void traGosto() {
        super.traGosto();
    }

    @Override
    public void masriola() {
        super.masriola();
    }

    @Override
    public void getCarimboTempo() {
        super.getCarimboTempo();
    }

    @Override
    public void display() {
        super.display();
    }
}
