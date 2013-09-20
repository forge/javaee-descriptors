package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallFlowReferenceType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> faces-config-flow-definition-flow-call-flow-referenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionFlowCallFlowReferenceTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionFlowCallFlowReferenceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionFlowCallFlowReferenceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionFlowCallFlowReferenceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallFlowReferenceType ElementName: xsd:token ElementType : flow-document-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flow-document-id</code> element
    * @param flowDocumentId the value for the element <code>flow-document-id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> flowDocumentId(String flowDocumentId)
   {
      childNode.getOrCreate("flow-document-id").text(flowDocumentId);
      return this;
   }

   /**
    * Returns the <code>flow-document-id</code> element
    * @return the node defined for the element <code>flow-document-id</code> 
    */
   public String getFlowDocumentId()
   {
      return childNode.getTextValueForPatternName("flow-document-id");
   }

   /**
    * Removes the <code>flow-document-id</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> removeFlowDocumentId()
   {
      childNode.removeChildren("flow-document-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallFlowReferenceType ElementName: xsd:token ElementType : flow-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flow-id</code> element
    * @param flowId the value for the element <code>flow-id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> flowId(String flowId)
   {
      childNode.getOrCreate("flow-id").text(flowId);
      return this;
   }

   /**
    * Returns the <code>flow-id</code> element
    * @return the node defined for the element <code>flow-id</code> 
    */
   public String getFlowId()
   {
      return childNode.getTextValueForPatternName("flow-id");
   }

   /**
    * Removes the <code>flow-id</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<T> removeFlowId()
   {
      childNode.removeChildren("flow-id");
      return this;
   }
}
