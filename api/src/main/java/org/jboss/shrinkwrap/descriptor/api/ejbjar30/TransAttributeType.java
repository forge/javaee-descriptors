package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

/**
 * This class implements the <code> trans-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum TransAttributeType
{
   _NOTSUPPORTED("NotSupported"),
   _SUPPORTS("Supports"),
   _REQUIRED("Required"),
   _REQUIRESNEW("RequiresNew"),
   _MANDATORY("Mandatory"),
   _NEVER("Never");

   private String value;

   TransAttributeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TransAttributeType getFromStringValue(String value)
   {
      for(TransAttributeType type: TransAttributeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

