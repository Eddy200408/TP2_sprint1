package Pedrada.ui;

import Pedrada.ConexaoBD;
import Pedrada.logic.Estudante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NovoPerfilEstudante extends JFrame {
    public static void main(String args[]) {

        Connection conexao= ConexaoBD.getConnection();
        if(conexao!=null){
            //
        }

        JFrame janelaCriarPerfil= new JFrame("NEW PERFIL");
        janelaCriarPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo= new JLabel("NOVO PERFIL ESTUDANTE", JLabel.CENTER);
        titulo.setBackground(Color.GRAY);
        titulo.setForeground(Color.WHITE);
        titulo.setPreferredSize(new Dimension(800,50));
        titulo.setOpaque(true);


        JPanel form= new JPanel();
        form.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 10, 5, 0);

        JLabel labelUsername= new JLabel("Username: ");
        JTextField username= new JTextField(40);

        JLabel labelEmail= new JLabel("email: ");
        JTextField email= new JTextField(40);

        JLabel labelPassword= new JLabel("Password: ");
        JTextField password= new JTextField(40);

        //JLabel labelCodigo= new JLabel("Codigo: ");
        //JTextField codigo= new JTextField(40);

        JLabel labelCurso= new JLabel("Curso: ");
        JTextField curso= new JTextField(40);



        form.add(labelUsername, constraints);
        constraints.gridx = 1;
        form.add(username, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(labelEmail, constraints);

        constraints.gridx = 1;
        form.add(email, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(labelPassword, constraints);

        constraints.gridx = 1;
        form.add(password, constraints);

        //constraints.gridy++;
        //constraints.gridx = 0;
        //form.add(labelCodigo, constraints);

        //constraints.gridx = 1;
        //form.add(codigo, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(labelCurso, constraints);

        constraints.gridx = 1;
        form.add(curso, constraints);




        JPanel imgPerfil= new JPanel();
        imgPerfil.setLayout(new GridBagLayout());
        GridBagConstraints im = new GridBagConstraints();

        im.gridx = 0;
        im.gridy = 0;
        im.gridwidth = GridBagConstraints.REMAINDER;
        im.anchor = GridBagConstraints.CENTER;
        im.insets = new Insets(10, 10, 10, 50);
        JButton selecionar= new JButton("Selecionar Foto");
        imgPerfil.add(selecionar, im);
        JLabel icon=new JLabel(new ImageIcon("icon.png"));
        icon.setPreferredSize(new Dimension(200,200));
        icon.setOpaque(true);
        im.gridy=1;
        imgPerfil.add(icon,im);

        JPanel containerButton= new JPanel();
        containerButton.setLayout(new GridLayout(1,2));

        JButton cadastrar= new JButton("Cadastrar");
        containerButton.add(cadastrar);
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = username.getText();
                String Email = email.getText();
                String Password = password.getText();
               // Integer Codigo= Integer.valueOf(codigo.getText());
                String Curso= curso.getText();

                Estudante estudante1= new Estudante(Username,Email,Password,Curso);

                boolean cadastroRealizadoComSucesso = true; // Substitua com a lógica real de cadastro

                if (cadastroRealizadoComSucesso) {
                    JOptionPane.showMessageDialog(janelaCriarPerfil, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(janelaCriarPerfil, "Erro ao realizar cadastro.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                try (Connection connection = ConexaoBD.getConnection()) {
                    if (connection == null) {
                        throw new SQLException("Conexão com o banco de dados falhou.");
                    }

                    String sql = "INSERT INTO estudante (username, email, senha, curso) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        statement.setString(1, estudante1.getUsername());
                        statement.setString(2, estudante1.getEmail());
                        statement.setString(3, estudante1.getPassword());
                        statement.setString(4, estudante1.getCurso());
                        statement.executeUpdate();
                        JOptionPane.showMessageDialog(janelaCriarPerfil, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(janelaCriarPerfil, "Erro ao realizar cadastro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("nome" +Username);

            }
        });

        JButton limpar= new JButton("Limpar");
        containerButton.add(limpar);
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa os campos de texto
                username.setText("");
                email.setText("");
                password.setText("");
                curso.setText("");

            }
        });




        janelaCriarPerfil.setVisible(true);
        janelaCriarPerfil.setSize(800,650);
        janelaCriarPerfil.setLayout(new BorderLayout());
        janelaCriarPerfil.add(titulo, BorderLayout.NORTH);
        janelaCriarPerfil.add(form,BorderLayout.CENTER);
        janelaCriarPerfil.add(imgPerfil, BorderLayout.EAST);
        janelaCriarPerfil.add(containerButton, BorderLayout.SOUTH);

    }
}
