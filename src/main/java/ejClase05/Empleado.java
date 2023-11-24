/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase05;

import java.text.DecimalFormat;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author edu
 */
public class Empleado {

    public static Random rd = new Random();
    // Atributos encapsulados
    private String nombre;
    private String nif;
    private double sueldoBase;
    private double cantidadAbonarHoras;
    private IRPF irpf;
    private boolean casado;
    private int numHijos;
    String[] nombres = {"Pepe", "Pepa", "Antonio", "Antonia", "Manuel",
        "Manuela", "Victor", "Victoria", "Frederica", "Alfredo"};
    int numRD = rd.nextInt(1, 4);

    //Constructor copia
    public Empleado() {
        this.nombre = listaNombres(nombres);
        this.nif = RandomStringUtils.random(9, "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
                + "123456789");
        this.sueldoBase = sueldoRandom();
        this.cantidadAbonarHoras = horasRandom();
        if (numRD == 1) {
            this.irpf = IRPF.OCHO;
        } else if (numRD == 2) {
            this.irpf = IRPF.QUINCE;
        } else {
            this.irpf = IRPF.VENTIUNO;
        }
        this.casado = casadoRandom();
        this.numHijos = hijosRandom();
    }

    // Constructor
    public Empleado(String nombre, String nif, double sueldoBase,
            double cantidadAbonarHoras, IRPF irpf, boolean casado, int numHijos) {
        this.nombre = nombre;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.cantidadAbonarHoras = cantidadAbonarHoras;
//        if ((irpf != irpf.OCHO) && (irpf != irpf.QUINCE)
//                && (irpf != irpf.VENTIUNO)) {
//            throw new IllegalArgumentException("IRPF No Válido");
//        }En el caso que no tenga un enum
        this.irpf = irpf;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    // Métodos
    public static double sueldoRandom() {
        return rd.nextDouble(1100, 1501);
    }

    public static double horasRandom() {
        return rd.nextDouble(30, 51);
    }

    public static boolean casadoRandom() {
        return rd.nextBoolean();
    }

    public static int hijosRandom() {
        return rd.nextInt(1, 10);
    }

    public static String listaNombres(String[] nombre) {
        String listaNombres;
        int numRd = rd.nextInt(0, 9 + 1);
        listaNombres = nombre[numRd];
        return listaNombres;
    }

    public double calculo(int horas) {
        return this.cantidadAbonarHoras * horas;
    }

    // Creación del 2º método
    public double calculo() {
        double bonificacion = 0;
        if (this.casado) {
            bonificacion += 2;
        }
        double bonificacionPorHijos = this.numHijos * 0.5;
        if (bonificacionPorHijos > 2) {
            bonificacionPorHijos = 2;
        }
        double irpfFinal = this.irpf.getTipoIRPF() - bonificacion - bonificacionPorHijos;
        return this.sueldoBase * (irpfFinal / 100);
    }

    // Creación del metodo 3º y 4º
    public double sueldoBruto(int numeroHoras) {
        return this.sueldoBase + this.calculo(numeroHoras);
    }

    public double sueldoNeto(int numeroHoras) {
        return this.calculo(numeroHoras) - this.calculo();
    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getCantidadAbonarHoras() {
        return cantidadAbonarHoras;
    }

    public void setCantidadAbonarHoras(double cantidadAbonarHoras) {
        this.cantidadAbonarHoras = cantidadAbonarHoras;
    }

    public IRPF getIrpf() {
        return irpf;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    // ToString
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre= ").append(nombre);
        sb.append(", nif= ").append(nif);
        sb.append(", sueldoBase= ").append(df.format(sueldoBase));
        sb.append(", cantidadAbonarHoras= ").append(df.format(cantidadAbonarHoras));
        sb.append(", irpf= ").append(irpf);
        sb.append(", casado= ").append(casado);
        sb.append(", numHijos= ").append(numHijos);
        sb.append('}');
        return sb.toString();
    }
}
