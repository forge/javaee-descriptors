package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> converter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Converter<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Converter ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Converter ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Converter ElementName: xsd:boolean ElementType : auto-apply
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>auto-apply</code> attribute
    * @param autoApply the value for the attribute <code>auto-apply</code> 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> autoApply(Boolean autoApply);

   /**
    * Returns the <code>auto-apply</code> attribute
    * @return the value defined for the attribute <code>auto-apply</code> 
    */
public Boolean isAutoApply();

   /**
    * Removes the <code>auto-apply</code> attribute 
    * @return the current instance of <code>Converter<T></code> 
    */
   public Converter<T> removeAutoApply();
}
