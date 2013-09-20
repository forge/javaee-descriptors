package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

/**
 * This class implements the <code> result-type-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ResultTypeMappingType
{
   _LOCAL("Local"),
   _REMOTE("Remote");

   private String value;

   ResultTypeMappingType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ResultTypeMappingType getFromStringValue(String value)
   {
      for(ResultTypeMappingType type: ResultTypeMappingType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

