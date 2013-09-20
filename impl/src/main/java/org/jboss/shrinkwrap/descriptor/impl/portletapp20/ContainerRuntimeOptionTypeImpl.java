package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> container-runtime-optionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ContainerRuntimeOptionTypeImpl<T> implements Child<T>, ContainerRuntimeOptionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ContainerRuntimeOptionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ContainerRuntimeOptionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerRuntimeOptionType ElementName: string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerRuntimeOptionType ElementName: string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> value(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("value").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
public List<String> getAllValue()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("value");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> removeAllValue()
   {
      childNode.removeChildren("value");
      return this;
   }
}
