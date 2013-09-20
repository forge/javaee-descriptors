package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.EmbeddableAttributes;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.Basic;
import org.jboss.shrinkwrap.descriptor.impl.orm20.BasicImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.ManyToOne;
import org.jboss.shrinkwrap.descriptor.impl.orm20.ManyToOneImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.OneToMany;
import org.jboss.shrinkwrap.descriptor.impl.orm20.OneToManyImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.OneToOne;
import org.jboss.shrinkwrap.descriptor.impl.orm20.OneToOneImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.ManyToMany;
import org.jboss.shrinkwrap.descriptor.impl.orm20.ManyToManyImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.ElementCollection;
import org.jboss.shrinkwrap.descriptor.impl.orm20.ElementCollectionImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.Embedded;
import org.jboss.shrinkwrap.descriptor.impl.orm20.EmbeddedImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.Transient;
import org.jboss.shrinkwrap.descriptor.impl.orm20.TransientImpl;

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
   // ClassName: EmbeddableAttributes ElementName: orm:many-to-one ElementType : many-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-one</code> element will be returned.
    * @return the instance defined for the element <code>many-to-one</code> 
    */
   public ManyToOne<EmbeddableAttributes<T>> getOrCreateManyToOne()
   {
      List<Node> nodeList = childNode.get("many-to-one");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ManyToOneImpl<EmbeddableAttributes<T>>(this, "many-to-one", childNode, nodeList.get(0));
      }
      return createManyToOne();
   }

   /**
    * Creates a new <code>many-to-one</code> element 
    * @return the new created instance of <code>ManyToOne<EmbeddableAttributes<T>></code> 
    */
   public ManyToOne<EmbeddableAttributes<T>> createManyToOne()
   {
      return new ManyToOneImpl<EmbeddableAttributes<T>>(this, "many-to-one", childNode);
   }

   /**
    * Returns all <code>many-to-one</code> elements
    * @return list of <code>many-to-one</code> 
    */
   public List<ManyToOne<EmbeddableAttributes<T>>> getAllManyToOne()
   {
      List<ManyToOne<EmbeddableAttributes<T>>> list = new ArrayList<ManyToOne<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("many-to-one");
      for(Node node: nodeList)
      {
         ManyToOne<EmbeddableAttributes<T>>  type = new ManyToOneImpl<EmbeddableAttributes<T>>(this, "many-to-one", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>many-to-one</code> elements 
    * @return the current instance of <code>ManyToOne<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllManyToOne()
   {
      childNode.removeChildren("many-to-one");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:one-to-many ElementType : one-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-many</code> element will be returned.
    * @return the instance defined for the element <code>one-to-many</code> 
    */
   public OneToMany<EmbeddableAttributes<T>> getOrCreateOneToMany()
   {
      List<Node> nodeList = childNode.get("one-to-many");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OneToManyImpl<EmbeddableAttributes<T>>(this, "one-to-many", childNode, nodeList.get(0));
      }
      return createOneToMany();
   }

   /**
    * Creates a new <code>one-to-many</code> element 
    * @return the new created instance of <code>OneToMany<EmbeddableAttributes<T>></code> 
    */
   public OneToMany<EmbeddableAttributes<T>> createOneToMany()
   {
      return new OneToManyImpl<EmbeddableAttributes<T>>(this, "one-to-many", childNode);
   }

   /**
    * Returns all <code>one-to-many</code> elements
    * @return list of <code>one-to-many</code> 
    */
   public List<OneToMany<EmbeddableAttributes<T>>> getAllOneToMany()
   {
      List<OneToMany<EmbeddableAttributes<T>>> list = new ArrayList<OneToMany<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("one-to-many");
      for(Node node: nodeList)
      {
         OneToMany<EmbeddableAttributes<T>>  type = new OneToManyImpl<EmbeddableAttributes<T>>(this, "one-to-many", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>one-to-many</code> elements 
    * @return the current instance of <code>OneToMany<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllOneToMany()
   {
      childNode.removeChildren("one-to-many");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:one-to-one ElementType : one-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-one</code> element will be returned.
    * @return the instance defined for the element <code>one-to-one</code> 
    */
   public OneToOne<EmbeddableAttributes<T>> getOrCreateOneToOne()
   {
      List<Node> nodeList = childNode.get("one-to-one");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OneToOneImpl<EmbeddableAttributes<T>>(this, "one-to-one", childNode, nodeList.get(0));
      }
      return createOneToOne();
   }

   /**
    * Creates a new <code>one-to-one</code> element 
    * @return the new created instance of <code>OneToOne<EmbeddableAttributes<T>></code> 
    */
   public OneToOne<EmbeddableAttributes<T>> createOneToOne()
   {
      return new OneToOneImpl<EmbeddableAttributes<T>>(this, "one-to-one", childNode);
   }

   /**
    * Returns all <code>one-to-one</code> elements
    * @return list of <code>one-to-one</code> 
    */
   public List<OneToOne<EmbeddableAttributes<T>>> getAllOneToOne()
   {
      List<OneToOne<EmbeddableAttributes<T>>> list = new ArrayList<OneToOne<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("one-to-one");
      for(Node node: nodeList)
      {
         OneToOne<EmbeddableAttributes<T>>  type = new OneToOneImpl<EmbeddableAttributes<T>>(this, "one-to-one", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>one-to-one</code> elements 
    * @return the current instance of <code>OneToOne<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllOneToOne()
   {
      childNode.removeChildren("one-to-one");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:many-to-many ElementType : many-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-many</code> element will be returned.
    * @return the instance defined for the element <code>many-to-many</code> 
    */
   public ManyToMany<EmbeddableAttributes<T>> getOrCreateManyToMany()
   {
      List<Node> nodeList = childNode.get("many-to-many");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ManyToManyImpl<EmbeddableAttributes<T>>(this, "many-to-many", childNode, nodeList.get(0));
      }
      return createManyToMany();
   }

   /**
    * Creates a new <code>many-to-many</code> element 
    * @return the new created instance of <code>ManyToMany<EmbeddableAttributes<T>></code> 
    */
   public ManyToMany<EmbeddableAttributes<T>> createManyToMany()
   {
      return new ManyToManyImpl<EmbeddableAttributes<T>>(this, "many-to-many", childNode);
   }

   /**
    * Returns all <code>many-to-many</code> elements
    * @return list of <code>many-to-many</code> 
    */
   public List<ManyToMany<EmbeddableAttributes<T>>> getAllManyToMany()
   {
      List<ManyToMany<EmbeddableAttributes<T>>> list = new ArrayList<ManyToMany<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("many-to-many");
      for(Node node: nodeList)
      {
         ManyToMany<EmbeddableAttributes<T>>  type = new ManyToManyImpl<EmbeddableAttributes<T>>(this, "many-to-many", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>many-to-many</code> elements 
    * @return the current instance of <code>ManyToMany<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllManyToMany()
   {
      childNode.removeChildren("many-to-many");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:element-collection ElementType : element-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>element-collection</code> element will be returned.
    * @return the instance defined for the element <code>element-collection</code> 
    */
   public ElementCollection<EmbeddableAttributes<T>> getOrCreateElementCollection()
   {
      List<Node> nodeList = childNode.get("element-collection");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ElementCollectionImpl<EmbeddableAttributes<T>>(this, "element-collection", childNode, nodeList.get(0));
      }
      return createElementCollection();
   }

   /**
    * Creates a new <code>element-collection</code> element 
    * @return the new created instance of <code>ElementCollection<EmbeddableAttributes<T>></code> 
    */
   public ElementCollection<EmbeddableAttributes<T>> createElementCollection()
   {
      return new ElementCollectionImpl<EmbeddableAttributes<T>>(this, "element-collection", childNode);
   }

   /**
    * Returns all <code>element-collection</code> elements
    * @return list of <code>element-collection</code> 
    */
   public List<ElementCollection<EmbeddableAttributes<T>>> getAllElementCollection()
   {
      List<ElementCollection<EmbeddableAttributes<T>>> list = new ArrayList<ElementCollection<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("element-collection");
      for(Node node: nodeList)
      {
         ElementCollection<EmbeddableAttributes<T>>  type = new ElementCollectionImpl<EmbeddableAttributes<T>>(this, "element-collection", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>element-collection</code> elements 
    * @return the current instance of <code>ElementCollection<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllElementCollection()
   {
      childNode.removeChildren("element-collection");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:embedded ElementType : embedded
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded</code> element will be created and returned.
    * Otherwise, the first existing <code>embedded</code> element will be returned.
    * @return the instance defined for the element <code>embedded</code> 
    */
   public Embedded<EmbeddableAttributes<T>> getOrCreateEmbedded()
   {
      List<Node> nodeList = childNode.get("embedded");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EmbeddedImpl<EmbeddableAttributes<T>>(this, "embedded", childNode, nodeList.get(0));
      }
      return createEmbedded();
   }

   /**
    * Creates a new <code>embedded</code> element 
    * @return the new created instance of <code>Embedded<EmbeddableAttributes<T>></code> 
    */
   public Embedded<EmbeddableAttributes<T>> createEmbedded()
   {
      return new EmbeddedImpl<EmbeddableAttributes<T>>(this, "embedded", childNode);
   }

   /**
    * Returns all <code>embedded</code> elements
    * @return list of <code>embedded</code> 
    */
   public List<Embedded<EmbeddableAttributes<T>>> getAllEmbedded()
   {
      List<Embedded<EmbeddableAttributes<T>>> list = new ArrayList<Embedded<EmbeddableAttributes<T>>>();
      List<Node> nodeList = childNode.get("embedded");
      for(Node node: nodeList)
      {
         Embedded<EmbeddableAttributes<T>>  type = new EmbeddedImpl<EmbeddableAttributes<T>>(this, "embedded", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>embedded</code> elements 
    * @return the current instance of <code>Embedded<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllEmbedded()
   {
      childNode.removeChildren("embedded");
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
