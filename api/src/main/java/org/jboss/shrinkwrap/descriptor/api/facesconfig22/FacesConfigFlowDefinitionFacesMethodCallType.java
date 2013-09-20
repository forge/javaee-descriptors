package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-faces-method-callType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionFacesMethodCallType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: javaee:faces-config-el-expressionType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method</code> element
    * @param method the value for the element <code>method</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> method(String method);

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public String getMethod();

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: xsd:token ElementType : default-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-outcome</code> element
    * @param defaultOutcome the value for the element <code>default-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> defaultOutcome(String defaultOutcome);

   /**
    * Returns the <code>default-outcome</code> element
    * @return the node defined for the element <code>default-outcome</code> 
    */
   public String getDefaultOutcome();

   /**
    * Removes the <code>default-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeDefaultOutcome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: javaee:faces-config-flow-definition-flow-call-parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>> getOrCreateParameter();

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>> createParameter();

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>>> getAllParameter();

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeAllParameter();
}
