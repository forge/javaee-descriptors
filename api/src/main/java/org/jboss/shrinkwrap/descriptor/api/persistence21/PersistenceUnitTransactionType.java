package org.jboss.shrinkwrap.descriptor.api.persistence21; 

/**
 * This class implements the <code> persistence-unit-transaction-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PersistenceUnitTransactionType
{
   _JTA("JTA"),
   _RESOURCE_LOCAL("RESOURCE_LOCAL");

   private String value;

   PersistenceUnitTransactionType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceUnitTransactionType getFromStringValue(String value)
   {
      for(PersistenceUnitTransactionType type: PersistenceUnitTransactionType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

