package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> custom-window-stateType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CustomWindowStateType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : window-state
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>window-state</code> element
    * @param windowState the value for the element <code>window-state</code> 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> windowState(String windowState);

   /**
    * Returns the <code>window-state</code> element
    * @return the node defined for the element <code>window-state</code> 
    */
   public String getWindowState();

   /**
    * Removes the <code>window-state</code> element 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeWindowState();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CustomWindowStateType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>CustomWindowStateType<T></code> 
    */
   public CustomWindowStateType<T> removeId();
}
