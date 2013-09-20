package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ReadOnlyType;
/**
 * This interface defines the contract for the <code> preferenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PreferenceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeAllValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: portlet:read-onlyType ElementType : read-only
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>read-only</code> element
    * @param readOnly the value for the element <code>read-only</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> readOnly(ReadOnlyType readOnly);
   /**
    * Sets the <code>read-only</code> element
    * @param readOnly the value for the element <code>read-only</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> readOnly(String readOnly);

   /**
    * Returns the <code>read-only</code> element
    * @return the value found for the element <code>read-only</code> 
    */
   public ReadOnlyType getReadOnly();

   /**
    * Returns the <code>read-only</code> element
    * @return the value found for the element <code>read-only</code> 
    */
   public String  getReadOnlyAsString();

   /**
    * Removes the <code>read-only</code> attribute 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeReadOnly();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreferenceType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PreferenceType<T></code> 
    */
   public PreferenceType<T> removeId();
}
