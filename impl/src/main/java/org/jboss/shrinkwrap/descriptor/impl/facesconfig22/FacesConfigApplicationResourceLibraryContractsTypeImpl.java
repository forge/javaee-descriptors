package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationResourceLibraryContractsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationResourceLibraryContractsContractMappingType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;

/**
 * This class implements the <code> faces-config-application-resource-library-contractsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigApplicationResourceLibraryContractsTypeImpl<T> implements Child<T>, FacesConfigApplicationResourceLibraryContractsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigApplicationResourceLibraryContractsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigApplicationResourceLibraryContractsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceLibraryContractsType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigApplicationResourceLibraryContractsType<T>>> list = new ArrayList<IconType<FacesConfigApplicationResourceLibraryContractsType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigApplicationResourceLibraryContractsType<T>>  type = new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: javaee:faces-config-application-resource-library-contracts-contract-mappingType ElementType : contract-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>contract-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>contract-mapping</code> element will be returned.
    * @return the instance defined for the element <code>contract-mapping</code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>> getOrCreateContractMapping()
   {
      List<Node> nodeList = childNode.get("contract-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "contract-mapping", childNode, nodeList.get(0));
      }
      return createContractMapping();
   }

   /**
    * Creates a new <code>contract-mapping</code> element 
    * @return the new created instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>> createContractMapping()
   {
      return new FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "contract-mapping", childNode);
   }

   /**
    * Returns all <code>contract-mapping</code> elements
    * @return list of <code>contract-mapping</code> 
    */
   public List<FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>>> getAllContractMapping()
   {
      List<FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>>> list = new ArrayList<FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>>>();
      List<Node> nodeList = childNode.get("contract-mapping");
      for(Node node: nodeList)
      {
         FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>>  type = new FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl<FacesConfigApplicationResourceLibraryContractsType<T>>(this, "contract-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>contract-mapping</code> elements 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllContractMapping()
   {
      childNode.removeChildren("contract-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
