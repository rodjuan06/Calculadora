package br.com.cursoudemy.calculadora.view;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora() {
        organizarLayout();

        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        Teclado teclado = new Teclado();
        add(display, BorderLayout.NORTH);
        add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {

        new Calculadora();
    }
}
