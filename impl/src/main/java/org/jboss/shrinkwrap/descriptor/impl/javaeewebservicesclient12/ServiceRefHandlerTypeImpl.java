package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> service-ref_handlerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServiceRefHandlerTypeImpl<T> implements Child<T>, ServiceRefHandlerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServiceRefHandlerTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> description(String ... values)
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
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> displayName(String ... values)
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
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefHandlerType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ServiceRefHandlerType<T>></code> 
    */
   public IconType<ServiceRefHandlerType<T>> createIcon()
   {
      return new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefHandlerType<T>>> getAllIcon()
   {
      List<IconType<ServiceRefHandlerType<T>>> list = new ArrayList<IconType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ServiceRefHandlerType<T>>  type = new IconTypeImpl<ServiceRefHandlerType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ServiceRefHandlerType<T>></code> 
    */
   public ServiceRefHandlerType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:token ElementType : handler-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-name</code> element
    * @param handlerName the value for the element <code>handler-name</code> 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> handlerName(String handlerName)
   {
      childNode.getOrCreate("handler-name").text(handlerName);
      return this;
   }

   /**
    * Returns the <code>handler-name</code> element
    * @return the node defined for the element <code>handler-name</code> 
    */
   public String getHandlerName()
   {
      return childNode.getTextValueForPatternName("handler-name");
   }

   /**
    * Removes the <code>handler-name</code> element 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeHandlerName()
   {
      childNode.removeChildren("handler-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> handlerClass(String handlerClass)
   {
      childNode.getOrCreate("handler-class").text(handlerClass);
      return this;
   }

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass()
   {
      return childNode.getTextValueForPatternName("handler-class");
   }

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<ServiceRefHandlerType<T>> getOrCreateInitParam()
   {
      List<Node> nodeList = childNode.get("init-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this, "init-param", childNode, nodeList.get(0));
      }
      return createInitParam();
   }

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<ServiceRefHandlerType<T>></code> 
    */
   public ParamValueType<ServiceRefHandlerType<T>> createInitParam()
   {
      return new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ServiceRefHandlerType<T>>> getAllInitParam()
   {
      List<ParamValueType<ServiceRefHandlerType<T>>> list = new ArrayList<ParamValueType<ServiceRefHandlerType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for(Node node: nodeList)
      {
         ParamValueType<ServiceRefHandlerType<T>>  type = new ParamValueTypeImpl<ServiceRefHandlerType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<ServiceRefHandlerType<T>></code> 
    */
   public ServiceRefHandlerType<T> removeAllInitParam()
   {
      childNode.removeChildren("init-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:QName ElementType : soap-header
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>soap-header</code> elements, 
    * a new <code>soap-header</code> element 
    * @param values list of <code>soap-header</code> objects 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> soapHeader(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("soap-header").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>soap-header</code> elements
    * @return list of <code>soap-header</code> 
    */
public List<String> getAllSoapHeader()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-header");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>soap-header</code> element 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeAllSoapHeader()
   {
      childNode.removeChildren("soap-header");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:token ElementType : soap-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>soap-role</code> elements, 
    * a new <code>soap-role</code> element 
    * @param values list of <code>soap-role</code> objects 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> soapRole(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("soap-role").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>soap-role</code> elements
    * @return list of <code>soap-role</code> 
    */
public List<String> getAllSoapRole()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("soap-role");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>soap-role</code> element 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeAllSoapRole()
   {
      childNode.removeChildren("soap-role");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:token ElementType : port-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>port-name</code> elements, 
    * a new <code>port-name</code> element 
    * @param values list of <code>port-name</code> objects 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> portName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("port-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>port-name</code> elements
    * @return list of <code>port-name</code> 
    */
public List<String> getAllPortName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("port-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>port-name</code> element 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeAllPortName()
   {
      childNode.removeChildren("port-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> id(String id)
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
    * @return the current instance of <code>ServiceRefHandlerType<T></code> 
    */
   public ServiceRefHandlerType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
