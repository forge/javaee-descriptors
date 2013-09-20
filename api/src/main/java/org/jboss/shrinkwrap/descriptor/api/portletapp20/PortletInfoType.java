package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> portlet-infoType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortletInfoType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : title
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>title</code> element
    * @param title the value for the element <code>title</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> title(String title);

   /**
    * Returns the <code>title</code> element
    * @return the node defined for the element <code>title</code> 
    */
   public String getTitle();

   /**
    * Removes the <code>title</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeTitle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : short-title
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-title</code> element
    * @param shortTitle the value for the element <code>short-title</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> shortTitle(String shortTitle);

   /**
    * Returns the <code>short-title</code> element
    * @return the node defined for the element <code>short-title</code> 
    */
   public String getShortTitle();

   /**
    * Removes the <code>short-title</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeShortTitle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : keywords
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>keywords</code> element
    * @param keywords the value for the element <code>keywords</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> keywords(String keywords);

   /**
    * Returns the <code>keywords</code> element
    * @return the node defined for the element <code>keywords</code> 
    */
   public String getKeywords();

   /**
    * Removes the <code>keywords</code> element 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeKeywords();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletInfoType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortletInfoType<T></code> 
    */
   public PortletInfoType<T> removeId();
}
