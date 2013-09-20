package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20; 

/**
 * This class implements the <code> variable-scopeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum VariableScopeType
{
   _NESTED("NESTED"),
   _AT_BEGIN("AT_BEGIN"),
   _AT_END("AT_END");

   private String value;

   VariableScopeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static VariableScopeType getFromStringValue(String value)
   {
      for(VariableScopeType type: VariableScopeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

