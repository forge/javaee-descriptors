package org.jboss.shrinkwrap.descriptor.api.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> partial-response-redirectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseRedirectType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseRedirectType ElementName: xsd:string ElementType : url
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url</code> attribute
    * @param url the value for the attribute <code>url</code> 
    * @return the current instance of <code>PartialResponseRedirectType<T></code> 
    */
   public PartialResponseRedirectType<T> url(String url);

   /**
    * Returns the <code>url</code> attribute
    * @return the value defined for the attribute <code>url</code> 
    */
   public String getUrl();

   /**
    * Removes the <code>url</code> attribute 
    * @return the current instance of <code>PartialResponseRedirectType<T></code> 
    */
   public PartialResponseRedirectType<T> removeUrl();
}
