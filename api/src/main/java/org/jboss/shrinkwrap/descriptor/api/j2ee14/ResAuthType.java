package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

/**
 * This class implements the <code> res-authType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ResAuthType
{
   _APPLICATION("Application"),
   _CONTAINER("Container");

   private String value;

   ResAuthType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ResAuthType getFromStringValue(String value)
   {
      for(ResAuthType type: ResAuthType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

