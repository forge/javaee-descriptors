package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> public-render-parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PublicRenderParameterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: string ElementType : identifier
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>identifier</code> element
    * @param identifier the value for the element <code>identifier</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> identifier(String identifier);

   /**
    * Returns the <code>identifier</code> element
    * @return the node defined for the element <code>identifier</code> 
    */
   public String getIdentifier();

   /**
    * Removes the <code>identifier</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeIdentifier();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: xsd:QName ElementType : qname
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>qname</code> element
    * @param qname the value for the element <code>qname</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> qname(String qname);

   /**
    * Returns the <code>qname</code> element
    * @return the node defined for the element <code>qname</code> 
    */
   public String getQname();

   /**
    * Removes the <code>qname</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeQname();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: xsd:NCName ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: xsd:QName ElementType : alias
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>alias</code> elements, 
    * a new <code>alias</code> element 
    * @param values list of <code>alias</code> objects 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> alias(String ... values);

   /**
    * Returns all <code>alias</code> elements
    * @return list of <code>alias</code> 
    */
   public List<String> getAllAlias();

   /**
    * Removes the <code>alias</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeAllAlias();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeId();
}
