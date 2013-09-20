package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> unique-constraint </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class UniqueConstraintImpl<T> implements Child<T>, UniqueConstraint<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public UniqueConstraintImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public UniqueConstraintImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UniqueConstraint ElementName: xsd:string ElementType : column-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>column-name</code> elements, 
    * a new <code>column-name</code> element 
    * @param values list of <code>column-name</code> objects 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> columnName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("column-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>column-name</code> elements
    * @return list of <code>column-name</code> 
    */
public List<String> getAllColumnName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("column-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>column-name</code> element 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> removeAllColumnName()
   {
      childNode.removeChildren("column-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UniqueConstraint ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> name(String name)
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
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
