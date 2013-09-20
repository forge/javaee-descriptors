package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;

/**
 * This class implements the <code> env-entryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EnvEntryTypeImpl<T> implements Child<T>, EnvEntryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EnvEntryTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EnvEntryTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> lookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.getTextValueForPatternName("lookup-name");
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeLookupName()
   {
      childNode.removeChildren("lookup-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EnvEntryType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<EnvEntryType<T>></code> 
    */
   public InjectionTargetType<EnvEntryType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EnvEntryType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<EnvEntryType<T>>> list = new ArrayList<InjectionTargetType<EnvEntryType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<EnvEntryType<T>>  type = new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<EnvEntryType<T>></code> 
    */
   public EnvEntryType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> description(String ... values)
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
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:token ElementType : env-entry-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>env-entry-name</code> element
    * @param envEntryName the value for the element <code>env-entry-name</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryName(String envEntryName)
   {
      childNode.getOrCreate("env-entry-name").text(envEntryName);
      return this;
   }

   /**
    * Returns the <code>env-entry-name</code> element
    * @return the node defined for the element <code>env-entry-name</code> 
    */
   public String getEnvEntryName()
   {
      return childNode.getTextValueForPatternName("env-entry-name");
   }

   /**
    * Removes the <code>env-entry-name</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryName()
   {
      childNode.removeChildren("env-entry-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:token ElementType : env-entry-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>env-entry-type</code> element
    * @param envEntryType the value for the element <code>env-entry-type</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryType(String envEntryType)
   {
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the node defined for the element <code>env-entry-type</code> 
    */
   public String getEnvEntryType()
   {
      return childNode.getTextValueForPatternName("env-entry-type");
   }

   /**
    * Removes the <code>env-entry-type</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryType()
   {
      childNode.removeChildren("env-entry-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : env-entry-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>env-entry-value</code> element
    * @param envEntryValue the value for the element <code>env-entry-value</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryValue(String envEntryValue)
   {
      childNode.getOrCreate("env-entry-value").text(envEntryValue);
      return this;
   }

   /**
    * Returns the <code>env-entry-value</code> element
    * @return the node defined for the element <code>env-entry-value</code> 
    */
   public String getEnvEntryValue()
   {
      return childNode.getTextValueForPatternName("env-entry-value");
   }

   /**
    * Removes the <code>env-entry-value</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryValue()
   {
      childNode.removeChildren("env-entry-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> id(String id)
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
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
