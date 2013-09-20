package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PreferenceType;
/**
 * This interface defines the contract for the <code> portlet-preferencesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortletPreferencesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: portlet:preferenceType ElementType : preference
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>preference</code> element will be created and returned.
    * Otherwise, the first existing <code>preference</code> element will be returned.
    * @return the instance defined for the element <code>preference</code> 
    */
   public PreferenceType<PortletPreferencesType<T>> getOrCreatePreference();

   /**
    * Creates a new <code>preference</code> element 
    * @return the new created instance of <code>PreferenceType<PortletPreferencesType<T>></code> 
    */
   public PreferenceType<PortletPreferencesType<T>> createPreference();

   /**
    * Returns all <code>preference</code> elements
    * @return list of <code>preference</code> 
    */
   public List<PreferenceType<PortletPreferencesType<T>>> getAllPreference();

   /**
    * Removes all <code>preference</code> elements 
    * @return the current instance of <code>PreferenceType<PortletPreferencesType<T>></code> 
    */
   public PortletPreferencesType<T> removeAllPreference();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: string ElementType : preferences-validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>preferences-validator</code> element
    * @param preferencesValidator the value for the element <code>preferences-validator</code> 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> preferencesValidator(String preferencesValidator);

   /**
    * Returns the <code>preferences-validator</code> element
    * @return the node defined for the element <code>preferences-validator</code> 
    */
   public String getPreferencesValidator();

   /**
    * Removes the <code>preferences-validator</code> element 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> removePreferencesValidator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletPreferencesType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortletPreferencesType<T></code> 
    */
   public PortletPreferencesType<T> removeId();
}
