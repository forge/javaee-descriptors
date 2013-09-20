package org.jboss.shrinkwrap.descriptor.impl.jsp21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsp21.TaglibType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> taglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TaglibTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TaglibTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:token ElementType : taglib-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-uri</code> element
    * @param taglibUri the value for the element <code>taglib-uri</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> taglibUri(String taglibUri)
   {
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }

   /**
    * Returns the <code>taglib-uri</code> element
    * @return the node defined for the element <code>taglib-uri</code> 
    */
   public String getTaglibUri()
   {
      return childNode.getTextValueForPatternName("taglib-uri");
   }

   /**
    * Removes the <code>taglib-uri</code> element 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeTaglibUri()
   {
      childNode.removeChildren("taglib-uri");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:token ElementType : taglib-location
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-location</code> element
    * @param taglibLocation the value for the element <code>taglib-location</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> taglibLocation(String taglibLocation)
   {
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }

   /**
    * Returns the <code>taglib-location</code> element
    * @return the node defined for the element <code>taglib-location</code> 
    */
   public String getTaglibLocation()
   {
      return childNode.getTextValueForPatternName("taglib-location");
   }

   /**
    * Removes the <code>taglib-location</code> element 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeTaglibLocation()
   {
      childNode.removeChildren("taglib-location");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> id(String id)
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
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
