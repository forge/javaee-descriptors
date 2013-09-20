package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationResourceLibraryContractsContractMappingType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-application-resource-library-contracts-contract-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl<T> implements Child<T>, FacesConfigApplicationResourceLibraryContractsContractMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigApplicationResourceLibraryContractsContractMappingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>> list = new ArrayList<IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>  type = new IconTypeImpl<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> urlPattern(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("url-pattern").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
public List<String> getAllUrlPattern()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:token ElementType : contracts
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>contracts</code> elements, 
    * a new <code>contracts</code> element 
    * @param values list of <code>contracts</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> contracts(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("contracts").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>contracts</code> elements
    * @return list of <code>contracts</code> 
    */
public List<String> getAllContracts()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("contracts");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>contracts</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllContracts()
   {
      childNode.removeChildren("contracts");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
