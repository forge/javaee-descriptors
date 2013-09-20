package org.jboss.shrinkwrap.descriptor.api.persistence21; 

/**
 * This class implements the <code> persistence-unit-validation-mode-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PersistenceUnitValidationModeType
{
   _AUTO("AUTO"),
   _CALLBACK("CALLBACK"),
   _NONE("NONE");

   private String value;

   PersistenceUnitValidationModeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceUnitValidationModeType getFromStringValue(String value)
   {
      for(PersistenceUnitValidationModeType type: PersistenceUnitValidationModeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

