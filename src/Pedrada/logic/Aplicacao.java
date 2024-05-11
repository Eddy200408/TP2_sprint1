package Pedrada.logic;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Grupo> grupos = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();


        Estudante estudante = new Estudante("HelderSantos", "htsantos@uta.cv", "Helder", "Santos",
                "eddy", "coutinho", "yaaa", 20, "sim", 2021, "EngenhariaInformatica");
        grupos.add(new Grupo(1, "Ativo"));
        eventos.add(new Evento(2, "Finalista","Festa"));


        System.out.println("*****************PEDRADA*********************");
        System.out.println("\n");
        System.out.println("  [1] LOGIN                   [2] CRIAR CONTA");
        System.out.println("______________________________________________");
        int opcao=scanner.nextInt();

        switch(opcao){
            case 1:


                System.out.println("DIGITE O EMAIL:");
                String email = scanner.nextLine();

                System.out.println("DIGITE O PASSWORD:");
                String password = scanner.nextLine();

                System.out.println("**************** MENU USUARIO ********************");
                System.out.println("\n");
                System.out.println("  [1] INFORMACOES DOS GRUPOS \n");
                System.out.println("  [2] INFORMACOES DOS EVENTOS \n");
                System.out.println("  [3] IMPRIMIR INFO DE ESTUDANTE\n");
                System.out.println("  [4] SAIR\n");
                System.out.println("\n");
                System.out.println("___________________________________________________");
                opcao=scanner.nextInt();
                    switch(opcao){
                        case 1:
                            System.out.println("\n");
                            System.out.println("******************** GRUPOS ***********************");
                            System.out.println("\n");
                            System.out.println("INFORMACOES SOBRE OS GRUPOS:\n");
                            for (Grupo grupo : grupos) {
                                System.out.println("ID: " + grupo.getId() + ", DATA: " + grupo.getData() + ", STATUS: " + grupo.getEstado());
                            }
                            System.out.println("___________________________________________________");

                        break;

                        case 2:

                            System.out.println("**************** EVENTOS ************************");
                            System.out.println("INFORMACOES SOBRE EVENTOS \n:");
                            for (Evento evento : eventos) {
                                System.out.println("ID: " + evento.getId() + ", NOME: " + evento.getNome() + ", TIPO: " + evento.getTipo());
                            }
                            System.out.println("\n*****************COPYRIGHT*********************");
                        break;

                        case 3:
                            System.out.println("\n");
                            System.out.println("******************** ESTUDANTE ***********************");
                            System.out.println("\n");
                            System.out.println(estudante);
                            System.out.println("___________________________________________________");


                        break;

                        case 4:
                            System.out.print("SAINDO ...");
                        break;


                    }



            break;

            case 2:
                System.out.println("\n  Digite o nome do funcionário:");
                String nomeFuncionario = scanner.nextLine();

                System.out.println("\nDigite a alcunha do funcionário:");
                String alcunhaFuncionario = scanner.nextLine();

                System.out.println("\nDigite o apelido do funcionário:");
                String apelidoFuncionario = scanner.nextLine();

                System.out.println("\nDigite a função do funcionário:");
                String funcaoFuncionario = scanner.nextLine();
                System.out.println("\nDigite o username do funcionário:");
                String userFuncionario = scanner.nextLine();
                System.out.println("\nDigite o email do funcionário:");
                String emailFuncionario = scanner.nextLine();
                System.out.println("\nDigite o password do funcionário:");
                String senhaFuncionario = scanner.nextLine();

                // Aqui você pode instanciar o objeto Funcionario com os valores fornecidos pelo usuário
                Funcionario funcionario = new Funcionario(userFuncionario, emailFuncionario, nomeFuncionario, apelidoFuncionario,
                        alcunhaFuncionario, senhaFuncionario,new String[]{"marin1"}, new int[]{2}, "visivel",
                        123, funcaoFuncionario);
                System.out.println(funcionario);

            break;

        }


    }
}
