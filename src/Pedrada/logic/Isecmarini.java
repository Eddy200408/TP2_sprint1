package Pedrada.logic;

public abstract class Isecmarini implements MembroRede{
    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String alcunha;
    protected String password;
    private String [] marins;
    private int [] nhasPedrada;
    private String visivel;

    public Isecmarini(String username, String email, String nome, String apelido, String alcunha, String password, String[] marins, int[] nhasPedrada, String visivel) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.alcunha = alcunha;
        this.password = password;
        this.marins = marins;
        this.nhasPedrada = nhasPedrada;
        this.visivel = visivel;
    }

    public Isecmarini(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Isecmarini() {

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void singup(){
    }
    public void signin(){
    }
    public void resetPassword(){
    }
    public void signof(){
    }

}

