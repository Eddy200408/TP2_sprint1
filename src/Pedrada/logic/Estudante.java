package Pedrada.logic;

public class Estudante extends Isecmarini implements GestorEvento{
    private int codigo;
    private String curso;
    private int anoMatricula;
    private int anoCurso;
    private String status;

    public Estudante(String username, String email, String nome, String apelido, String alcunha, String password, String[] marins, int[] nhasPedrada, String visivel, int codigo, String curso, int anoMatricula, int anoCurso, String status) {
        super(username, email, nome, apelido, alcunha, password, marins, nhasPedrada, visivel);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.status = status;
    }

    public Estudante(String helderSantos, String mail, String helder, String santos, String eddy, String coutinho, String yaaa, int i, String sim, int codigo, String engenhariaInformatica) {
        super();
    }


    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public int getAnoCurso() {
        return anoCurso;
    }

    public String getStatus() {
        return status;
    }

    public void mandaPaTurma(){
    }

    @Override
    public void novo() {

    }

    @Override
    public void novoRecorrente() {

    }

    @Override
    public void convidar() {

    }
    @Override
    public void singup() {
        super.singup();
    }

    @Override
    public void signin() {
        super.signin();
    }

    @Override
    public void resetPassword() {
        super.resetPassword();
    }

    @Override
    public void signof() {
        super.signof();
    }

    @Override
    public void manda(MembroRede membro) {

    }

    @Override
    public void mostrarPerfil() {

    }

    @Override
    public void mudarVisibilidade() {

    }

    @Override
    public String toString() {
        return "Estudante{" +
                "codigo=" + codigo +
                ", curso='" + curso + '\'' +
                ", anoMatricula=" + anoMatricula +
                ", anoCurso=" + anoCurso +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}
