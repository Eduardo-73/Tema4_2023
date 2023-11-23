/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

/**
 *
 * @author edu
 */
public class Comedor {
    private String nombre;
    private double precioMenu;
    private PartesDias horario;

    public Comedor(String nombre, double precioMenu, PartesDias horario) {
        this.nombre = nombre;
        this.precioMenu = precioMenu;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(double precioMenu) {
        this.precioMenu = precioMenu;
    }

    public PartesDias getHorario() {
        return horario;
    }

    public void setHorario(PartesDias horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comedor{");
        sb.append("nombre=").append(nombre);
        sb.append(", precioMenu=").append(precioMenu);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }
}
