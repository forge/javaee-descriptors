package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.GenericBooleanType;
/**
 * This interface defines the contract for the <code> tld-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TldAttributeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: j2ee:generic-booleanType ElementType : required
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> required(GenericBooleanType required);
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> required(String required);

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public GenericBooleanType getRequired();

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public String  getRequiredAsString();

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeRequired();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: j2ee:generic-booleanType ElementType : rtexprvalue
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>rtexprvalue</code> element
    * @param rtexprvalue the value for the element <code>rtexprvalue</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> rtexprvalue(GenericBooleanType rtexprvalue);
   /**
    * Sets the <code>rtexprvalue</code> element
    * @param rtexprvalue the value for the element <code>rtexprvalue</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> rtexprvalue(String rtexprvalue);

   /**
    * Returns the <code>rtexprvalue</code> element
    * @return the value found for the element <code>rtexprvalue</code> 
    */
   public GenericBooleanType getRtexprvalue();

   /**
    * Returns the <code>rtexprvalue</code> element
    * @return the value found for the element <code>rtexprvalue</code> 
    */
   public String  getRtexprvalueAsString();

   /**
    * Removes the <code>rtexprvalue</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeRtexprvalue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:token ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> element
    * @param type the value for the element <code>type</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> type(String type);

   /**
    * Returns the <code>type</code> element
    * @return the node defined for the element <code>type</code> 
    */
   public String getType();

   /**
    * Removes the <code>type</code> element 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: j2ee:generic-booleanType ElementType : fragment
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>fragment</code> element
    * @param fragment the value for the element <code>fragment</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> fragment(GenericBooleanType fragment);
   /**
    * Sets the <code>fragment</code> element
    * @param fragment the value for the element <code>fragment</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> fragment(String fragment);

   /**
    * Returns the <code>fragment</code> element
    * @return the value found for the element <code>fragment</code> 
    */
   public GenericBooleanType getFragment();

   /**
    * Returns the <code>fragment</code> element
    * @return the value found for the element <code>fragment</code> 
    */
   public String  getFragmentAsString();

   /**
    * Removes the <code>fragment</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeFragment();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldAttributeType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldAttributeType<T></code> 
    */
   public TldAttributeType<T> removeId();
}
