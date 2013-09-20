package org.jboss.shrinkwrap.descriptor.impl.webfragment31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webfragment31.OrderingOrderingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.OrderingOthersType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.OrderingOthersTypeImpl;

/**
 * This class implements the <code> ordering-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OrderingOrderingTypeImpl<T> implements Child<T>, OrderingOrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OrderingOrderingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OrderingOrderingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingOrderingType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>OrderingOrderingType<T></code> 
    */
   public OrderingOrderingType<T> name(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
public List<String> getAllName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>OrderingOrderingType<T></code> 
    */
   public OrderingOrderingType<T> removeAllName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingOrderingType ElementName: javaee:ordering-othersType ElementType : others
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>others</code> element 
    * @return the current instance of <code>OrderingOrderingType<T></code> 
    */
   public OrderingOrderingType<T> others()
   {
      childNode.getOrCreate("others");
      return this;
   }

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>OrderingOrderingType<T></code> 
    */
   public Boolean isOthers()
   {
      return childNode.getSingle("others") != null;
   }

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>OrderingOrderingType<T></code> 
    */
   public OrderingOrderingType<T> removeOthers()
   {
      childNode.removeChild("others");
      return this;
   }
}
