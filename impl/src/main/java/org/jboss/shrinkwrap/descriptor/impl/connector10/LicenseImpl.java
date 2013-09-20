package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector10.License;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> license </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class LicenseImpl<T> implements Child<T>, License<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LicenseImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public LicenseImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: License ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>License<T></code> 
    */
   public License<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>License<T></code> 
    */
   public License<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: License ElementName: xsd:string ElementType : license-required
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>license-required</code> element
    * @param licenseRequired the value for the element <code>license-required</code> 
    * @return the current instance of <code>License<T></code> 
    */
   public License<T> licenseRequired(String licenseRequired)
   {
      childNode.getOrCreate("license-required").text(licenseRequired);
      return this;
   }

   /**
    * Returns the <code>license-required</code> element
    * @return the node defined for the element <code>license-required</code> 
    */
   public String getLicenseRequired()
   {
      return childNode.getTextValueForPatternName("license-required");
   }

   /**
    * Removes the <code>license-required</code> element 
    * @return the current instance of <code>License<T></code> 
    */
   public License<T> removeLicenseRequired()
   {
      childNode.removeChildren("license-required");
      return this;
   }
}
