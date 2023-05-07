package src.co.usta.clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

public class Cubo extends JApplet implements Runnable, MouseMotionListener {

    Thread luxury;
    static Point[] vertex = new Point[8];
    int maxSize;
    private Color color;
    static int origin;
    static int xMouseP = 0, yMouseP = 0;
    int xAux, yAux;
    Image cImage; 
    int module;
    
    Graphics backBuffer;
    double y;

    public Cubo(int myModule){
       module = myModule;
    }
    
    @Override
    public void init() {        
        y=0.0;
        setSize(maxSize, maxSize);
        origin = maxSize/2;
        setBackground(new Color(0.2f, 0.2f, 0.2f, 1.0f));
        addMouseMotionListener(this);
        int[] coordX = new int[]{-module, module, module, -module, -module, module, module, -module};
        int[] coordY = new int[]{-module, -module, module, module, -module, -module, module, module};
        int[] coordZ = new int[]{module, module, module, module, -module, -module, -module, -module};
        backBuffer = cImage.getGraphics();
        for (int i = 0; i < vertex.length; i++) {
            vertex[i] = new Point(coordX[i], coordY[i], coordZ[i]);
        }
    }

    @Override
    public void start() {
        try {
            luxury = new Thread(this);
            luxury.start();
        } catch (Exception e) {
        }
    }

    @Override
    public void run() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void paint(Graphics g) {
        int[] pts1 = new int[]{0, 1, 5, 0, 0, 3};
        int[] pts2 = new int[]{1, 5, 4, 3, 4, 2};
        int[] pts3 = new int[]{2, 6, 7, 7, 5, 6};
        int[] pts4 = new int[]{3, 2, 6, 4, 1, 7};

        Color[] colorRGB = new Color[]{color, color, color, color, color, color};
        Face[] faces = new Face[6];
        backBuffer.clearRect(0, 0, 500, 500);

        for (int i = 0; i < 6; i++) {
            backBuffer.setColor(colorRGB[i]);
            faces[i] = new Face(vertex[pts1[i]], vertex[pts2[i]], vertex[pts3[i]], vertex[pts4[i]]);
            if (faces[i].isVisible()) {
                faces[i].drawFace(backBuffer);
            }
        }
        g.drawImage(cImage, 0, 0, this);
        g.drawString(" Coordenadas: ", 30, 30);
        g.drawString(" X= " + xMouseP, 30, 50);
        g.drawString(" Y= " + yMouseP, 30, 65);
        g.drawString(" Dimensiones: ", 30, 80);
        g.drawString(" Perimetro= " + (module*12), 30, 95);
        g.drawString(" Volumen= " + (module*module*module), 30, 110);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void destroy() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Exception in sleep");
        }
    }

    void rota(double angleTeta, double anglePhi, double anglePsi) {
        double teta = Math.toRadians(angleTeta);
        double phi = Math.toRadians(anglePhi);
        double psi = Math.toRadians(anglePsi);
        Point pAux = new Point();
        Point pAux1 = new Point();
        Point pAux2 = new Point();
        for(int y=0; y<100; y++){
            for (int i = 0; i < 8; i++) {
                pAux1.x = vertex[i].x;
                pAux1.y = vertex[i].y * Math.cos(teta) + vertex[i].z * (-Math.sin(teta));
                pAux1.z = vertex[i].y * Math.sin(teta) + vertex[i].z * Math.cos(teta);
                pAux2.x = pAux1.x * Math.cos(phi) + pAux1.z * Math.sin(phi);
                pAux2.y = pAux1.y;
                pAux2.z = pAux1.x * (-Math.sin(phi)) + pAux1.z * Math.cos(phi);
                pAux.x = pAux2.x * Math.cos(psi) + pAux2.y * (-Math.sin(psi));
                pAux.y = pAux2.x * Math.sin(psi) + pAux2.y * Math.cos(psi);
            pAux.z = pAux2.z;
            vertex[i].x = pAux.x;
            vertex[i].y = pAux.y;
            vertex[i].z = pAux.z;
            }
        }
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xAux = xMouseP;
        yAux = yMouseP;
        xMouseP = e.getX();
        yMouseP = e.getY();
        
        for(int i=0; i<100 ; i++){
            yAux = i;
            xAux = i;
            if (yMouseP > yAux) {
            rota(2, 0, 0);
            }

            if (yMouseP < yAux) {
                rota(-2, 0, 0);
            }

            if (xMouseP > xAux) {
                rota(0, 2, 0);
            }

            if (xMouseP < xAux) {
                rota(0, -2, 0);
            }
        }
        

        repaint();

        e.consume();

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
     public Image getcImage() {
        return cImage;
    }

    public void setcImage(Image cImage) {
        this.cImage = cImage;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
