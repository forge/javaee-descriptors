package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class implements the <code> isolation-levelType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum IsolationLevelType
{
   _TRANSACTION_READ_UNCOMMITTED("TRANSACTION_READ_UNCOMMITTED"),
   _TRANSACTION_READ_COMMITTED("TRANSACTION_READ_COMMITTED"),
   _TRANSACTION_REPEATABLE_READ("TRANSACTION_REPEATABLE_READ"),
   _TRANSACTION_SERIALIZABLE("TRANSACTION_SERIALIZABLE");

   private String value;

   IsolationLevelType (String value) { this.value = value; }

   public String toString() {return value;}

   public static IsolationLevelType getFromStringValue(String value)
   {
      for(IsolationLevelType type: IsolationLevelType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

