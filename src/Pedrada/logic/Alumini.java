package Pedrada.logic;

public class Alumini extends Estudante{
    private String trabalho;
    private String funcao;
    private String email;

    public Alumini(String username, String email, String nome, String apelido, String alcunha, String password, String[] marins, int[] nhasPedrada, String visivel, int codigo, String curso, int anoMatricula, int anoCurso, String status, String trabalho, String funcao, String email1) {
        super(username, email, nome, apelido, alcunha, password, marins, nhasPedrada, visivel, codigo, curso, anoMatricula, anoCurso, status);
        this.trabalho = trabalho;
        this.funcao = funcao;
        this.email = email1;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getEmail() {
        return email;
    }
}
