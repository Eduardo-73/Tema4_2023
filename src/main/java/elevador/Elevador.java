/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eduar
 */
public class Elevador {

    public static Random rd = new Random();
    // Variables
    private int numSerie;
    private String fabricante;
    private int capacidadMax;
    private int pesoMax;
    private LocalDate fecFabricacion;
    private LocalDate fecUltRevision;
    private Estado estadoElevador;
    private Planta estadoPlanta;

    // Contructor
    public Elevador(String fabricante, int capacidadMax,
            int pesoMax) {
        this.numSerie = rd.nextInt(11_111_111, 99_999_999);
        this.fabricante = fabricante;
        if (capacidadMax < 0 || capacidadMax > 10) {
            this.capacidadMax = 0;
        } else {
            this.capacidadMax = capacidadMax;
        }
        if (pesoMax < 0 || pesoMax > 800) {
            this.pesoMax = 0;
        } else {
            this.pesoMax = pesoMax;
        }
        this.fecFabricacion = LocalDate.now();
        this.fecUltRevision = LocalDate.now();
        this.estadoElevador = null;
        this.estadoPlanta = Planta.PLANTA_BAJA;
    }

    // Métodos 
    public boolean mover(int numPersonas, int peso, Planta destino) {
        if ((estadoPlanta.ordinal() < destino.ordinal()
                || estadoPlanta.ordinal() > destino.ordinal())
                && (numPersonas >= 0 && numPersonas <= this.getCapacidadMax())
                && (peso >= 0 && peso <= this.getPesoMax())) {
            estadoElevador = estadoPlanta.ordinal() < destino.ordinal()
                    ? Estado.SUBIENDO : Estado.BAJANDO;
            return true;
        } else {
            return false;
        }
    }

    // Getters y Setters
    public int getNumSerie() {
        return numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public LocalDate getFecFabricacion() {
        return fecFabricacion;
    }

    public LocalDate getFecUltRevision() {
        return fecUltRevision;
    }

    public void setFecUltRevision(LocalDate fecUltRevision) {
        this.fecUltRevision = fecUltRevision;
    }

    public Estado getEstadoElevador() {
        return estadoElevador;
    }

    public void setEstadoElevador(Estado estadoElevador) {
        this.estadoElevador = estadoElevador;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", fabricante=").append(fabricante);
        sb.append(", capacidadMax=").append(capacidadMax);
        sb.append(", pesoMax=").append(pesoMax);
        sb.append(", fecFabricacion=").append(fecFabricacion);
        sb.append(", fecUltRevision=").append(fecUltRevision);
        sb.append(", estadoElevador=").append(estadoElevador);
        sb.append(", estadoPlanta=").append(estadoPlanta);
        sb.append('}');
        return sb.toString();
    }
}
