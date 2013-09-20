package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

/**
 * This class implements the <code> faces-config-versionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum FacesConfigVersionType
{
   _2_2("2.2");

   private String value;

   FacesConfigVersionType (String value) { this.value = value; }

   public String toString() {return value;}

   public static FacesConfigVersionType getFromStringValue(String value)
   {
      for(FacesConfigVersionType type: FacesConfigVersionType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

