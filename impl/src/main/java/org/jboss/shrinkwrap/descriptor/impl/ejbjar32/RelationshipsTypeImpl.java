package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.RelationshipsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.EjbRelationTypeImpl;

/**
 * This class implements the <code> relationshipsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class RelationshipsTypeImpl<T> implements Child<T>, RelationshipsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RelationshipsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RelationshipsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: javaee:ejb-relationType ElementType : ejb-relation
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relation</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-relation</code> element will be returned.
    * @return the instance defined for the element <code>ejb-relation</code> 
    */
   public EjbRelationType<RelationshipsType<T>> getOrCreateEjbRelation()
   {
      List<Node> nodeList = childNode.get("ejb-relation");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRelationTypeImpl<RelationshipsType<T>>(this, "ejb-relation", childNode, nodeList.get(0));
      }
      return createEjbRelation();
   }

   /**
    * Creates a new <code>ejb-relation</code> element 
    * @return the new created instance of <code>EjbRelationType<RelationshipsType<T>></code> 
    */
   public EjbRelationType<RelationshipsType<T>> createEjbRelation()
   {
      return new EjbRelationTypeImpl<RelationshipsType<T>>(this, "ejb-relation", childNode);
   }

   /**
    * Returns all <code>ejb-relation</code> elements
    * @return list of <code>ejb-relation</code> 
    */
   public List<EjbRelationType<RelationshipsType<T>>> getAllEjbRelation()
   {
      List<EjbRelationType<RelationshipsType<T>>> list = new ArrayList<EjbRelationType<RelationshipsType<T>>>();
      List<Node> nodeList = childNode.get("ejb-relation");
      for(Node node: nodeList)
      {
         EjbRelationType<RelationshipsType<T>>  type = new EjbRelationTypeImpl<RelationshipsType<T>>(this, "ejb-relation", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-relation</code> elements 
    * @return the current instance of <code>EjbRelationType<RelationshipsType<T>></code> 
    */
   public RelationshipsType<T> removeAllEjbRelation()
   {
      childNode.removeChildren("ejb-relation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> id(String id)
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
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
