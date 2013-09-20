package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MultipartConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

/**
 * This class implements the <code> servletType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServletTypeImpl<T> implements Child<T>, ServletType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServletTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServletTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> description(String ... values)
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
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> displayName(String ... values)
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
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ServletType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ServletType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ServletType<T>></code> 
    */
   public IconType<ServletType<T>> createIcon()
   {
      return new IconTypeImpl<ServletType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServletType<T>>> getAllIcon()
   {
      List<IconType<ServletType<T>>> list = new ArrayList<IconType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ServletType<T>>  type = new IconTypeImpl<ServletType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ServletType<T>></code> 
    */
   public ServletType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>servlet-name</code> element
    * @param servletName the value for the element <code>servlet-name</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> servletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName()
   {
      return childNode.getTextValueForPatternName("servlet-name");
   }

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeServletName()
   {
      childNode.removeChildren("servlet-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:token ElementType : servlet-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>servlet-class</code> element
    * @param servletClass the value for the element <code>servlet-class</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> servletClass(String servletClass)
   {
      childNode.getOrCreate("servlet-class").text(servletClass);
      return this;
   }

   /**
    * Returns the <code>servlet-class</code> element
    * @return the node defined for the element <code>servlet-class</code> 
    */
   public String getServletClass()
   {
      return childNode.getTextValueForPatternName("servlet-class");
   }

   /**
    * Removes the <code>servlet-class</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeServletClass()
   {
      childNode.removeChildren("servlet-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:pathType ElementType : jsp-file
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jsp-file</code> element
    * @param jspFile the value for the element <code>jsp-file</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> jspFile(String jspFile)
   {
      childNode.getOrCreate("jsp-file").text(jspFile);
      return this;
   }

   /**
    * Returns the <code>jsp-file</code> element
    * @return the node defined for the element <code>jsp-file</code> 
    */
   public String getJspFile()
   {
      return childNode.getTextValueForPatternName("jsp-file");
   }

   /**
    * Removes the <code>jsp-file</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeJspFile()
   {
      childNode.removeChildren("jsp-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServletType<T>> getOrCreateInitParam()
   {
      List<Node> nodeList = childNode.get("init-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<ServletType<T>>(this, "init-param", childNode, nodeList.get(0));
      }
      return createInitParam();
   }

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<ServletType<T>></code> 
    */
   public ParamValueType<ServletType<T>> createInitParam()
   {
      return new ParamValueTypeImpl<ServletType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServletType<T>>> getAllInitParam()
   {
      List<ParamValueType<ServletType<T>>> list = new ArrayList<ParamValueType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for(Node node: nodeList)
      {
         ParamValueType<ServletType<T>>  type = new ParamValueTypeImpl<ServletType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<ServletType<T>></code> 
    */
   public ServletType<T> removeAllInitParam()
   {
      childNode.removeChildren("init-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:integer ElementType : load-on-startup
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>load-on-startup</code> element
    * @param loadOnStartup the value for the element <code>load-on-startup</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> loadOnStartup(Integer loadOnStartup)
   {
      childNode.getOrCreate("load-on-startup").text(loadOnStartup);
      return this;
   }

   /**
    * Returns the <code>load-on-startup</code> element
    * @return the node defined for the element <code>load-on-startup</code> 
    */
   public Integer getLoadOnStartup()
   {
      if (childNode.getTextValueForPatternName("load-on-startup") != null && !childNode.getTextValueForPatternName("load-on-startup").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("load-on-startup"));
      }
      return null;
   }

   /**
    * Removes the <code>load-on-startup</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeLoadOnStartup()
   {
      childNode.removeChildren("load-on-startup");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:xsdBooleanType ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> element
    * @param enabled the value for the element <code>enabled</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> enabled(Boolean enabled)
   {
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("enabled"));
   }

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeEnabled()
   {
      childNode.removeChildren("enabled");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:xsdBooleanType ElementType : async-supported
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>async-supported</code> element
    * @param asyncSupported the value for the element <code>async-supported</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> asyncSupported(Boolean asyncSupported)
   {
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("async-supported"));
   }

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeAsyncSupported()
   {
      childNode.removeChildren("async-supported");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:run-asType ElementType : run-as
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>run-as</code> element with the given value will be created.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return  a new or existing instance of <code>RunAsType<ServletType<T>></code> 
    */
   public RunAsType<ServletType<T>> getOrCreateRunAs()
   {
      Node node = childNode.getOrCreate("run-as");
      RunAsType<ServletType<T>> runAs = new RunAsTypeImpl<ServletType<T>>(this, "run-as", childNode, node);
      return runAs;
   }

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeRunAs()
   {
      childNode.removeChildren("run-as");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<ServletType<T>> getOrCreateSecurityRoleRef()
   {
      List<Node> nodeList = childNode.get("security-role-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleRefTypeImpl<ServletType<T>>(this, "security-role-ref", childNode, nodeList.get(0));
      }
      return createSecurityRoleRef();
   }

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<ServletType<T>></code> 
    */
   public SecurityRoleRefType<ServletType<T>> createSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<ServletType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<ServletType<T>>> getAllSecurityRoleRef()
   {
      List<SecurityRoleRefType<ServletType<T>>> list = new ArrayList<SecurityRoleRefType<ServletType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for(Node node: nodeList)
      {
         SecurityRoleRefType<ServletType<T>>  type = new SecurityRoleRefTypeImpl<ServletType<T>>(this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<ServletType<T>></code> 
    */
   public ServletType<T> removeAllSecurityRoleRef()
   {
      childNode.removeChildren("security-role-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:multipart-configType ElementType : multipart-config
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>multipart-config</code> element with the given value will be created.
    * Otherwise, the existing <code>multipart-config</code> element will be returned.
    * @return  a new or existing instance of <code>MultipartConfigType<ServletType<T>></code> 
    */
   public MultipartConfigType<ServletType<T>> getOrCreateMultipartConfig()
   {
      Node node = childNode.getOrCreate("multipart-config");
      MultipartConfigType<ServletType<T>> multipartConfig = new MultipartConfigTypeImpl<ServletType<T>>(this, "multipart-config", childNode, node);
      return multipartConfig;
   }

   /**
    * Removes the <code>multipart-config</code> element 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeMultipartConfig()
   {
      childNode.removeChildren("multipart-config");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> id(String id)
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
    * @return the current instance of <code>ServletType<T></code> 
    */
   public ServletType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
