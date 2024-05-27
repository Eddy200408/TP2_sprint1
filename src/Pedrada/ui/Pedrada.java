package Pedrada.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pedrada extends JFrame {
    public static void main(String args[]) {

        JFrame janelaComentar= new JFrame("COMENTAR");
        janelaComentar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo= new JLabel("LOGIN PEDRADA DIGITAL", JLabel.CENTER);

        JPanel form= new JPanel();
        form.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 10, 5, 0);
        JLabel labelTitulo= new JLabel("Titulo: ");
        JTextField tituloTexto= new JTextField(20);

        JLabel labelTexto= new JLabel("Texto: ");
        JTextField texto= new JTextField(20);

        form.add(labelTitulo, constraints);
        constraints.gridx = 1;
        form.add(tituloTexto, constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        form.add(labelTexto, constraints);

        constraints.gridx = 1;
        form.add(texto, constraints);

        JPanel containerButton= new JPanel();
        containerButton.setLayout(new GridLayout(1,2));

        JButton limpar= new JButton("LIMPAR");
        containerButton.add(limpar);
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa os campos de texto
                tituloTexto.setText("");
                texto.setText("");

            }
        });



        JButton enviar= new JButton("ENVIAR");
        containerButton.add(enviar);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }

        });





        janelaComentar.setVisible(true);
        janelaComentar.setSize(500,450);
        janelaComentar.setLayout(new BorderLayout());
        janelaComentar.add(titulo, BorderLayout.NORTH);
        janelaComentar.add(form,BorderLayout.CENTER);
        janelaComentar.add(containerButton, BorderLayout.SOUTH);


    }
}
