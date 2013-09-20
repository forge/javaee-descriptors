package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> depends-onType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface DependsOnType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DependsOnType ElementName: xsd:token ElementType : ejb-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>ejb-name</code> elements, 
    * a new <code>ejb-name</code> element 
    * @param values list of <code>ejb-name</code> objects 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> ejbName(String ... values);

   /**
    * Returns all <code>ejb-name</code> elements
    * @return list of <code>ejb-name</code> 
    */
   public List<String> getAllEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> removeAllEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DependsOnType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>DependsOnType<T></code> 
    */
   public DependsOnType<T> removeId();
}
