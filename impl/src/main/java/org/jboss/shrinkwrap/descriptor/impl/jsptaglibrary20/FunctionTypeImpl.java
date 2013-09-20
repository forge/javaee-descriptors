package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.IconType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.FunctionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> functionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FunctionTypeImpl<T> implements Child<T>, FunctionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FunctionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FunctionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> description(String ... values)
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
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> displayName(String ... values)
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
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: j2ee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FunctionType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FunctionType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FunctionType<T>></code> 
    */
   public IconType<FunctionType<T>> createIcon()
   {
      return new IconTypeImpl<FunctionType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FunctionType<T>>> getAllIcon()
   {
      List<IconType<FunctionType<T>>> list = new ArrayList<IconType<FunctionType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FunctionType<T>>  type = new IconTypeImpl<FunctionType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FunctionType<T>></code> 
    */
   public FunctionType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: j2ee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : function-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-class</code> element
    * @param functionClass the value for the element <code>function-class</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> functionClass(String functionClass)
   {
      childNode.getOrCreate("function-class").text(functionClass);
      return this;
   }

   /**
    * Returns the <code>function-class</code> element
    * @return the node defined for the element <code>function-class</code> 
    */
   public String getFunctionClass()
   {
      return childNode.getTextValueForPatternName("function-class");
   }

   /**
    * Removes the <code>function-class</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeFunctionClass()
   {
      childNode.removeChildren("function-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:token ElementType : function-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-signature</code> element
    * @param functionSignature the value for the element <code>function-signature</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> functionSignature(String functionSignature)
   {
      childNode.getOrCreate("function-signature").text(functionSignature);
      return this;
   }

   /**
    * Returns the <code>function-signature</code> element
    * @return the node defined for the element <code>function-signature</code> 
    */
   public String getFunctionSignature()
   {
      return childNode.getTextValueForPatternName("function-signature");
   }

   /**
    * Removes the <code>function-signature</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeFunctionSignature()
   {
      childNode.removeChildren("function-signature");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> example(String example)
   {
      childNode.getOrCreate("example").text(example);
      return this;
   }

   /**
    * Returns the <code>example</code> element
    * @return the node defined for the element <code>example</code> 
    */
   public String getExample()
   {
      return childNode.getTextValueForPatternName("example");
   }

   /**
    * Removes the <code>example</code> element 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeExample()
   {
      childNode.removeChildren("example");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: j2ee:tld-extensionType ElementType : function-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>function-extension</code> element will be returned.
    * @return the instance defined for the element <code>function-extension</code> 
    */
   public TldExtensionType<FunctionType<T>> getOrCreateFunctionExtension()
   {
      List<Node> nodeList = childNode.get("function-extension");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldExtensionTypeImpl<FunctionType<T>>(this, "function-extension", childNode, nodeList.get(0));
      }
      return createFunctionExtension();
   }

   /**
    * Creates a new <code>function-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<FunctionType<T>></code> 
    */
   public TldExtensionType<FunctionType<T>> createFunctionExtension()
   {
      return new TldExtensionTypeImpl<FunctionType<T>>(this, "function-extension", childNode);
   }

   /**
    * Returns all <code>function-extension</code> elements
    * @return list of <code>function-extension</code> 
    */
   public List<TldExtensionType<FunctionType<T>>> getAllFunctionExtension()
   {
      List<TldExtensionType<FunctionType<T>>> list = new ArrayList<TldExtensionType<FunctionType<T>>>();
      List<Node> nodeList = childNode.get("function-extension");
      for(Node node: nodeList)
      {
         TldExtensionType<FunctionType<T>>  type = new TldExtensionTypeImpl<FunctionType<T>>(this, "function-extension", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>function-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<FunctionType<T>></code> 
    */
   public FunctionType<T> removeAllFunctionExtension()
   {
      childNode.removeChildren("function-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FunctionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> id(String id)
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
    * @return the current instance of <code>FunctionType<T></code> 
    */
   public FunctionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
