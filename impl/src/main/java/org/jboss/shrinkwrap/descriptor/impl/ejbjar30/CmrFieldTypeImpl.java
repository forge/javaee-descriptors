package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.CmrFieldType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.CmrFieldTypeType;

/**
 * This class implements the <code> cmr-fieldType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CmrFieldTypeImpl<T> implements Child<T>, CmrFieldType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CmrFieldTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CmrFieldTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> description(String ... values)
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
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:token ElementType : cmr-field-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cmr-field-name</code> element
    * @param cmrFieldName the value for the element <code>cmr-field-name</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldName(String cmrFieldName)
   {
      childNode.getOrCreate("cmr-field-name").text(cmrFieldName);
      return this;
   }

   /**
    * Returns the <code>cmr-field-name</code> element
    * @return the node defined for the element <code>cmr-field-name</code> 
    */
   public String getCmrFieldName()
   {
      return childNode.getTextValueForPatternName("cmr-field-name");
   }

   /**
    * Removes the <code>cmr-field-name</code> element 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeCmrFieldName()
   {
      childNode.removeChildren("cmr-field-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: javaee:cmr-field-typeType ElementType : cmr-field-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>cmr-field-type</code> element
    * @param cmrFieldType the value for the element <code>cmr-field-type</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldType(CmrFieldTypeType cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }
   /**
    * Sets the <code>cmr-field-type</code> element
    * @param cmrFieldType the value for the element <code>cmr-field-type</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldType(String cmrFieldType)
   {
      childNode.getOrCreate("cmr-field-type").text(cmrFieldType);
      return this;
   }

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the value found for the element <code>cmr-field-type</code> 
    */
   public CmrFieldTypeType getCmrFieldType()
   {
      return CmrFieldTypeType.getFromStringValue(childNode.getTextValueForPatternName("cmr-field-type"));
   }

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the value found for the element <code>cmr-field-type</code> 
    */
   public String  getCmrFieldTypeAsString()
   {
      return childNode.getTextValueForPatternName("cmr-field-type");
   }

   /**
    * Removes the <code>cmr-field-type</code> attribute 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeCmrFieldType()
   {
      childNode.removeAttribute("cmr-field-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> id(String id)
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
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
