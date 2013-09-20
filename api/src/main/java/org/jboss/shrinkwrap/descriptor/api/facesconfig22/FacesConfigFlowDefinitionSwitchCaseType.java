package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-switch-caseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionSwitchCaseType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigFlowDefinitionSwitchCaseType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigFlowDefinitionSwitchCaseType<T>></code> 
    */
   public IconType<FacesConfigFlowDefinitionSwitchCaseType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigFlowDefinitionSwitchCaseType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigFlowDefinitionSwitchCaseType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: javaee:faces-config-el-expressionType ElementType : if
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>if</code> element
    * @param _if the value for the element <code>if</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> _if(String _if);

   /**
    * Returns the <code>if</code> element
    * @return the node defined for the element <code>if</code> 
    */
   public String getIf();

   /**
    * Removes the <code>if</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeIf();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:token ElementType : from-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-outcome</code> element
    * @param fromOutcome the value for the element <code>from-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> fromOutcome(String fromOutcome);

   /**
    * Returns the <code>from-outcome</code> element
    * @return the node defined for the element <code>from-outcome</code> 
    */
   public String getFromOutcome();

   /**
    * Removes the <code>from-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeFromOutcome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeId();
}
