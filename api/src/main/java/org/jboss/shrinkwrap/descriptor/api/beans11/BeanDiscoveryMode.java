package org.jboss.shrinkwrap.descriptor.api.beans11; 

/**
 * This class implements the <code> bean-discovery-mode </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum BeanDiscoveryMode
{
   _ANNOTATED("annotated"),
   _ALL("all"),
   _NONE("none");

   private String value;

   BeanDiscoveryMode (String value) { this.value = value; }

   public String toString() {return value;}

   public static BeanDiscoveryMode getFromStringValue(String value)
   {
      for(BeanDiscoveryMode type: BeanDiscoveryMode.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

