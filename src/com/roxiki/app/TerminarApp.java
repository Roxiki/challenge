package com.roxiki.app;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TerminarApp {

    ImageIcon Pregunta = new ImageIcon(getClass().getResource("/com/roxiki/iconos/pregunta.png"));
    ImageIcon Salida = new ImageIcon(getClass().getResource("/com/roxiki/iconos/salir.png"));


    public void TerminarApp() {
        System.out.println("Terminar");

        // Mostrar un cuadro de diálogo para preguntar si se desea continuar
        Object[] opciones = {"Sí", "No"};
        int opcionMensaje = JOptionPane.showOptionDialog(
                null,
                "¿Deseas continuar?",
                "Seleccione una opción:",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                Pregunta,
                opciones,
                opciones[0]
        );
        int mensaje = (Integer) opcionMensaje;

        if (mensaje == 0) {
            MenuPrincipal iniciarApp = new MenuPrincipal();
            iniciarApp.iniciar();
        }

        else if (mensaje == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Programa Finalizado",
                    "Muchas Gracias",
                    JOptionPane.INFORMATION_MESSAGE,
                    Salida
            );
        }
    }
}
