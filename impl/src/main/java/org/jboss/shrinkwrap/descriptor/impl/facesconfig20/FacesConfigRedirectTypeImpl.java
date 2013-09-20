package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectViewParamType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigRedirectViewParamTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectViewParamType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigRedirectViewParamTypeImpl;

/**
 * This class implements the <code> faces-config-redirectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigRedirectTypeImpl<T> implements Child<T>, FacesConfigRedirectType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigRedirectTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigRedirectTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: javaee:faces-config-redirect-viewParamType ElementType : view-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>view-param</code> element will be created and returned.
    * Otherwise, the first existing <code>view-param</code> element will be returned.
    * @return the instance defined for the element <code>view-param</code> 
    */
   public FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>> getOrCreateViewParam()
   {
      List<Node> nodeList = childNode.get("view-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigRedirectViewParamTypeImpl<FacesConfigRedirectType<T>>(this, "view-param", childNode, nodeList.get(0));
      }
      return createViewParam();
   }

   /**
    * Creates a new <code>view-param</code> element 
    * @return the new created instance of <code>FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>></code> 
    */
   public FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>> createViewParam()
   {
      return new FacesConfigRedirectViewParamTypeImpl<FacesConfigRedirectType<T>>(this, "view-param", childNode);
   }

   /**
    * Returns all <code>view-param</code> elements
    * @return list of <code>view-param</code> 
    */
   public List<FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>>> getAllViewParam()
   {
      List<FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>>> list = new ArrayList<FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>>>();
      List<Node> nodeList = childNode.get("view-param");
      for(Node node: nodeList)
      {
         FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>>  type = new FacesConfigRedirectViewParamTypeImpl<FacesConfigRedirectType<T>>(this, "view-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>view-param</code> elements 
    * @return the current instance of <code>FacesConfigRedirectViewParamType<FacesConfigRedirectType<T>></code> 
    */
   public FacesConfigRedirectType<T> removeAllViewParam()
   {
      childNode.removeChildren("view-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRedirectType ElementName: xsd:boolean ElementType : include-view-params
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-view-params</code> attribute
    * @param includeViewParams the value for the attribute <code>include-view-params</code> 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> includeViewParams(Boolean includeViewParams)
   {
      childNode.attribute("include-view-params", includeViewParams);
      return this;
   }

   /**
    * Returns the <code>include-view-params</code> attribute
    * @return the value defined for the attribute <code>include-view-params</code> 
    */
   public Boolean isIncludeViewParams()
   {
      return Strings.isTrue(childNode.getAttribute("include-view-params"));
   }

   /**
    * Removes the <code>include-view-params</code> attribute 
    * @return the current instance of <code>FacesConfigRedirectType<T></code> 
    */
   public FacesConfigRedirectType<T> removeIncludeViewParams()
   {
      childNode.removeAttribute("include-view-params");
      return this;
   }
}
