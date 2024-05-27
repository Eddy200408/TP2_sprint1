package Pedrada.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public static void main(String args[]) {

        JFrame janelaLogin= new JFrame("LOGIN");
        janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo= new JLabel("LOGIN PEDRADA DIGITAL", JLabel.CENTER);

        JPanel form= new JPanel();
        form.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 10, 5, 0);
        JLabel email= new JLabel("Email: ");
        JTextField campoEmail= new JTextField(20);

        JLabel Password= new JLabel("Password: ");
        JTextField password= new JTextField(20);

        form.add(email, constraints);
        constraints.gridx = 1;
        form.add(campoEmail, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(Password, constraints);

        constraints.gridx = 1;
        form.add(password, constraints);

        JPanel containerButton= new JPanel();
        containerButton.setLayout(new GridLayout(1,2));

        JButton limpar= new JButton("LIMPAR");
        containerButton.add(limpar);
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa os campos de texto
                email.setText("");
                password.setText("");

            }
        });



        JButton login= new JButton("LOGIN");
        containerButton.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(janelaLogin, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    PedradaDigitalGUI.main(new String[0]);
                    janelaLogin.dispose();
                }

        });





        janelaLogin.setVisible(true);
        janelaLogin.setSize(500,450);
        janelaLogin.setLayout(new BorderLayout());
        janelaLogin.add(titulo, BorderLayout.NORTH);
        janelaLogin.add(form,BorderLayout.CENTER);
        janelaLogin.add(containerButton, BorderLayout.SOUTH);


    }
    }
