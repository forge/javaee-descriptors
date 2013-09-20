package org.jboss.shrinkwrap.descriptor.impl.beans11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.Alternatives;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> alternatives </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AlternativesImpl<T> implements Child<T>, Alternatives<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AlternativesImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AlternativesImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Alternatives ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> clazz(String ... values)
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
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> removeAllClazz()
   {
      childNode.removeChildren("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Alternatives ElementName: xsd:string ElementType : stereotype
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>stereotype</code> elements, 
    * a new <code>stereotype</code> element 
    * @param values list of <code>stereotype</code> objects 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> stereotype(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("stereotype").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>stereotype</code> elements
    * @return list of <code>stereotype</code> 
    */
public List<String> getAllStereotype()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("stereotype");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>stereotype</code> element 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> removeAllStereotype()
   {
      childNode.removeChildren("stereotype");
      return this;
   }
}
