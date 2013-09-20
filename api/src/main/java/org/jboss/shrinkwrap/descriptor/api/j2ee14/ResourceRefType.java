package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> resource-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ResourceRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:token ElementType : res-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>res-ref-name</code> element
    * @param resRefName the value for the element <code>res-ref-name</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resRefName(String resRefName);

   /**
    * Returns the <code>res-ref-name</code> element
    * @return the node defined for the element <code>res-ref-name</code> 
    */
   public String getResRefName();

   /**
    * Removes the <code>res-ref-name</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:token ElementType : res-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>res-type</code> element
    * @param resType the value for the element <code>res-type</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resType(String resType);

   /**
    * Returns the <code>res-type</code> element
    * @return the node defined for the element <code>res-type</code> 
    */
   public String getResType();

   /**
    * Removes the <code>res-type</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: j2ee:res-authType ElementType : res-auth
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>res-auth</code> element
    * @param resAuth the value for the element <code>res-auth</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resAuth(ResAuthType resAuth);
   /**
    * Sets the <code>res-auth</code> element
    * @param resAuth the value for the element <code>res-auth</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resAuth(String resAuth);

   /**
    * Returns the <code>res-auth</code> element
    * @return the value found for the element <code>res-auth</code> 
    */
   public ResAuthType getResAuth();

   /**
    * Returns the <code>res-auth</code> element
    * @return the value found for the element <code>res-auth</code> 
    */
   public String  getResAuthAsString();

   /**
    * Removes the <code>res-auth</code> attribute 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResAuth();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: j2ee:res-sharing-scopeType ElementType : res-sharing-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>res-sharing-scope</code> element
    * @param resSharingScope the value for the element <code>res-sharing-scope</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resSharingScope(ResSharingScopeType resSharingScope);
   /**
    * Sets the <code>res-sharing-scope</code> element
    * @param resSharingScope the value for the element <code>res-sharing-scope</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resSharingScope(String resSharingScope);

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the value found for the element <code>res-sharing-scope</code> 
    */
   public ResSharingScopeType getResSharingScope();

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the value found for the element <code>res-sharing-scope</code> 
    */
   public String  getResSharingScopeAsString();

   /**
    * Removes the <code>res-sharing-scope</code> attribute 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResSharingScope();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeId();
}