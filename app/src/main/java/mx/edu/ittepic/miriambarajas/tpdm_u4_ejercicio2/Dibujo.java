package mx.edu.ittepic.miriambarajas.tpdm_u4_ejercicio2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Dibujo {
    int colorFondo, x, y, tamaño, desplazamientoX, desplazamientoY;

    public Dibujo (Lienzo lienzo, int posx, int posy) {
        x = posx;
        y = posy;
        tamaño = (int) (Math.random() * 300) + 20;
        //el tamaño máximo de un circulo será de 320, como el RANDOM puede ser 0
        // o valores menores a 20, se le suma 20 por si llega a dar 0 entonces
        //al menos que sea de 20 px lo cual es sumamente pequeño

        //Generando si va de izquierda a derecha
        if (Math.random() * 10 < 5) {
            desplazamientoX = 5; //si el random es <5 la variable se suma por lo que
            // el movimiento es a la derecha
        } else {
            desplazamientoX = -5; //si el random >5 entonces la variable se hace negativa
            //por lo que resta lo que significa que el movimiento es a la izquierda
        }

        //generando si sube o baja, si <5 se suma (BAJA) si >5 se resta (SUBE)
        if (Math.random() * 10 < 5) {
            desplazamientoY = 5;
        } else {
            desplazamientoY = -5;
        }

        int c = (int) (Math.random() * 10);
        switch (c) {
            case 0:
                colorFondo = Color.BLACK;
                break;
            case 1:
                colorFondo = Color.BLUE;
                break;
            case 2:
                colorFondo = Color.YELLOW;
                break;
            case 3:
                colorFondo = Color.GREEN;
                break;
            case 4:
                colorFondo = Color.CYAN;
                break;
            case 5:
                colorFondo = Color.MAGENTA;
                break;
            case 6:
                colorFondo = Color.RED;
                break;
            case 7:
                colorFondo = Color.WHITE;
                break;
            case 8:
                colorFondo = Color.LTGRAY;
                break;
            case 9:
                colorFondo = Color.GRAY;
                break;
        }
    }
        public void mover (int ancho, int alto) {
        if(x<=0) {
            desplazamientoX = 10;
        }if(y<=0){
            desplazamientoY=10;
        }if(x>=ancho){
            desplazamientoX=(desplazamientoX*-1);
        }if (y >= alto) {
            desplazamientoY=(desplazamientoY*-1);
        }
        x += desplazamientoX;
        y += desplazamientoY;
        }

        public void pintar(Canvas c, Paint p){
            c.drawCircle(x,y,tamaño,p);
        }

}
