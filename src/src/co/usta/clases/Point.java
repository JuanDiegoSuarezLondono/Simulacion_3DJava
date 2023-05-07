/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.co.usta.clases;

/**
 *
 * @author USER
 */
public class Point {

    public double x;

    public double y;

    public double z;

    Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int getXCoordinate() {
        return Cubo.origin + (int) this.x;
    }

    int getYCoordinate() {
        return Cubo.origin - (int) this.y;
    }

    int getZCoordinate() {
        return 0;
    }
}
