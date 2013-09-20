package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResSharingScopeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;

/**
 * This class implements the <code> resource-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceRefTypeImpl<T> implements Child<T>, ResourceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> lookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.getTextValueForPatternName("lookup-name");
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeLookupName()
   {
      childNode.removeChildren("lookup-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ResourceRefType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<ResourceRefType<T>></code> 
    */
   public InjectionTargetType<ResourceRefType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ResourceRefType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<ResourceRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<ResourceRefType<T>>  type = new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<ResourceRefType<T>></code> 
    */
   public ResourceRefType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> description(String ... values)
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
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:token ElementType : res-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>res-ref-name</code> element
    * @param resRefName the value for the element <code>res-ref-name</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resRefName(String resRefName)
   {
      childNode.getOrCreate("res-ref-name").text(resRefName);
      return this;
   }

   /**
    * Returns the <code>res-ref-name</code> element
    * @return the node defined for the element <code>res-ref-name</code> 
    */
   public String getResRefName()
   {
      return childNode.getTextValueForPatternName("res-ref-name");
   }

   /**
    * Removes the <code>res-ref-name</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResRefName()
   {
      childNode.removeChildren("res-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:token ElementType : res-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>res-type</code> element
    * @param resType the value for the element <code>res-type</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resType(String resType)
   {
      childNode.getOrCreate("res-type").text(resType);
      return this;
   }

   /**
    * Returns the <code>res-type</code> element
    * @return the node defined for the element <code>res-type</code> 
    */
   public String getResType()
   {
      return childNode.getTextValueForPatternName("res-type");
   }

   /**
    * Removes the <code>res-type</code> element 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResType()
   {
      childNode.removeChildren("res-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: javaee:res-authType ElementType : res-auth
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>res-auth</code> element
    * @param resAuth the value for the element <code>res-auth</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resAuth(ResAuthType resAuth)
   {
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }
   /**
    * Sets the <code>res-auth</code> element
    * @param resAuth the value for the element <code>res-auth</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resAuth(String resAuth)
   {
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   /**
    * Returns the <code>res-auth</code> element
    * @return the value found for the element <code>res-auth</code> 
    */
   public ResAuthType getResAuth()
   {
      return ResAuthType.getFromStringValue(childNode.getTextValueForPatternName("res-auth"));
   }

   /**
    * Returns the <code>res-auth</code> element
    * @return the value found for the element <code>res-auth</code> 
    */
   public String  getResAuthAsString()
   {
      return childNode.getTextValueForPatternName("res-auth");
   }

   /**
    * Removes the <code>res-auth</code> attribute 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResAuth()
   {
      childNode.removeAttribute("res-auth");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: javaee:res-sharing-scopeType ElementType : res-sharing-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>res-sharing-scope</code> element
    * @param resSharingScope the value for the element <code>res-sharing-scope</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resSharingScope(ResSharingScopeType resSharingScope)
   {
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }
   /**
    * Sets the <code>res-sharing-scope</code> element
    * @param resSharingScope the value for the element <code>res-sharing-scope</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> resSharingScope(String resSharingScope)
   {
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the value found for the element <code>res-sharing-scope</code> 
    */
   public ResSharingScopeType getResSharingScope()
   {
      return ResSharingScopeType.getFromStringValue(childNode.getTextValueForPatternName("res-sharing-scope"));
   }

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the value found for the element <code>res-sharing-scope</code> 
    */
   public String  getResSharingScopeAsString()
   {
      return childNode.getTextValueForPatternName("res-sharing-scope");
   }

   /**
    * Removes the <code>res-sharing-scope</code> attribute 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeResSharingScope()
   {
      childNode.removeAttribute("res-sharing-scope");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> id(String id)
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
    * @return the current instance of <code>ResourceRefType<T></code> 
    */
   public ResourceRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
