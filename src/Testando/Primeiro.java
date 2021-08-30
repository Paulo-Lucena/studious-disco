package Testando;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primeiro {

    private JButton botao;
    private JPanel painel;

    public Primeiro() {
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Olá, Mundo!");

            }
        });
    }

    public static void main(String[] args) {

    JFrame frame = new JFrame("Quebrando a Maldição");
    frame.setContentPane(new Primeiro().painel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

    }
}
