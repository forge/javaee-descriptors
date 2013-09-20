package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ParamValueType;
/**
 * This interface defines the contract for the <code> handlerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface HandlerType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<HandlerType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<HandlerType<T>></code> 
    */
   public IconType<HandlerType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<HandlerType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<HandlerType<T>></code> 
    */
   public HandlerType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:token ElementType : handler-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-name</code> element
    * @param handlerName the value for the element <code>handler-name</code> 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> handlerName(String handlerName);

   /**
    * Returns the <code>handler-name</code> element
    * @return the node defined for the element <code>handler-name</code> 
    */
   public String getHandlerName();

   /**
    * Removes the <code>handler-name</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeHandlerName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> handlerClass(String handlerClass);

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<HandlerType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<HandlerType<T>></code> 
    */
   public ParamValueType<HandlerType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<HandlerType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<HandlerType<T>></code> 
    */
   public HandlerType<T> removeAllInitParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:QName ElementType : soap-header
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>soap-header</code> elements, 
    * a new <code>soap-header</code> element 
    * @param values list of <code>soap-header</code> objects 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> soapHeader(String ... values);

   /**
    * Returns all <code>soap-header</code> elements
    * @return list of <code>soap-header</code> 
    */
   public List<String> getAllSoapHeader();

   /**
    * Removes the <code>soap-header</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeAllSoapHeader();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:token ElementType : soap-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>soap-role</code> elements, 
    * a new <code>soap-role</code> element 
    * @param values list of <code>soap-role</code> objects 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> soapRole(String ... values);

   /**
    * Returns all <code>soap-role</code> elements
    * @return list of <code>soap-role</code> 
    */
   public List<String> getAllSoapRole();

   /**
    * Removes the <code>soap-role</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeAllSoapRole();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:token ElementType : port-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>port-name</code> elements, 
    * a new <code>port-name</code> element 
    * @param values list of <code>port-name</code> objects 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> portName(String ... values);

   /**
    * Returns all <code>port-name</code> elements
    * @return list of <code>port-name</code> 
    */
   public List<String> getAllPortName();

   /**
    * Removes the <code>port-name</code> element 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeAllPortName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>HandlerType<T></code> 
    */
   public HandlerType<T> removeId();
}
