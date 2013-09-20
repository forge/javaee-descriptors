package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableType;
/**
 * This interface defines the contract for the <code> default-validated-executable-typesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface DefaultValidatedExecutableTypesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DefaultValidatedExecutableTypesType ElementName: config:executable-type ElementType : executable-type
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all config:executable-type objects representing <code>executable-type</code> elements, 
    * a new <code>executable-type</code> element 
    * @param values list of <code>executable-type</code> objects 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> executableType(ExecutableType ... values);

   /**
    * Creates for all String objects representing <code>executable-type</code> elements, 
    * a new <code>executable-type</code> element 
    * @param values list of <code>executable-type</code> objects 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> executableType(String ... values);

   /**
    * Returns all <code>executable-type</code> elements
    * @return list of <code>executable-type</code> 
    */
   public List<String> getAllExecutableType();

   /**
    * Removes the <code>executable-type</code> element 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> removeAllExecutableType();
}
