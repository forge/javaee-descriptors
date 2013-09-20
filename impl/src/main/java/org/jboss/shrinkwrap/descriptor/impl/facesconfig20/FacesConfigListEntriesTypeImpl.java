package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigListEntriesType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNullValueType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigNullValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNullValueType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigNullValueTypeImpl;

/**
 * This class implements the <code> faces-config-list-entriesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigListEntriesTypeImpl<T> implements Child<T>, FacesConfigListEntriesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigListEntriesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigListEntriesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: javaee:fully-qualified-classType ElementType : value-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-class</code> element
    * @param valueClass the value for the element <code>value-class</code> 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> valueClass(String valueClass)
   {
      childNode.getOrCreate("value-class").text(valueClass);
      return this;
   }

   /**
    * Returns the <code>value-class</code> element
    * @return the node defined for the element <code>value-class</code> 
    */
   public String getValueClass()
   {
      return childNode.getTextValueForPatternName("value-class");
   }

   /**
    * Removes the <code>value-class</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeValueClass()
   {
      childNode.removeChildren("value-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> nullValue()
   {
      childNode.getOrCreate("null-value");
      return this;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public Boolean isNullValue()
   {
      return childNode.getSingle("null-value") != null;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeNullValue()
   {
      childNode.removeChild("null-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> value(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("value").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
public List<String> getAllValue()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("value");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeAllValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
