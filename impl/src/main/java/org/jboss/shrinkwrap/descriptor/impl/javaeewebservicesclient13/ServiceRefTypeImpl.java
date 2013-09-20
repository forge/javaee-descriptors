package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.PortComponentRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.HandlerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainsType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.HandlerChainsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;

/**
 * This class implements the <code> service-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServiceRefTypeImpl<T> implements Child<T>, ServiceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServiceRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("display-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ServiceRefType<T>></code> 
    */
   public IconType<ServiceRefType<T>> createIcon()
   {
      return new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefType<T>>> getAllIcon()
   {
      List<IconType<ServiceRefType<T>>> list = new ArrayList<IconType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ServiceRefType<T>>  type = new IconTypeImpl<ServiceRefType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> lookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.getTextValueForPatternName("lookup-name");
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeLookupName()
   {
      childNode.removeChildren("lookup-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ServiceRefType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<ServiceRefType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<ServiceRefType<T>></code> 
    */
   public InjectionTargetType<ServiceRefType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<ServiceRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ServiceRefType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<ServiceRefType<T>>> list = new ArrayList<InjectionTargetType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<ServiceRefType<T>>  type = new InjectionTargetTypeImpl<ServiceRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-ref-name</code> element
    * @param serviceRefName the value for the element <code>service-ref-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceRefName(String serviceRefName)
   {
      childNode.getOrCreate("service-ref-name").text(serviceRefName);
      return this;
   }

   /**
    * Returns the <code>service-ref-name</code> element
    * @return the node defined for the element <code>service-ref-name</code> 
    */
   public String getServiceRefName()
   {
      return childNode.getTextValueForPatternName("service-ref-name");
   }

   /**
    * Removes the <code>service-ref-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceRefName()
   {
      childNode.removeChildren("service-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-interface</code> element
    * @param serviceInterface the value for the element <code>service-interface</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceInterface(String serviceInterface)
   {
      childNode.getOrCreate("service-interface").text(serviceInterface);
      return this;
   }

   /**
    * Returns the <code>service-interface</code> element
    * @return the node defined for the element <code>service-interface</code> 
    */
   public String getServiceInterface()
   {
      return childNode.getTextValueForPatternName("service-interface");
   }

   /**
    * Removes the <code>service-interface</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceInterface()
   {
      childNode.removeChildren("service-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-ref-type
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-ref-type</code> element
    * @param serviceRefType the value for the element <code>service-ref-type</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceRefType(String serviceRefType)
   {
      childNode.getOrCreate("service-ref-type").text(serviceRefType);
      return this;
   }

   /**
    * Returns the <code>service-ref-type</code> element
    * @return the node defined for the element <code>service-ref-type</code> 
    */
   public String getServiceRefType()
   {
      return childNode.getTextValueForPatternName("service-ref-type");
   }

   /**
    * Removes the <code>service-ref-type</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceRefType()
   {
      childNode.removeChildren("service-ref-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:anyURI ElementType : wsdl-file
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>wsdl-file</code> element
    * @param wsdlFile the value for the element <code>wsdl-file</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> wsdlFile(String wsdlFile)
   {
      childNode.getOrCreate("wsdl-file").text(wsdlFile);
      return this;
   }

   /**
    * Returns the <code>wsdl-file</code> element
    * @return the node defined for the element <code>wsdl-file</code> 
    */
   public String getWsdlFile()
   {
      return childNode.getTextValueForPatternName("wsdl-file");
   }

   /**
    * Removes the <code>wsdl-file</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeWsdlFile()
   {
      childNode.removeChildren("wsdl-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : jaxrpc-mapping-file
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jaxrpc-mapping-file</code> element
    * @param jaxrpcMappingFile the value for the element <code>jaxrpc-mapping-file</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> jaxrpcMappingFile(String jaxrpcMappingFile)
   {
      childNode.getOrCreate("jaxrpc-mapping-file").text(jaxrpcMappingFile);
      return this;
   }

   /**
    * Returns the <code>jaxrpc-mapping-file</code> element
    * @return the node defined for the element <code>jaxrpc-mapping-file</code> 
    */
   public String getJaxrpcMappingFile()
   {
      return childNode.getTextValueForPatternName("jaxrpc-mapping-file");
   }

   /**
    * Removes the <code>jaxrpc-mapping-file</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeJaxrpcMappingFile()
   {
      childNode.removeChildren("jaxrpc-mapping-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:QName ElementType : service-qname
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-qname</code> element
    * @param serviceQname the value for the element <code>service-qname</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceQname(String serviceQname)
   {
      childNode.getOrCreate("service-qname").text(serviceQname);
      return this;
   }

   /**
    * Returns the <code>service-qname</code> element
    * @return the node defined for the element <code>service-qname</code> 
    */
   public String getServiceQname()
   {
      return childNode.getTextValueForPatternName("service-qname");
   }

   /**
    * Removes the <code>service-qname</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceQname()
   {
      childNode.removeChildren("service-qname");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:port-component-refType ElementType : port-component-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-component-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>port-component-ref</code> element will be returned.
    * @return the instance defined for the element <code>port-component-ref</code> 
    */
   public PortComponentRefType<ServiceRefType<T>> getOrCreatePortComponentRef()
   {
      List<Node> nodeList = childNode.get("port-component-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "port-component-ref", childNode, nodeList.get(0));
      }
      return createPortComponentRef();
   }

   /**
    * Creates a new <code>port-component-ref</code> element 
    * @return the new created instance of <code>PortComponentRefType<ServiceRefType<T>></code> 
    */
   public PortComponentRefType<ServiceRefType<T>> createPortComponentRef()
   {
      return new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "port-component-ref", childNode);
   }

   /**
    * Returns all <code>port-component-ref</code> elements
    * @return list of <code>port-component-ref</code> 
    */
   public List<PortComponentRefType<ServiceRefType<T>>> getAllPortComponentRef()
   {
      List<PortComponentRefType<ServiceRefType<T>>> list = new ArrayList<PortComponentRefType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("port-component-ref");
      for(Node node: nodeList)
      {
         PortComponentRefType<ServiceRefType<T>>  type = new PortComponentRefTypeImpl<ServiceRefType<T>>(this, "port-component-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>port-component-ref</code> elements 
    * @return the current instance of <code>PortComponentRefType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllPortComponentRef()
   {
      childNode.removeChildren("port-component-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:handlerType ElementType : handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler</code> element will be created and returned.
    * Otherwise, the first existing <code>handler</code> element will be returned.
    * @return the instance defined for the element <code>handler</code> 
    */
   public HandlerType<ServiceRefType<T>> getOrCreateHandler()
   {
      List<Node> nodeList = childNode.get("handler");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new HandlerTypeImpl<ServiceRefType<T>>(this, "handler", childNode, nodeList.get(0));
      }
      return createHandler();
   }

   /**
    * Creates a new <code>handler</code> element 
    * @return the new created instance of <code>HandlerType<ServiceRefType<T>></code> 
    */
   public HandlerType<ServiceRefType<T>> createHandler()
   {
      return new HandlerTypeImpl<ServiceRefType<T>>(this, "handler", childNode);
   }

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<HandlerType<ServiceRefType<T>>> getAllHandler()
   {
      List<HandlerType<ServiceRefType<T>>> list = new ArrayList<HandlerType<ServiceRefType<T>>>();
      List<Node> nodeList = childNode.get("handler");
      for(Node node: nodeList)
      {
         HandlerType<ServiceRefType<T>>  type = new HandlerTypeImpl<ServiceRefType<T>>(this, "handler", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of <code>HandlerType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllHandler()
   {
      childNode.removeChildren("handler");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:handler-chainsType ElementType : handler-chains
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chains</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-chains</code> element will be returned.
    * @return  a new or existing instance of <code>HandlerChainsType<ServiceRefType<T>></code> 
    */
   public HandlerChainsType<ServiceRefType<T>> getOrCreateHandlerChains()
   {
      Node node = childNode.getOrCreate("handler-chains");
      HandlerChainsType<ServiceRefType<T>> handlerChains = new HandlerChainsTypeImpl<ServiceRefType<T>>(this, "handler-chains", childNode, node);
      return handlerChains;
   }

   /**
    * Removes the <code>handler-chains</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeHandlerChains()
   {
      childNode.removeChildren("handler-chains");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> id(String id)
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
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
