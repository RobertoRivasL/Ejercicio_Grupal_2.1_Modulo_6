package models;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {


    public static List<Capacitacion> listaCapacitaciones = new ArrayList<>();


    public static void agregarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        Contenedor.listaCapacitaciones = listaCapacitaciones;
    }

}
