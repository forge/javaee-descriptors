package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.StoredProcedureParameter;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.ParameterMode;

/**
 * This class implements the <code> stored-procedure-parameter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class StoredProcedureParameterImpl<T> implements Child<T>, StoredProcedureParameter<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public StoredProcedureParameterImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public StoredProcedureParameterImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> description(String description)
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
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> name(String name)
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
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> clazz(String clazz)
   {
      childNode.attribute("class", clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
      public String getClazz()
   {
      return childNode.getAttribute("class");
   }

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: orm:parameter-mode ElementType : mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mode</code> attribute
    * @param mode the value for the attribute <code>mode</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> mode(ParameterMode mode)
   {
      childNode.attribute("mode", mode);
      return this;
   }

   /**
    * Sets the <code>mode</code> attribute
    * @param mode the value for the attribute <code>mode</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> mode(String mode)
   {
      childNode.attribute("mode", mode);
      return this;
   }

   /**
    * Returns the <code>mode</code> attribute
    * @return the value defined for the attribute <code>mode</code> 
    */
   public ParameterMode getMode()
   {
      return ParameterMode.getFromStringValue(childNode.getAttribute("mode"));
   }

   /**
    * Returns the <code>mode</code> attribute
    * @return the value found for the element <code>mode</code> 
    */
   public String  getModeAsString()
   {
      return childNode.getAttribute("mode");
   }

   /**
    * Removes the <code>mode</code> attribute 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeMode()
   {
      childNode.removeAttribute("mode");
      return this;
   }
}
