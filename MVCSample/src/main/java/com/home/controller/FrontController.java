package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.entity.Person;
import com.home.model.Model;

/**
 * @author preetham
 *
 */
public class FrontController extends HttpServlet
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   Model m = new Model();

   public FrontController()
   {
      System.out.println( "Front controller instantiated" );
   }

   @Override
   protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
   {
      process( req, resp );
   }

   protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
   {
      process( req, resp );
   }

   private void process( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
   {
      String uri = req.getRequestURI();
      System.out.println( "uri " + uri );
      RequestDispatcher rd = null;
      if ( uri != null && uri.contains( "openAddPersonView" ) )
      {
         System.out.println( "Opens addperson.jsp" );
         rd = req.getRequestDispatcher( "addperson.jsp" );
         rd.forward( req, resp );
      }
      else if ( uri != null && uri.contains( "addperson" ) )
      {
         System.out.println("Adds the user");
         Person p = (Person) req.getAttribute( "person" );
         String result = m.addPerson( p );
         if ( result.equalsIgnoreCase( "sucess" ) )
         {
            System.out.println("Adding person operation sucessfull, so forwarding to sucess.jsp");
            rd = req.getRequestDispatcher( "sucess.jsp" );
            rd.forward( req, resp );
         }
         else
         {
            System.out.println("Adding person operation unsucessfull, so forwarding back to addperson.jsp along with errors");
            req.setAttribute( "error", result );
            rd = req.getRequestDispatcher( "addperson.jsp" );
            rd.forward( req, resp );
         }
      }

   }

}
