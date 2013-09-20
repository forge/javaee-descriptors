package org.jboss.shrinkwrap.descriptor.api.orm20; 

/**
 * This class implements the <code> lock-mode-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum LockModeType
{
   _READ("READ"),
   _WRITE("WRITE"),
   _OPTIMISTIC("OPTIMISTIC"),
   _OPTIMISTIC_FORCE_INCREMENT("OPTIMISTIC_FORCE_INCREMENT"),
   _PESSIMISTIC_READ("PESSIMISTIC_READ"),
   _PESSIMISTIC_WRITE("PESSIMISTIC_WRITE"),
   _PESSIMISTIC_FORCE_INCREMENT("PESSIMISTIC_FORCE_INCREMENT"),
   _NONE("NONE");

   private String value;

   LockModeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static LockModeType getFromStringValue(String value)
   {
      for(LockModeType type: LockModeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

