package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagConverterType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagConverterExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20.FaceletTaglibTagConverterExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> facelet-taglib-tag-converterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTagConverterTypeImpl<T> implements Child<T>, FaceletTaglibTagConverterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTagConverterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTagConverterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagConverterType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibTagConverterType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagConverterType<T>></code> 
    */
   public IconType<FaceletTaglibTagConverterType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibTagConverterType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagConverterType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibTagConverterType<T>>> list = new ArrayList<IconType<FaceletTaglibTagConverterType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibTagConverterType<T>>  type = new IconTypeImpl<FaceletTaglibTagConverterType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagConverterType<T>></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : converter-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-id</code> element
    * @param converterId the value for the element <code>converter-id</code> 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> converterId(String converterId)
   {
      childNode.getOrCreate("converter-id").text(converterId);
      return this;
   }

   /**
    * Returns the <code>converter-id</code> element
    * @return the node defined for the element <code>converter-id</code> 
    */
   public String getConverterId()
   {
      return childNode.getTextValueForPatternName("converter-id");
   }

   /**
    * Removes the <code>converter-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeConverterId()
   {
      childNode.removeChildren("converter-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> handlerClass(String handlerClass)
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
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: javaee:facelet-taglib-tag-converter-extensionType ElementType : converter-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> converterExtension()
   {
      childNode.getOrCreate("converter-extension");
      return this;
   }

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public Boolean isConverterExtension()
   {
      return childNode.getSingle("converter-extension") != null;
   }

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeConverterExtension()
   {
      childNode.removeChild("converter-extension");
      return this;
   }
}
