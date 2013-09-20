package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20; 

/**
 * This class implements the <code> body-contentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum BodyContentType
{
   _TAGDEPENDENT("tagdependent"),
   _JSP("JSP"),
   _EMPTY("empty"),
   _SCRIPTLESS("scriptless");

   private String value;

   BodyContentType (String value) { this.value = value; }

   public String toString() {return value;}

   public static BodyContentType getFromStringValue(String value)
   {
      for(BodyContentType type: BodyContentType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

