package org.jboss.shrinkwrap.descriptor.impl.beans10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.beans10.Alternatives;
import org.jboss.shrinkwrap.descriptor.api.beans10.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.beans10.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans10.Interceptors;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

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
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/beans_1_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
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
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public Interceptors<BeansDescriptor> getOrCreateInterceptors()
   {
      Node node = model.getOrCreate("interceptors");
      Interceptors<BeansDescriptor> interceptors = new InterceptorsImpl<BeansDescriptor>(this, "interceptors", model, node);
      return interceptors;
   }

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeInterceptors()
   {
      model.removeChildren("interceptors");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element with the given value will be created.
    * Otherwise, the existing <code>decorators</code> element will be returned.
    * @return  a new or existing instance of <code>Decorators<BeansDescriptor></code> 
    */
   public Decorators<BeansDescriptor> getOrCreateDecorators()
   {
      Node node = model.getOrCreate("decorators");
      Decorators<BeansDescriptor> decorators = new DecoratorsImpl<BeansDescriptor>(this, "decorators", model, node);
      return decorators;
   }

   /**
    * Removes the <code>decorators</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeDecorators()
   {
      model.removeChildren("decorators");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element with the given value will be created.
    * Otherwise, the existing <code>alternatives</code> element will be returned.
    * @return  a new or existing instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public Alternatives<BeansDescriptor> getOrCreateAlternatives()
   {
      Node node = model.getOrCreate("alternatives");
      Alternatives<BeansDescriptor> alternatives = new AlternativesImpl<BeansDescriptor>(this, "alternatives", model, node);
      return alternatives;
   }

   /**
    * Removes the <code>alternatives</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeAlternatives()
   {
      model.removeChildren("alternatives");
      return this;
   }

}
