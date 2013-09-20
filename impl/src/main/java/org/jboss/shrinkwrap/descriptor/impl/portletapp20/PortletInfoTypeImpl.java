package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletInfoType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> portlet-infoType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletInfoTypeImpl<T> implements Child<T>, PortletInfoType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletInfoTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortletInfoTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : title
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>title</code> element
    * @param title the value for the element <code>title</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> title(String title)
   {
      childNode.getOrCreate("title").text(title);
      return this;
   }

   /**
    * Returns the <code>title</code> element
    * @return the node defined for the element <code>title</code> 
    */
   public String getTitle()
   {
      return childNode.getTextValueForPatternName("title");
   }

   /**
    * Removes the <code>title</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeTitle()
   {
      childNode.removeChildren("title");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : short-title
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-title</code> element
    * @param shortTitle the value for the element <code>short-title</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> shortTitle(String shortTitle)
   {
      childNode.getOrCreate("short-title").text(shortTitle);
      return this;
   }

   /**
    * Returns the <code>short-title</code> element
    * @return the node defined for the element <code>short-title</code> 
    */
   public String getShortTitle()
   {
      return childNode.getTextValueForPatternName("short-title");
   }

   /**
    * Removes the <code>short-title</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeShortTitle()
   {
      childNode.removeChildren("short-title");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : keywords
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>keywords</code> element
    * @param keywords the value for the element <code>keywords</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> keywords(String keywords)
   {
      childNode.getOrCreate("keywords").text(keywords);
      return this;
   }

   /**
    * Returns the <code>keywords</code> element
    * @return the node defined for the element <code>keywords</code> 
    */
   public String getKeywords()
   {
      return childNode.getTextValueForPatternName("keywords");
   }

   /**
    * Removes the <code>keywords</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeKeywords()
   {
      childNode.removeChildren("keywords");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> id(String id)
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
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
