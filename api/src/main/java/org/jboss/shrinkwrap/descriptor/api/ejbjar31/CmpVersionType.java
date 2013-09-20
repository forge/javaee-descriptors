package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class implements the <code> cmp-versionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum CmpVersionType
{
   _1_X("1.x"),
   _2_X("2.x");

   private String value;

   CmpVersionType (String value) { this.value = value; }

   public String toString() {return value;}

   public static CmpVersionType getFromStringValue(String value)
   {
      for(CmpVersionType type: CmpVersionType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

