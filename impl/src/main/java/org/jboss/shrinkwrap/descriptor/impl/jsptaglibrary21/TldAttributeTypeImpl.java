package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldAttributeType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldDeferredValueType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21.TldDeferredValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldDeferredMethodType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21.TldDeferredMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.GenericBooleanType;

/**
 * This class implements the <code> tld-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TldAttributeTypeImpl<T> implements Child<T>, TldAttributeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TldAttributeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TldAttributeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> description(String ... values)
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
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> name(String name)
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
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: javaee:generic-booleanType ElementType : required
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> required(GenericBooleanType required)
   {
      childNode.getOrCreate("required").text(required);
      return this;
   }
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> required(String required)
   {
      childNode.getOrCreate("required").text(required);
      return this;
   }

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public GenericBooleanType getRequired()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("required"));
   }

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public String  getRequiredAsString()
   {
      return childNode.getTextValueForPatternName("required");
   }

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeRequired()
   {
      childNode.removeAttribute("required");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: javaee:generic-booleanType ElementType : rtexprvalue
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>rtexprvalue</code> element
    * @param rtexprvalue the value for the element <code>rtexprvalue</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> rtexprvalue(GenericBooleanType rtexprvalue)
   {
      childNode.getOrCreate("rtexprvalue").text(rtexprvalue);
      return this;
   }
   /**
    * Sets the <code>rtexprvalue</code> element
    * @param rtexprvalue the value for the element <code>rtexprvalue</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> rtexprvalue(String rtexprvalue)
   {
      childNode.getOrCreate("rtexprvalue").text(rtexprvalue);
      return this;
   }

   /**
    * Returns the <code>rtexprvalue</code> element
    * @return the value found for the element <code>rtexprvalue</code> 
    */
   public GenericBooleanType getRtexprvalue()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("rtexprvalue"));
   }

   /**
    * Returns the <code>rtexprvalue</code> element
    * @return the value found for the element <code>rtexprvalue</code> 
    */
   public String  getRtexprvalueAsString()
   {
      return childNode.getTextValueForPatternName("rtexprvalue");
   }

   /**
    * Removes the <code>rtexprvalue</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeRtexprvalue()
   {
      childNode.removeAttribute("rtexprvalue");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:token ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> element
    * @param type the value for the element <code>type</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> type(String type)
   {
      childNode.getOrCreate("type").text(type);
      return this;
   }

   /**
    * Returns the <code>type</code> element
    * @return the node defined for the element <code>type</code> 
    */
   public String getType()
   {
      return childNode.getTextValueForPatternName("type");
   }

   /**
    * Removes the <code>type</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeType()
   {
      childNode.removeChildren("type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: javaee:tld-deferred-valueType ElementType : deferred-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>deferred-value</code> element with the given value will be created.
    * Otherwise, the existing <code>deferred-value</code> element will be returned.
    * @return  a new or existing instance of <code>TldDeferredValueType<TldAttributeType<T>></code> 
    */
   public TldDeferredValueType<TldAttributeType<T>> getOrCreateDeferredValue()
   {
      Node node = childNode.getOrCreate("deferred-value");
      TldDeferredValueType<TldAttributeType<T>> deferredValue = new TldDeferredValueTypeImpl<TldAttributeType<T>>(this, "deferred-value", childNode, node);
      return deferredValue;
   }

   /**
    * Removes the <code>deferred-value</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeDeferredValue()
   {
      childNode.removeChildren("deferred-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: javaee:tld-deferred-methodType ElementType : deferred-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>deferred-method</code> element with the given value will be created.
    * Otherwise, the existing <code>deferred-method</code> element will be returned.
    * @return  a new or existing instance of <code>TldDeferredMethodType<TldAttributeType<T>></code> 
    */
   public TldDeferredMethodType<TldAttributeType<T>> getOrCreateDeferredMethod()
   {
      Node node = childNode.getOrCreate("deferred-method");
      TldDeferredMethodType<TldAttributeType<T>> deferredMethod = new TldDeferredMethodTypeImpl<TldAttributeType<T>>(this, "deferred-method", childNode, node);
      return deferredMethod;
   }

   /**
    * Removes the <code>deferred-method</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeDeferredMethod()
   {
      childNode.removeChildren("deferred-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: javaee:generic-booleanType ElementType : fragment
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>fragment</code> element
    * @param fragment the value for the element <code>fragment</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> fragment(GenericBooleanType fragment)
   {
      childNode.getOrCreate("fragment").text(fragment);
      return this;
   }
   /**
    * Sets the <code>fragment</code> element
    * @param fragment the value for the element <code>fragment</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> fragment(String fragment)
   {
      childNode.getOrCreate("fragment").text(fragment);
      return this;
   }

   /**
    * Returns the <code>fragment</code> element
    * @return the value found for the element <code>fragment</code> 
    */
   public GenericBooleanType getFragment()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("fragment"));
   }

   /**
    * Returns the <code>fragment</code> element
    * @return the value found for the element <code>fragment</code> 
    */
   public String  getFragmentAsString()
   {
      return childNode.getTextValueForPatternName("fragment");
   }

   /**
    * Removes the <code>fragment</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeFragment()
   {
      childNode.removeAttribute("fragment");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> id(String id)
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
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
