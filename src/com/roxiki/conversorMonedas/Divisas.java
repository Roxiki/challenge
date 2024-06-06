package com.roxiki.conversorMonedas;


import com.roxiki.app.TerminarApp;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Divisas {

    ImageIcon dinero = new ImageIcon(getClass().getResource("/com/roxiki/iconos/dinero.png"));
    ImageIcon Error = new ImageIcon(getClass().getResource("/com/roxiki/iconos/error.png"));
    public void convertirDivisa() {

        Object[] opcionesDivisa = {
                "USD a ARS",
                "USD a BRL",
                "USD a COP",
                "USD a VES",
                "ARS a USD",
                "BRL a USD",
                "COP a USD",
                "VES a USD"

        };

        // Se muestra un cuadro en pantalla para elegir una Moneda a convertir
        Object opcionElegida = JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Conversión de Monedas",
                JOptionPane.QUESTION_MESSAGE,
                dinero,
                opcionesDivisa,
                opcionesDivisa[0]
        );
        System.out.println(opcionElegida);
        String opcionDivisaElegida = (String) opcionElegida;

        if (opcionElegida == null) {
            TerminarApp mensajeFinal = new TerminarApp();
            mensajeFinal.TerminarApp();
            System.exit(0);
        }
        try {
            // Solicitar la cantidad a convertir
            Object opcionCantidadAConvertir = JOptionPane.showInputDialog(
                    null,
                    "Ingrese la cantidad que desea convertir de: " + opcionDivisaElegida,
                    "Conversión de Monedas",
                    JOptionPane.QUESTION_MESSAGE,
                    dinero,
                    null,
                    null
            );
            String stringCantidadAConvertir = opcionCantidadAConvertir.toString();
            DivisasCalculo operacion = new DivisasCalculo();
            operacion.resultadoConversion(opcionDivisaElegida, stringCantidadAConvertir);

        } catch(NumberFormatException | NullPointerException exception) {

            JOptionPane.showMessageDialog(
                    null,
                    "I",
                    "Error",
                    JOptionPane.ERROR_MESSAGE,
                    Error
            );
        }
        TerminarApp mensajeFinal = new TerminarApp();
        mensajeFinal.TerminarApp();
    }
}
