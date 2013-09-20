package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.SequenceGenerator;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> sequence-generator </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SequenceGeneratorImpl<T> implements Child<T>, SequenceGenerator<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SequenceGeneratorImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SequenceGeneratorImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : sequence-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>sequence-name</code> attribute
    * @param sequenceName the value for the attribute <code>sequence-name</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> sequenceName(String sequenceName)
   {
      childNode.attribute("sequence-name", sequenceName);
      return this;
   }

   /**
    * Returns the <code>sequence-name</code> attribute
    * @return the value defined for the attribute <code>sequence-name</code> 
    */
      public String getSequenceName()
   {
      return childNode.getAttribute("sequence-name");
   }

   /**
    * Removes the <code>sequence-name</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeSequenceName()
   {
      childNode.removeAttribute("sequence-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> catalog(String catalog)
   {
      childNode.attribute("catalog", catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
      public String getCatalog()
   {
      return childNode.getAttribute("catalog");
   }

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> schema(String schema)
   {
      childNode.attribute("schema", schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
      public String getSchema()
   {
      return childNode.getAttribute("schema");
   }

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:int ElementType : initial-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-value</code> attribute
    * @param initialValue the value for the attribute <code>initial-value</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> initialValue(Integer initialValue)
   {
      childNode.attribute("initial-value", initialValue);
      return this;
   }

   /**
    * Returns the <code>initial-value</code> attribute
    * @return the value defined for the attribute <code>initial-value</code> 
    */
   public Integer getInitialValue()
   {
      if(childNode.getAttribute("initial-value") != null && !childNode.getAttribute("initial-value").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("initial-value"));
      }
      return null;
   }

   /**
    * Removes the <code>initial-value</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeInitialValue()
   {
      childNode.removeAttribute("initial-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:int ElementType : allocation-size
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-size</code> attribute
    * @param allocationSize the value for the attribute <code>allocation-size</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> allocationSize(Integer allocationSize)
   {
      childNode.attribute("allocation-size", allocationSize);
      return this;
   }

   /**
    * Returns the <code>allocation-size</code> attribute
    * @return the value defined for the attribute <code>allocation-size</code> 
    */
   public Integer getAllocationSize()
   {
      if(childNode.getAttribute("allocation-size") != null && !childNode.getAttribute("allocation-size").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("allocation-size"));
      }
      return null;
   }

   /**
    * Removes the <code>allocation-size</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeAllocationSize()
   {
      childNode.removeAttribute("allocation-size");
      return this;
   }
}
