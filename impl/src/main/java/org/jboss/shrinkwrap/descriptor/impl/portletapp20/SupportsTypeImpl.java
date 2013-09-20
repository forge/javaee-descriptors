package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SupportsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> supportsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SupportsTypeImpl<T> implements Child<T>, SupportsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SupportsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SupportsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : mime-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mime-type</code> element
    * @param mimeType the value for the element <code>mime-type</code> 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> mimeType(String mimeType)
   {
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }

   /**
    * Returns the <code>mime-type</code> element
    * @return the node defined for the element <code>mime-type</code> 
    */
   public String getMimeType()
   {
      return childNode.getTextValueForPatternName("mime-type");
   }

   /**
    * Removes the <code>mime-type</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeMimeType()
   {
      childNode.removeChildren("mime-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : portlet-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>portlet-mode</code> elements, 
    * a new <code>portlet-mode</code> element 
    * @param values list of <code>portlet-mode</code> objects 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> portletMode(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("portlet-mode").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>portlet-mode</code> elements
    * @return list of <code>portlet-mode</code> 
    */
public List<String> getAllPortletMode()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("portlet-mode");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>portlet-mode</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeAllPortletMode()
   {
      childNode.removeChildren("portlet-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : window-state
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>window-state</code> elements, 
    * a new <code>window-state</code> element 
    * @param values list of <code>window-state</code> objects 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> windowState(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("window-state").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>window-state</code> elements
    * @return list of <code>window-state</code> 
    */
public List<String> getAllWindowState()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("window-state");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>window-state</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeAllWindowState()
   {
      childNode.removeChildren("window-state");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> id(String id)
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
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
