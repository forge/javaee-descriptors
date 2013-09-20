package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MethodIntfType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MethodParamsType;
/**
 * This interface defines the contract for the <code> methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> ejbName(String ejbName);

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:method-intfType ElementType : method-intf
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>method-intf</code> element
    * @param methodIntf the value for the element <code>method-intf</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodIntf(MethodIntfType methodIntf);
   /**
    * Sets the <code>method-intf</code> element
    * @param methodIntf the value for the element <code>method-intf</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodIntf(String methodIntf);

   /**
    * Returns the <code>method-intf</code> element
    * @return the value found for the element <code>method-intf</code> 
    */
   public MethodIntfType getMethodIntf();

   /**
    * Returns the <code>method-intf</code> element
    * @return the value found for the element <code>method-intf</code> 
    */
   public String  getMethodIntfAsString();

   /**
    * Removes the <code>method-intf</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodIntf();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodName(String methodName);

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:method-paramsType ElementType : method-params
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-params</code> element with the given value will be created.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return  a new or existing instance of <code>MethodParamsType<MethodType<T>></code> 
    */
   public MethodParamsType<MethodType<T>> getOrCreateMethodParams();

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodParams();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeId();
}
