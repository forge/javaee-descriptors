package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> icon </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Icon<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Icon ElementName: xsd:string ElementType : small-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>small-icon</code> element
    * @param smallIcon the value for the element <code>small-icon</code> 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> smallIcon(String smallIcon);

   /**
    * Returns the <code>small-icon</code> element
    * @return the node defined for the element <code>small-icon</code> 
    */
   public String getSmallIcon();

   /**
    * Removes the <code>small-icon</code> element 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> removeSmallIcon();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Icon ElementName: xsd:string ElementType : large-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>large-icon</code> element
    * @param largeIcon the value for the element <code>large-icon</code> 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> largeIcon(String largeIcon);

   /**
    * Returns the <code>large-icon</code> element
    * @return the node defined for the element <code>large-icon</code> 
    */
   public String getLargeIcon();

   /**
    * Removes the <code>large-icon</code> element 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> removeLargeIcon();
}
