package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     PersistenceDescriptor descriptor = Descriptors.create(PersistenceDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<PersistenceDescriptor>, PersistenceDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("persistence"));
   }

   public PersistenceDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/persistence");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor removeAllNamespaces()
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
   // ClassName: PersistenceDescriptor ElementName: persistence:persistence-unit ElementType : persistence-unit
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<PersistenceDescriptor> getOrCreatePersistenceUnit()
   {
      List<Node> nodeList = model.get("persistence-unit");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitImpl<PersistenceDescriptor>(this, "persistence-unit", model, nodeList.get(0));
      }
      return createPersistenceUnit();
   }

   /**
    * Creates a new <code>persistence-unit</code> element 
    * @return the new created instance of <code>PersistenceUnit<PersistenceDescriptor></code> 
    */
   public PersistenceUnit<PersistenceDescriptor> createPersistenceUnit()
   {
      return new PersistenceUnitImpl<PersistenceDescriptor>(this, "persistence-unit", model);
   }

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<PersistenceDescriptor>> getAllPersistenceUnit()
   {
      List<PersistenceUnit<PersistenceDescriptor>> list = new ArrayList<PersistenceUnit<PersistenceDescriptor>>();
      List<Node> nodeList = model.get("persistence-unit");
      for(Node node: nodeList)
      {
         PersistenceUnit<PersistenceDescriptor>  type = new PersistenceUnitImpl<PersistenceDescriptor>(this, "persistence-unit", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of <code>PersistenceUnit<PersistenceDescriptor></code> 
    */
   public PersistenceDescriptor removeAllPersistenceUnit()
   {
      model.removeChildren("persistence-unit");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor version(String version)
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
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
