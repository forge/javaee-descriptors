package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

/**
 * This class implements the <code> portal-managedType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PortalManagedType
{
   _TRUE("true"),
   _FALSE("false");

   private String value;

   PortalManagedType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PortalManagedType getFromStringValue(String value)
   {
      for(PortalManagedType type: PortalManagedType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

