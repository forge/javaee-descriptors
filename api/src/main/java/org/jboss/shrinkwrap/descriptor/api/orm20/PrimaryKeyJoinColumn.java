package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> primary-key-join-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PrimaryKeyJoinColumn<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : referenced-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-column-name</code> attribute
    * @param referencedColumnName the value for the attribute <code>referenced-column-name</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> referencedColumnName(String referencedColumnName);

   /**
    * Returns the <code>referenced-column-name</code> attribute
    * @return the value defined for the attribute <code>referenced-column-name</code> 
    */
   public String getReferencedColumnName();

   /**
    * Removes the <code>referenced-column-name</code> attribute 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeReferencedColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeColumnDefinition();
}
