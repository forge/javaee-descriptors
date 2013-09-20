package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallParameterType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-flow-definition-flow-call-parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionFlowCallParameterTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionFlowCallParameterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionFlowCallParameterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionFlowCallParameterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallParameterType ElementName: xsd:token ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> element
    * @param clazz the value for the element <code>class</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> clazz(String clazz)
   {
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz()
   {
      return childNode.getTextValueForPatternName("class");
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> removeClazz()
   {
      childNode.removeChildren("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallParameterType ElementName: javaee:faces-config-el-expressionType ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> value(String value)
   {
      childNode.getOrCreate("value").text(value);
      return this;
   }

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue()
   {
      return childNode.getTextValueForPatternName("value");
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<T> removeValue()
   {
      childNode.removeChildren("value");
      return this;
   }
}
