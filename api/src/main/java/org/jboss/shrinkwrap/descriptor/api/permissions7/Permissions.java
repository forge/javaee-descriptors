package org.jboss.shrinkwrap.descriptor.api.permissions7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permission;
/**
 * This interface defines the contract for the <code> permissions </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Permissions<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permissions ElementName: permissions:permission ElementType : permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>permission</code> element will be created and returned.
    * Otherwise, the first existing <code>permission</code> element will be returned.
    * @return the instance defined for the element <code>permission</code> 
    */
   public Permission<Permissions<T>> getOrCreatePermission();

   /**
    * Creates a new <code>permission</code> element 
    * @return the new created instance of <code>Permission<Permissions<T>></code> 
    */
   public Permission<Permissions<T>> createPermission();

   /**
    * Returns all <code>permission</code> elements
    * @return list of <code>permission</code> 
    */
   public List<Permission<Permissions<T>>> getAllPermission();

   /**
    * Removes all <code>permission</code> elements 
    * @return the current instance of <code>Permission<Permissions<T>></code> 
    */
   public Permissions<T> removeAllPermission();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permissions ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "7";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Permissions<T></code> 
    */
   public Permissions<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Permissions<T></code> 
    */
   public Permissions<T> removeVersion();
}
