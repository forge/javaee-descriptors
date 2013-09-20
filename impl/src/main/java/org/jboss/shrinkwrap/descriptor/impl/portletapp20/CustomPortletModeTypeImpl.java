package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomPortletModeType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortalManagedType;

/**
 * This class implements the <code> custom-portlet-modeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CustomPortletModeTypeImpl<T> implements Child<T>, CustomPortletModeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CustomPortletModeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CustomPortletModeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> description(String ... values)
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
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: string ElementType : portlet-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-mode</code> element
    * @param portletMode the value for the element <code>portlet-mode</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portletMode(String portletMode)
   {
      childNode.getOrCreate("portlet-mode").text(portletMode);
      return this;
   }

   /**
    * Returns the <code>portlet-mode</code> element
    * @return the node defined for the element <code>portlet-mode</code> 
    */
   public String getPortletMode()
   {
      return childNode.getTextValueForPatternName("portlet-mode");
   }

   /**
    * Removes the <code>portlet-mode</code> element 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removePortletMode()
   {
      childNode.removeChildren("portlet-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: portlet:portal-managedType ElementType : portal-managed
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>portal-managed</code> element
    * @param portalManaged the value for the element <code>portal-managed</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portalManaged(PortalManagedType portalManaged)
   {
      childNode.getOrCreate("portal-managed").text(portalManaged);
      return this;
   }
   /**
    * Sets the <code>portal-managed</code> element
    * @param portalManaged the value for the element <code>portal-managed</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portalManaged(String portalManaged)
   {
      childNode.getOrCreate("portal-managed").text(portalManaged);
      return this;
   }

   /**
    * Returns the <code>portal-managed</code> element
    * @return the value found for the element <code>portal-managed</code> 
    */
   public PortalManagedType getPortalManaged()
   {
      return PortalManagedType.getFromStringValue(childNode.getTextValueForPatternName("portal-managed"));
   }

   /**
    * Returns the <code>portal-managed</code> element
    * @return the value found for the element <code>portal-managed</code> 
    */
   public String  getPortalManagedAsString()
   {
      return childNode.getTextValueForPatternName("portal-managed");
   }

   /**
    * Removes the <code>portal-managed</code> attribute 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removePortalManaged()
   {
      childNode.removeAttribute("portal-managed");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> id(String id)
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
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
