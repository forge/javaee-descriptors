package org.jboss.shrinkwrap.descriptor.api.orm20; 

/**
 * This class implements the <code> inheritance-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum InheritanceType
{
   _SINGLE_TABLE("SINGLE_TABLE"),
   _JOINED("JOINED"),
   _TABLE_PER_CLASS("TABLE_PER_CLASS");

   private String value;

   InheritanceType (String value) { this.value = value; }

   public String toString() {return value;}

   public static InheritanceType getFromStringValue(String value)
   {
      for(InheritanceType type: InheritanceType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

