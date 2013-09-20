package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigMapEntryType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-map-entryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigMapEntryTypeImpl<T> implements Child<T>, FacesConfigMapEntryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigMapEntryTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigMapEntryTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: xsd:token ElementType : key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key</code> element
    * @param key the value for the element <code>key</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> key(String key)
   {
      childNode.getOrCreate("key").text(key);
      return this;
   }

   /**
    * Returns the <code>key</code> element
    * @return the node defined for the element <code>key</code> 
    */
   public String getKey()
   {
      return childNode.getTextValueForPatternName("key");
   }

   /**
    * Removes the <code>key</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeKey()
   {
      childNode.removeChildren("key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> nullValue()
   {
      childNode.getOrCreate("null-value");
      return this;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public Boolean isNullValue()
   {
      return childNode.getSingle("null-value") != null;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeNullValue()
   {
      childNode.removeChild("null-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: javaee:faces-config-el-expressionType ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> value(String value)
   {
      childNode.getOrCreate("value").text(value);
      return this;
   }

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue()
   {
      return childNode.getTextValueForPatternName("value");
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
