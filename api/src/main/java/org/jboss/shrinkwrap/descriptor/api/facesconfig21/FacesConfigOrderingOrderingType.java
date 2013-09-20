package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigOrderingOthersType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigOrderingOthersType;
/**
 * This interface defines the contract for the <code> faces-config-ordering-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigOrderingOrderingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingOrderingType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> removeAllName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingOrderingType ElementName: javaee:faces-config-ordering-othersType ElementType : others
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> others();

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public Boolean isOthers();

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> removeOthers();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingOrderingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> removeId();
}
