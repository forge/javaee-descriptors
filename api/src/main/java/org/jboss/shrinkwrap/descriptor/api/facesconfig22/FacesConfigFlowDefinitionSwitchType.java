package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-switchType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionSwitchType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: javaee:faces-config-flow-definition-switch-caseType ElementType : case
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>case</code> element will be created and returned.
    * Otherwise, the first existing <code>case</code> element will be returned.
    * @return the instance defined for the element <code>case</code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>> getOrCreateCase();

   /**
    * Creates a new <code>case</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>> createCase();

   /**
    * Returns all <code>case</code> elements
    * @return list of <code>case</code> 
    */
   public List<FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>>> getAllCase();

   /**
    * Removes all <code>case</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeAllCase();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: xsd:token ElementType : default-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-outcome</code> element
    * @param defaultOutcome the value for the element <code>default-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> defaultOutcome(String defaultOutcome);

   /**
    * Returns the <code>default-outcome</code> element
    * @return the node defined for the element <code>default-outcome</code> 
    */
   public String getDefaultOutcome();

   /**
    * Removes the <code>default-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeDefaultOutcome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeId();
}
