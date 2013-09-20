package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-flow-call-parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionFlowCallParameterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallParameterType ElementName: xsd:token ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> element
    * @param clazz the value for the element <code>class</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> removeClazz();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallParameterType ElementName: javaee:faces-config-el-expressionType ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> value(String value);

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> removeValue();
}
