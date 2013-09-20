package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-client-behavior-rendererType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigClientBehaviorRendererType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:token ElementType : client-behavior-renderer-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-behavior-renderer-type</code> element
    * @param clientBehaviorRendererType the value for the element <code>client-behavior-renderer-type</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> clientBehaviorRendererType(String clientBehaviorRendererType);

   /**
    * Returns the <code>client-behavior-renderer-type</code> element
    * @return the node defined for the element <code>client-behavior-renderer-type</code> 
    */
   public String getClientBehaviorRendererType();

   /**
    * Removes the <code>client-behavior-renderer-type</code> element 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeClientBehaviorRendererType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:token ElementType : client-behavior-renderer-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-behavior-renderer-class</code> element
    * @param clientBehaviorRendererClass the value for the element <code>client-behavior-renderer-class</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> clientBehaviorRendererClass(String clientBehaviorRendererClass);

   /**
    * Returns the <code>client-behavior-renderer-class</code> element
    * @return the node defined for the element <code>client-behavior-renderer-class</code> 
    */
   public String getClientBehaviorRendererClass();

   /**
    * Removes the <code>client-behavior-renderer-class</code> element 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeClientBehaviorRendererClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigClientBehaviorRendererType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<T></code> 
    */
   public FacesConfigClientBehaviorRendererType<T> removeId();
}
