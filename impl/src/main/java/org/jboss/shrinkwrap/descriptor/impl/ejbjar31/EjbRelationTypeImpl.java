package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.EjbRelationshipRoleTypeImpl;

/**
 * This class implements the <code> ejb-relationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbRelationTypeImpl<T> implements Child<T>, EjbRelationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbRelationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EjbRelationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> description(String ... values)
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
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:token ElementType : ejb-relation-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-relation-name</code> element
    * @param ejbRelationName the value for the element <code>ejb-relation-name</code> 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> ejbRelationName(String ejbRelationName)
   {
      childNode.getOrCreate("ejb-relation-name").text(ejbRelationName);
      return this;
   }

   /**
    * Returns the <code>ejb-relation-name</code> element
    * @return the node defined for the element <code>ejb-relation-name</code> 
    */
   public String getEjbRelationName()
   {
      return childNode.getTextValueForPatternName("ejb-relation-name");
   }

   /**
    * Removes the <code>ejb-relation-name</code> element 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeEjbRelationName()
   {
      childNode.removeChildren("ejb-relation-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: javaee:ejb-relationship-roleType ElementType : ejb-relationship-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relationship-role</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-relationship-role</code> element will be returned.
    * @return the instance defined for the element <code>ejb-relationship-role</code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> getOrCreateEjbRelationshipRole()
   {
      List<Node> nodeList = childNode.get("ejb-relationship-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(this, "ejb-relationship-role", childNode, nodeList.get(0));
      }
      return createEjbRelationshipRole();
   }

   /**
    * Creates a new <code>ejb-relationship-role</code> element 
    * @return the new created instance of <code>EjbRelationshipRoleType<EjbRelationType<T>></code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> createEjbRelationshipRole()
   {
      return new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(this, "ejb-relationship-role", childNode);
   }

   /**
    * Returns all <code>ejb-relationship-role</code> elements
    * @return list of <code>ejb-relationship-role</code> 
    */
   public List<EjbRelationshipRoleType<EjbRelationType<T>>> getAllEjbRelationshipRole()
   {
      List<EjbRelationshipRoleType<EjbRelationType<T>>> list = new ArrayList<EjbRelationshipRoleType<EjbRelationType<T>>>();
      List<Node> nodeList = childNode.get("ejb-relationship-role");
      for(Node node: nodeList)
      {
         EjbRelationshipRoleType<EjbRelationType<T>>  type = new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(this, "ejb-relationship-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-relationship-role</code> elements 
    * @return the current instance of <code>EjbRelationshipRoleType<EjbRelationType<T>></code> 
    */
   public EjbRelationType<T> removeAllEjbRelationshipRole()
   {
      childNode.removeChildren("ejb-relationship-role");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> id(String id)
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
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
