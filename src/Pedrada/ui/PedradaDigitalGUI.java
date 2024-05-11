package Pedrada.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PedradaDigitalGUI extends JFrame {
    public static void main(String args[]) {



        JFrame janelaPrincipal= new JFrame("POO");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel norteLabel= new JLabel("Rede Social-PedradaDigital", JLabel.CENTER);

        JPanel contentorLabel = new JPanel();

        JTextArea text=new JTextArea(35,68);
        JLabel Pedra= new JLabel("PedraDigital>", JLabel.LEFT);
        JTextField campoPedra= new JTextField(50);

        contentorLabel.add(text, BorderLayout.CENTER);
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

        contentorBtn.add(LoginBtn, gbc);

        JButton ExecutBtn = new JButton("Executar");
        gbc.gridx = 0;
        gbc.gridy = 2;

        ExecutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(campoPedra.getText().equals("Criar Perfil")){
                NovoPerfil.main(new String[0]);
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
