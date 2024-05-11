package Pedrada.logic;

import java.util.List;

public class PedradaMensagem extends Pedrada{
    private String mensagem;

    public PedradaMensagem(int id, String username, int carimboTempo, int gostos, List<Comentario> comentarios, String mensagem) {
        super( username, carimboTempo, gostos, comentarios);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void addPedrada(){
    }
    public void show(){
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
