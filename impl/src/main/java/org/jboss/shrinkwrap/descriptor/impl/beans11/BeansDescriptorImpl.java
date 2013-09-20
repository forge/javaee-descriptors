package org.jboss.shrinkwrap.descriptor.impl.beans11; 

import org.jboss.shrinkwrap.descriptor.api.beans11.BeansDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.beans11.Interceptors;
import org.jboss.shrinkwrap.descriptor.impl.beans11.InterceptorsImpl;
import org.jboss.shrinkwrap.descriptor.api.beans11.Decorators;
import org.jboss.shrinkwrap.descriptor.impl.beans11.DecoratorsImpl;
import org.jboss.shrinkwrap.descriptor.api.beans11.Alternatives;
import org.jboss.shrinkwrap.descriptor.impl.beans11.AlternativesImpl;
import org.jboss.shrinkwrap.descriptor.api.beans11.Scan;
import org.jboss.shrinkwrap.descriptor.impl.beans11.ScanImpl;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     BeansDescriptor descriptor = Descriptors.create(BeansDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BeansDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<BeansDescriptor>, BeansDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BeansDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("beans"));
   }

   public BeansDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/beans_1_1.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptors</code> element will be returned.
    * @return the instance defined for the element <code>interceptors</code> 
    */
   public Interceptors<BeansDescriptor> getOrCreateInterceptors()
   {
      List<Node> nodeList = model.get("interceptors");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InterceptorsImpl<BeansDescriptor>(this, "interceptors", model, nodeList.get(0));
      }
      return createInterceptors();
   }

   /**
    * Creates a new <code>interceptors</code> element 
    * @return the new created instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public Interceptors<BeansDescriptor> createInterceptors()
   {
      return new InterceptorsImpl<BeansDescriptor>(this, "interceptors", model);
   }

   /**
    * Returns all <code>interceptors</code> elements
    * @return list of <code>interceptors</code> 
    */
   public List<Interceptors<BeansDescriptor>> getAllInterceptors()
   {
      List<Interceptors<BeansDescriptor>> list = new ArrayList<Interceptors<BeansDescriptor>>();
      List<Node> nodeList = model.get("interceptors");
      for(Node node: nodeList)
      {
         Interceptors<BeansDescriptor>  type = new InterceptorsImpl<BeansDescriptor>(this, "interceptors", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>interceptors</code> elements 
    * @return the current instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllInterceptors()
   {
      model.removeChildren("interceptors");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element will be created and returned.
    * Otherwise, the first existing <code>decorators</code> element will be returned.
    * @return the instance defined for the element <code>decorators</code> 
    */
   public Decorators<BeansDescriptor> getOrCreateDecorators()
   {
      List<Node> nodeList = model.get("decorators");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DecoratorsImpl<BeansDescriptor>(this, "decorators", model, nodeList.get(0));
      }
      return createDecorators();
   }

   /**
    * Creates a new <code>decorators</code> element 
    * @return the new created instance of <code>Decorators<BeansDescriptor></code> 
    */
   public Decorators<BeansDescriptor> createDecorators()
   {
      return new DecoratorsImpl<BeansDescriptor>(this, "decorators", model);
   }

   /**
    * Returns all <code>decorators</code> elements
    * @return list of <code>decorators</code> 
    */
   public List<Decorators<BeansDescriptor>> getAllDecorators()
   {
      List<Decorators<BeansDescriptor>> list = new ArrayList<Decorators<BeansDescriptor>>();
      List<Node> nodeList = model.get("decorators");
      for(Node node: nodeList)
      {
         Decorators<BeansDescriptor>  type = new DecoratorsImpl<BeansDescriptor>(this, "decorators", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>decorators</code> elements 
    * @return the current instance of <code>Decorators<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllDecorators()
   {
      model.removeChildren("decorators");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element will be created and returned.
    * Otherwise, the first existing <code>alternatives</code> element will be returned.
    * @return the instance defined for the element <code>alternatives</code> 
    */
   public Alternatives<BeansDescriptor> getOrCreateAlternatives()
   {
      List<Node> nodeList = model.get("alternatives");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AlternativesImpl<BeansDescriptor>(this, "alternatives", model, nodeList.get(0));
      }
      return createAlternatives();
   }

   /**
    * Creates a new <code>alternatives</code> element 
    * @return the new created instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public Alternatives<BeansDescriptor> createAlternatives()
   {
      return new AlternativesImpl<BeansDescriptor>(this, "alternatives", model);
   }

   /**
    * Returns all <code>alternatives</code> elements
    * @return list of <code>alternatives</code> 
    */
   public List<Alternatives<BeansDescriptor>> getAllAlternatives()
   {
      List<Alternatives<BeansDescriptor>> list = new ArrayList<Alternatives<BeansDescriptor>>();
      List<Node> nodeList = model.get("alternatives");
      for(Node node: nodeList)
      {
         Alternatives<BeansDescriptor>  type = new AlternativesImpl<BeansDescriptor>(this, "alternatives", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>alternatives</code> elements 
    * @return the current instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllAlternatives()
   {
      model.removeChildren("alternatives");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:scan ElementType : scan
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scan</code> element will be created and returned.
    * Otherwise, the first existing <code>scan</code> element will be returned.
    * @return the instance defined for the element <code>scan</code> 
    */
   public Scan<BeansDescriptor> getOrCreateScan()
   {
      List<Node> nodeList = model.get("scan");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ScanImpl<BeansDescriptor>(this, "scan", model, nodeList.get(0));
      }
      return createScan();
   }

   /**
    * Creates a new <code>scan</code> element 
    * @return the new created instance of <code>Scan<BeansDescriptor></code> 
    */
   public Scan<BeansDescriptor> createScan()
   {
      return new ScanImpl<BeansDescriptor>(this, "scan", model);
   }

   /**
    * Returns all <code>scan</code> elements
    * @return list of <code>scan</code> 
    */
   public List<Scan<BeansDescriptor>> getAllScan()
   {
      List<Scan<BeansDescriptor>> list = new ArrayList<Scan<BeansDescriptor>>();
      List<Node> nodeList = model.get("scan");
      for(Node node: nodeList)
      {
         Scan<BeansDescriptor>  type = new ScanImpl<BeansDescriptor>(this, "scan", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>scan</code> elements 
    * @return the current instance of <code>Scan<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllScan()
   {
      model.removeChildren("scan");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: xsd:string ElementType : bean-discovery-mode
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bean-discovery-mode</code> attribute
    * @param beanDiscoveryMode the value for the attribute <code>bean-discovery-mode</code> 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor beanDiscoveryMode(String beanDiscoveryMode)
   {
      model.attribute("bean-discovery-mode", beanDiscoveryMode);
      return this;
   }

   /**
    * Returns the <code>bean-discovery-mode</code> attribute
    * @return the value defined for the attribute <code>bean-discovery-mode</code> 
    */
      public String getBeanDiscoveryMode()
   {
      return model.getAttribute("bean-discovery-mode");
   }

   /**
    * Removes the <code>bean-discovery-mode</code> attribute 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeBeanDiscoveryMode()
   {
      model.removeAttribute("bean-discovery-mode");
      return this;
   }

}
