package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigClientBehaviorRendererType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRenderKitType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRendererType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-render-kitType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigRenderKitTypeImpl<T> implements Child<T>, FacesConfigRenderKitType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigRenderKitTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigRenderKitTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigRenderKitType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigRenderKitType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigRenderKitType<T>></code> 
    */
   public IconType<FacesConfigRenderKitType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigRenderKitType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigRenderKitType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigRenderKitType<T>>> list = new ArrayList<IconType<FacesConfigRenderKitType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigRenderKitType<T>>  type = new IconTypeImpl<FacesConfigRenderKitType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : render-kit-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-id</code> element
    * @param renderKitId the value for the element <code>render-kit-id</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitId(String renderKitId)
   {
      childNode.getOrCreate("render-kit-id").text(renderKitId);
      return this;
   }

   /**
    * Returns the <code>render-kit-id</code> element
    * @return the node defined for the element <code>render-kit-id</code> 
    */
   public String getRenderKitId()
   {
      return childNode.getTextValueForPatternName("render-kit-id");
   }

   /**
    * Removes the <code>render-kit-id</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitId()
   {
      childNode.removeChildren("render-kit-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : render-kit-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-class</code> element
    * @param renderKitClass the value for the element <code>render-kit-class</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitClass(String renderKitClass)
   {
      childNode.getOrCreate("render-kit-class").text(renderKitClass);
      return this;
   }

   /**
    * Returns the <code>render-kit-class</code> element
    * @return the node defined for the element <code>render-kit-class</code> 
    */
   public String getRenderKitClass()
   {
      return childNode.getTextValueForPatternName("render-kit-class");
   }

   /**
    * Removes the <code>render-kit-class</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitClass()
   {
      childNode.removeChildren("render-kit-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-rendererType ElementType : renderer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>renderer</code> element will be created and returned.
    * Otherwise, the first existing <code>renderer</code> element will be returned.
    * @return the instance defined for the element <code>renderer</code> 
    */
   public FacesConfigRendererType<FacesConfigRenderKitType<T>> getOrCreateRenderer()
   {
      List<Node> nodeList = childNode.get("renderer");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "renderer", childNode, nodeList.get(0));
      }
      return createRenderer();
   }

   /**
    * Creates a new <code>renderer</code> element 
    * @return the new created instance of <code>FacesConfigRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRendererType<FacesConfigRenderKitType<T>> createRenderer()
   {
      return new FacesConfigRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "renderer", childNode);
   }

   /**
    * Returns all <code>renderer</code> elements
    * @return list of <code>renderer</code> 
    */
   public List<FacesConfigRendererType<FacesConfigRenderKitType<T>>> getAllRenderer()
   {
      List<FacesConfigRendererType<FacesConfigRenderKitType<T>>> list = new ArrayList<FacesConfigRendererType<FacesConfigRenderKitType<T>>>();
      List<Node> nodeList = childNode.get("renderer");
      for(Node node: nodeList)
      {
         FacesConfigRendererType<FacesConfigRenderKitType<T>>  type = new FacesConfigRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "renderer", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>renderer</code> elements 
    * @return the current instance of <code>FacesConfigRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllRenderer()
   {
      childNode.removeChildren("renderer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-client-behavior-rendererType ElementType : client-behavior-renderer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>client-behavior-renderer</code> element will be created and returned.
    * Otherwise, the first existing <code>client-behavior-renderer</code> element will be returned.
    * @return the instance defined for the element <code>client-behavior-renderer</code> 
    */
   public FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>> getOrCreateClientBehaviorRenderer()
   {
      List<Node> nodeList = childNode.get("client-behavior-renderer");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigClientBehaviorRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "client-behavior-renderer", childNode, nodeList.get(0));
      }
      return createClientBehaviorRenderer();
   }

   /**
    * Creates a new <code>client-behavior-renderer</code> element 
    * @return the new created instance of <code>FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>> createClientBehaviorRenderer()
   {
      return new FacesConfigClientBehaviorRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "client-behavior-renderer", childNode);
   }

   /**
    * Returns all <code>client-behavior-renderer</code> elements
    * @return list of <code>client-behavior-renderer</code> 
    */
   public List<FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>>> getAllClientBehaviorRenderer()
   {
      List<FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>>> list = new ArrayList<FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>>>();
      List<Node> nodeList = childNode.get("client-behavior-renderer");
      for(Node node: nodeList)
      {
         FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>>  type = new FacesConfigClientBehaviorRendererTypeImpl<FacesConfigRenderKitType<T>>(this, "client-behavior-renderer", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>client-behavior-renderer</code> elements 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllClientBehaviorRenderer()
   {
      childNode.removeChildren("client-behavior-renderer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-render-kit-extensionType ElementType : render-kit-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitExtension()
   {
      childNode.getOrCreate("render-kit-extension");
      return this;
   }

   /**
    * Removes the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public Boolean isRenderKitExtension()
   {
      return childNode.getSingle("render-kit-extension") != null;
   }

   /**
    * Removes the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitExtension()
   {
      childNode.removeChild("render-kit-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
