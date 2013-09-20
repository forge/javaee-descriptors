package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

/**
 * This class implements the <code> persistence-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PersistenceTypeType
{
   _BEAN("Bean"),
   _CONTAINER("Container");

   private String value;

   PersistenceTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceTypeType getFromStringValue(String value)
   {
      for(PersistenceTypeType type: PersistenceTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

