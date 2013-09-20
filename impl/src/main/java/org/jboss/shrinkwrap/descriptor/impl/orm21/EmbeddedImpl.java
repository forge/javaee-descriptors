package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm21.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.api.orm21.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm21.Convert;
import org.jboss.shrinkwrap.descriptor.api.orm21.Embedded;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

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
   // ClassName: Embedded ElementName: orm:convert ElementType : convert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert</code> element will be created and returned.
    * Otherwise, the first existing <code>convert</code> element will be returned.
    * @return the instance defined for the element <code>convert</code> 
    */
   public Convert<Embedded<T>> getOrCreateConvert()
   {
      List<Node> nodeList = childNode.get("convert");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConvertImpl<Embedded<T>>(this, "convert", childNode, nodeList.get(0));
      }
      return createConvert();
   }

   /**
    * Creates a new <code>convert</code> element 
    * @return the new created instance of <code>Convert<Embedded<T>></code> 
    */
   public Convert<Embedded<T>> createConvert()
   {
      return new ConvertImpl<Embedded<T>>(this, "convert", childNode);
   }

   /**
    * Returns all <code>convert</code> elements
    * @return list of <code>convert</code> 
    */
   public List<Convert<Embedded<T>>> getAllConvert()
   {
      List<Convert<Embedded<T>>> list = new ArrayList<Convert<Embedded<T>>>();
      List<Node> nodeList = childNode.get("convert");
      for(Node node: nodeList)
      {
         Convert<Embedded<T>>  type = new ConvertImpl<Embedded<T>>(this, "convert", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert</code> elements 
    * @return the current instance of <code>Convert<Embedded<T>></code> 
    */
   public Embedded<T> removeAllConvert()
   {
      childNode.removeChildren("convert");
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
