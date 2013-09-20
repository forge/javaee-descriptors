package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortalManagedType;
/**
 * This interface defines the contract for the <code> custom-portlet-modeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CustomPortletModeType<T> extends Child<T>
{
 
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
   public CustomPortletModeType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: string ElementType : portlet-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-mode</code> element
    * @param portletMode the value for the element <code>portlet-mode</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portletMode(String portletMode);

   /**
    * Returns the <code>portlet-mode</code> element
    * @return the node defined for the element <code>portlet-mode</code> 
    */
   public String getPortletMode();

   /**
    * Removes the <code>portlet-mode</code> element 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removePortletMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: portlet:portal-managedType ElementType : portal-managed
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>portal-managed</code> element
    * @param portalManaged the value for the element <code>portal-managed</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portalManaged(PortalManagedType portalManaged);
   /**
    * Sets the <code>portal-managed</code> element
    * @param portalManaged the value for the element <code>portal-managed</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> portalManaged(String portalManaged);

   /**
    * Returns the <code>portal-managed</code> element
    * @return the value found for the element <code>portal-managed</code> 
    */
   public PortalManagedType getPortalManaged();

   /**
    * Returns the <code>portal-managed</code> element
    * @return the value found for the element <code>portal-managed</code> 
    */
   public String  getPortalManagedAsString();

   /**
    * Removes the <code>portal-managed</code> attribute 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removePortalManaged();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomPortletModeType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>CustomPortletModeType<T></code> 
    */
   public CustomPortletModeType<T> removeId();
}
