package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> iconType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface IconType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:token ElementType : small-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>small-icon</code> element
    * @param smallIcon the value for the element <code>small-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> smallIcon(String smallIcon);

   /**
    * Returns the <code>small-icon</code> element
    * @return the node defined for the element <code>small-icon</code> 
    */
   public String getSmallIcon();

   /**
    * Removes the <code>small-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeSmallIcon();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:token ElementType : large-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>large-icon</code> element
    * @param largeIcon the value for the element <code>large-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> largeIcon(String largeIcon);

   /**
    * Returns the <code>large-icon</code> element
    * @return the node defined for the element <code>large-icon</code> 
    */
   public String getLargeIcon();

   /**
    * Removes the <code>large-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeLargeIcon();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeId();
}
