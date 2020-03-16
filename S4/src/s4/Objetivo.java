/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

import GUI.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JFrame;

/**
 *
 * @author fedeg
 */
public class Objetivo {

    private JFrame frame;
    private JFrame frame2;
    private Salpicadero salpicadero;
    private PanelBotones panelBotones;
    private Dimension screenSize;
    private double kilometros;
    static final double RADIO = 0.3;

    public Objetivo() {
        frame = new JFrame();
        frame2 = new JFrame();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        iniciarComponentes();
        configurarVentana();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private void configurarVentana() {
        frame.setTitle("Mandos");
        frame.setSize(500, 145);
        frame.setResizable(false);
        frame.setLocation((screenSize.width / 2) - 500, (screenSize.height / 2) - 100);

        frame2.setTitle("Salpicadero");
        frame2.setSize(500, 540);
        frame2.setResizable(false);
        frame2.setLocation((screenSize.width / 2), (screenSize.height / 2) - 300);

    }

    private void iniciarComponentes() {
        frame = new JFrame();
        panelBotones = new PanelBotones();
        frame.add(panelBotones);

        frame2 = new JFrame();
        salpicadero = new Salpicadero();
        frame2.add(salpicadero);
    }

    public void setVisibleMandos(Boolean visible) {
        frame.setVisible(visible);
    }

    public void setVisibleSalpicadero(Boolean visible) {
        frame2.setVisible(visible);
    }

    private double calcularVelocidad(double revoluciones) {
        double velocidad, velocidadAngular;
        velocidad = (2 * Math.PI * RADIO) * revoluciones * 0.06;
        return velocidad;
    }

    public void ejecutar(double revoluciones) {

        //Velocímetro
        double velocidad;
        velocidad = calcularVelocidad(revoluciones);
        DecimalFormat df = new DecimalFormat("#.00");
        String velocidadString = df.format(velocidad) + " km/h";

        salpicadero.setVelocimetro(velocidadString);

        //CuentaKilometros
        //CuentaRevoluciones
        String revolucionesString = revoluciones + "RPM";
        salpicadero.setCuentaRevoluciones(revolucionesString);
    }

}
