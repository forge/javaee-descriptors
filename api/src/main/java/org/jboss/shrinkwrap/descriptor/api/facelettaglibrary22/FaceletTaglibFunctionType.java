package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-functionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibFunctionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibFunctionType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibFunctionType<T>></code> 
    */
   public IconType<FaceletTaglibFunctionType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibFunctionType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibFunctionType<T>></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-name</code> element
    * @param functionName the value for the element <code>function-name</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionName(String functionName);

   /**
    * Returns the <code>function-name</code> element
    * @return the node defined for the element <code>function-name</code> 
    */
   public String getFunctionName();

   /**
    * Removes the <code>function-name</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-class</code> element
    * @param functionClass the value for the element <code>function-class</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionClass(String functionClass);

   /**
    * Returns the <code>function-class</code> element
    * @return the node defined for the element <code>function-class</code> 
    */
   public String getFunctionClass();

   /**
    * Removes the <code>function-class</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-signature</code> element
    * @param functionSignature the value for the element <code>function-signature</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionSignature(String functionSignature);

   /**
    * Returns the <code>function-signature</code> element
    * @return the node defined for the element <code>function-signature</code> 
    */
   public String getFunctionSignature();

   /**
    * Removes the <code>function-signature</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionSignature();
}
