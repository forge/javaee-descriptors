package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> validated-byType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ValidatedByType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatedByType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> removeAllValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatedByType ElementName: xsd:boolean ElementType : include-existing-validators
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-existing-validators</code> attribute
    * @param includeExistingValidators the value for the attribute <code>include-existing-validators</code> 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> includeExistingValidators(Boolean includeExistingValidators);

   /**
    * Returns the <code>include-existing-validators</code> attribute
    * @return the value defined for the attribute <code>include-existing-validators</code> 
    */
public Boolean isIncludeExistingValidators();

   /**
    * Removes the <code>include-existing-validators</code> attribute 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> removeIncludeExistingValidators();
}
