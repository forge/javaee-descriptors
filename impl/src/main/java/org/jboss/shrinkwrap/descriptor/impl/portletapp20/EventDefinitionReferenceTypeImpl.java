package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionReferenceType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> event-definition-referenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EventDefinitionReferenceTypeImpl<T> implements Child<T>, EventDefinitionReferenceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EventDefinitionReferenceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EventDefinitionReferenceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: xsd:QName ElementType : qname
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>qname</code> element
    * @param qname the value for the element <code>qname</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> qname(String qname)
   {
      childNode.getOrCreate("qname").text(qname);
      return this;
   }

   /**
    * Returns the <code>qname</code> element
    * @return the node defined for the element <code>qname</code> 
    */
   public String getQname()
   {
      return childNode.getTextValueForPatternName("qname");
   }

   /**
    * Removes the <code>qname</code> element 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeQname()
   {
      childNode.removeChildren("qname");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: xsd:NCName ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> id(String id)
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
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
