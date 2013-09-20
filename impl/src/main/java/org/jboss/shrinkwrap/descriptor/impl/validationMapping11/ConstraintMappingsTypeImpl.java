package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.BeanType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintMappingsType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> constraint-mappingsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConstraintMappingsTypeImpl<T> implements Child<T>, ConstraintMappingsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConstraintMappingsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConstraintMappingsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: xsd:string ElementType : default-package
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-package</code> element
    * @param defaultPackage the value for the element <code>default-package</code> 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> defaultPackage(String defaultPackage)
   {
      childNode.getOrCreate("default-package").text(defaultPackage);
      return this;
   }

   /**
    * Returns the <code>default-package</code> element
    * @return the node defined for the element <code>default-package</code> 
    */
   public String getDefaultPackage()
   {
      return childNode.getTextValueForPatternName("default-package");
   }

   /**
    * Removes the <code>default-package</code> element 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> removeDefaultPackage()
   {
      childNode.removeChildren("default-package");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: map:beanType ElementType : bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean</code> element will be created and returned.
    * Otherwise, the first existing <code>bean</code> element will be returned.
    * @return the instance defined for the element <code>bean</code> 
    */
   public BeanType<ConstraintMappingsType<T>> getOrCreateBean()
   {
      List<Node> nodeList = childNode.get("bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BeanTypeImpl<ConstraintMappingsType<T>>(this, "bean", childNode, nodeList.get(0));
      }
      return createBean();
   }

   /**
    * Creates a new <code>bean</code> element 
    * @return the new created instance of <code>BeanType<ConstraintMappingsType<T>></code> 
    */
   public BeanType<ConstraintMappingsType<T>> createBean()
   {
      return new BeanTypeImpl<ConstraintMappingsType<T>>(this, "bean", childNode);
   }

   /**
    * Returns all <code>bean</code> elements
    * @return list of <code>bean</code> 
    */
   public List<BeanType<ConstraintMappingsType<T>>> getAllBean()
   {
      List<BeanType<ConstraintMappingsType<T>>> list = new ArrayList<BeanType<ConstraintMappingsType<T>>>();
      List<Node> nodeList = childNode.get("bean");
      for(Node node: nodeList)
      {
         BeanType<ConstraintMappingsType<T>>  type = new BeanTypeImpl<ConstraintMappingsType<T>>(this, "bean", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>bean</code> elements 
    * @return the current instance of <code>BeanType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintMappingsType<T> removeAllBean()
   {
      childNode.removeChildren("bean");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: map:constraint-definitionType ElementType : constraint-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint-definition</code> element will be returned.
    * @return the instance defined for the element <code>constraint-definition</code> 
    */
   public ConstraintDefinitionType<ConstraintMappingsType<T>> getOrCreateConstraintDefinition()
   {
      List<Node> nodeList = childNode.get("constraint-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintDefinitionTypeImpl<ConstraintMappingsType<T>>(this, "constraint-definition", childNode, nodeList.get(0));
      }
      return createConstraintDefinition();
   }

   /**
    * Creates a new <code>constraint-definition</code> element 
    * @return the new created instance of <code>ConstraintDefinitionType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintDefinitionType<ConstraintMappingsType<T>> createConstraintDefinition()
   {
      return new ConstraintDefinitionTypeImpl<ConstraintMappingsType<T>>(this, "constraint-definition", childNode);
   }

   /**
    * Returns all <code>constraint-definition</code> elements
    * @return list of <code>constraint-definition</code> 
    */
   public List<ConstraintDefinitionType<ConstraintMappingsType<T>>> getAllConstraintDefinition()
   {
      List<ConstraintDefinitionType<ConstraintMappingsType<T>>> list = new ArrayList<ConstraintDefinitionType<ConstraintMappingsType<T>>>();
      List<Node> nodeList = childNode.get("constraint-definition");
      for(Node node: nodeList)
      {
         ConstraintDefinitionType<ConstraintMappingsType<T>>  type = new ConstraintDefinitionTypeImpl<ConstraintMappingsType<T>>(this, "constraint-definition", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint-definition</code> elements 
    * @return the current instance of <code>ConstraintDefinitionType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintMappingsType<T> removeAllConstraintDefinition()
   {
      childNode.removeChildren("constraint-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
