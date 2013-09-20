package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigClientBehaviorRendererType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-client-behavior-rendererType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigClientBehaviorRendererTypeImpl<T> implements Child<T>, FacesConfigClientBehaviorRendererType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigClientBehaviorRendererTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigClientBehaviorRendererTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:token ElementType : client-behavior-renderer-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-behavior-renderer-type</code> element
    * @param clientBehaviorRendererType the value for the element <code>client-behavior-renderer-type</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> clientBehaviorRendererType(String clientBehaviorRendererType)
   {
      childNode.getOrCreate("client-behavior-renderer-type").text(clientBehaviorRendererType);
      return this;
   }

   /**
    * Returns the <code>client-behavior-renderer-type</code> element
    * @return the node defined for the element <code>client-behavior-renderer-type</code> 
    */
   public String getClientBehaviorRendererType()
   {
      return childNode.getTextValueForPatternName("client-behavior-renderer-type");
   }

   /**
    * Removes the <code>client-behavior-renderer-type</code> element 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeClientBehaviorRendererType()
   {
      childNode.removeChildren("client-behavior-renderer-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:token ElementType : client-behavior-renderer-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-behavior-renderer-class</code> element
    * @param clientBehaviorRendererClass the value for the element <code>client-behavior-renderer-class</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> clientBehaviorRendererClass(String clientBehaviorRendererClass)
   {
      childNode.getOrCreate("client-behavior-renderer-class").text(clientBehaviorRendererClass);
      return this;
   }

   /**
    * Returns the <code>client-behavior-renderer-class</code> element
    * @return the node defined for the element <code>client-behavior-renderer-class</code> 
    */
   public String getClientBehaviorRendererClass()
   {
      return childNode.getTextValueForPatternName("client-behavior-renderer-class");
   }

   /**
    * Removes the <code>client-behavior-renderer-class</code> element 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeClientBehaviorRendererClass()
   {
      childNode.removeChildren("client-behavior-renderer-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
