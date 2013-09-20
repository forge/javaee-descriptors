package org.jboss.shrinkwrap.descriptor.api.connector16; 

/**
 * This class implements the <code> transaction-supportType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum TransactionSupportType
{
   _NOTRANSACTION("NoTransaction"),
   _LOCALTRANSACTION("LocalTransaction"),
   _XATRANSACTION("XATransaction");

   private String value;

   TransactionSupportType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TransactionSupportType getFromStringValue(String value)
   {
      for(TransactionSupportType type: TransactionSupportType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

