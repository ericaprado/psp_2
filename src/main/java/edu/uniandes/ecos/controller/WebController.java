/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controller;


import edu.uniandes.ecos.NumericalIntegration;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

/**
 * Clase controladora para resultados por web
 * @author ASUS-PC
 */
public class WebController extends HttpServlet{ 
    
    /**
     * Clase main que se llama cuando el programa es ejecutado y el resultado
     * se mostrará a través de web
     * @param args
     * @throws Exception 
     */
    public static void main( String[] args )  throws Exception 
    {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new WebController()),"/*");
        server.start();
        server.join();
    
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               
        String result = "<HTML>";
               
        result += "<H1>Prueba</H1></BR><TABLE>";
        
        NumericalIntegration numericalIntegration = new NumericalIntegration();
        result += "<TR><TD>0 to x= 1.1</TD><TD>dof = 9</TD><TD>p=" + numericalIntegration.calculateIntegralValue(10, 1.1, 9)+"</TD></TR>"; 
        result += "<TR><TD>0 to x= 1.1812</TD><TD>dof = 10</TD><TD>p=" + numericalIntegration.calculateIntegralValue(10, 1.1812, 10)+"</TD></TR>"; 
        result += "<TR><TD>0 to x= 2.750</TD><TD>dof = 30</TD><TD>p=" + numericalIntegration.calculateIntegralValue(10, 2.750, 30)+"</TD></TR>";   
                
        result += "</TABLE></HTML>";
        
        resp.getWriter().write(result);          
       
    }
    
}
