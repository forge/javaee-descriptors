package org.jboss.shrinkwrap.descriptor.api.jsp23; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> taglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TaglibType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:token ElementType : taglib-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-uri</code> element
    * @param taglibUri the value for the element <code>taglib-uri</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> taglibUri(String taglibUri);

   /**
    * Returns the <code>taglib-uri</code> element
    * @return the node defined for the element <code>taglib-uri</code> 
    */
   public String getTaglibUri();

   /**
    * Removes the <code>taglib-uri</code> element 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeTaglibUri();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:token ElementType : taglib-location
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-location</code> element
    * @param taglibLocation the value for the element <code>taglib-location</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> taglibLocation(String taglibLocation);

   /**
    * Returns the <code>taglib-location</code> element
    * @return the node defined for the element <code>taglib-location</code> 
    */
   public String getTaglibLocation();

   /**
    * Removes the <code>taglib-location</code> element 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeTaglibLocation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TaglibType<T></code> 
    */
   public TaglibType<T> removeId();
}
