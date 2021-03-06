package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConnectorType;
import org.jboss.shrinkwrap.descriptor.api.connector16.LicenseType;
import org.jboss.shrinkwrap.descriptor.api.connector16.ResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> connectorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectorTypeImpl<T> implements Child<T>, ConnectorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> description(String ... values)
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
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> displayName(String ... values)
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
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ConnectorType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ConnectorType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ConnectorType<T>></code> 
    */
   public IconType<ConnectorType<T>> createIcon()
   {
      return new IconTypeImpl<ConnectorType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConnectorType<T>>> getAllIcon()
   {
      List<IconType<ConnectorType<T>>> list = new ArrayList<IconType<ConnectorType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ConnectorType<T>>  type = new IconTypeImpl<ConnectorType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ConnectorType<T>></code> 
    */
   public ConnectorType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> moduleName(String moduleName)
   {
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName()
   {
      return childNode.getTextValueForPatternName("module-name");
   }

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeModuleName()
   {
      childNode.removeChildren("module-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> vendorName(String vendorName)
   {
      childNode.getOrCreate("vendor-name").text(vendorName);
      return this;
   }

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName()
   {
      return childNode.getTextValueForPatternName("vendor-name");
   }

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeVendorName()
   {
      childNode.removeChildren("vendor-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> eisType(String eisType)
   {
      childNode.getOrCreate("eis-type").text(eisType);
      return this;
   }

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType()
   {
      return childNode.getTextValueForPatternName("eis-type");
   }

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeEisType()
   {
      childNode.removeChildren("eis-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : resourceadapter-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-version</code> element
    * @param resourceadapterVersion the value for the element <code>resourceadapter-version</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> resourceadapterVersion(String resourceadapterVersion)
   {
      childNode.getOrCreate("resourceadapter-version").text(resourceadapterVersion);
      return this;
   }

   /**
    * Returns the <code>resourceadapter-version</code> element
    * @return the node defined for the element <code>resourceadapter-version</code> 
    */
   public String getResourceadapterVersion()
   {
      return childNode.getTextValueForPatternName("resourceadapter-version");
   }

   /**
    * Removes the <code>resourceadapter-version</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeResourceadapterVersion()
   {
      childNode.removeChildren("resourceadapter-version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:licenseType ElementType : license
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>LicenseType<ConnectorType<T>></code> 
    */
   public LicenseType<ConnectorType<T>> getOrCreateLicense()
   {
      Node node = childNode.getOrCreate("license");
      LicenseType<ConnectorType<T>> license = new LicenseTypeImpl<ConnectorType<T>>(this, "license", childNode, node);
      return license;
   }

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeLicense()
   {
      childNode.removeChildren("license");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:resourceadapterType ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>ResourceadapterType<ConnectorType<T>></code> 
    */
   public ResourceadapterType<ConnectorType<T>> getOrCreateResourceadapter()
   {
      Node node = childNode.getOrCreate("resourceadapter");
      ResourceadapterType<ConnectorType<T>> resourceadapter = new ResourceadapterTypeImpl<ConnectorType<T>>(this, "resourceadapter", childNode, node);
      return resourceadapter;
   }

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeResourceadapter()
   {
      childNode.removeChildren("resourceadapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : required-work-context
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>required-work-context</code> elements, 
    * a new <code>required-work-context</code> element 
    * @param values list of <code>required-work-context</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> requiredWorkContext(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("required-work-context").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>required-work-context</code> elements
    * @return list of <code>required-work-context</code> 
    */
public List<String> getAllRequiredWorkContext()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("required-work-context");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>required-work-context</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllRequiredWorkContext()
   {
      childNode.removeChildren("required-work-context");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> metadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> id(String id)
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
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
