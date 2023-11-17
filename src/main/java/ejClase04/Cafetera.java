/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase04;

/**
 *
 * @author edu
 */
public class Cafetera {

    public static final int CAP_MAX = 1000;
    public static final int CAP_MIN = 0;
    private double capacidadMaxima;//ml
    private double cantidadActual;//ml

    // Constructores
    public Cafetera() {
        this.capacidadMaxima = CAP_MAX;
        this.cantidadActual = CAP_MIN;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Métodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirCafe(int cantidadServir) {
        if (cantidadServir > this.cantidadActual) {
            this.cantidadActual = CAP_MIN;
        } else {
            this.cantidadActual -= cantidadServir;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = CAP_MIN;
    }

    public void agregarCafe(int cantidadAPoner) {
        if (cantidadAPoner > this.capacidadMaxima) {
            this.cantidadActual = CAP_MAX;
        } else {
            this.cantidadActual += cantidadAPoner;
        }
    }

    // Get y Set
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cafetera{");
        sb.append("capacidadMaxima=").append(capacidadMaxima);
        sb.append(", cantidadActual=").append(cantidadActual);
        sb.append('}');
        return sb.toString();
    }

}
