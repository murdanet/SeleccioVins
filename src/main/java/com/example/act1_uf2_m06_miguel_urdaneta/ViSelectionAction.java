package com.example.act1_uf2_m06_miguel_urdaneta;

import java.io.*;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import somelier.model.ViExpert;
import somelier.model.Vins;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class ViSelectionAction extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String color= request.getParameter("color");
        ViExpert viExpert = new ViExpert();
        viExpert.afegirVins(new Vins("El coto", "blanc"));
        viExpert.afegirVins(new Vins("Caperucita Tinta", "rosat"));
        viExpert.afegirVins(new Vins("El Carril Hechicero", "negre"));
        List<String> marca= viExpert.obtenerMarcas(color);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println ("<HTML>");
        out.println ("<BODY>");
        out.println ("<H1>Marques de Vi suggerides</H1>");
        out.println (marca.toString());
        out.println ("</BODY>");
        out.println ("</HTML>");
        //Miguel Urdaneta
    }

    public void destroy() {
    }
}