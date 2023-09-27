<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="models.Capacitacion" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="models.Contenedor" %>
<%@include file="navbar.jsp" %>
<%@include file="footer.jsp" %>
<html>
<head>
    <title>Capacitaciones</title>
</head>
<body>
<div class="container">
    <h1 class="text-center">Capacitaciones</h1>

    <hr class="hr" style="height: 20px"/>
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">Rut Cliente</th>
            <th scope="col">Dia</th>
            <th scope="col">Hora</th>
            <th scope="col">Lugar</th>
            <th scope="col">Duracion</th>
            <th scope="col">Cantidad Asistentes</th>
        </tr>
        </thead>
        <%
            List<Capacitacion> capacitaciones = Contenedor.listaCapacitaciones;
            for (Capacitacion capacitacion : capacitaciones) {
        %>
        <tbody>
        <tr>
            <td><%= capacitacion.getRutCliente()%>
            </td>
            <td><%= capacitacion.getDia()%>
            </td>
            <td><%= capacitacion.getHora()%>
            </td>
            <td><%= capacitacion.getLugar()%>
            </td>
            <td><%= capacitacion.getDuracion()%>
            </td>
            <td><%= capacitacion.getCantidadAsistentes()%>
            </td>
        </tr>
        </tbody>
        <%}%>
    </table>


</div>
</body>
</html>