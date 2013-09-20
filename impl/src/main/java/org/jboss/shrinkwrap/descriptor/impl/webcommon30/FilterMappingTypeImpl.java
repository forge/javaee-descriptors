package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.DispatcherType;

/**
 * This class implements the <code> filter-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FilterMappingTypeImpl<T> implements Child<T>, FilterMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FilterMappingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FilterMappingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: javaee:nonEmptyStringType ElementType : filter-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-name</code> element
    * @param filterName the value for the element <code>filter-name</code> 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> filterName(String filterName)
   {
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName()
   {
      return childNode.getTextValueForPatternName("filter-name");
   }

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeFilterName()
   {
      childNode.removeChildren("filter-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> urlPattern(String ... values)
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
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>servlet-name</code> elements, 
    * a new <code>servlet-name</code> element 
    * @param values list of <code>servlet-name</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> servletName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("servlet-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>servlet-name</code> elements
    * @return list of <code>servlet-name</code> 
    */
public List<String> getAllServletName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("servlet-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllServletName()
   {
      childNode.removeChildren("servlet-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: javaee:dispatcherType ElementType : dispatcher
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all javaee:dispatcherType objects representing <code>dispatcher</code> elements, 
    * a new <code>dispatcher</code> element 
    * @param values list of <code>dispatcher</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> dispatcher(DispatcherType ... values)
   {
      if (values != null)
      {
         for(DispatcherType name: values)
         {
            childNode.createChild("dispatcher").text(name);
         }
      }
      return this;
   }

   /**
    * Creates for all String objects representing <code>dispatcher</code> elements, 
    * a new <code>dispatcher</code> element 
    * @param values list of <code>dispatcher</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> dispatcher(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("dispatcher").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>dispatcher</code> elements
    * @return list of <code>dispatcher</code> 
    */
public List<String> getAllDispatcher()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("dispatcher");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>dispatcher</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllDispatcher()
   {
      childNode.removeChildren("dispatcher");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> id(String id)
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
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
