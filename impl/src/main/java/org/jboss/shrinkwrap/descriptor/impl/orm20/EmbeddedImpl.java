package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.Embedded;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm20.AttributeOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm20.AssociationOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;

/**
 * This class implements the <code> embedded </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EmbeddedImpl<T> implements Child<T>, Embedded<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EmbeddedImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EmbeddedImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<Embedded<T>> getOrCreateAttributeOverride()
   {
      List<Node> nodeList = childNode.get("attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<Embedded<T>>(this, "attribute-override", childNode, nodeList.get(0));
      }
      return createAttributeOverride();
   }

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<Embedded<T>></code> 
    */
   public AttributeOverride<Embedded<T>> createAttributeOverride()
   {
      return new AttributeOverrideImpl<Embedded<T>>(this, "attribute-override", childNode);
   }

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<Embedded<T>>> getAllAttributeOverride()
   {
      List<AttributeOverride<Embedded<T>>> list = new ArrayList<AttributeOverride<Embedded<T>>>();
      List<Node> nodeList = childNode.get("attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<Embedded<T>>  type = new AttributeOverrideImpl<Embedded<T>>(this, "attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<Embedded<T>></code> 
    */
   public Embedded<T> removeAllAttributeOverride()
   {
      childNode.removeChildren("attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<Embedded<T>> getOrCreateAssociationOverride()
   {
      List<Node> nodeList = childNode.get("association-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AssociationOverrideImpl<Embedded<T>>(this, "association-override", childNode, nodeList.get(0));
      }
      return createAssociationOverride();
   }

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<Embedded<T>></code> 
    */
   public AssociationOverride<Embedded<T>> createAssociationOverride()
   {
      return new AssociationOverrideImpl<Embedded<T>>(this, "association-override", childNode);
   }

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<Embedded<T>>> getAllAssociationOverride()
   {
      List<AssociationOverride<Embedded<T>>> list = new ArrayList<AssociationOverride<Embedded<T>>>();
      List<Node> nodeList = childNode.get("association-override");
      for(Node node: nodeList)
      {
         AssociationOverride<Embedded<T>>  type = new AssociationOverrideImpl<Embedded<T>>(this, "association-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<Embedded<T>></code> 
    */
   public Embedded<T> removeAllAssociationOverride()
   {
      childNode.removeChildren("association-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> name(String name)
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
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> access(String access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getAttribute("access"));
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getAttribute("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }
}
