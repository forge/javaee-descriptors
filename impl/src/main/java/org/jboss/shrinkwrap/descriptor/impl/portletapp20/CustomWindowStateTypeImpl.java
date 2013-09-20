package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomWindowStateType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> custom-window-stateType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CustomWindowStateTypeImpl<T> implements Child<T>, CustomWindowStateType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CustomWindowStateTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CustomWindowStateTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> description(String ... values)
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
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : window-state
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>window-state</code> element
    * @param windowState the value for the element <code>window-state</code> 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> windowState(String windowState)
   {
      childNode.getOrCreate("window-state").text(windowState);
      return this;
   }

   /**
    * Returns the <code>window-state</code> element
    * @return the node defined for the element <code>window-state</code> 
    */
   public String getWindowState()
   {
      return childNode.getTextValueForPatternName("window-state");
   }

   /**
    * Removes the <code>window-state</code> element 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeWindowState()
   {
      childNode.removeChildren("window-state");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> id(String id)
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
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
