package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.Attributes;
import org.jboss.shrinkwrap.descriptor.api.orm21.Basic;
import org.jboss.shrinkwrap.descriptor.api.orm21.ElementCollection;
import org.jboss.shrinkwrap.descriptor.api.orm21.Embedded;
import org.jboss.shrinkwrap.descriptor.api.orm21.EmbeddedId;
import org.jboss.shrinkwrap.descriptor.api.orm21.Id;
import org.jboss.shrinkwrap.descriptor.api.orm21.ManyToMany;
import org.jboss.shrinkwrap.descriptor.api.orm21.ManyToOne;
import org.jboss.shrinkwrap.descriptor.api.orm21.OneToMany;
import org.jboss.shrinkwrap.descriptor.api.orm21.OneToOne;
import org.jboss.shrinkwrap.descriptor.api.orm21.Transient;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> attributes </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AttributesImpl<T> implements Child<T>, Attributes<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AttributesImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AttributesImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:id ElementType : id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id</code> element will be created and returned.
    * Otherwise, the first existing <code>id</code> element will be returned.
    * @return the instance defined for the element <code>id</code> 
    */
   public Id<Attributes<T>> getOrCreateId()
   {
      List<Node> nodeList = childNode.get("id");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IdImpl<Attributes<T>>(this, "id", childNode, nodeList.get(0));
      }
      return createId();
   }

   /**
    * Creates a new <code>id</code> element 
    * @return the new created instance of <code>Id<Attributes<T>></code> 
    */
   public Id<Attributes<T>> createId()
   {
      return new IdImpl<Attributes<T>>(this, "id", childNode);
   }

   /**
    * Returns all <code>id</code> elements
    * @return list of <code>id</code> 
    */
   public List<Id<Attributes<T>>> getAllId()
   {
      List<Id<Attributes<T>>> list = new ArrayList<Id<Attributes<T>>>();
      List<Node> nodeList = childNode.get("id");
      for(Node node: nodeList)
      {
         Id<Attributes<T>>  type = new IdImpl<Attributes<T>>(this, "id", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>id</code> elements 
    * @return the current instance of <code>Id<Attributes<T>></code> 
    */
   public Attributes<T> removeAllId()
   {
      childNode.removeChildren("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:embedded-id ElementType : embedded-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded-id</code> element with the given value will be created.
    * Otherwise, the existing <code>embedded-id</code> element will be returned.
    * @return  a new or existing instance of <code>EmbeddedId<Attributes<T>></code> 
    */
   public EmbeddedId<Attributes<T>> getOrCreateEmbeddedId()
   {
      Node node = childNode.getOrCreate("embedded-id");
      EmbeddedId<Attributes<T>> embeddedId = new EmbeddedIdImpl<Attributes<T>>(this, "embedded-id", childNode, node);
      return embeddedId;
   }

   /**
    * Removes the <code>embedded-id</code> element 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> removeEmbeddedId()
   {
      childNode.removeChildren("embedded-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:basic ElementType : basic
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>basic</code> element will be created and returned.
    * Otherwise, the first existing <code>basic</code> element will be returned.
    * @return the instance defined for the element <code>basic</code> 
    */
   public Basic<Attributes<T>> getOrCreateBasic()
   {
      List<Node> nodeList = childNode.get("basic");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BasicImpl<Attributes<T>>(this, "basic", childNode, nodeList.get(0));
      }
      return createBasic();
   }

   /**
    * Creates a new <code>basic</code> element 
    * @return the new created instance of <code>Basic<Attributes<T>></code> 
    */
   public Basic<Attributes<T>> createBasic()
   {
      return new BasicImpl<Attributes<T>>(this, "basic", childNode);
   }

   /**
    * Returns all <code>basic</code> elements
    * @return list of <code>basic</code> 
    */
   public List<Basic<Attributes<T>>> getAllBasic()
   {
      List<Basic<Attributes<T>>> list = new ArrayList<Basic<Attributes<T>>>();
      List<Node> nodeList = childNode.get("basic");
      for(Node node: nodeList)
      {
         Basic<Attributes<T>>  type = new BasicImpl<Attributes<T>>(this, "basic", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>basic</code> elements 
    * @return the current instance of <code>Basic<Attributes<T>></code> 
    */
   public Attributes<T> removeAllBasic()
   {
      childNode.removeChildren("basic");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:version ElementType : version
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>version</code> elements, 
    * a new <code>version</code> element 
    * @param values list of <code>version</code> objects 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> version(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("version").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>version</code> elements
    * @return list of <code>version</code> 
    */
public List<String> getAllVersion()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("version");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> removeAllVersion()
   {
      childNode.removeChildren("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:many-to-one ElementType : many-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-one</code> element will be returned.
    * @return the instance defined for the element <code>many-to-one</code> 
    */
   public ManyToOne<Attributes<T>> getOrCreateManyToOne()
   {
      List<Node> nodeList = childNode.get("many-to-one");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ManyToOneImpl<Attributes<T>>(this, "many-to-one", childNode, nodeList.get(0));
      }
      return createManyToOne();
   }

   /**
    * Creates a new <code>many-to-one</code> element 
    * @return the new created instance of <code>ManyToOne<Attributes<T>></code> 
    */
   public ManyToOne<Attributes<T>> createManyToOne()
   {
      return new ManyToOneImpl<Attributes<T>>(this, "many-to-one", childNode);
   }

   /**
    * Returns all <code>many-to-one</code> elements
    * @return list of <code>many-to-one</code> 
    */
   public List<ManyToOne<Attributes<T>>> getAllManyToOne()
   {
      List<ManyToOne<Attributes<T>>> list = new ArrayList<ManyToOne<Attributes<T>>>();
      List<Node> nodeList = childNode.get("many-to-one");
      for(Node node: nodeList)
      {
         ManyToOne<Attributes<T>>  type = new ManyToOneImpl<Attributes<T>>(this, "many-to-one", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>many-to-one</code> elements 
    * @return the current instance of <code>ManyToOne<Attributes<T>></code> 
    */
   public Attributes<T> removeAllManyToOne()
   {
      childNode.removeChildren("many-to-one");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:one-to-many ElementType : one-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-many</code> element will be returned.
    * @return the instance defined for the element <code>one-to-many</code> 
    */
   public OneToMany<Attributes<T>> getOrCreateOneToMany()
   {
      List<Node> nodeList = childNode.get("one-to-many");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OneToManyImpl<Attributes<T>>(this, "one-to-many", childNode, nodeList.get(0));
      }
      return createOneToMany();
   }

   /**
    * Creates a new <code>one-to-many</code> element 
    * @return the new created instance of <code>OneToMany<Attributes<T>></code> 
    */
   public OneToMany<Attributes<T>> createOneToMany()
   {
      return new OneToManyImpl<Attributes<T>>(this, "one-to-many", childNode);
   }

   /**
    * Returns all <code>one-to-many</code> elements
    * @return list of <code>one-to-many</code> 
    */
   public List<OneToMany<Attributes<T>>> getAllOneToMany()
   {
      List<OneToMany<Attributes<T>>> list = new ArrayList<OneToMany<Attributes<T>>>();
      List<Node> nodeList = childNode.get("one-to-many");
      for(Node node: nodeList)
      {
         OneToMany<Attributes<T>>  type = new OneToManyImpl<Attributes<T>>(this, "one-to-many", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>one-to-many</code> elements 
    * @return the current instance of <code>OneToMany<Attributes<T>></code> 
    */
   public Attributes<T> removeAllOneToMany()
   {
      childNode.removeChildren("one-to-many");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:one-to-one ElementType : one-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-one</code> element will be returned.
    * @return the instance defined for the element <code>one-to-one</code> 
    */
   public OneToOne<Attributes<T>> getOrCreateOneToOne()
   {
      List<Node> nodeList = childNode.get("one-to-one");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OneToOneImpl<Attributes<T>>(this, "one-to-one", childNode, nodeList.get(0));
      }
      return createOneToOne();
   }

   /**
    * Creates a new <code>one-to-one</code> element 
    * @return the new created instance of <code>OneToOne<Attributes<T>></code> 
    */
   public OneToOne<Attributes<T>> createOneToOne()
   {
      return new OneToOneImpl<Attributes<T>>(this, "one-to-one", childNode);
   }

   /**
    * Returns all <code>one-to-one</code> elements
    * @return list of <code>one-to-one</code> 
    */
   public List<OneToOne<Attributes<T>>> getAllOneToOne()
   {
      List<OneToOne<Attributes<T>>> list = new ArrayList<OneToOne<Attributes<T>>>();
      List<Node> nodeList = childNode.get("one-to-one");
      for(Node node: nodeList)
      {
         OneToOne<Attributes<T>>  type = new OneToOneImpl<Attributes<T>>(this, "one-to-one", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>one-to-one</code> elements 
    * @return the current instance of <code>OneToOne<Attributes<T>></code> 
    */
   public Attributes<T> removeAllOneToOne()
   {
      childNode.removeChildren("one-to-one");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:many-to-many ElementType : many-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-many</code> element will be returned.
    * @return the instance defined for the element <code>many-to-many</code> 
    */
   public ManyToMany<Attributes<T>> getOrCreateManyToMany()
   {
      List<Node> nodeList = childNode.get("many-to-many");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ManyToManyImpl<Attributes<T>>(this, "many-to-many", childNode, nodeList.get(0));
      }
      return createManyToMany();
   }

   /**
    * Creates a new <code>many-to-many</code> element 
    * @return the new created instance of <code>ManyToMany<Attributes<T>></code> 
    */
   public ManyToMany<Attributes<T>> createManyToMany()
   {
      return new ManyToManyImpl<Attributes<T>>(this, "many-to-many", childNode);
   }

   /**
    * Returns all <code>many-to-many</code> elements
    * @return list of <code>many-to-many</code> 
    */
   public List<ManyToMany<Attributes<T>>> getAllManyToMany()
   {
      List<ManyToMany<Attributes<T>>> list = new ArrayList<ManyToMany<Attributes<T>>>();
      List<Node> nodeList = childNode.get("many-to-many");
      for(Node node: nodeList)
      {
         ManyToMany<Attributes<T>>  type = new ManyToManyImpl<Attributes<T>>(this, "many-to-many", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>many-to-many</code> elements 
    * @return the current instance of <code>ManyToMany<Attributes<T>></code> 
    */
   public Attributes<T> removeAllManyToMany()
   {
      childNode.removeChildren("many-to-many");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:element-collection ElementType : element-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>element-collection</code> element will be returned.
    * @return the instance defined for the element <code>element-collection</code> 
    */
   public ElementCollection<Attributes<T>> getOrCreateElementCollection()
   {
      List<Node> nodeList = childNode.get("element-collection");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ElementCollectionImpl<Attributes<T>>(this, "element-collection", childNode, nodeList.get(0));
      }
      return createElementCollection();
   }

   /**
    * Creates a new <code>element-collection</code> element 
    * @return the new created instance of <code>ElementCollection<Attributes<T>></code> 
    */
   public ElementCollection<Attributes<T>> createElementCollection()
   {
      return new ElementCollectionImpl<Attributes<T>>(this, "element-collection", childNode);
   }

   /**
    * Returns all <code>element-collection</code> elements
    * @return list of <code>element-collection</code> 
    */
   public List<ElementCollection<Attributes<T>>> getAllElementCollection()
   {
      List<ElementCollection<Attributes<T>>> list = new ArrayList<ElementCollection<Attributes<T>>>();
      List<Node> nodeList = childNode.get("element-collection");
      for(Node node: nodeList)
      {
         ElementCollection<Attributes<T>>  type = new ElementCollectionImpl<Attributes<T>>(this, "element-collection", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>element-collection</code> elements 
    * @return the current instance of <code>ElementCollection<Attributes<T>></code> 
    */
   public Attributes<T> removeAllElementCollection()
   {
      childNode.removeChildren("element-collection");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:embedded ElementType : embedded
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded</code> element will be created and returned.
    * Otherwise, the first existing <code>embedded</code> element will be returned.
    * @return the instance defined for the element <code>embedded</code> 
    */
   public Embedded<Attributes<T>> getOrCreateEmbedded()
   {
      List<Node> nodeList = childNode.get("embedded");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EmbeddedImpl<Attributes<T>>(this, "embedded", childNode, nodeList.get(0));
      }
      return createEmbedded();
   }

   /**
    * Creates a new <code>embedded</code> element 
    * @return the new created instance of <code>Embedded<Attributes<T>></code> 
    */
   public Embedded<Attributes<T>> createEmbedded()
   {
      return new EmbeddedImpl<Attributes<T>>(this, "embedded", childNode);
   }

   /**
    * Returns all <code>embedded</code> elements
    * @return list of <code>embedded</code> 
    */
   public List<Embedded<Attributes<T>>> getAllEmbedded()
   {
      List<Embedded<Attributes<T>>> list = new ArrayList<Embedded<Attributes<T>>>();
      List<Node> nodeList = childNode.get("embedded");
      for(Node node: nodeList)
      {
         Embedded<Attributes<T>>  type = new EmbeddedImpl<Attributes<T>>(this, "embedded", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>embedded</code> elements 
    * @return the current instance of <code>Embedded<Attributes<T>></code> 
    */
   public Attributes<T> removeAllEmbedded()
   {
      childNode.removeChildren("embedded");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:transient ElementType : transient
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transient</code> element will be created and returned.
    * Otherwise, the first existing <code>transient</code> element will be returned.
    * @return the instance defined for the element <code>transient</code> 
    */
   public Transient<Attributes<T>> getOrCreateTransient()
   {
      List<Node> nodeList = childNode.get("transient");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TransientImpl<Attributes<T>>(this, "transient", childNode, nodeList.get(0));
      }
      return createTransient();
   }

   /**
    * Creates a new <code>transient</code> element 
    * @return the new created instance of <code>Transient<Attributes<T>></code> 
    */
   public Transient<Attributes<T>> createTransient()
   {
      return new TransientImpl<Attributes<T>>(this, "transient", childNode);
   }

   /**
    * Returns all <code>transient</code> elements
    * @return list of <code>transient</code> 
    */
   public List<Transient<Attributes<T>>> getAllTransient()
   {
      List<Transient<Attributes<T>>> list = new ArrayList<Transient<Attributes<T>>>();
      List<Node> nodeList = childNode.get("transient");
      for(Node node: nodeList)
      {
         Transient<Attributes<T>>  type = new TransientImpl<Attributes<T>>(this, "transient", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>transient</code> elements 
    * @return the current instance of <code>Transient<Attributes<T>></code> 
    */
   public Attributes<T> removeAllTransient()
   {
      childNode.removeChildren("transient");
      return this;
   }
}
