package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-default-validatorsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigDefaultValidatorsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigDefaultValidatorsType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>validator-id</code> elements, 
    * a new <code>validator-id</code> element 
    * @param values list of <code>validator-id</code> objects 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> validatorId(String ... values);

   /**
    * Returns all <code>validator-id</code> elements
    * @return list of <code>validator-id</code> 
    */
   public List<String> getAllValidatorId();

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> removeAllValidatorId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigDefaultValidatorsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> removeId();
}
