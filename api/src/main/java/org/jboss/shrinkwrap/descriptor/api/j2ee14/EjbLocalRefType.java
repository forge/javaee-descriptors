package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> ejb-local-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbLocalRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:token ElementType : ejb-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ref-name</code> element
    * @param ejbRefName the value for the element <code>ejb-ref-name</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefName(String ejbRefName);

   /**
    * Returns the <code>ejb-ref-name</code> element
    * @return the node defined for the element <code>ejb-ref-name</code> 
    */
   public String getEjbRefName();

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:ejb-ref-typeType ElementType : ejb-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefType(EjbRefTypeType ejbRefType);
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefType(String ejbRefType);

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
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbRefType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> localHome(String localHome);

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome();

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeLocalHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> local(String local);

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeLocal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:token ElementType : ejb-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-link</code> element
    * @param ejbLink the value for the element <code>ejb-link</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbLink(String ejbLink);

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink();

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbLink();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeId();
}
