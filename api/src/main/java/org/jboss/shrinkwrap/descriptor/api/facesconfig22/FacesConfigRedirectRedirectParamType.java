package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-redirect-redirectParamType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigRedirectRedirectParamType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectRedirectParamType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectRedirectParamType ElementName: xsd:token ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> value(String value);

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> removeValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectRedirectParamType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigRedirectRedirectParamType<T></code> 
    */
   public FacesConfigRedirectRedirectParamType<T> removeId();
}
