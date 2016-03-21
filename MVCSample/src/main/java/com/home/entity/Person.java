package com.home.entity;

/**
 * @author preetham
 *
 */
public class Person
{

   private String firstName;
   private String lastName;

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName( String firstName )
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName( String lastName )
   {
      this.lastName = lastName;
   }

   @Override
   public String toString()
   {
      return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
   }

   public String validate()
   {
      System.out.println("this.Firstname "+ this.firstName);
      System.out.println("this.lasttname "+ this.lastName);
      String result="";
      if(this.firstName==null || this.firstName.trim().equals( "" ))
      {
         result+= "First name can't be empty ";
      }
      else if(this.lastName==null || this.lastName.trim().equals( "" ))
      {
         result+= "Last name can't be empty ";
      }
      else
      {
         result="sucess";
      }
      System.out.println("Validatin returning ----> "+ result);
      return result;

   }

}

