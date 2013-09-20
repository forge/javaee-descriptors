package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.api.orm10.JoinColumn;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> association-override </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AssociationOverrideImpl<T> implements Child<T>, AssociationOverride<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AssociationOverrideImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AssociationOverrideImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssociationOverride ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<AssociationOverride<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<AssociationOverride<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<AssociationOverride<T>></code> 
    */
   public JoinColumn<AssociationOverride<T>> createJoinColumn()
   {
      return new JoinColumnImpl<AssociationOverride<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<AssociationOverride<T>>> getAllJoinColumn()
   {
      List<JoinColumn<AssociationOverride<T>>> list = new ArrayList<JoinColumn<AssociationOverride<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<AssociationOverride<T>>  type = new JoinColumnImpl<AssociationOverride<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<AssociationOverride<T>></code> 
    */
   public AssociationOverride<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssociationOverride ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>AssociationOverride<T></code> 
    */
   public AssociationOverride<T> name(String name)
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
    * @return the current instance of <code>AssociationOverride<T></code> 
    */
   public AssociationOverride<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
