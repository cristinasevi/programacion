/*
 
 */
/*
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
            apuesta.setEditable(false);
            crouppier.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            System.out.println("Tienes " + jugador.puntuacion() + " puntos.");
            repaint();
            return true;
        } else if(e.target instanceof Button) {
            if(e.arg.equals("Carta")) {
                jugador.anadirCarta(baraja.sacarCarta());
                System.out.println("Tienes " + jugador.puntuacion() + " puntos.");
                repaint();
                if(jugador.seHaPasado())
                    System.out.println("Te has pasado");
                    juegaElCrouppier();
                return true;
            }
            else if (e.arg == "Me planto") {
                System.out.println("Te has plantado con " + jugador.puntuacion() + " puntos.");
                juegaElCrouppier();
            }
            repaint();
        }
        return true;
    }
    
    public void juegaElCrouppier() {
        while(crouppier.menor17()) {
            crouppier.anadirCarta(baraja.sacarCarta());
            repaint();
        }
        
        if ((crouppier.seHaPasado() || jugador.puntuacion() > crouppier.puntuacion()) && !jugador.seHaPasado()) {
            System.out.println("Has ganado!");
        } else if (jugador.puntuacion() < crouppier.puntuacion()) {
            System.out.println("Has perdido :(");
        } else {
            System.out.println("Empate");
        }
    }
}
*/
/*
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
import java.awt.Rectangle;
import java.awt.TextField;

public class BlackJack extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    Image imagenes[];

    String cartas[] = {"clubs", "diamonds", "hearts", "spades"};

    Thread animacion;
    Image imagen;
    Graphics noseve;

    Rectangle tablero[][];
    Baraja baraja;

    Mano jugador;
    Mano crupier;

    Button pedir;
    Button plantar;
    TextField apuesta;
    Button boton1, boton2;

    public void init() {
        imagen = this.createImage(700, 700);
        noseve = imagen.getGraphics();

        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < NUMCARTAS; i++) {

            String nombre = cartas[i / CPP];
            int num = (i % CPP) + 1;

            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio03/Cartas/" + num + "_of_" + nombre + ".png");

        }

        baraja = new Baraja(imagenes);
        jugador = new Mano(500);
        crupier = new Mano(100);

        pedir = new Button();
        plantar = new Button();

        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta", Label.RIGHT);
        apuesta = new TextField("", 10);

        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);

        confPaneles();

        this.add("North", primerPanel);
        this.setSize(700, 700);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

    private void confPaneles() throws HeadlessException {
        this.setLayout(new BorderLayout());
        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta : ", Label.RIGHT);
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

    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);

        jugador.paint(noseve, this);
        crupier.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

    public void plantar() {
        while (crupier.puntuacion() <= 17) {
            crupier.anadirCarta(baraja.sacarCarta());
            repaint();
        }

        if ((crupier.seHaPasado() || jugador.puntuacion() > crupier.puntuacion()) && !jugador.seHaPasado()) {
            System.out.println("Has ganado");
        } else if (jugador.puntuacion() < crupier.puntuacion()) {
            System.out.println("Has perdido :(");
        } else {
            System.out.println("Empate jeje");

        }
    }

    public boolean action(Event ev, Object obj) {
        if (ev.target instanceof TextField) {
            apuesta.setEnabled(false);
            jugador.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            crupier.anadirCarta(baraja.sacarCarta());
            System.out.println("Tienes " + jugador.puntuacion() + " puntos.");

            repaint();

        } else if (ev.target instanceof Button) {
            if (ev.arg == "Carta") {
                jugador.anadirCarta(baraja.sacarCarta());
                System.out.println("Tienes " + jugador.puntuacion() + " puntos.");

                if (jugador.seHaPasado()) {
                    System.out.println("Te has pasado");
                    plantar();
                }
            } else if (ev.arg == "Me planto") {
                System.out.println("Te has plantado con " + jugador.puntuacion() + " puntos.");
                plantar();
            }

            repaint();
        }
        return true;
    }

}
*/
/*
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
import java.util.ArrayList;

public class BlackJack extends Applet{
    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    Image imagenes[];
    String palos[] = {"_of_hearts", "_of_spades", "_of_diamonds", "_of_clubs"};
    Baraja baraja;
    ArrayList<Mano> manos;
    TextField apuesta;
    
    Image imagen;
    Graphics noseve;
    
    public void init(){
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUMCARTAS];
        manos = new ArrayList<Mano>();
     
        for(int i = 0; i < NUMCARTAS; i++){
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio003/Sprites/" + ((i%CPP)+1) + palos[i/CPP] + ".png");
        }
        baraja = new Baraja(imagenes);
        
        confPaneles();
        
        this.setSize(700, 500);
    }

    public void confPaneles() throws HeadlessException {
        this.setLayout(new BorderLayout());
        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta: ", Label.RIGHT);
        apuesta = new TextField("", 10);
        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);
        this.add("North", primerPanel);
        
        Panel segundoPanel = new Panel();
        Button pedir = new Button("Pedir");
        Button plantarse = new Button("Plantarse");
        segundoPanel.add(pedir);
        segundoPanel.add(plantarse);
        this.add("South", segundoPanel);
    }

    public void repartir() {
        for (int i = 0; i < 2; i++) {
            manos.add(new Mano((240*i)+60));
            for(int j = 0; j < 2; j++){
                manos.get(i).anadirCarta(baraja.sacarCarta());
            }
        }
    }
    public void paint(Graphics g){
        noseve.setColor(Color.BLUE);
        noseve.fillRect(0, 0, 700, 500);
        noseve.setColor(Color.GRAY);
        for(Mano mano:manos){
            mano.paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
        paint(g);
    }
    public boolean action(Event ev, Object obj){
        if(ev.target instanceof TextField){
            apuesta.setEditable(false);
            apuesta.setEnabled(false);
            repartir();
            repaint();
        }else if( ev.target instanceof Button){
            if(ev.arg.equals("Pedir")){
                    manos.get(1).anadirCarta(baraja.sacarCarta());
                    repaint();
                    if(manos.get(1).seHaPasado()){
                        System.out.println("Has perdido"); 
                    }
            }
            if(ev.arg.equals("Plantarse")){
                juegaCroupier();
            }
        }
        return true;
    }
    public void juegaCroupier(){
        while(manos.get(0).menor17()){
            manos.get(0).anadirCarta(baraja.sacarCarta());
            repaint();
        }
        if(manos.get(0).seHaPasado() == false){
            if(manos.get(0).puntuacion() > manos.get(1).puntuacion()){
                System.out.println("Ha ganado el Croupier");
            }else if(manos.get(1).puntuacion() > manos.get(0).puntuacion()){
                System.out.println("Ha ganado el Jugador");
            }else if(manos.get(1).puntuacion() == manos.get(0).puntuacion()){
                System.out.println("Empate");
            }  
        }else{
            System.out.println("El Croupier se ha pasado");
        }
    }
}*/

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