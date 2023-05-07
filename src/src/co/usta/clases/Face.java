/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.co.usta.clases;

import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author USER
 */
public class Face {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private Polygon side;
    
    public Face() {
        side= new Polygon();
    }

    public Face(Point p1, Point p2, Point p3, Point p4) {
        side= new Polygon();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        
        this.side.addPoint(p1.getXCoordinate(), p1.getYCoordinate());
        this.side.addPoint(p2.getXCoordinate(), p2.getYCoordinate());
        this.side.addPoint(p3.getXCoordinate(), p3.getYCoordinate());
        this.side.addPoint(p4.getXCoordinate(), p4.getYCoordinate());

    }

    public void drawFace(Graphics g) {
        g.fillPolygon(side);
    }

    public boolean isVisible() {
        boolean ret= false;
        Point aux1, aux2;
        aux1 = new Point(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z); // p1->p2
        aux2 = new Point(p4.x - p1.x, p4.y - p1.y, p4.z - p1.z); // p1->p4
        if ((aux1.x * aux2.y - aux1.y * aux2.x) > 0) {
            ret = true;
        }
        return ret;
    }

}
