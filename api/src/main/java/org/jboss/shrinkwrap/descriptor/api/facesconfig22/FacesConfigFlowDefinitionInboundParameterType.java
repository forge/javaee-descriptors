package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-inbound-parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionInboundParameterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionInboundParameterType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionInboundParameterType ElementName: javaee:faces-config-el-expressionType ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<T> value(String value);

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<T> removeValue();
}
