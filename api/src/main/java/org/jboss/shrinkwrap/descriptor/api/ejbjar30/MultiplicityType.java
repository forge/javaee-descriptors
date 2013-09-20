package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

/**
 * This class implements the <code> multiplicityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum MultiplicityType
{
   _ONE("One"),
   _MANY("Many");

   private String value;

   MultiplicityType (String value) { this.value = value; }

   public String toString() {return value;}

   public static MultiplicityType getFromStringValue(String value)
   {
      for(MultiplicityType type: MultiplicityType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

