package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-flow-call-flow-referenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallFlowReferenceType ElementName: xsd:token ElementType : flow-document-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flow-document-id</code> element
    * @param flowDocumentId the value for the element <code>flow-document-id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> flowDocumentId(String flowDocumentId);

   /**
    * Returns the <code>flow-document-id</code> element
    * @return the node defined for the element <code>flow-document-id</code> 
    */
   public String getFlowDocumentId();

   /**
    * Removes the <code>flow-document-id</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> removeFlowDocumentId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallFlowReferenceType ElementName: xsd:token ElementType : flow-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flow-id</code> element
    * @param flowId the value for the element <code>flow-id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> flowId(String flowId);

   /**
    * Returns the <code>flow-id</code> element
    * @return the node defined for the element <code>flow-id</code> 
    */
   public String getFlowId();

   /**
    * Removes the <code>flow-id</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> removeFlowId();
}
