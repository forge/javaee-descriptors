package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class implements the <code> res-sharing-scopeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ResSharingScopeType
{
   _SHAREABLE("Shareable"),
   _UNSHAREABLE("Unshareable");

   private String value;

   ResSharingScopeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ResSharingScopeType getFromStringValue(String value)
   {
      for(ResSharingScopeType type: ResSharingScopeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

