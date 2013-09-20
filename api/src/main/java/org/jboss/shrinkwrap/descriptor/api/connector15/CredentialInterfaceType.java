package org.jboss.shrinkwrap.descriptor.api.connector15; 

/**
 * This class implements the <code> credential-interfaceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum CredentialInterfaceType
{
   _JAVAX_RESOURCE_SPI_SECURITY_PASSWORDCREDENTIAL("javax.resource.spi.security.PasswordCredential"),
   _ORG_IETF_JGSS_GSSCREDENTIAL("org.ietf.jgss.GSSCredential"),
   _JAVAX_RESOURCE_SPI_SECURITY_GENERICCREDENTIAL("javax.resource.spi.security.GenericCredential");

   private String value;

   CredentialInterfaceType (String value) { this.value = value; }

   public String toString() {return value;}

   public static CredentialInterfaceType getFromStringValue(String value)
   {
      for(CredentialInterfaceType type: CredentialInterfaceType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

