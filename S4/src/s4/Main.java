/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

import GUI.PanelBotones;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        GestorFiltros gestorFiltros = new GestorFiltros();

        Cliente cliente = new Cliente();

        cliente.setGestorFiltros(gestorFiltros);

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            cliente.solicitar(PanelBotones.estadoMotor);
        }

    }
}
