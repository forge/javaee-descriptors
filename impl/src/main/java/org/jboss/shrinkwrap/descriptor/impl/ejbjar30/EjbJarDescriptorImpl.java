package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbJarDescriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     EjbJarDescriptor descriptor = Descriptors.create(EjbJarDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbJarDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<EjbJarDescriptor>, EjbJarDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbJarDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("ejb-jar"));
   }

   public EjbJarDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAllNamespaces()
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
   // ClassName: EjbJarDescriptor ElementName: javaee:enterprise-beansType ElementType : enterprise-beans
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enterprise-beans</code> element with the given value will be created.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return  a new or existing instance of <code>EnterpriseBeansType<EjbJarDescriptor></code> 
    */
   public EnterpriseBeansType<EjbJarDescriptor> getOrCreateEnterpriseBeans()
   {
      Node node = model.getOrCreate("enterprise-beans");
      EnterpriseBeansType<EjbJarDescriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJarDescriptor>(this, "enterprise-beans", model, node);
      return enterpriseBeans;
   }

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeEnterpriseBeans()
   {
      model.removeChildren("enterprise-beans");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:interceptorsType ElementType : interceptors
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorsType<EjbJarDescriptor></code> 
    */
   public InterceptorsType<EjbJarDescriptor> getOrCreateInterceptors()
   {
      Node node = model.getOrCreate("interceptors");
      InterceptorsType<EjbJarDescriptor> interceptors = new InterceptorsTypeImpl<EjbJarDescriptor>(this, "interceptors", model, node);
      return interceptors;
   }

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeInterceptors()
   {
      model.removeChildren("interceptors");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:relationshipsType ElementType : relationships
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationships</code> element with the given value will be created.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipsType<EjbJarDescriptor></code> 
    */
   public RelationshipsType<EjbJarDescriptor> getOrCreateRelationships()
   {
      Node node = model.getOrCreate("relationships");
      RelationshipsType<EjbJarDescriptor> relationships = new RelationshipsTypeImpl<EjbJarDescriptor>(this, "relationships", model, node);
      return relationships;
   }

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeRelationships()
   {
      model.removeChildren("relationships");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:assembly-descriptorType ElementType : assembly-descriptor
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>assembly-descriptor</code> element with the given value will be created.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return  a new or existing instance of <code>AssemblyDescriptorType<EjbJarDescriptor></code> 
    */
   public AssemblyDescriptorType<EjbJarDescriptor> getOrCreateAssemblyDescriptor()
   {
      Node node = model.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<EjbJarDescriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJarDescriptor>(this, "assembly-descriptor", model, node);
      return assemblyDescriptor;
   }

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAssemblyDescriptor()
   {
      model.removeChildren("assembly-descriptor");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : ejb-client-jar
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-client-jar</code> element
    * @param ejbClientJar the value for the element <code>ejb-client-jar</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor ejbClientJar(String ejbClientJar)
   {
      model.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar()
   {
      return model.getTextValueForPatternName("ejb-client-jar");
   }

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeEjbClientJar()
   {
      model.removeChildren("ejb-client-jar");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor version(String version)
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
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor metadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeMetadataComplete()
   {
      model.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("description").text(name);
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
      List<Node> nodes = model.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("display-name").text(name);
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
      List<Node> nodes = model.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EjbJarDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<EjbJarDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EjbJarDescriptor></code> 
    */
   public IconType<EjbJarDescriptor> createIcon()
   {
      return new IconTypeImpl<EjbJarDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarDescriptor>> getAllIcon()
   {
      List<IconType<EjbJarDescriptor>> list = new ArrayList<IconType<EjbJarDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<EjbJarDescriptor>  type = new IconTypeImpl<EjbJarDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EjbJarDescriptor></code> 
    */
   public EjbJarDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }

}
