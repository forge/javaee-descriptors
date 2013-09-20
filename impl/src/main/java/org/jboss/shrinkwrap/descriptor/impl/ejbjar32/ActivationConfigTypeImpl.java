package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ActivationConfigType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.ActivationConfigPropertyTypeImpl;

/**
 * This class implements the <code> activation-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ActivationConfigTypeImpl<T> implements Child<T>, ActivationConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ActivationConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ActivationConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> description(String ... values)
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
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: javaee:activation-config-propertyType ElementType : activation-config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>activation-config-property</code> element will be returned.
    * @return the instance defined for the element <code>activation-config-property</code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> getOrCreateActivationConfigProperty()
   {
      List<Node> nodeList = childNode.get("activation-config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "activation-config-property", childNode, nodeList.get(0));
      }
      return createActivationConfigProperty();
   }

   /**
    * Creates a new <code>activation-config-property</code> element 
    * @return the new created instance of <code>ActivationConfigPropertyType<ActivationConfigType<T>></code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> createActivationConfigProperty()
   {
      return new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "activation-config-property", childNode);
   }

   /**
    * Returns all <code>activation-config-property</code> elements
    * @return list of <code>activation-config-property</code> 
    */
   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getAllActivationConfigProperty()
   {
      List<ActivationConfigPropertyType<ActivationConfigType<T>>> list = new ArrayList<ActivationConfigPropertyType<ActivationConfigType<T>>>();
      List<Node> nodeList = childNode.get("activation-config-property");
      for(Node node: nodeList)
      {
         ActivationConfigPropertyType<ActivationConfigType<T>>  type = new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "activation-config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>activation-config-property</code> elements 
    * @return the current instance of <code>ActivationConfigPropertyType<ActivationConfigType<T>></code> 
    */
   public ActivationConfigType<T> removeAllActivationConfigProperty()
   {
      childNode.removeChildren("activation-config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> id(String id)
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
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
