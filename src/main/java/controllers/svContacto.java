package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/svContacto")

public class svContacto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String nombre = req.getParameter("nombre");
        String correo = req.getParameter("correo");
        String mensaje = req.getParameter("mensaje");

        // Muestra los atributos por consola
        System.out.print("Nombre: " + nombre + " Correo: " + correo + " Mensaje: " + mensaje);

        RequestDispatcher rd = req.getRequestDispatcher("/contacto.jsp");
        rd.forward(req, resp);


    }
}
