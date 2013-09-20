package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> locale-encoding-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class LocaleEncodingMappingTypeImpl<T> implements Child<T>, LocaleEncodingMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public LocaleEncodingMappingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:string ElementType : locale
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>locale</code> element
    * @param locale the value for the element <code>locale</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> locale(String locale)
   {
      childNode.getOrCreate("locale").text(locale);
      return this;
   }

   /**
    * Returns the <code>locale</code> element
    * @return the node defined for the element <code>locale</code> 
    */
   public String getLocale()
   {
      return childNode.getTextValueForPatternName("locale");
   }

   /**
    * Removes the <code>locale</code> element 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeLocale()
   {
      childNode.removeChildren("locale");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:string ElementType : encoding
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>encoding</code> element
    * @param encoding the value for the element <code>encoding</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> encoding(String encoding)
   {
      childNode.getOrCreate("encoding").text(encoding);
      return this;
   }

   /**
    * Returns the <code>encoding</code> element
    * @return the node defined for the element <code>encoding</code> 
    */
   public String getEncoding()
   {
      return childNode.getTextValueForPatternName("encoding");
   }

   /**
    * Removes the <code>encoding</code> element 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeEncoding()
   {
      childNode.removeChildren("encoding");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> id(String id)
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
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
