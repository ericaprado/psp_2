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
 *
 * @author ASUS-PC
 */
public class WebController extends HttpServlet{ 
    
    
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
               
        result += "<H1>Prueba</H1></BR></BR>";
        
        NumericalIntegration numericalIntegration = new NumericalIntegration();
        result += "0 to x= 1.1     dof = 9  p=" + numericalIntegration.calculateIntegralValue(10, 1.1, 9); 
        result += "0 to x= 1.1812  dof = 10 p=" + numericalIntegration.calculateIntegralValue(10, 1.1812, 10); 
        result += "0 to x= 2.750   dof = 30 p=" + numericalIntegration.calculateIntegralValue(10, 2.750, 30);   
                
        result += "</HTML>";
        
        resp.getWriter().write(result);          
       
    }
    
}
