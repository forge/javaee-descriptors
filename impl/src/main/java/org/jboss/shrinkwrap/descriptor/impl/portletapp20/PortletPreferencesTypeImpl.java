package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletPreferencesType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PreferenceType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> portlet-preferencesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletPreferencesTypeImpl<T> implements Child<T>, PortletPreferencesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletPreferencesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortletPreferencesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: portlet:preferenceType ElementType : preference
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>preference</code> element will be created and returned.
    * Otherwise, the first existing <code>preference</code> element will be returned.
    * @return the instance defined for the element <code>preference</code> 
    */
   public PreferenceType<PortletPreferencesType<T>> getOrCreatePreference()
   {
      List<Node> nodeList = childNode.get("preference");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PreferenceTypeImpl<PortletPreferencesType<T>>(this, "preference", childNode, nodeList.get(0));
      }
      return createPreference();
   }

   /**
    * Creates a new <code>preference</code> element 
    * @return the new created instance of <code>PreferenceType<PortletPreferencesType<T>></code> 
    */
   public PreferenceType<PortletPreferencesType<T>> createPreference()
   {
      return new PreferenceTypeImpl<PortletPreferencesType<T>>(this, "preference", childNode);
   }

   /**
    * Returns all <code>preference</code> elements
    * @return list of <code>preference</code> 
    */
   public List<PreferenceType<PortletPreferencesType<T>>> getAllPreference()
   {
      List<PreferenceType<PortletPreferencesType<T>>> list = new ArrayList<PreferenceType<PortletPreferencesType<T>>>();
      List<Node> nodeList = childNode.get("preference");
      for(Node node: nodeList)
      {
         PreferenceType<PortletPreferencesType<T>>  type = new PreferenceTypeImpl<PortletPreferencesType<T>>(this, "preference", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>preference</code> elements 
    * @return the current instance of <code>PreferenceType<PortletPreferencesType<T>></code> 
    */
   public PortletPreferencesType<T> removeAllPreference()
   {
      childNode.removeChildren("preference");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: string ElementType : preferences-validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>preferences-validator</code> element
    * @param preferencesValidator the value for the element <code>preferences-validator</code> 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> preferencesValidator(String preferencesValidator)
   {
      childNode.getOrCreate("preferences-validator").text(preferencesValidator);
      return this;
   }

   /**
    * Returns the <code>preferences-validator</code> element
    * @return the node defined for the element <code>preferences-validator</code> 
    */
   public String getPreferencesValidator()
   {
      return childNode.getTextValueForPatternName("preferences-validator");
   }

   /**
    * Removes the <code>preferences-validator</code> element 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> removePreferencesValidator()
   {
      childNode.removeChildren("preferences-validator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> id(String id)
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
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
