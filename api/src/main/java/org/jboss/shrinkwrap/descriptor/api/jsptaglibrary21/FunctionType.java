package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> functionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FunctionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FunctionType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FunctionType<T>></code> 
    */
   public IconType<FunctionType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FunctionType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FunctionType<T>></code> 
    */
   public FunctionType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: javaee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : function-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-class</code> element
    * @param functionClass the value for the element <code>function-class</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> functionClass(String functionClass);

   /**
    * Returns the <code>function-class</code> element
    * @return the node defined for the element <code>function-class</code> 
    */
   public String getFunctionClass();

   /**
    * Removes the <code>function-class</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeFunctionClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : function-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-signature</code> element
    * @param functionSignature the value for the element <code>function-signature</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> functionSignature(String functionSignature);

   /**
    * Returns the <code>function-signature</code> element
    * @return the node defined for the element <code>function-signature</code> 
    */
   public String getFunctionSignature();

   /**
    * Removes the <code>function-signature</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeFunctionSignature();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> example(String example);

   /**
    * Returns the <code>example</code> element
    * @return the node defined for the element <code>example</code> 
    */
   public String getExample();

   /**
    * Removes the <code>example</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeExample();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: javaee:tld-extensionType ElementType : function-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>function-extension</code> element will be returned.
    * @return the instance defined for the element <code>function-extension</code> 
    */
   public TldExtensionType<FunctionType<T>> getOrCreateFunctionExtension();

   /**
    * Creates a new <code>function-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<FunctionType<T>></code> 
    */
   public TldExtensionType<FunctionType<T>> createFunctionExtension();

   /**
    * Returns all <code>function-extension</code> elements
    * @return list of <code>function-extension</code> 
    */
   public List<TldExtensionType<FunctionType<T>>> getAllFunctionExtension();

   /**
    * Removes all <code>function-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<FunctionType<T>></code> 
    */
   public FunctionType<T> removeAllFunctionExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeId();
}
