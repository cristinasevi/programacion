/*

 */
package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BlackJack extends Applet {
    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    
    Image imagenes[];
    
    Baraja baraja;
    Mano crouppier, jugador;
    
    Image imagen;
    Graphics noseve;
    TextField apuesta;
    Button boton1, boton2;
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
        
        imagenes = new Image[NUMCARTAS];
        
        for(int i=0; i<NUMCARTAS; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio03/Cartas/" + ((i%CPP)+1) + palos[i/CPP]);
        
        baraja = new Baraja(imagenes);
        crouppier = new Mano(50);
        jugador = new Mano(300);
        
        confPaneles();
        
        this.setSize(700, 500);
    }
    
    private void confPaneles() throws HeadlessException {
        this.setLayout(new BorderLayout());
        Panel primerPanel = new Panel();
        primerPanel.setBackground(Color.GRAY);
        
        Label etiqueta = new Label("Introduce tu apuesta:", Label.RIGHT);
        apuesta = new TextField("", 10);
        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);
        this.add("North", primerPanel);
        
        Panel segundoPanel = new Panel();
        boton1 = new Button("Carta");
        boton2 = new Button("Me planto");
        segundoPanel.add(boton1);
        segundoPanel.add(boton2);
        this.add("South", segundoPanel);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY); 
        noseve.fillRect(0, 0, 700, 500);
        
        crouppier.paint(noseve, this);
        jugador.paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean action(Event e, Object obj) {
        if(e.target instanceof TextField) {
            apuesta.setEditable(false); // hace que no se pueda editar la cantidad de apuesta
            apuesta.setEnabled(false); // hace que se bloquee el campo de cantidad de apuesta
            crouppier.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            System.out.println("Tienes " + jugador.puntuacion() + " puntos.");
            repaint();
        } else if(e.target instanceof Button) {
            if(e.arg.equals("Carta")) {
                jugador.anadirCarta(baraja.sacarCarta());
                System.out.println("Tienes " + jugador.puntuacion() + " puntos.");
                repaint();
                if(jugador.seHaPasado())
                    System.out.println("Has perdido"); 
            }
            if(e.arg.equals("Me planto")){
                System.out.println("Te has plantado con " + jugador.puntuacion() + " puntos.");
                juegaElCrouppier();
            }
        }
        return true;
    }

    
    public void juegaElCrouppier() {
        while(crouppier.menor17()) {
            crouppier.anadirCarta(baraja.sacarCarta());
            repaint();
        }

        if ((crouppier.seHaPasado() || jugador.puntuacion() > crouppier.puntuacion()) && !jugador.seHaPasado()) {
            System.out.println("Has ganado");
        } else if (jugador.puntuacion() < crouppier.puntuacion()) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Empate jeje");
        }
    }
}