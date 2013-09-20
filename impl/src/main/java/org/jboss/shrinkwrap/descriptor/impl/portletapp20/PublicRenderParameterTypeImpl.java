package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PublicRenderParameterType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> public-render-parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PublicRenderParameterTypeImpl<T> implements Child<T>, PublicRenderParameterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PublicRenderParameterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PublicRenderParameterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public PublicRenderParameterType<T> description(String ... values)
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
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: string ElementType : identifier
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>identifier</code> element
    * @param identifier the value for the element <code>identifier</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> identifier(String identifier)
   {
      childNode.getOrCreate("identifier").text(identifier);
      return this;
   }

   /**
    * Returns the <code>identifier</code> element
    * @return the node defined for the element <code>identifier</code> 
    */
   public String getIdentifier()
   {
      return childNode.getTextValueForPatternName("identifier");
   }

   /**
    * Removes the <code>identifier</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeIdentifier()
   {
      childNode.removeChildren("identifier");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: xsd:QName ElementType : qname
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>qname</code> element
    * @param qname the value for the element <code>qname</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> qname(String qname)
   {
      childNode.getOrCreate("qname").text(qname);
      return this;
   }

   /**
    * Returns the <code>qname</code> element
    * @return the node defined for the element <code>qname</code> 
    */
   public String getQname()
   {
      return childNode.getTextValueForPatternName("qname");
   }

   /**
    * Removes the <code>qname</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeQname()
   {
      childNode.removeChildren("qname");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: xsd:NCName ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
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
   public PublicRenderParameterType<T> alias(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("alias").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>alias</code> elements
    * @return list of <code>alias</code> 
    */
public List<String> getAllAlias()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("alias");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>alias</code> element 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeAllAlias()
   {
      childNode.removeChildren("alias");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PublicRenderParameterType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> id(String id)
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
    * @return the current instance of <code>PublicRenderParameterType<T></code> 
    */
   public PublicRenderParameterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
