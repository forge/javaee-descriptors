package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagValidatorType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglib-tag-validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTagValidatorTypeImpl<T> implements Child<T>, FaceletTaglibTagValidatorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTagValidatorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTagValidatorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagValidatorType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibTagValidatorType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagValidatorType<T>></code> 
    */
   public IconType<FaceletTaglibTagValidatorType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibTagValidatorType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagValidatorType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibTagValidatorType<T>>> list = new ArrayList<IconType<FaceletTaglibTagValidatorType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibTagValidatorType<T>>  type = new IconTypeImpl<FaceletTaglibTagValidatorType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagValidatorType<T>></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-id</code> element
    * @param validatorId the value for the element <code>validator-id</code> 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> validatorId(String validatorId)
   {
      childNode.getOrCreate("validator-id").text(validatorId);
      return this;
   }

   /**
    * Returns the <code>validator-id</code> element
    * @return the node defined for the element <code>validator-id</code> 
    */
   public String getValidatorId()
   {
      return childNode.getTextValueForPatternName("validator-id");
   }

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeValidatorId()
   {
      childNode.removeChildren("validator-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> handlerClass(String handlerClass)
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
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: javaee:facelet-taglib-tag-validator-extensionType ElementType : validator-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> validatorExtension()
   {
      childNode.getOrCreate("validator-extension");
      return this;
   }

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public Boolean isValidatorExtension()
   {
      return childNode.getSingle("validator-extension") != null;
   }

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeValidatorExtension()
   {
      childNode.removeChild("validator-extension");
      return this;
   }
}
