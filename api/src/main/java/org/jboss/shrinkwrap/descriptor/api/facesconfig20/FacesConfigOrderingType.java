package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
/**
 * This interface defines the contract for the <code> faces-config-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigOrderingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: javaee:faces-config-ordering-orderingType ElementType : after
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>></code> 
    */
   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getOrCreateAfter();

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> removeAfter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: javaee:faces-config-ordering-orderingType ElementType : before
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>></code> 
    */
   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getOrCreateBefore();

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> removeBefore();
}
