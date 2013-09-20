package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PreferenceType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ReadOnlyType;

/**
 * This class implements the <code> preferenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PreferenceTypeImpl<T> implements Child<T>, PreferenceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PreferenceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PreferenceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> name(String name)
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
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> value(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("value").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
public List<String> getAllValue()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("value");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeAllValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: portlet:read-onlyType ElementType : read-only
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>read-only</code> element
    * @param readOnly the value for the element <code>read-only</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> readOnly(ReadOnlyType readOnly)
   {
      childNode.getOrCreate("read-only").text(readOnly);
      return this;
   }
   /**
    * Sets the <code>read-only</code> element
    * @param readOnly the value for the element <code>read-only</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> readOnly(String readOnly)
   {
      childNode.getOrCreate("read-only").text(readOnly);
      return this;
   }

   /**
    * Returns the <code>read-only</code> element
    * @return the value found for the element <code>read-only</code> 
    */
   public ReadOnlyType getReadOnly()
   {
      return ReadOnlyType.getFromStringValue(childNode.getTextValueForPatternName("read-only"));
   }

   /**
    * Returns the <code>read-only</code> element
    * @return the value found for the element <code>read-only</code> 
    */
   public String  getReadOnlyAsString()
   {
      return childNode.getTextValueForPatternName("read-only");
   }

   /**
    * Removes the <code>read-only</code> attribute 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeReadOnly()
   {
      childNode.removeAttribute("read-only");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> id(String id)
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
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
