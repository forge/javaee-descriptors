package org.jboss.shrinkwrap.descriptor.api.persistence20; 

/**
 * This class implements the <code> persistence-unit-caching-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum PersistenceUnitCachingType
{
   _ALL("ALL"),
   _NONE("NONE"),
   _ENABLE_SELECTIVE("ENABLE_SELECTIVE"),
   _DISABLE_SELECTIVE("DISABLE_SELECTIVE"),
   _UNSPECIFIED("UNSPECIFIED");

   private String value;

   PersistenceUnitCachingType (String value) { this.value = value; }

   public String toString() {return value;}

   public static PersistenceUnitCachingType getFromStringValue(String value)
   {
      for(PersistenceUnitCachingType type: PersistenceUnitCachingType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

