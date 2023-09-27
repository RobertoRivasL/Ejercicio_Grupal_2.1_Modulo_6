package controllers;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;
import models.Contenedor;

import java.io.IOException;

@WebServlet("/svCrearCapacitacion")
public class svCrearCapacitacion extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String rutCliente = req.getParameter("rutCliente");
        String dia = req.getParameter("dia");
        String hora = req.getParameter("hora");
        String lugar = req.getParameter("lugar");
        String duracion = req.getParameter("duracion");
        String cantidadAsistentes = req.getParameter("cantidadAsistentes");

        Capacitacion capacitacion = new Capacitacion(rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
        Contenedor contenedor = new Contenedor();
        Contenedor.agregarCapacitacion(capacitacion);


        System.out.println("Capacitacion agregada");
        RequestDispatcher rd = req.getRequestDispatcher("/crearCapacitacion.jsp");
        rd.forward(req, resp);


    }
}
