package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.RequiredConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> required-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class RequiredConfigPropertyTypeImpl<T> implements Child<T>, RequiredConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RequiredConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RequiredConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: javaee:xsdStringType ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> configPropertyName(String configPropertyName)
   {
      childNode.getOrCreate("config-property-name").text(configPropertyName);
      return this;
   }

   /**
    * Returns the <code>config-property-name</code> element
    * @return the node defined for the element <code>config-property-name</code> 
    */
   public String getConfigPropertyName()
   {
      return childNode.getTextValueForPatternName("config-property-name");
   }

   /**
    * Removes the <code>config-property-name</code> element 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeConfigPropertyName()
   {
      childNode.removeChildren("config-property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> id(String id)
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
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
