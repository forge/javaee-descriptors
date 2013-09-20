package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

/**
 * This class implements the <code> transaction-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum TransactionTypeType
{
   _BEAN("Bean"),
   _CONTAINER("Container");

   private String value;

   TransactionTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TransactionTypeType getFromStringValue(String value)
   {
      for(TransactionTypeType type: TransactionTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

