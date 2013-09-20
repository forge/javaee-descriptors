package org.jboss.shrinkwrap.descriptor.api.javaee5; 

/**
 * This class implements the <code> ejb-ref-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum EjbRefTypeType
{
   _ENTITY("Entity"),
   _SESSION("Session");

   private String value;

   EjbRefTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static EjbRefTypeType getFromStringValue(String value)
   {
      for(EjbRefTypeType type: EjbRefTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

