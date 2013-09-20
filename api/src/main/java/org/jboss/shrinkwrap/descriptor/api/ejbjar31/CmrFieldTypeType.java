package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class implements the <code> cmr-field-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum CmrFieldTypeType
{
   _JAVA_UTIL_COLLECTION("java.util.Collection"),
   _JAVA_UTIL_SET("java.util.Set");

   private String value;

   CmrFieldTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static CmrFieldTypeType getFromStringValue(String value)
   {
      for(CmrFieldTypeType type: CmrFieldTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

