package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> depends-onType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DependsOnTypeImpl<T> implements Child<T>, DependsOnType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DependsOnTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DependsOnTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DependsOnType ElementName: xsd:token ElementType : ejb-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>ejb-name</code> elements, 
    * a new <code>ejb-name</code> element 
    * @param values list of <code>ejb-name</code> objects 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> ejbName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("ejb-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>ejb-name</code> elements
    * @return list of <code>ejb-name</code> 
    */
public List<String> getAllEjbName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("ejb-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> removeAllEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DependsOnType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> id(String id)
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
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
