package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

/**
 * This class implements the <code> facelet-taglib-versionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum FaceletTaglibVersionType
{
   _2_0("2.0");

   private String value;

   FaceletTaglibVersionType (String value) { this.value = value; }

   public String toString() {return value;}

   public static FaceletTaglibVersionType getFromStringValue(String value)
   {
      for(FaceletTaglibVersionType type: FaceletTaglibVersionType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

