package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> container-runtime-optionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ContainerRuntimeOptionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerRuntimeOptionType ElementName: string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerRuntimeOptionType ElementName: string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ContainerRuntimeOptionType<T></code> 
    */
   public ContainerRuntimeOptionType<T> removeAllValue();
}
