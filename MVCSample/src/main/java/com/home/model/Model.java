package com.home.model;

import com.home.dao.PersonDao;
import com.home.entity.Person;

/**
 * @author preetham
 *
 */
public class Model
{
   PersonDao db = new PersonDao();

   public Model()
   {
      System.out.println( "Model object created" );

   }

   public String addPerson( Person person )
   {
      String result = "error";
      result = person.validate();
      if ( result.equalsIgnoreCase( "sucess" ) )
      {
         db.addPerson( person );
      }
      System.out.println("Model add person returning "+ result);
      return result;
   }

}
