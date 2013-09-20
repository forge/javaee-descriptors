package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> locale-encoding-mapping-listType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class LocaleEncodingMappingListTypeImpl<T> implements Child<T>, LocaleEncodingMappingListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingListType ElementName: javaee:locale-encoding-mappingType ElementType : locale-encoding-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping</code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> getOrCreateLocaleEncodingMapping()
   {
      List<Node> nodeList = childNode.get("locale-encoding-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "locale-encoding-mapping", childNode, nodeList.get(0));
      }
      return createLocaleEncodingMapping();
   }

   /**
    * Creates a new <code>locale-encoding-mapping</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingType<LocaleEncodingMappingListType<T>></code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> createLocaleEncodingMapping()
   {
      return new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "locale-encoding-mapping", childNode);
   }

   /**
    * Returns all <code>locale-encoding-mapping</code> elements
    * @return list of <code>locale-encoding-mapping</code> 
    */
   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getAllLocaleEncodingMapping()
   {
      List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> list = new ArrayList<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping");
      for(Node node: nodeList)
      {
         LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>  type = new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "locale-encoding-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-encoding-mapping</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingType<LocaleEncodingMappingListType<T>></code> 
    */
   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping()
   {
      childNode.removeChildren("locale-encoding-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingListType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LocaleEncodingMappingListType<T></code> 
    */
   public LocaleEncodingMappingListType<T> id(String id)
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
    * @return the current instance of <code>LocaleEncodingMappingListType<T></code> 
    */
   public LocaleEncodingMappingListType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
