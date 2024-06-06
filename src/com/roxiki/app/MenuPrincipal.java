package com.roxiki.app;
import com.roxiki.conversorMonedas.Divisas;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {
    public void iniciar() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/com/roxiki/iconos/siguiente.png"));
        Object[] opciones = { "Conversor de Monedas", "Salir del Programa" };
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);

        Object elegirOpcion = JOptionPane.showInputDialog(null,
                "Seleccione una opción:", "Menú Principal",
                JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);

        if (elegirOpcion != null) {
            String opcionElegida = (String) elegirOpcion;

            if (opcionElegida.equals("Conversor de Monedas")) {
                Divisas conversorDivisas = new Divisas();
                conversorDivisas.convertirDivisa();
            }
        }
    }
}
