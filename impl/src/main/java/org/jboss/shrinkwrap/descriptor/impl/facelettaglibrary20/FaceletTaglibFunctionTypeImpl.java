package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibFunctionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglib-functionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibFunctionTypeImpl<T> implements Child<T>, FaceletTaglibFunctionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibFunctionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibFunctionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibFunctionType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibFunctionType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibFunctionType<T>></code> 
    */
   public IconType<FaceletTaglibFunctionType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibFunctionType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibFunctionType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibFunctionType<T>>> list = new ArrayList<IconType<FaceletTaglibFunctionType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibFunctionType<T>>  type = new IconTypeImpl<FaceletTaglibFunctionType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibFunctionType<T>></code> 
    */
   public FaceletTaglibFunctionType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-name</code> element
    * @param functionName the value for the element <code>function-name</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionName(String functionName)
   {
      childNode.getOrCreate("function-name").text(functionName);
      return this;
   }

   /**
    * Returns the <code>function-name</code> element
    * @return the node defined for the element <code>function-name</code> 
    */
   public String getFunctionName()
   {
      return childNode.getTextValueForPatternName("function-name");
   }

   /**
    * Removes the <code>function-name</code> element 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionName()
   {
      childNode.removeChildren("function-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-class</code> element
    * @param functionClass the value for the element <code>function-class</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionClass(String functionClass)
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
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionClass()
   {
      childNode.removeChildren("function-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibFunctionType ElementName: xsd:token ElementType : function-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>function-signature</code> element
    * @param functionSignature the value for the element <code>function-signature</code> 
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> functionSignature(String functionSignature)
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
    * @return the current instance of <code>FaceletTaglibFunctionType<T></code> 
    */
   public FaceletTaglibFunctionType<T> removeFunctionSignature()
   {
      childNode.removeChildren("function-signature");
      return this;
   }
}
