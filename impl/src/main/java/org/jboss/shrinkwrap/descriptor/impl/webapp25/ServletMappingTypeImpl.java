package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> servlet-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServletMappingTypeImpl<T> implements Child<T>, ServletMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServletMappingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServletMappingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>servlet-name</code> element
    * @param servletName the value for the element <code>servlet-name</code> 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> servletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName()
   {
      return childNode.getTextValueForPatternName("servlet-name");
   }

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeServletName()
   {
      childNode.removeChildren("servlet-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> urlPattern(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("url-pattern").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
public List<String> getAllUrlPattern()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> id(String id)
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
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
