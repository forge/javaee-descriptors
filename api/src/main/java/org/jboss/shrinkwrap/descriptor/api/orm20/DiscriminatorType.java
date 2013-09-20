package org.jboss.shrinkwrap.descriptor.api.orm20; 

/**
 * This class implements the <code> discriminator-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum DiscriminatorType
{
   _STRING("STRING"),
   _CHAR("CHAR"),
   _INTEGER("INTEGER");

   private String value;

   DiscriminatorType (String value) { this.value = value; }

   public String toString() {return value;}

   public static DiscriminatorType getFromStringValue(String value)
   {
      for(DiscriminatorType type: DiscriminatorType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

