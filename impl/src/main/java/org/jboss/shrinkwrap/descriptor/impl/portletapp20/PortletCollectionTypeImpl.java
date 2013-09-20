package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> portlet-collectionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletCollectionTypeImpl<T> implements Child<T>, PortletCollectionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletCollectionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortletCollectionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletCollectionType ElementName: string ElementType : portlet-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>portlet-name</code> elements, 
    * a new <code>portlet-name</code> element 
    * @param values list of <code>portlet-name</code> objects 
    * @return the current instance of <code>PortletCollectionType<T></code> 
    */
   public PortletCollectionType<T> portletName(String ... values)
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
    * @return the current instance of <code>PortletCollectionType<T></code> 
    */
   public PortletCollectionType<T> removeAllPortletName()
   {
      childNode.removeChildren("portlet-name");
      return this;
   }
}
