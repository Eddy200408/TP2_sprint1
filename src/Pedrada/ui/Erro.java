package Pedrada.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Erro extends JFrame {
    public Erro() {
        setTitle("ERRO!");
        JLabel mensagem = new JLabel("COMANDO DIGITADO INCORRETO!, DIGITE NOVAMENTE O COMANDO", SwingConstants.CENTER);

        getContentPane().add(mensagem, BorderLayout.CENTER);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });

        timer.setRepeats(false);
        timer.start();

        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Erro();
            }
        });
    }
}
