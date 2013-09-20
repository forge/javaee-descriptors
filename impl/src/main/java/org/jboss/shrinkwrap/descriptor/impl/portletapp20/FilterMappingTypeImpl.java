package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterMappingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

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
   // ClassName: FilterMappingType ElementName: portlet:string ElementType : filter-name
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
   // ClassName: FilterMappingType ElementName: string ElementType : portlet-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>portlet-name</code> elements, 
    * a new <code>portlet-name</code> element 
    * @param values list of <code>portlet-name</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> portletName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("portlet-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>portlet-name</code> elements
    * @return list of <code>portlet-name</code> 
    */
public List<String> getAllPortletName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("portlet-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>portlet-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllPortletName()
   {
      childNode.removeChildren("portlet-name");
      return this;
   }
}
