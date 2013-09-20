package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class implements the <code> concurrent-lock-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ConcurrentLockTypeType
{
   _READ("Read"),
   _WRITE("Write");

   private String value;

   ConcurrentLockTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ConcurrentLockTypeType getFromStringValue(String value)
   {
      for(ConcurrentLockTypeType type: ConcurrentLockTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

