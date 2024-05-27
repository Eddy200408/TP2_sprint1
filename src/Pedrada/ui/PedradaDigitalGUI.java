package Pedrada.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedradaDigitalGUI extends JFrame {
    public static void main(String args[]) {



        JFrame janelaPrincipal= new JFrame("POO");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel norteLabel= new JLabel("Rede Social-PedradaDigital", JLabel.CENTER);

        JPanel contentorLabel = new JPanel();


        JTextArea text=new JTextArea(45,150);
        JLabel Pedra= new JLabel("PedraDigital>", JLabel.LEFT);
        JTextField campoPedra= new JTextField(130);


        contentorLabel.add(text);
        contentorLabel.add(Pedra);
        contentorLabel.add(campoPedra);

        JLabel sulLabel=new JLabel("Mensagem", JLabel.CENTER);


        JPanel contentorBtn = new JPanel(new GridBagLayout() );
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 10, 2, 10); // Margens para os botões

        JButton LoginBtn = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //   gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0.0;

        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Login.main(new String[0]);
                    janelaPrincipal.dispose();

            }
        });


        contentorBtn.add(LoginBtn, gbc);

        JButton ExecutBtn = new JButton("Executar");
        gbc.gridx = 0;
        gbc.gridy = 2;


        ExecutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(campoPedra.getText().equals("Criar Perfil Estudante")){
                    NovoPerfilEstudante.main(new String[0]);
                    janelaPrincipal.dispose();
            }
                else if(campoPedra.getText().equals("Criar Perfil Professor")){
                    NovoPerfilProfessor.main(new String[0]);
                    janelaPrincipal.dispose();
                }
                else if(campoPedra.getText().equals("Criar Perfil Funcionario")){
                    NovoPerfilFuncionario.main(new String[0]);
                    janelaPrincipal.dispose();
                }
                else if (campoPedra.getText().equals("Comentar")){
                    Pedrada.main(new String[0]);
                    janelaPrincipal.dispose();

                }
                else {
                    Erro.main(new String[0]);
                }
            }
        });

        contentorBtn.add(ExecutBtn, gbc);

        JButton LogoutBtn = new JButton("Logout");
        gbc.gridx = 0;
        gbc.gridy = 3;

        contentorBtn.add(LogoutBtn, gbc);


        contentorLabel.setBackground(Color.GRAY);

        janelaPrincipal.setSize(800,660);
        janelaPrincipal.setVisible(true);
        janelaPrincipal.add(norteLabel, BorderLayout.NORTH);
        janelaPrincipal.add(contentorLabel, BorderLayout.CENTER);
        janelaPrincipal.add(sulLabel, BorderLayout.SOUTH);
        janelaPrincipal.add(contentorBtn, BorderLayout.EAST);

    }


}


