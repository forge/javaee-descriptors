package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigOrderingOrderingType;
/**
 * This interface defines the contract for the <code> faces-config-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigOrderingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: javaee:faces-config-ordering-orderingType ElementType : after
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
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
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
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

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> removeId();
}
