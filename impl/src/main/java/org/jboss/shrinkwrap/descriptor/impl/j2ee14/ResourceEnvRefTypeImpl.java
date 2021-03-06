package org.jboss.shrinkwrap.descriptor.impl.j2ee14; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> resource-env-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> description(String ... values)
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
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:token ElementType : resource-env-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-env-ref-name</code> element
    * @param resourceEnvRefName the value for the element <code>resource-env-ref-name</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> resourceEnvRefName(String resourceEnvRefName)
   {
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }

   /**
    * Returns the <code>resource-env-ref-name</code> element
    * @return the node defined for the element <code>resource-env-ref-name</code> 
    */
   public String getResourceEnvRefName()
   {
      return childNode.getTextValueForPatternName("resource-env-ref-name");
   }

   /**
    * Removes the <code>resource-env-ref-name</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefName()
   {
      childNode.removeChildren("resource-env-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:token ElementType : resource-env-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-env-ref-type</code> element
    * @param resourceEnvRefType the value for the element <code>resource-env-ref-type</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> resourceEnvRefType(String resourceEnvRefType)
   {
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }

   /**
    * Returns the <code>resource-env-ref-type</code> element
    * @return the node defined for the element <code>resource-env-ref-type</code> 
    */
   public String getResourceEnvRefType()
   {
      return childNode.getTextValueForPatternName("resource-env-ref-type");
   }

   /**
    * Removes the <code>resource-env-ref-type</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefType()
   {
      childNode.removeChildren("resource-env-ref-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> id(String id)
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
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
