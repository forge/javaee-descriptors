package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.EntityResult;
import org.jboss.shrinkwrap.descriptor.api.orm20.FieldResult;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> entity-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityResultImpl<T> implements Child<T>, EntityResult<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityResultImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityResultImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: orm:field-result ElementType : field-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>field-result</code> element will be created and returned.
    * Otherwise, the first existing <code>field-result</code> element will be returned.
    * @return the instance defined for the element <code>field-result</code> 
    */
   public FieldResult<EntityResult<T>> getOrCreateFieldResult()
   {
      List<Node> nodeList = childNode.get("field-result");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FieldResultImpl<EntityResult<T>>(this, "field-result", childNode, nodeList.get(0));
      }
      return createFieldResult();
   }

   /**
    * Creates a new <code>field-result</code> element 
    * @return the new created instance of <code>FieldResult<EntityResult<T>></code> 
    */
   public FieldResult<EntityResult<T>> createFieldResult()
   {
      return new FieldResultImpl<EntityResult<T>>(this, "field-result", childNode);
   }

   /**
    * Returns all <code>field-result</code> elements
    * @return list of <code>field-result</code> 
    */
   public List<FieldResult<EntityResult<T>>> getAllFieldResult()
   {
      List<FieldResult<EntityResult<T>>> list = new ArrayList<FieldResult<EntityResult<T>>>();
      List<Node> nodeList = childNode.get("field-result");
      for(Node node: nodeList)
      {
         FieldResult<EntityResult<T>>  type = new FieldResultImpl<EntityResult<T>>(this, "field-result", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>field-result</code> elements 
    * @return the current instance of <code>FieldResult<EntityResult<T>></code> 
    */
   public EntityResult<T> removeAllFieldResult()
   {
      childNode.removeChildren("field-result");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: xsd:string ElementType : entity-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>entity-class</code> attribute
    * @param entityClass the value for the attribute <code>entity-class</code> 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> entityClass(String entityClass)
   {
      childNode.attribute("entity-class", entityClass);
      return this;
   }

   /**
    * Returns the <code>entity-class</code> attribute
    * @return the value defined for the attribute <code>entity-class</code> 
    */
      public String getEntityClass()
   {
      return childNode.getAttribute("entity-class");
   }

   /**
    * Removes the <code>entity-class</code> attribute 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> removeEntityClass()
   {
      childNode.removeAttribute("entity-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: xsd:string ElementType : discriminator-column
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-column</code> attribute
    * @param discriminatorColumn the value for the attribute <code>discriminator-column</code> 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> discriminatorColumn(String discriminatorColumn)
   {
      childNode.attribute("discriminator-column", discriminatorColumn);
      return this;
   }

   /**
    * Returns the <code>discriminator-column</code> attribute
    * @return the value defined for the attribute <code>discriminator-column</code> 
    */
      public String getDiscriminatorColumn()
   {
      return childNode.getAttribute("discriminator-column");
   }

   /**
    * Removes the <code>discriminator-column</code> attribute 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> removeDiscriminatorColumn()
   {
      childNode.removeAttribute("discriminator-column");
      return this;
   }
}
