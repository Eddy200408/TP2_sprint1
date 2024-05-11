package Pedrada.logic;

public abstract class Professor extends Isecmarini{
    private String area;
    private int grau;
    private int departamento;


    public Professor(String username, String email, String nome, String apelido, String alcunha, String password, String[] marins, int[] nhasPedrada, String visivel, String area, int grau, int departamento) {
        super(username, email, nome, apelido, alcunha, password, marins, nhasPedrada, visivel);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }

    public void mandaColegas(){
    }

    public String getArea() {
        return area;
    }

    public int getGrau() {
        return grau;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
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
