package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

/**
 * This class implements the <code> concurrency-management-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ConcurrencyManagementTypeType
{
   _BEAN("Bean"),
   _CONTAINER("Container");

   private String value;

   ConcurrencyManagementTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ConcurrencyManagementTypeType getFromStringValue(String value)
   {
      for(ConcurrencyManagementTypeType type: ConcurrencyManagementTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

