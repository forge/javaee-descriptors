package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

/**
 * This class implements the <code> method-intfType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum MethodIntfType
{
   _HOME("Home"),
   _REMOTE("Remote"),
   _LOCALHOME("LocalHome"),
   _LOCAL("Local"),
   _SERVICEENDPOINT("ServiceEndpoint"),
   _TIMER("Timer"),
   _MESSAGEENDPOINT("MessageEndpoint"),
   _LIFECYCLECALLBACK("LifecycleCallback");

   private String value;

   MethodIntfType (String value) { this.value = value; }

   public String toString() {return value;}

   public static MethodIntfType getFromStringValue(String value)
   {
      for(MethodIntfType type: MethodIntfType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

