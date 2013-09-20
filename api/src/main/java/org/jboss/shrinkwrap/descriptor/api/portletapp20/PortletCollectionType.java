package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> portlet-collectionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortletCollectionType<T> extends Child<T>
{
 
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
   public PortletCollectionType<T> portletName(String ... values);

   /**
    * Returns all <code>portlet-name</code> elements
    * @return list of <code>portlet-name</code> 
    */
   public List<String> getAllPortletName();

   /**
    * Removes the <code>portlet-name</code> element 
    * @return the current instance of <code>PortletCollectionType<T></code> 
    */
   public PortletCollectionType<T> removeAllPortletName();
}
