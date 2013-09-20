package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> mime-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MimeMappingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: xsd:token ElementType : extension
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>extension</code> element
    * @param extension the value for the element <code>extension</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> extension(String extension);

   /**
    * Returns the <code>extension</code> element
    * @return the node defined for the element <code>extension</code> 
    */
   public String getExtension();

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: javaee:string ElementType : mime-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mime-type</code> element
    * @param mimeType the value for the element <code>mime-type</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> mimeType(String mimeType);

   /**
    * Returns the <code>mime-type</code> element
    * @return the node defined for the element <code>mime-type</code> 
    */
   public String getMimeType();

   /**
    * Removes the <code>mime-type</code> element 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeMimeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeId();
}
