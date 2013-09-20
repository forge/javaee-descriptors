package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

/**
 * This class implements the <code> executable-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ExecutableType
{
   _NONE("NONE"),
   _CONSTRUCTORS("CONSTRUCTORS"),
   _NON_GETTER_METHODS("NON_GETTER_METHODS"),
   _GETTER_METHODS("GETTER_METHODS"),
   _ALL("ALL");

   private String value;

   ExecutableType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ExecutableType getFromStringValue(String value)
   {
      for(ExecutableType type: ExecutableType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

