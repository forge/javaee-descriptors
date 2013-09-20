package org.jboss.shrinkwrap.descriptor.api.orm10; 

/**
 * This class implements the <code> access-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum AccessType
{
   _PROPERTY("PROPERTY"),
   _FIELD("FIELD");

   private String value;

   AccessType (String value) { this.value = value; }

   public String toString() {return value;}

   public static AccessType getFromStringValue(String value)
   {
      for(AccessType type: AccessType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

