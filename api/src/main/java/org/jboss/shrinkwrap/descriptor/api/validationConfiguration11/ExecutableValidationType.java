package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> executable-validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ExecutableValidationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExecutableValidationType ElementName: config:default-validated-executable-typesType ElementType : default-validated-executable-types
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-validated-executable-types</code> element with the given value will be created.
    * Otherwise, the existing <code>default-validated-executable-types</code> element will be returned.
    * @return  a new or existing instance of <code>DefaultValidatedExecutableTypesType<ExecutableValidationType<T>></code> 
    */
   public DefaultValidatedExecutableTypesType<ExecutableValidationType<T>> getOrCreateDefaultValidatedExecutableTypes();

   /**
    * Removes the <code>default-validated-executable-types</code> element 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> removeDefaultValidatedExecutableTypes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExecutableValidationType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> removeEnabled();
}
