package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigMapEntriesType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigMapEntryType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigMapEntryTypeImpl;

/**
 * This class implements the <code> faces-config-map-entriesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigMapEntriesTypeImpl<T> implements Child<T>, FacesConfigMapEntriesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigMapEntriesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigMapEntriesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: xsd:token ElementType : key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key-class</code> element
    * @param keyClass the value for the element <code>key-class</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> keyClass(String keyClass)
   {
      childNode.getOrCreate("key-class").text(keyClass);
      return this;
   }

   /**
    * Returns the <code>key-class</code> element
    * @return the node defined for the element <code>key-class</code> 
    */
   public String getKeyClass()
   {
      return childNode.getTextValueForPatternName("key-class");
   }

   /**
    * Removes the <code>key-class</code> element 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeKeyClass()
   {
      childNode.removeChildren("key-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: javaee:fully-qualified-classType ElementType : value-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-class</code> element
    * @param valueClass the value for the element <code>value-class</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> valueClass(String valueClass)
   {
      childNode.getOrCreate("value-class").text(valueClass);
      return this;
   }

   /**
    * Returns the <code>value-class</code> element
    * @return the node defined for the element <code>value-class</code> 
    */
   public String getValueClass()
   {
      return childNode.getTextValueForPatternName("value-class");
   }

   /**
    * Removes the <code>value-class</code> element 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeValueClass()
   {
      childNode.removeChildren("value-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: javaee:faces-config-map-entryType ElementType : map-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>map-entry</code> element will be returned.
    * @return the instance defined for the element <code>map-entry</code> 
    */
   public FacesConfigMapEntryType<FacesConfigMapEntriesType<T>> getOrCreateMapEntry()
   {
      List<Node> nodeList = childNode.get("map-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigMapEntryTypeImpl<FacesConfigMapEntriesType<T>>(this, "map-entry", childNode, nodeList.get(0));
      }
      return createMapEntry();
   }

   /**
    * Creates a new <code>map-entry</code> element 
    * @return the new created instance of <code>FacesConfigMapEntryType<FacesConfigMapEntriesType<T>></code> 
    */
   public FacesConfigMapEntryType<FacesConfigMapEntriesType<T>> createMapEntry()
   {
      return new FacesConfigMapEntryTypeImpl<FacesConfigMapEntriesType<T>>(this, "map-entry", childNode);
   }

   /**
    * Returns all <code>map-entry</code> elements
    * @return list of <code>map-entry</code> 
    */
   public List<FacesConfigMapEntryType<FacesConfigMapEntriesType<T>>> getAllMapEntry()
   {
      List<FacesConfigMapEntryType<FacesConfigMapEntriesType<T>>> list = new ArrayList<FacesConfigMapEntryType<FacesConfigMapEntriesType<T>>>();
      List<Node> nodeList = childNode.get("map-entry");
      for(Node node: nodeList)
      {
         FacesConfigMapEntryType<FacesConfigMapEntriesType<T>>  type = new FacesConfigMapEntryTypeImpl<FacesConfigMapEntriesType<T>>(this, "map-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-entry</code> elements 
    * @return the current instance of <code>FacesConfigMapEntryType<FacesConfigMapEntriesType<T>></code> 
    */
   public FacesConfigMapEntriesType<T> removeAllMapEntry()
   {
      childNode.removeChildren("map-entry");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
