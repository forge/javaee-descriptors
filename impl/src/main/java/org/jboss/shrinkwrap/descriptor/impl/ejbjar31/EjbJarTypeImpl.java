package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.EnterpriseBeansTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.InterceptorsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.RelationshipsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AssemblyDescriptorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

/**
 * This class implements the <code> ejb-jarType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbJarTypeImpl<T> implements Child<T>, EjbJarType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbJarTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EjbJarTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> description(String ... values)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> displayName(String ... values)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EjbJarType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EjbJarType<T>></code> 
    */
   public IconType<EjbJarType<T>> createIcon()
   {
      return new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarType<T>>> getAllIcon()
   {
      List<IconType<EjbJarType<T>>> list = new ArrayList<IconType<EjbJarType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<EjbJarType<T>>  type = new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EjbJarType<T>></code> 
    */
   public EjbJarType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> moduleName(String moduleName)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeModuleName()
   {
      childNode.removeChildren("module-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:enterprise-beansType ElementType : enterprise-beans
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enterprise-beans</code> element with the given value will be created.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return  a new or existing instance of <code>EnterpriseBeansType<EjbJarType<T>></code> 
    */
   public EnterpriseBeansType<EjbJarType<T>> getOrCreateEnterpriseBeans()
   {
      Node node = childNode.getOrCreate("enterprise-beans");
      EnterpriseBeansType<EjbJarType<T>> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJarType<T>>(this, "enterprise-beans", childNode, node);
      return enterpriseBeans;
   }

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeEnterpriseBeans()
   {
      childNode.removeChildren("enterprise-beans");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:interceptorsType ElementType : interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorsType<EjbJarType<T>></code> 
    */
   public InterceptorsType<EjbJarType<T>> getOrCreateInterceptors()
   {
      Node node = childNode.getOrCreate("interceptors");
      InterceptorsType<EjbJarType<T>> interceptors = new InterceptorsTypeImpl<EjbJarType<T>>(this, "interceptors", childNode, node);
      return interceptors;
   }

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeInterceptors()
   {
      childNode.removeChildren("interceptors");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:relationshipsType ElementType : relationships
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationships</code> element with the given value will be created.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipsType<EjbJarType<T>></code> 
    */
   public RelationshipsType<EjbJarType<T>> getOrCreateRelationships()
   {
      Node node = childNode.getOrCreate("relationships");
      RelationshipsType<EjbJarType<T>> relationships = new RelationshipsTypeImpl<EjbJarType<T>>(this, "relationships", childNode, node);
      return relationships;
   }

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeRelationships()
   {
      childNode.removeChildren("relationships");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:assembly-descriptorType ElementType : assembly-descriptor
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>assembly-descriptor</code> element with the given value will be created.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return  a new or existing instance of <code>AssemblyDescriptorType<EjbJarType<T>></code> 
    */
   public AssemblyDescriptorType<EjbJarType<T>> getOrCreateAssemblyDescriptor()
   {
      Node node = childNode.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJarType<T>>(this, "assembly-descriptor", childNode, node);
      return assemblyDescriptor;
   }

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAssemblyDescriptor()
   {
      childNode.removeChildren("assembly-descriptor");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : ejb-client-jar
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-client-jar</code> element
    * @param ejbClientJar the value for the element <code>ejb-client-jar</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> ejbClientJar(String ejbClientJar)
   {
      childNode.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar()
   {
      return childNode.getTextValueForPatternName("ejb-client-jar");
   }

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeEjbClientJar()
   {
      childNode.removeChildren("ejb-client-jar");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> version(String version)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> metadataComplete(Boolean metadataComplete)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> id(String id)
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
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
