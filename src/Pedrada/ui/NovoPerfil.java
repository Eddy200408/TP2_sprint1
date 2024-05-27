package Pedrada.ui;

import Pedrada.logic.Estudante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovoPerfil extends JFrame {
    public static void main(String args[]) {

        JFrame janelaCriarPerfil= new JFrame("NEW PERFIL");
        janelaCriarPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo= new JLabel("Novo Perfil", JLabel.CENTER);
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
        JLabel email= new JLabel("Email: ");
        JTextField campoEmail= new JTextField(40);

        JLabel nome= new JLabel("Nome: ");
        JTextField campoNome= new JTextField(40);

        JLabel alcunha= new JLabel("Alcunha: ");
        JTextField campoAlcunha= new JTextField(40);
        form.add(email, constraints);
        constraints.gridx = 1;
        form.add(campoEmail, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(nome, constraints);

        constraints.gridx = 1;
        form.add(campoNome, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(alcunha, constraints);

        constraints.gridx = 1;
        form.add(campoAlcunha, constraints);




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


        JButton limpar= new JButton("Limpar");
        containerButton.add(limpar);




        janelaCriarPerfil.setVisible(true);
        janelaCriarPerfil.setSize(800,650);
        janelaCriarPerfil.setLayout(new BorderLayout());
        janelaCriarPerfil.add(titulo, BorderLayout.NORTH);
        janelaCriarPerfil.add(form,BorderLayout.CENTER);
        janelaCriarPerfil.add(imgPerfil, BorderLayout.EAST);
        janelaCriarPerfil.add(containerButton, BorderLayout.SOUTH);

    }
}
