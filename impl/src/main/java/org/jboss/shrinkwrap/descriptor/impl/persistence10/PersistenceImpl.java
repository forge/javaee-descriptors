package org.jboss.shrinkwrap.descriptor.impl.persistence10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence10.Persistence;
import org.jboss.shrinkwrap.descriptor.api.persistence10.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> persistence </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceImpl<T> implements Child<T>, Persistence<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PersistenceImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Persistence ElementName: persistence:persistence-unit ElementType : persistence-unit
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<Persistence<T>> getOrCreatePersistenceUnit()
   {
      List<Node> nodeList = childNode.get("persistence-unit");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitImpl<Persistence<T>>(this, "persistence-unit", childNode, nodeList.get(0));
      }
      return createPersistenceUnit();
   }

   /**
    * Creates a new <code>persistence-unit</code> element 
    * @return the new created instance of <code>PersistenceUnit<Persistence<T>></code> 
    */
   public PersistenceUnit<Persistence<T>> createPersistenceUnit()
   {
      return new PersistenceUnitImpl<Persistence<T>>(this, "persistence-unit", childNode);
   }

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<Persistence<T>>> getAllPersistenceUnit()
   {
      List<PersistenceUnit<Persistence<T>>> list = new ArrayList<PersistenceUnit<Persistence<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit");
      for(Node node: nodeList)
      {
         PersistenceUnit<Persistence<T>>  type = new PersistenceUnitImpl<Persistence<T>>(this, "persistence-unit", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of <code>PersistenceUnit<Persistence<T>></code> 
    */
   public Persistence<T> removeAllPersistenceUnit()
   {
      childNode.removeChildren("persistence-unit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Persistence ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Persistence<T></code> 
    */
   public Persistence<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Persistence<T></code> 
    */
   public Persistence<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
