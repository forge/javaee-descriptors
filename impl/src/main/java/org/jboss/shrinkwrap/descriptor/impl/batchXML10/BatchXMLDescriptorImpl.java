package org.jboss.shrinkwrap.descriptor.impl.batchXML10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.batchXML10.BatchArtifactRef;
import org.jboss.shrinkwrap.descriptor.api.batchXML10.BatchXMLDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     BatchXMLDescriptor descriptor = Descriptors.create(BatchXMLDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BatchXMLDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<BatchXMLDescriptor>, BatchXMLDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BatchXMLDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("batch-artifacts"));
   }

   public BatchXMLDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>BatchXMLDescriptor</code> 
    */
   public BatchXMLDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/batchXML_1_0.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>BatchXMLDescriptor</code> 
    */
   public BatchXMLDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>BatchXMLDescriptor</code> 
    */
   public BatchXMLDescriptor removeAllNamespaces()
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
   // ClassName: BatchXMLDescriptor ElementName: jbatch:BatchArtifactRef ElementType : ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ref</code> element will be returned.
    * @return the instance defined for the element <code>ref</code> 
    */
   public BatchArtifactRef<BatchXMLDescriptor> getOrCreateRef()
   {
      List<Node> nodeList = model.get("ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BatchArtifactRefImpl<BatchXMLDescriptor>(this, "ref", model, nodeList.get(0));
      }
      return createRef();
   }

   /**
    * Creates a new <code>ref</code> element 
    * @return the new created instance of <code>BatchArtifactRef<BatchXMLDescriptor></code> 
    */
   public BatchArtifactRef<BatchXMLDescriptor> createRef()
   {
      return new BatchArtifactRefImpl<BatchXMLDescriptor>(this, "ref", model);
   }

   /**
    * Returns all <code>ref</code> elements
    * @return list of <code>ref</code> 
    */
   public List<BatchArtifactRef<BatchXMLDescriptor>> getAllRef()
   {
      List<BatchArtifactRef<BatchXMLDescriptor>> list = new ArrayList<BatchArtifactRef<BatchXMLDescriptor>>();
      List<Node> nodeList = model.get("ref");
      for(Node node: nodeList)
      {
         BatchArtifactRef<BatchXMLDescriptor>  type = new BatchArtifactRefImpl<BatchXMLDescriptor>(this, "ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ref</code> elements 
    * @return the current instance of <code>BatchArtifactRef<BatchXMLDescriptor></code> 
    */
   public BatchXMLDescriptor removeAllRef()
   {
      model.removeChildren("ref");
      return this;
   }

}
