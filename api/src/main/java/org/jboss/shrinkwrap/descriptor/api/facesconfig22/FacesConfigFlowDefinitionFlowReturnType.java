package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-flow-returnType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionFlowReturnType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowReturnType ElementName: xsd:token ElementType : from-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-outcome</code> element
    * @param fromOutcome the value for the element <code>from-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<T> fromOutcome(String fromOutcome);

   /**
    * Returns the <code>from-outcome</code> element
    * @return the node defined for the element <code>from-outcome</code> 
    */
   public String getFromOutcome();

   /**
    * Removes the <code>from-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<T> removeFromOutcome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowReturnType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<T> removeId();
}
