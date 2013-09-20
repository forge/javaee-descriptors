package org.jboss.shrinkwrap.descriptor.impl.beans10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans10.Interceptors;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> interceptors </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InterceptorsImpl<T> implements Child<T>, Interceptors<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorsImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InterceptorsImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Interceptors ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>Interceptors<T></code> 
    */
   public Interceptors<T> clazz(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("class").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
public List<String> getAllClazz()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("class");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>Interceptors<T></code> 
    */
   public Interceptors<T> removeAllClazz()
   {
      childNode.removeChildren("class");
      return this;
   }
}
