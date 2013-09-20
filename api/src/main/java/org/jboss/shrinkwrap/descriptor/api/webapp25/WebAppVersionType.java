package org.jboss.shrinkwrap.descriptor.api.webapp25; 

/**
 * This class implements the <code> web-app-versionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum WebAppVersionType
{
   _2_5("2.5");

   private String value;

   WebAppVersionType (String value) { this.value = value; }

   public String toString() {return value;}

   public static WebAppVersionType getFromStringValue(String value)
   {
      for(WebAppVersionType type: WebAppVersionType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

