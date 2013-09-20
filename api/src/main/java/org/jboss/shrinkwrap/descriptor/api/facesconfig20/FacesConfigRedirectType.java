package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectViewParamType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectViewParamType;
/**
 * This interface defines the contract for the <code> faces-config-redirectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigRedirectType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: javaee:faces-config-redirect-viewParamType ElementType : view-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>view-param</code> element will be created and returned.
    * Otherwise, the first existing <code>view-param</code> element will be returned.
    * @return the instance defined for the element <code>view-param</code> 
    */
   public FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>> getOrCreateViewParam();

   /**
    * Creates a new <code>view-param</code> element 
    * @return the new created instance of <code>FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>></code> 
    */
   public FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>> createViewParam();

   /**
    * Returns all <code>view-param</code> elements
    * @return list of <code>view-param</code> 
    */
   public List<FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>>> getAllViewParam();

   /**
    * Removes all <code>view-param</code> elements 
    * @return the current instance of <code>FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>></code> 
    */
   public FacesConfigRedirectType<T> removeAllViewParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: xsd:boolean ElementType : include-view-params
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-view-params</code> attribute
    * @param includeViewParams the value for the attribute <code>include-view-params</code> 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> includeViewParams(Boolean includeViewParams);

   /**
    * Returns the <code>include-view-params</code> attribute
    * @return the value defined for the attribute <code>include-view-params</code> 
    */
public Boolean isIncludeViewParams();

   /**
    * Removes the <code>include-view-params</code> attribute 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> removeIncludeViewParams();
}
