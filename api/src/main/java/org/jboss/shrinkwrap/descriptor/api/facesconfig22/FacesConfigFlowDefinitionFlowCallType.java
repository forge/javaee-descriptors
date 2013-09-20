package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-flow-callType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionFlowCallType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: javaee:faces-config-flow-definition-flow-call-flow-referenceType ElementType : flow-reference
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-reference</code> element with the given value will be created.
    * Otherwise, the existing <code>flow-reference</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<FacesConfigFlowDefinitionFlowCallType<T>> getOrCreateFlowReference();

   /**
    * Removes the <code>flow-reference</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeFlowReference();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: javaee:faces-config-flow-definition-flow-call-outbound-parameterType ElementType : outbound-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>outbound-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>outbound-parameter</code> element will be returned.
    * @return the instance defined for the element <code>outbound-parameter</code> 
    */
   public FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>> getOrCreateOutboundParameter();

   /**
    * Creates a new <code>outbound-parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>> createOutboundParameter();

   /**
    * Returns all <code>outbound-parameter</code> elements
    * @return list of <code>outbound-parameter</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>>> getAllOutboundParameter();

   /**
    * Removes all <code>outbound-parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeAllOutboundParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeId();
}
