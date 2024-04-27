import java.util.List;

public abstract class Pedrada {
    private int id;
    private String username;
    private int carimboTempo;
    private int gostos;
    private List<Comentario> comentarios;

    public Pedrada(int id, String username, int carimboTempo, int gostos, List<Comentario> comentarios) {
        this.id = id;
        this.username = username;
        this.carimboTempo = carimboTempo;
        this.gostos = gostos;
        this.comentarios = comentarios;
    }



    public void gosto(){
    }
    public void traGosto(){
    }
    public void masriola(){
    }
    public void getCarimboTempo(){
    }
    public void display(){
    }
}
