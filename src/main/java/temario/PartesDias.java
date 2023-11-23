/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

/**
 *
 * @author edu
 */
public enum PartesDias {
    MAÑANA("Mañana", 7, 12),
    TARDE("Tarde", 12, 20),
    NOCHE("Noche", 20, 24),
    MADRUGADA("Madrugada", 24, 7);

    private final String nombre;
    private final int horaInicio;
    private final int horaFin;

    private PartesDias(String nombre, int horaInicio, int horaFin) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    @Override
    public String toString() {
        return "PartesDias{" + "nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }

}
