package org.jboss.shrinkwrap.descriptor.api.jsp21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> jsp-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JspConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: javaee:taglibType ElementType : taglib
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib</code> element will be returned.
    * @return the instance defined for the element <code>taglib</code> 
    */
   public TaglibType<JspConfigType<T>> getOrCreateTaglib();

   /**
    * Creates a new <code>taglib</code> element 
    * @return the new created instance of <code>TaglibType<JspConfigType<T>></code> 
    */
   public TaglibType<JspConfigType<T>> createTaglib();

   /**
    * Returns all <code>taglib</code> elements
    * @return list of <code>taglib</code> 
    */
   public List<TaglibType<JspConfigType<T>>> getAllTaglib();

   /**
    * Removes all <code>taglib</code> elements 
    * @return the current instance of <code>TaglibType<JspConfigType<T>></code> 
    */
   public JspConfigType<T> removeAllTaglib();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: javaee:jsp-property-groupType ElementType : jsp-property-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-property-group</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-property-group</code> element will be returned.
    * @return the instance defined for the element <code>jsp-property-group</code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> getOrCreateJspPropertyGroup();

   /**
    * Creates a new <code>jsp-property-group</code> element 
    * @return the new created instance of <code>JspPropertyGroupType<JspConfigType<T>></code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> createJspPropertyGroup();

   /**
    * Returns all <code>jsp-property-group</code> elements
    * @return list of <code>jsp-property-group</code> 
    */
   public List<JspPropertyGroupType<JspConfigType<T>>> getAllJspPropertyGroup();

   /**
    * Removes all <code>jsp-property-group</code> elements 
    * @return the current instance of <code>JspPropertyGroupType<JspConfigType<T>></code> 
    */
   public JspConfigType<T> removeAllJspPropertyGroup();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JspConfigType<T></code> 
    */
   public JspConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JspConfigType<T></code> 
    */
   public JspConfigType<T> removeId();
}
