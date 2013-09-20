package org.jboss.shrinkwrap.descriptor.api.orm21; 

/**
 * This class implements the <code> constraint-mode </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ConstraintMode
{
   _CONSTRAINT("CONSTRAINT"),
   _NO_CONSTRAINT("NO_CONSTRAINT"),
   _PROVIDER_DEFAULT("PROVIDER_DEFAULT");

   private String value;

   ConstraintMode (String value) { this.value = value; }

   public String toString() {return value;}

   public static ConstraintMode getFromStringValue(String value)
   {
      for(ConstraintMode type: ConstraintMode.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

