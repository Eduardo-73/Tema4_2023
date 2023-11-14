/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase03;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author edu
 */
public class CuentaBancaria {

    // Atributos
    public static final int DIGITOS_CUENTA = 20;
    private final String numCuenta;
    private String nombre;
    private String NIF;
    private double saldo;
    private double interesMensual;

    // Contructores
    public CuentaBancaria() {
        this.numCuenta = RandomStringUtils.randomNumeric(DIGITOS_CUENTA);
    }

    public CuentaBancaria(String nombre, String NIF, double saldo, double interesMensual) {
        this.numCuenta = RandomStringUtils.randomNumeric(DIGITOS_CUENTA);
        this.nombre = nombre;
        this.NIF = NIF;
        this.saldo = saldo;
        this.interesMensual = interesMensual;
    }

    //Métodos
    public void ingresar(double cantidadIngresar) {
        this.saldo += cantidadIngresar;
    }

    public void retirar(double cantidadRetirar) {
        if (this.saldo > cantidadRetirar) {
            this.saldo -= cantidadRetirar;
        }
    }

    public void abonarIntereses(double interes) {
        this.saldo *= interes;
    }

    // Get y Set
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{");
        sb.append("numCuenta=").append(numCuenta);
        sb.append(", nombre=").append(nombre);
        sb.append(", NIF=").append(NIF);
        sb.append(", saldo=").append(saldo);
        sb.append(", interesMensual=").append(interesMensual);
        sb.append('}');
        return sb.toString();
    }

}
