package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagBehaviorType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglib-tag-behaviorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTagBehaviorTypeImpl<T> implements Child<T>, FaceletTaglibTagBehaviorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTagBehaviorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTagBehaviorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagBehaviorType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibTagBehaviorType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagBehaviorType<T>></code> 
    */
   public IconType<FaceletTaglibTagBehaviorType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibTagBehaviorType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagBehaviorType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibTagBehaviorType<T>>> list = new ArrayList<IconType<FaceletTaglibTagBehaviorType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibTagBehaviorType<T>>  type = new IconTypeImpl<FaceletTaglibTagBehaviorType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagBehaviorType<T>></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : behavior-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-id</code> element
    * @param behaviorId the value for the element <code>behavior-id</code> 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> behaviorId(String behaviorId)
   {
      childNode.getOrCreate("behavior-id").text(behaviorId);
      return this;
   }

   /**
    * Returns the <code>behavior-id</code> element
    * @return the node defined for the element <code>behavior-id</code> 
    */
   public String getBehaviorId()
   {
      return childNode.getTextValueForPatternName("behavior-id");
   }

   /**
    * Removes the <code>behavior-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeBehaviorId()
   {
      childNode.removeChildren("behavior-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> handlerClass(String handlerClass)
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
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: javaee:facelet-taglib-tag-behavior-extensionType ElementType : behavior-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> behaviorExtension()
   {
      childNode.getOrCreate("behavior-extension");
      return this;
   }

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public Boolean isBehaviorExtension()
   {
      return childNode.getSingle("behavior-extension") != null;
   }

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeBehaviorExtension()
   {
      childNode.removeChild("behavior-extension");
      return this;
   }
}
