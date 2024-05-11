package Pedrada.logic;

import java.util.List;

public class PedradaFoto extends Pedrada{
    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto(int id, String username, int carimboTempo, int gostos, List<Comentario> comentarios, String nomeFicheiro, String legenda) {
        super( username, carimboTempo, gostos, comentarios);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
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
