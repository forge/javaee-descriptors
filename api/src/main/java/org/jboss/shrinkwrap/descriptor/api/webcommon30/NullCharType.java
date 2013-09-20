package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

/**
 * This class implements the <code> null-charType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum NullCharType
{
   _("");

   private String value;

   NullCharType (String value) { this.value = value; }

   public String toString() {return value;}

   public static NullCharType getFromStringValue(String value)
   {
      for(NullCharType type: NullCharType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

