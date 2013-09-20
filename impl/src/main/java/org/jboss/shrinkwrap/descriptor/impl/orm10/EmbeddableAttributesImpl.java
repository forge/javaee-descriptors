package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm10.EmbeddableAttributes;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm10.Basic;
import org.jboss.shrinkwrap.descriptor.impl.orm10.BasicImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.Transient;
import org.jboss.shrinkwrap.descriptor.impl.orm10.TransientImpl;

/**
 * This class implements the <code> embeddable-attributes </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EmbeddableAttributesImpl<T> implements Child<T>, EmbeddableAttributes<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EmbeddableAttributesImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EmbeddableAttributesImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:basic ElementType : basic
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>basic</code> element will be created and returned.
    * Otherwise, the first existing <code>basic</code> element will be returned.
    * @return the instance defined for the element <code>basic</code> 
    */
   public Basic<EmbeddableAttributes<T>> getOrCreateBasic()
   {
      List<Node> nodeList = childNode.get("basic");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BasicImpl<EmbeddableAttributes<T>>(this, "basic", childNode, nodeList.get(0));
      }
      return createBasic();
   }

   /**
    * Creates a new <code>basic</code> element 
    * @return the new created instance of <code>Basic<EmbeddableAttributes<T>></code> 
    */
   public Basic<EmbeddableAttributes<T>> createBasic()
   {
      return new BasicImpl<EmbeddableAttributes<T>>(this, "basic", childNode);
   }

   /**
    * Returns all <code>basic</code> elements
    * @return list of <code>basic</code> 
    */
   public List<Basic<EmbeddableAttributes<T>>> getAllBasic()
   {
      List<Basic<EmbeddableAttributes<T>>> list = new ArrayList<Basic<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("basic");
      for(Node node: nodeList)
      {
         Basic<EmbeddableAttributes<T>>  type = new BasicImpl<EmbeddableAttributes<T>>(this, "basic", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>basic</code> elements 
    * @return the current instance of <code>Basic<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllBasic()
   {
      childNode.removeChildren("basic");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:transient ElementType : transient
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transient</code> element will be created and returned.
    * Otherwise, the first existing <code>transient</code> element will be returned.
    * @return the instance defined for the element <code>transient</code> 
    */
   public Transient<EmbeddableAttributes<T>> getOrCreateTransient()
   {
      List<Node> nodeList = childNode.get("transient");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TransientImpl<EmbeddableAttributes<T>>(this, "transient", childNode, nodeList.get(0));
      }
      return createTransient();
   }

   /**
    * Creates a new <code>transient</code> element 
    * @return the new created instance of <code>Transient<EmbeddableAttributes<T>></code> 
    */
   public Transient<EmbeddableAttributes<T>> createTransient()
   {
      return new TransientImpl<EmbeddableAttributes<T>>(this, "transient", childNode);
   }

   /**
    * Returns all <code>transient</code> elements
    * @return list of <code>transient</code> 
    */
   public List<Transient<EmbeddableAttributes<T>>> getAllTransient()
   {
      List<Transient<EmbeddableAttributes<T>>> list = new ArrayList<Transient<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("transient");
      for(Node node: nodeList)
      {
         Transient<EmbeddableAttributes<T>>  type = new TransientImpl<EmbeddableAttributes<T>>(this, "transient", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>transient</code> elements 
    * @return the current instance of <code>Transient<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllTransient()
   {
      childNode.removeChildren("transient");
      return this;
   }
}
