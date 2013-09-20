package org.jboss.shrinkwrap.descriptor.api.application7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application7.WebType;
/**
 * This interface defines the contract for the <code> moduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ModuleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : connector
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connector</code> element
    * @param connector the value for the element <code>connector</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> connector(String connector);

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector();

   /**
    * Removes the <code>connector</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeConnector();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : ejb
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb</code> element
    * @param ejb the value for the element <code>ejb</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> ejb(String ejb);

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb();

   /**
    * Removes the <code>ejb</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeEjb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : java
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>java</code> element
    * @param java the value for the element <code>java</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> java(String java);

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava();

   /**
    * Removes the <code>java</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeJava();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: javaee:webType ElementType : web
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web</code> element with the given value will be created.
    * Otherwise, the existing <code>web</code> element will be returned.
    * @return  a new or existing instance of <code>WebType<ModuleType<T>></code> 
    */
   public WebType<ModuleType<T>> getOrCreateWeb();

   /**
    * Removes the <code>web</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeWeb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : alt-dd
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>alt-dd</code> element
    * @param altDd the value for the element <code>alt-dd</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> altDd(String altDd);

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd();

   /**
    * Removes the <code>alt-dd</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeAltDd();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeId();
}
