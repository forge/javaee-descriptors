package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.VariableScopeType;
/**
 * This interface defines the contract for the <code> variableType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface VariableType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : name-given
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name-given</code> element
    * @param nameGiven the value for the element <code>name-given</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> nameGiven(String nameGiven);

   /**
    * Returns the <code>name-given</code> element
    * @return the node defined for the element <code>name-given</code> 
    */
   public String getNameGiven();

   /**
    * Removes the <code>name-given</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeNameGiven();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : name-from-attribute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name-from-attribute</code> element
    * @param nameFromAttribute the value for the element <code>name-from-attribute</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> nameFromAttribute(String nameFromAttribute);

   /**
    * Returns the <code>name-from-attribute</code> element
    * @return the node defined for the element <code>name-from-attribute</code> 
    */
   public String getNameFromAttribute();

   /**
    * Removes the <code>name-from-attribute</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeNameFromAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:token ElementType : variable-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>variable-class</code> element
    * @param variableClass the value for the element <code>variable-class</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> variableClass(String variableClass);

   /**
    * Returns the <code>variable-class</code> element
    * @return the node defined for the element <code>variable-class</code> 
    */
   public String getVariableClass();

   /**
    * Removes the <code>variable-class</code> element 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeVariableClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: j2ee:generic-booleanType ElementType : declare
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>declare</code> element
    * @param declare the value for the element <code>declare</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> declare(GenericBooleanType declare);
   /**
    * Sets the <code>declare</code> element
    * @param declare the value for the element <code>declare</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> declare(String declare);

   /**
    * Returns the <code>declare</code> element
    * @return the value found for the element <code>declare</code> 
    */
   public GenericBooleanType getDeclare();

   /**
    * Returns the <code>declare</code> element
    * @return the value found for the element <code>declare</code> 
    */
   public String  getDeclareAsString();

   /**
    * Removes the <code>declare</code> attribute 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeDeclare();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: j2ee:variable-scopeType ElementType : scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>scope</code> element
    * @param scope the value for the element <code>scope</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> scope(VariableScopeType scope);
   /**
    * Sets the <code>scope</code> element
    * @param scope the value for the element <code>scope</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> scope(String scope);

   /**
    * Returns the <code>scope</code> element
    * @return the value found for the element <code>scope</code> 
    */
   public VariableScopeType getScope();

   /**
    * Returns the <code>scope</code> element
    * @return the value found for the element <code>scope</code> 
    */
   public String  getScopeAsString();

   /**
    * Removes the <code>scope</code> attribute 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeScope();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: VariableType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>VariableType<T></code> 
    */
   public VariableType<T> removeId();
}
