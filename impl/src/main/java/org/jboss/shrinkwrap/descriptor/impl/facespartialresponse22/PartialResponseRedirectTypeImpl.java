package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseRedirectType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> partial-response-redirectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseRedirectTypeImpl<T> implements Child<T>, PartialResponseRedirectType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseRedirectTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseRedirectTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseRedirectType ElementName: xsd:string ElementType : url
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url</code> attribute
    * @param url the value for the attribute <code>url</code> 
    * @return the current instance of <code>PartialResponseRedirectType<T></code> 
    */
   public PartialResponseRedirectType<T> url(String url)
   {
      childNode.attribute("url", url);
      return this;
   }

   /**
    * Returns the <code>url</code> attribute
    * @return the value defined for the attribute <code>url</code> 
    */
      public String getUrl()
   {
      return childNode.getAttribute("url");
   }

   /**
    * Removes the <code>url</code> attribute 
    * @return the current instance of <code>PartialResponseRedirectType<T></code> 
    */
   public PartialResponseRedirectType<T> removeUrl()
   {
      childNode.removeAttribute("url");
      return this;
   }
}
