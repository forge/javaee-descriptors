package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagComponentType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglib-tag-componentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTagComponentTypeImpl<T> implements Child<T>, FaceletTaglibTagComponentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTagComponentTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTagComponentTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagComponentType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibTagComponentType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagComponentType<T>></code> 
    */
   public IconType<FaceletTaglibTagComponentType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibTagComponentType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagComponentType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibTagComponentType<T>>> list = new ArrayList<IconType<FaceletTaglibTagComponentType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibTagComponentType<T>>  type = new IconTypeImpl<FaceletTaglibTagComponentType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagComponentType<T>></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : component-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-type</code> element
    * @param componentType the value for the element <code>component-type</code> 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> componentType(String componentType)
   {
      childNode.getOrCreate("component-type").text(componentType);
      return this;
   }

   /**
    * Returns the <code>component-type</code> element
    * @return the node defined for the element <code>component-type</code> 
    */
   public String getComponentType()
   {
      return childNode.getTextValueForPatternName("component-type");
   }

   /**
    * Removes the <code>component-type</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeComponentType()
   {
      childNode.removeChildren("component-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : renderer-type
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-type</code> element
    * @param rendererType the value for the element <code>renderer-type</code> 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> rendererType(String rendererType)
   {
      childNode.getOrCreate("renderer-type").text(rendererType);
      return this;
   }

   /**
    * Returns the <code>renderer-type</code> element
    * @return the node defined for the element <code>renderer-type</code> 
    */
   public String getRendererType()
   {
      return childNode.getTextValueForPatternName("renderer-type");
   }

   /**
    * Removes the <code>renderer-type</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeRendererType()
   {
      childNode.removeChildren("renderer-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> handlerClass(String handlerClass)
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
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: javaee:facelet-taglib-tag-component-extensionType ElementType : component-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> componentExtension()
   {
      childNode.getOrCreate("component-extension");
      return this;
   }

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public Boolean isComponentExtension()
   {
      return childNode.getSingle("component-extension") != null;
   }

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeComponentExtension()
   {
      childNode.removeChild("component-extension");
      return this;
   }
}
