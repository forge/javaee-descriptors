package org.jboss.shrinkwrap.descriptor.impl.facesuicomponent20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesuicomponent20.UicomponentAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> uicomponent-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class UicomponentAttributeTypeImpl<T> implements Child<T>, UicomponentAttributeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public UicomponentAttributeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public UicomponentAttributeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: javaee:uicomponent-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public UicomponentAttributeType<UicomponentAttributeType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UicomponentAttributeTypeImpl<UicomponentAttributeType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>UicomponentAttributeType<UicomponentAttributeType<T>></code> 
    */
   public UicomponentAttributeType<UicomponentAttributeType<T>> createAttribute()
   {
      return new UicomponentAttributeTypeImpl<UicomponentAttributeType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<UicomponentAttributeType<UicomponentAttributeType<T>>> getAllAttribute()
   {
      List<UicomponentAttributeType<UicomponentAttributeType<T>>> list = new ArrayList<UicomponentAttributeType<UicomponentAttributeType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         UicomponentAttributeType<UicomponentAttributeType<T>>  type = new UicomponentAttributeTypeImpl<UicomponentAttributeType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>UicomponentAttributeType<UicomponentAttributeType<T>></code> 
    */
   public UicomponentAttributeType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> name(String name)
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
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : displayName
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>displayName</code> attribute
    * @param displayName the value for the attribute <code>displayName</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> displayName(String displayName)
   {
      childNode.attribute("displayName", displayName);
      return this;
   }

   /**
    * Returns the <code>displayName</code> attribute
    * @return the value defined for the attribute <code>displayName</code> 
    */
      public String getDisplayName()
   {
      return childNode.getAttribute("displayName");
   }

   /**
    * Removes the <code>displayName</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeDisplayName()
   {
      childNode.removeAttribute("displayName");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : shortDescription
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>shortDescription</code> attribute
    * @param shortDescription the value for the attribute <code>shortDescription</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> shortDescription(String shortDescription)
   {
      childNode.attribute("shortDescription", shortDescription);
      return this;
   }

   /**
    * Returns the <code>shortDescription</code> attribute
    * @return the value defined for the attribute <code>shortDescription</code> 
    */
      public String getShortDescription()
   {
      return childNode.getAttribute("shortDescription");
   }

   /**
    * Removes the <code>shortDescription</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeShortDescription()
   {
      childNode.removeAttribute("shortDescription");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : default
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default</code> attribute
    * @param _default the value for the attribute <code>default</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> _default(String _default)
   {
      childNode.attribute("default", _default);
      return this;
   }

   /**
    * Returns the <code>default</code> attribute
    * @return the value defined for the attribute <code>default</code> 
    */
      public String get_Default()
   {
      return childNode.getAttribute("default");
   }

   /**
    * Removes the <code>default</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> remove_Default()
   {
      childNode.removeAttribute("default");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : method-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> attribute
    * @param methodSignature the value for the attribute <code>method-signature</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> methodSignature(String methodSignature)
   {
      childNode.attribute("method-signature", methodSignature);
      return this;
   }

   /**
    * Returns the <code>method-signature</code> attribute
    * @return the value defined for the attribute <code>method-signature</code> 
    */
      public String getMethodSignature()
   {
      return childNode.getAttribute("method-signature");
   }

   /**
    * Removes the <code>method-signature</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeMethodSignature()
   {
      childNode.removeAttribute("method-signature");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:string ElementType : applyTo
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>applyTo</code> attribute
    * @param applyTo the value for the attribute <code>applyTo</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> applyTo(String applyTo)
   {
      childNode.attribute("applyTo", applyTo);
      return this;
   }

   /**
    * Returns the <code>applyTo</code> attribute
    * @return the value defined for the attribute <code>applyTo</code> 
    */
      public String getApplyTo()
   {
      return childNode.getAttribute("applyTo");
   }

   /**
    * Removes the <code>applyTo</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeApplyTo()
   {
      childNode.removeAttribute("applyTo");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:boolean ElementType : required
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>required</code> attribute
    * @param required the value for the attribute <code>required</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> required(Boolean required)
   {
      childNode.attribute("required", required);
      return this;
   }

   /**
    * Returns the <code>required</code> attribute
    * @return the value defined for the attribute <code>required</code> 
    */
   public Boolean isRequired()
   {
      return Strings.isTrue(childNode.getAttribute("required"));
   }

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeRequired()
   {
      childNode.removeAttribute("required");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:boolean ElementType : preferred
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>preferred</code> attribute
    * @param preferred the value for the attribute <code>preferred</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> preferred(Boolean preferred)
   {
      childNode.attribute("preferred", preferred);
      return this;
   }

   /**
    * Returns the <code>preferred</code> attribute
    * @return the value defined for the attribute <code>preferred</code> 
    */
   public Boolean isPreferred()
   {
      return Strings.isTrue(childNode.getAttribute("preferred"));
   }

   /**
    * Removes the <code>preferred</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removePreferred()
   {
      childNode.removeAttribute("preferred");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UicomponentAttributeType ElementName: xsd:boolean ElementType : expert
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>expert</code> attribute
    * @param expert the value for the attribute <code>expert</code> 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> expert(Boolean expert)
   {
      childNode.attribute("expert", expert);
      return this;
   }

   /**
    * Returns the <code>expert</code> attribute
    * @return the value defined for the attribute <code>expert</code> 
    */
   public Boolean isExpert()
   {
      return Strings.isTrue(childNode.getAttribute("expert"));
   }

   /**
    * Removes the <code>expert</code> attribute 
    * @return the current instance of <code>UicomponentAttributeType<T></code> 
    */
   public UicomponentAttributeType<T> removeExpert()
   {
      childNode.removeAttribute("expert");
      return this;
   }
}
