package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionViewType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> faces-config-flow-definition-viewType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionViewTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionViewType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionViewTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionViewTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionViewType ElementName: xsd:token ElementType : vdl-document
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vdl-document</code> element
    * @param vdlDocument the value for the element <code>vdl-document</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> vdlDocument(String vdlDocument)
   {
      childNode.getOrCreate("vdl-document").text(vdlDocument);
      return this;
   }

   /**
    * Returns the <code>vdl-document</code> element
    * @return the node defined for the element <code>vdl-document</code> 
    */
   public String getVdlDocument()
   {
      return childNode.getTextValueForPatternName("vdl-document");
   }

   /**
    * Removes the <code>vdl-document</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> removeVdlDocument()
   {
      childNode.removeChildren("vdl-document");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionViewType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<T></code> 
    */
   public FacesConfigFlowDefinitionViewType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
