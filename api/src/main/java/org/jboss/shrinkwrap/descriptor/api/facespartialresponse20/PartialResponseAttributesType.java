package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.Attribute;
/**
 * This interface defines the contract for the <code> partial-response-attributesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseAttributesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseAttributesType ElementName: javaee:attribute ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public Attribute<PartialResponseAttributesType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>Attribute<PartialResponseAttributesType<T>></code> 
    */
   public Attribute<PartialResponseAttributesType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<Attribute<PartialResponseAttributesType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>Attribute<PartialResponseAttributesType<T>></code> 
    */
   public PartialResponseAttributesType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseAttributesType ElementName: xsd:string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PartialResponseAttributesType<T></code> 
    */
   public PartialResponseAttributesType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PartialResponseAttributesType<T></code> 
    */
   public PartialResponseAttributesType<T> removeId();
}
