package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.PortComponentRefType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.AddressingType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.AddressingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.RespectBindingType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.RespectBindingTypeImpl;

/**
 * This class implements the <code> port-component-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortComponentRefTypeImpl<T> implements Child<T>, PortComponentRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortComponentRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortComponentRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : service-endpoint-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-endpoint-interface</code> element
    * @param serviceEndpointInterface the value for the element <code>service-endpoint-interface</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> serviceEndpointInterface(String serviceEndpointInterface)
   {
      childNode.getOrCreate("service-endpoint-interface").text(serviceEndpointInterface);
      return this;
   }

   /**
    * Returns the <code>service-endpoint-interface</code> element
    * @return the node defined for the element <code>service-endpoint-interface</code> 
    */
   public String getServiceEndpointInterface()
   {
      return childNode.getTextValueForPatternName("service-endpoint-interface");
   }

   /**
    * Removes the <code>service-endpoint-interface</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeServiceEndpointInterface()
   {
      childNode.removeChildren("service-endpoint-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: javaee:xsdBooleanType ElementType : enable-mtom
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enable-mtom</code> element
    * @param enableMtom the value for the element <code>enable-mtom</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> enableMtom(Boolean enableMtom)
   {
      childNode.getOrCreate("enable-mtom").text(enableMtom);
      return this;
   }

   /**
    * Returns the <code>enable-mtom</code> element
    * @return the node defined for the element <code>enable-mtom</code> 
    */
   public Boolean isEnableMtom()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("enable-mtom"));
   }

   /**
    * Removes the <code>enable-mtom</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeEnableMtom()
   {
      childNode.removeChildren("enable-mtom");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:nonNegativeInteger ElementType : mtom-threshold
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mtom-threshold</code> element
    * @param mtomThreshold the value for the element <code>mtom-threshold</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> mtomThreshold(Integer mtomThreshold)
   {
      childNode.getOrCreate("mtom-threshold").text(mtomThreshold);
      return this;
   }

   /**
    * Returns the <code>mtom-threshold</code> element
    * @return the node defined for the element <code>mtom-threshold</code> 
    */
   public Integer getMtomThreshold()
   {
      if (childNode.getTextValueForPatternName("mtom-threshold") != null && !childNode.getTextValueForPatternName("mtom-threshold").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("mtom-threshold"));
      }
      return null;
   }

   /**
    * Removes the <code>mtom-threshold</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeMtomThreshold()
   {
      childNode.removeChildren("mtom-threshold");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: javaee:addressingType ElementType : addressing
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>addressing</code> element with the given value will be created.
    * Otherwise, the existing <code>addressing</code> element will be returned.
    * @return  a new or existing instance of <code>AddressingType<PortComponentRefType<T>></code> 
    */
   public AddressingType<PortComponentRefType<T>> getOrCreateAddressing()
   {
      Node node = childNode.getOrCreate("addressing");
      AddressingType<PortComponentRefType<T>> addressing = new AddressingTypeImpl<PortComponentRefType<T>>(this, "addressing", childNode, node);
      return addressing;
   }

   /**
    * Removes the <code>addressing</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeAddressing()
   {
      childNode.removeChildren("addressing");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: javaee:respect-bindingType ElementType : respect-binding
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>respect-binding</code> element with the given value will be created.
    * Otherwise, the existing <code>respect-binding</code> element will be returned.
    * @return  a new or existing instance of <code>RespectBindingType<PortComponentRefType<T>></code> 
    */
   public RespectBindingType<PortComponentRefType<T>> getOrCreateRespectBinding()
   {
      Node node = childNode.getOrCreate("respect-binding");
      RespectBindingType<PortComponentRefType<T>> respectBinding = new RespectBindingTypeImpl<PortComponentRefType<T>>(this, "respect-binding", childNode, node);
      return respectBinding;
   }

   /**
    * Removes the <code>respect-binding</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeRespectBinding()
   {
      childNode.removeChildren("respect-binding");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : port-component-link
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-component-link</code> element
    * @param portComponentLink the value for the element <code>port-component-link</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> portComponentLink(String portComponentLink)
   {
      childNode.getOrCreate("port-component-link").text(portComponentLink);
      return this;
   }

   /**
    * Returns the <code>port-component-link</code> element
    * @return the node defined for the element <code>port-component-link</code> 
    */
   public String getPortComponentLink()
   {
      return childNode.getTextValueForPatternName("port-component-link");
   }

   /**
    * Removes the <code>port-component-link</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removePortComponentLink()
   {
      childNode.removeChildren("port-component-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> id(String id)
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
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
