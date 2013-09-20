package org.jboss.shrinkwrap.descriptor.api.javaee7; 

/**
 * This class implements the <code> persistence-context-synchronizationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PersistenceContextSynchronizationType
{
   _SYNCHRONIZED("Synchronized"),
   _UNSYNCHRONIZED("Unsynchronized");

   private String value;

   PersistenceContextSynchronizationType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceContextSynchronizationType getFromStringValue(String value)
   {
      for(PersistenceContextSynchronizationType type: PersistenceContextSynchronizationType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

