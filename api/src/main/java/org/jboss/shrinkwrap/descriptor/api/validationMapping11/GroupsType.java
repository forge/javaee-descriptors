package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> groupsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface GroupsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GroupsType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>GroupsType<T></code> 
    */
   public GroupsType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>GroupsType<T></code> 
    */
   public GroupsType<T> removeAllValue();
}
