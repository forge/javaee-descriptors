package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.EjbRefTypeType;
/**
 * This interface defines the contract for the <code> ejb-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:token ElementType : ejb-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ref-name</code> element
    * @param ejbRefName the value for the element <code>ejb-ref-name</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefName(String ejbRefName);

   /**
    * Returns the <code>ejb-ref-name</code> element
    * @return the node defined for the element <code>ejb-ref-name</code> 
    */
   public String getEjbRefName();

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: j2ee:ejb-ref-typeType ElementType : ejb-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefType(EjbRefTypeType ejbRefType);
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefType(String ejbRefType);

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the value found for the element <code>ejb-ref-type</code> 
    */
   public EjbRefTypeType getEjbRefType();

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the value found for the element <code>ejb-ref-type</code> 
    */
   public String  getEjbRefTypeAsString();

   /**
    * Removes the <code>ejb-ref-type</code> attribute 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbRefType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: j2ee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> home(String home);

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome();

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: j2ee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> remote(String remote);

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote();

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeRemote();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:token ElementType : ejb-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-link</code> element
    * @param ejbLink the value for the element <code>ejb-link</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbLink(String ejbLink);

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink();

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbLink();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeId();
}
