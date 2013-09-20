package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> ejb-relationship-roleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbRelationshipRoleTypeImpl<T> implements Child<T>, EjbRelationshipRoleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> description(String ... values)
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
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:token ElementType : ejb-relationship-role-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-relationship-role-name</code> element
    * @param ejbRelationshipRoleName the value for the element <code>ejb-relationship-role-name</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> ejbRelationshipRoleName(String ejbRelationshipRoleName)
   {
      childNode.getOrCreate("ejb-relationship-role-name").text(ejbRelationshipRoleName);
      return this;
   }

   /**
    * Returns the <code>ejb-relationship-role-name</code> element
    * @return the node defined for the element <code>ejb-relationship-role-name</code> 
    */
   public String getEjbRelationshipRoleName()
   {
      return childNode.getTextValueForPatternName("ejb-relationship-role-name");
   }

   /**
    * Removes the <code>ejb-relationship-role-name</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName()
   {
      childNode.removeChildren("ejb-relationship-role-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:multiplicityType ElementType : multiplicity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>multiplicity</code> element
    * @param multiplicity the value for the element <code>multiplicity</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> multiplicity(MultiplicityType multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }
   /**
    * Sets the <code>multiplicity</code> element
    * @param multiplicity the value for the element <code>multiplicity</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> multiplicity(String multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   /**
    * Returns the <code>multiplicity</code> element
    * @return the value found for the element <code>multiplicity</code> 
    */
   public MultiplicityType getMultiplicity()
   {
      return MultiplicityType.getFromStringValue(childNode.getTextValueForPatternName("multiplicity"));
   }

   /**
    * Returns the <code>multiplicity</code> element
    * @return the value found for the element <code>multiplicity</code> 
    */
   public String  getMultiplicityAsString()
   {
      return childNode.getTextValueForPatternName("multiplicity");
   }

   /**
    * Removes the <code>multiplicity</code> attribute 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeMultiplicity()
   {
      childNode.removeAttribute("multiplicity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:emptyType ElementType : cascade-delete
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> cascadeDelete()
   {
      childNode.getOrCreate("cascade-delete");
      return this;
   }

   /**
    * Removes the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public Boolean isCascadeDelete()
   {
      return childNode.getSingle("cascade-delete") != null;
   }

   /**
    * Removes the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeCascadeDelete()
   {
      childNode.removeChild("cascade-delete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:relationship-role-sourceType ElementType : relationship-role-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationship-role-source</code> element with the given value will be created.
    * Otherwise, the existing <code>relationship-role-source</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipRoleSourceType<EjbRelationshipRoleType<T>></code> 
    */
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> getOrCreateRelationshipRoleSource()
   {
      Node node = childNode.getOrCreate("relationship-role-source");
      RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource = new RelationshipRoleSourceTypeImpl<EjbRelationshipRoleType<T>>(this, "relationship-role-source", childNode, node);
      return relationshipRoleSource;
   }

   /**
    * Removes the <code>relationship-role-source</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeRelationshipRoleSource()
   {
      childNode.removeChildren("relationship-role-source");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:cmr-fieldType ElementType : cmr-field
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmr-field</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field</code> element will be returned.
    * @return  a new or existing instance of <code>CmrFieldType<EjbRelationshipRoleType<T>></code> 
    */
   public CmrFieldType<EjbRelationshipRoleType<T>> getOrCreateCmrField()
   {
      Node node = childNode.getOrCreate("cmr-field");
      CmrFieldType<EjbRelationshipRoleType<T>> cmrField = new CmrFieldTypeImpl<EjbRelationshipRoleType<T>>(this, "cmr-field", childNode, node);
      return cmrField;
   }

   /**
    * Removes the <code>cmr-field</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeCmrField()
   {
      childNode.removeChildren("cmr-field");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> id(String id)
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
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
