public class Funcionario extends Isecmarini implements GestorEvento{
    private int uo;
    private String funcao;

    public Funcionario(String username, String email, String nome, String apelido, String alcunha, String password, String[] marins, int[] nhasPedrada, String visivel, int uo, String funcao) {
        super(username, email, nome, apelido, alcunha, password, marins, nhasPedrada, visivel);
        this.uo = uo;
        this.funcao = funcao;
    }

    public int getUo() {
        return uo;
    }

    public String getFuncao() {
        return funcao;
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
}
