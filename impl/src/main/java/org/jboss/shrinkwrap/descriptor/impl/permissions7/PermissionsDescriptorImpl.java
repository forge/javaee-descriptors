package org.jboss.shrinkwrap.descriptor.impl.permissions7; 

import org.jboss.shrinkwrap.descriptor.api.permissions7.PermissionsDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permission;
import org.jboss.shrinkwrap.descriptor.impl.permissions7.PermissionImpl;
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
 *     PermissionsDescriptor descriptor = Descriptors.create(PermissionsDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PermissionsDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<PermissionsDescriptor>, PermissionsDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PermissionsDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("permissions"));
   }

   public PermissionsDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/permissions_7.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor removeAllNamespaces()
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
   // ClassName: PermissionsDescriptor ElementName: permissions:permission ElementType : permission
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>permission</code> element will be created and returned.
    * Otherwise, the first existing <code>permission</code> element will be returned.
    * @return the instance defined for the element <code>permission</code> 
    */
   public Permission<PermissionsDescriptor> getOrCreatePermission()
   {
      List<Node> nodeList = model.get("permission");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PermissionImpl<PermissionsDescriptor>(this, "permission", model, nodeList.get(0));
      }
      return createPermission();
   }

   /**
    * Creates a new <code>permission</code> element 
    * @return the new created instance of <code>Permission<PermissionsDescriptor></code> 
    */
   public Permission<PermissionsDescriptor> createPermission()
   {
      return new PermissionImpl<PermissionsDescriptor>(this, "permission", model);
   }

   /**
    * Returns all <code>permission</code> elements
    * @return list of <code>permission</code> 
    */
   public List<Permission<PermissionsDescriptor>> getAllPermission()
   {
      List<Permission<PermissionsDescriptor>> list = new ArrayList<Permission<PermissionsDescriptor>>();
      List<Node> nodeList = model.get("permission");
      for(Node node: nodeList)
      {
         Permission<PermissionsDescriptor>  type = new PermissionImpl<PermissionsDescriptor>(this, "permission", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>permission</code> elements 
    * @return the current instance of <code>Permission<PermissionsDescriptor></code> 
    */
   public PermissionsDescriptor removeAllPermission()
   {
      model.removeChildren("permission");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PermissionsDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor version(String version)
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
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
