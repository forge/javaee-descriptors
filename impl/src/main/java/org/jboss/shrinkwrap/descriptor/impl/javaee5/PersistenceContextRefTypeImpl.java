package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> persistence-context-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceContextRefTypeImpl<T> implements Child<T>, PersistenceContextRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceContextRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PersistenceContextRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> mappedName(String mappedName)
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
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceContextRefType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<PersistenceContextRefType<T>></code> 
    */
   public InjectionTargetType<PersistenceContextRefType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceContextRefType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<PersistenceContextRefType<T>>> list = new ArrayList<InjectionTargetType<PersistenceContextRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<PersistenceContextRefType<T>>  type = new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<PersistenceContextRefType<T>></code> 
    */
   public PersistenceContextRefType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> description(String ... values)
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
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:token ElementType : persistence-context-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-context-ref-name</code> element
    * @param persistenceContextRefName the value for the element <code>persistence-context-ref-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextRefName(String persistenceContextRefName)
   {
      childNode.getOrCreate("persistence-context-ref-name").text(persistenceContextRefName);
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref-name</code> element
    * @return the node defined for the element <code>persistence-context-ref-name</code> 
    */
   public String getPersistenceContextRefName()
   {
      return childNode.getTextValueForPatternName("persistence-context-ref-name");
   }

   /**
    * Removes the <code>persistence-context-ref-name</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceContextRefName()
   {
      childNode.removeChildren("persistence-context-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:token ElementType : persistence-unit-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-unit-name</code> element
    * @param persistenceUnitName the value for the element <code>persistence-unit-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceUnitName(String persistenceUnitName)
   {
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName()
   {
      return childNode.getTextValueForPatternName("persistence-unit-name");
   }

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceUnitName()
   {
      childNode.removeChildren("persistence-unit-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:persistence-context-typeType ElementType : persistence-context-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>persistence-context-type</code> element
    * @param persistenceContextType the value for the element <code>persistence-context-type</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextType(PersistenceContextTypeType persistenceContextType)
   {
      childNode.getOrCreate("persistence-context-type").text(persistenceContextType);
      return this;
   }
   /**
    * Sets the <code>persistence-context-type</code> element
    * @param persistenceContextType the value for the element <code>persistence-context-type</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextType(String persistenceContextType)
   {
      childNode.getOrCreate("persistence-context-type").text(persistenceContextType);
      return this;
   }

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the value found for the element <code>persistence-context-type</code> 
    */
   public PersistenceContextTypeType getPersistenceContextType()
   {
      return PersistenceContextTypeType.getFromStringValue(childNode.getTextValueForPatternName("persistence-context-type"));
   }

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the value found for the element <code>persistence-context-type</code> 
    */
   public String  getPersistenceContextTypeAsString()
   {
      return childNode.getTextValueForPatternName("persistence-context-type");
   }

   /**
    * Removes the <code>persistence-context-type</code> attribute 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceContextType()
   {
      childNode.removeAttribute("persistence-context-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:propertyType ElementType : persistence-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-property</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-property</code> element will be returned.
    * @return the instance defined for the element <code>persistence-property</code> 
    */
   public PropertyType<PersistenceContextRefType<T>> getOrCreatePersistenceProperty()
   {
      List<Node> nodeList = childNode.get("persistence-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "persistence-property", childNode, nodeList.get(0));
      }
      return createPersistenceProperty();
   }

   /**
    * Creates a new <code>persistence-property</code> element 
    * @return the new created instance of <code>PropertyType<PersistenceContextRefType<T>></code> 
    */
   public PropertyType<PersistenceContextRefType<T>> createPersistenceProperty()
   {
      return new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "persistence-property", childNode);
   }

   /**
    * Returns all <code>persistence-property</code> elements
    * @return list of <code>persistence-property</code> 
    */
   public List<PropertyType<PersistenceContextRefType<T>>> getAllPersistenceProperty()
   {
      List<PropertyType<PersistenceContextRefType<T>>> list = new ArrayList<PropertyType<PersistenceContextRefType<T>>>();
      List<Node> nodeList = childNode.get("persistence-property");
      for(Node node: nodeList)
      {
         PropertyType<PersistenceContextRefType<T>>  type = new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "persistence-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-property</code> elements 
    * @return the current instance of <code>PropertyType<PersistenceContextRefType<T>></code> 
    */
   public PersistenceContextRefType<T> removeAllPersistenceProperty()
   {
      childNode.removeChildren("persistence-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> id(String id)
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
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
