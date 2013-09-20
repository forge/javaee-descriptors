package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.InitParamType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> filterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FilterTypeImpl<T> implements Child<T>, FilterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FilterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FilterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> description(String ... values)
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
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: string ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("display-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: portlet:string ElementType : filter-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-name</code> element
    * @param filterName the value for the element <code>filter-name</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> filterName(String filterName)
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
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeFilterName()
   {
      childNode.removeChildren("filter-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: string ElementType : filter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-class</code> element
    * @param filterClass the value for the element <code>filter-class</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> filterClass(String filterClass)
   {
      childNode.getOrCreate("filter-class").text(filterClass);
      return this;
   }

   /**
    * Returns the <code>filter-class</code> element
    * @return the node defined for the element <code>filter-class</code> 
    */
   public String getFilterClass()
   {
      return childNode.getTextValueForPatternName("filter-class");
   }

   /**
    * Removes the <code>filter-class</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeFilterClass()
   {
      childNode.removeChildren("filter-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: string ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>lifecycle</code> elements, 
    * a new <code>lifecycle</code> element 
    * @param values list of <code>lifecycle</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> lifecycle(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("lifecycle").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
public List<String> getAllLifecycle()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("lifecycle");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>lifecycle</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllLifecycle()
   {
      childNode.removeChildren("lifecycle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: portlet:init-paramType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public InitParamType<FilterType<T>> getOrCreateInitParam()
   {
      List<Node> nodeList = childNode.get("init-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InitParamTypeImpl<FilterType<T>>(this, "init-param", childNode, nodeList.get(0));
      }
      return createInitParam();
   }

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>InitParamType<FilterType<T>></code> 
    */
   public InitParamType<FilterType<T>> createInitParam()
   {
      return new InitParamTypeImpl<FilterType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<InitParamType<FilterType<T>>> getAllInitParam()
   {
      List<InitParamType<FilterType<T>>> list = new ArrayList<InitParamType<FilterType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for(Node node: nodeList)
      {
         InitParamType<FilterType<T>>  type = new InitParamTypeImpl<FilterType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>InitParamType<FilterType<T>></code> 
    */
   public FilterType<T> removeAllInitParam()
   {
      childNode.removeChildren("init-param");
      return this;
   }
}
