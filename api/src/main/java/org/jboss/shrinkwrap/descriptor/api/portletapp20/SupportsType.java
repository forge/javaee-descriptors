package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> supportsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SupportsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : mime-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mime-type</code> element
    * @param mimeType the value for the element <code>mime-type</code> 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> mimeType(String mimeType);

   /**
    * Returns the <code>mime-type</code> element
    * @return the node defined for the element <code>mime-type</code> 
    */
   public String getMimeType();

   /**
    * Removes the <code>mime-type</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeMimeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : portlet-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>portlet-mode</code> elements, 
    * a new <code>portlet-mode</code> element 
    * @param values list of <code>portlet-mode</code> objects 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> portletMode(String ... values);

   /**
    * Returns all <code>portlet-mode</code> elements
    * @return list of <code>portlet-mode</code> 
    */
   public List<String> getAllPortletMode();

   /**
    * Removes the <code>portlet-mode</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeAllPortletMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : window-state
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>window-state</code> elements, 
    * a new <code>window-state</code> element 
    * @param values list of <code>window-state</code> objects 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> windowState(String ... values);

   /**
    * Returns all <code>window-state</code> elements
    * @return list of <code>window-state</code> 
    */
   public List<String> getAllWindowState();

   /**
    * Removes the <code>window-state</code> element 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeAllWindowState();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SupportsType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SupportsType<T></code> 
    */
   public SupportsType<T> removeId();
}
