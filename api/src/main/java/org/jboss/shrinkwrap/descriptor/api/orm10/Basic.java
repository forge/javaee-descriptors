package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.Column;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.orm10.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm10.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm10.FetchType;
/**
 * This interface defines the contract for the <code> basic </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Basic<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Basic<T>></code> 
    */
   public Column<Basic<T>> getOrCreateColumn();

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: javaee:emptyType ElementType : lob
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> lob();

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Boolean isLob();

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeLob();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> temporal(TemporalType temporal);
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> temporal(String temporal);

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public TemporalType getTemporal();

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public String  getTemporalAsString();

   /**
    * Removes the <code>temporal</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:enum-type ElementType : enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> enumerated(EnumType enumerated);
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> enumerated(String enumerated);

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public EnumType getEnumerated();

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public String  getEnumeratedAsString();

   /**
    * Removes the <code>enumerated</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeEnumerated();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> fetch(String fetch);

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value defined for the attribute <code>fetch</code> 
    */
public FetchType getFetch();

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value found for the element <code>fetch</code> 
    */
   public String  getFetchAsString();

   /**
    * Removes the <code>fetch</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> optional(Boolean optional);

   /**
    * Returns the <code>optional</code> attribute
    * @return the value defined for the attribute <code>optional</code> 
    */
public Boolean isOptional();

   /**
    * Removes the <code>optional</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeOptional();
}
