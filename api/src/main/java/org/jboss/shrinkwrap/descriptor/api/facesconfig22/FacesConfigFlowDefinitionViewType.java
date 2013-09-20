package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-flow-definition-viewType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionViewType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionViewType ElementName: xsd:token ElementType : vdl-document
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vdl-document</code> element
    * @param vdlDocument the value for the element <code>vdl-document</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> vdlDocument(String vdlDocument);

   /**
    * Returns the <code>vdl-document</code> element
    * @return the node defined for the element <code>vdl-document</code> 
    */
   public String getVdlDocument();

   /**
    * Removes the <code>vdl-document</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> removeVdlDocument();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionViewType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> removeId();
}
