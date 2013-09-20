package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.VariableType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.VariableScopeType;

/**
 * This class implements the <code> variableType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class VariableTypeImpl<T> implements Child<T>, VariableType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public VariableTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public VariableTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> description(String ... values)
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
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : name-given
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name-given</code> element
    * @param nameGiven the value for the element <code>name-given</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> nameGiven(String nameGiven)
   {
      childNode.getOrCreate("name-given").text(nameGiven);
      return this;
   }

   /**
    * Returns the <code>name-given</code> element
    * @return the node defined for the element <code>name-given</code> 
    */
   public String getNameGiven()
   {
      return childNode.getTextValueForPatternName("name-given");
   }

   /**
    * Removes the <code>name-given</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeNameGiven()
   {
      childNode.removeChildren("name-given");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : name-from-attribute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name-from-attribute</code> element
    * @param nameFromAttribute the value for the element <code>name-from-attribute</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> nameFromAttribute(String nameFromAttribute)
   {
      childNode.getOrCreate("name-from-attribute").text(nameFromAttribute);
      return this;
   }

   /**
    * Returns the <code>name-from-attribute</code> element
    * @return the node defined for the element <code>name-from-attribute</code> 
    */
   public String getNameFromAttribute()
   {
      return childNode.getTextValueForPatternName("name-from-attribute");
   }

   /**
    * Removes the <code>name-from-attribute</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeNameFromAttribute()
   {
      childNode.removeChildren("name-from-attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : variable-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>variable-class</code> element
    * @param variableClass the value for the element <code>variable-class</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> variableClass(String variableClass)
   {
      childNode.getOrCreate("variable-class").text(variableClass);
      return this;
   }

   /**
    * Returns the <code>variable-class</code> element
    * @return the node defined for the element <code>variable-class</code> 
    */
   public String getVariableClass()
   {
      return childNode.getTextValueForPatternName("variable-class");
   }

   /**
    * Removes the <code>variable-class</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeVariableClass()
   {
      childNode.removeChildren("variable-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: javaee:generic-booleanType ElementType : declare
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>declare</code> element
    * @param declare the value for the element <code>declare</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> declare(GenericBooleanType declare)
   {
      childNode.getOrCreate("declare").text(declare);
      return this;
   }
   /**
    * Sets the <code>declare</code> element
    * @param declare the value for the element <code>declare</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> declare(String declare)
   {
      childNode.getOrCreate("declare").text(declare);
      return this;
   }

   /**
    * Returns the <code>declare</code> element
    * @return the value found for the element <code>declare</code> 
    */
   public GenericBooleanType getDeclare()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("declare"));
   }

   /**
    * Returns the <code>declare</code> element
    * @return the value found for the element <code>declare</code> 
    */
   public String  getDeclareAsString()
   {
      return childNode.getTextValueForPatternName("declare");
   }

   /**
    * Removes the <code>declare</code> attribute 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeDeclare()
   {
      childNode.removeAttribute("declare");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: javaee:variable-scopeType ElementType : scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>scope</code> element
    * @param scope the value for the element <code>scope</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> scope(VariableScopeType scope)
   {
      childNode.getOrCreate("scope").text(scope);
      return this;
   }
   /**
    * Sets the <code>scope</code> element
    * @param scope the value for the element <code>scope</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> scope(String scope)
   {
      childNode.getOrCreate("scope").text(scope);
      return this;
   }

   /**
    * Returns the <code>scope</code> element
    * @return the value found for the element <code>scope</code> 
    */
   public VariableScopeType getScope()
   {
      return VariableScopeType.getFromStringValue(childNode.getTextValueForPatternName("scope"));
   }

   /**
    * Returns the <code>scope</code> element
    * @return the value found for the element <code>scope</code> 
    */
   public String  getScopeAsString()
   {
      return childNode.getTextValueForPatternName("scope");
   }

   /**
    * Removes the <code>scope</code> attribute 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeScope()
   {
      childNode.removeAttribute("scope");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> id(String id)
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
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
