package mx.edu.ittepic.miriambarajas.tpdm_u4_ejercicio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Lienzo extends View {
    Dibujo d1,d2,d3,d4,d5,d6,d7,d8;
    Timer timer;
    int width = this.getResources().getDisplayMetrics().widthPixels;
    int height = this.getResources().getDisplayMetrics().heightPixels;

    public Lienzo(final Context context) {
        super(context);
        d1 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d2 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d3 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d4 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d5 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d6 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d7 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        d8 = new Dibujo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                d1.mover(width,height);
                d2.mover(width,height);
                d3.mover(width,height);
                d4.mover(width,height);
                d5.mover(width,height);
                d6.mover(width,height);
                d7.mover(width,height);
                d8.mover(width,height);
            }
        },0,30);
    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        p.setColor(d1.colorFondo);
        d1.pintar(c,p);
        p.setColor(d2.colorFondo);
        d2.pintar(c,p);
        p.setColor(d3.colorFondo);
        d3.pintar(c,p);
        p.setColor(d4.colorFondo);
        d4.pintar(c,p);
        p.setColor(d5.colorFondo);
        d5.pintar(c,p);
        p.setColor(d6.colorFondo);
        d6.pintar(c,p);
        p.setColor(d7.colorFondo);
        d7.pintar(c,p);
        p.setColor(d8.colorFondo);
        d8.pintar(c,p);
        invalidate();

        //El evento onDraw permite dibujar en la pantalla del celular
        //El objeto canvas ejecuta el dibujo
        //EL objeto paint indica sus caracteristicas como tamaño, color, etc

    }

    //public boolean onTouchEvent (MotionEvent me){
        //El evento ontouchEvent permite detectar los toques de uno o
        //más dedos que se hacen en el área de dibujo

       /* me.getAction() = obtiene la accion: presiono, soltar, mover
                de cada accion se obtiene una posición x,y*/

        /*int accion = me.getAction();
        int posx = (int) me.getX();
        int posy = (int) me.getY();


        switch (accion){
            case MotionEvent.ACTION_DOWN:
                //presionó
                break;
            case MotionEvent.ACTION_MOVE:
                //movió
                break;
            case MotionEvent.ACTION_UP:
                //soltó
                break;
        }

        return true;
    }*/
}
