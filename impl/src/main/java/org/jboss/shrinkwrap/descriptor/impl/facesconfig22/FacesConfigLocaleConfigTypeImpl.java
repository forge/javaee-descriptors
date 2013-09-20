package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigLocaleConfigType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-locale-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigLocaleConfigTypeImpl<T> implements Child<T>, FacesConfigLocaleConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigLocaleConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigLocaleConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: xsd:string ElementType : default-locale
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-locale</code> element
    * @param defaultLocale the value for the element <code>default-locale</code> 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> defaultLocale(String defaultLocale)
   {
      childNode.getOrCreate("default-locale").text(defaultLocale);
      return this;
   }

   /**
    * Returns the <code>default-locale</code> element
    * @return the node defined for the element <code>default-locale</code> 
    */
   public String getDefaultLocale()
   {
      return childNode.getTextValueForPatternName("default-locale");
   }

   /**
    * Removes the <code>default-locale</code> element 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeDefaultLocale()
   {
      childNode.removeChildren("default-locale");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: javaee:faces-config-localeType ElementType : supported-locale
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-locale</code> elements, 
    * a new <code>supported-locale</code> element 
    * @param values list of <code>supported-locale</code> objects 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> supportedLocale(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("supported-locale").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>supported-locale</code> elements
    * @return list of <code>supported-locale</code> 
    */
public List<String> getAllSupportedLocale()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("supported-locale");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>supported-locale</code> element 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeAllSupportedLocale()
   {
      childNode.removeChildren("supported-locale");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
