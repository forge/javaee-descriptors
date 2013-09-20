package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFactoryType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-factoryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFactoryTypeImpl<T> implements Child<T>, FacesConfigFactoryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFactoryTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFactoryTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : application-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>application-factory</code> elements, 
    * a new <code>application-factory</code> element 
    * @param values list of <code>application-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> applicationFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("application-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>application-factory</code> elements
    * @return list of <code>application-factory</code> 
    */
public List<String> getAllApplicationFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("application-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>application-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllApplicationFactory()
   {
      childNode.removeChildren("application-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : exception-handler-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>exception-handler-factory</code> elements, 
    * a new <code>exception-handler-factory</code> element 
    * @param values list of <code>exception-handler-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> exceptionHandlerFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("exception-handler-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>exception-handler-factory</code> elements
    * @return list of <code>exception-handler-factory</code> 
    */
public List<String> getAllExceptionHandlerFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("exception-handler-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>exception-handler-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllExceptionHandlerFactory()
   {
      childNode.removeChildren("exception-handler-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : external-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>external-context-factory</code> elements, 
    * a new <code>external-context-factory</code> element 
    * @param values list of <code>external-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> externalContextFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("external-context-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>external-context-factory</code> elements
    * @return list of <code>external-context-factory</code> 
    */
public List<String> getAllExternalContextFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("external-context-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>external-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllExternalContextFactory()
   {
      childNode.removeChildren("external-context-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : faces-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>faces-context-factory</code> elements, 
    * a new <code>faces-context-factory</code> element 
    * @param values list of <code>faces-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> facesContextFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("faces-context-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>faces-context-factory</code> elements
    * @return list of <code>faces-context-factory</code> 
    */
public List<String> getAllFacesContextFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("faces-context-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>faces-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFacesContextFactory()
   {
      childNode.removeChildren("faces-context-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : facelet-cache-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>facelet-cache-factory</code> elements, 
    * a new <code>facelet-cache-factory</code> element 
    * @param values list of <code>facelet-cache-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> faceletCacheFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("facelet-cache-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>facelet-cache-factory</code> elements
    * @return list of <code>facelet-cache-factory</code> 
    */
public List<String> getAllFaceletCacheFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("facelet-cache-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>facelet-cache-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFaceletCacheFactory()
   {
      childNode.removeChildren("facelet-cache-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : partial-view-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>partial-view-context-factory</code> elements, 
    * a new <code>partial-view-context-factory</code> element 
    * @param values list of <code>partial-view-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> partialViewContextFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("partial-view-context-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>partial-view-context-factory</code> elements
    * @return list of <code>partial-view-context-factory</code> 
    */
public List<String> getAllPartialViewContextFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("partial-view-context-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>partial-view-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllPartialViewContextFactory()
   {
      childNode.removeChildren("partial-view-context-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : lifecycle-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>lifecycle-factory</code> elements, 
    * a new <code>lifecycle-factory</code> element 
    * @param values list of <code>lifecycle-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> lifecycleFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("lifecycle-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>lifecycle-factory</code> elements
    * @return list of <code>lifecycle-factory</code> 
    */
public List<String> getAllLifecycleFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("lifecycle-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>lifecycle-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllLifecycleFactory()
   {
      childNode.removeChildren("lifecycle-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : view-declaration-language-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>view-declaration-language-factory</code> elements, 
    * a new <code>view-declaration-language-factory</code> element 
    * @param values list of <code>view-declaration-language-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> viewDeclarationLanguageFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("view-declaration-language-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>view-declaration-language-factory</code> elements
    * @return list of <code>view-declaration-language-factory</code> 
    */
public List<String> getAllViewDeclarationLanguageFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("view-declaration-language-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>view-declaration-language-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllViewDeclarationLanguageFactory()
   {
      childNode.removeChildren("view-declaration-language-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : tag-handler-delegate-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>tag-handler-delegate-factory</code> elements, 
    * a new <code>tag-handler-delegate-factory</code> element 
    * @param values list of <code>tag-handler-delegate-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> tagHandlerDelegateFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("tag-handler-delegate-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>tag-handler-delegate-factory</code> elements
    * @return list of <code>tag-handler-delegate-factory</code> 
    */
public List<String> getAllTagHandlerDelegateFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("tag-handler-delegate-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>tag-handler-delegate-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllTagHandlerDelegateFactory()
   {
      childNode.removeChildren("tag-handler-delegate-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : render-kit-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>render-kit-factory</code> elements, 
    * a new <code>render-kit-factory</code> element 
    * @param values list of <code>render-kit-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> renderKitFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("render-kit-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>render-kit-factory</code> elements
    * @return list of <code>render-kit-factory</code> 
    */
public List<String> getAllRenderKitFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("render-kit-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>render-kit-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllRenderKitFactory()
   {
      childNode.removeChildren("render-kit-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : visit-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>visit-context-factory</code> elements, 
    * a new <code>visit-context-factory</code> element 
    * @param values list of <code>visit-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> visitContextFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("visit-context-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>visit-context-factory</code> elements
    * @return list of <code>visit-context-factory</code> 
    */
public List<String> getAllVisitContextFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("visit-context-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>visit-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllVisitContextFactory()
   {
      childNode.removeChildren("visit-context-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : flash-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>flash-factory</code> elements, 
    * a new <code>flash-factory</code> element 
    * @param values list of <code>flash-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> flashFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("flash-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>flash-factory</code> elements
    * @return list of <code>flash-factory</code> 
    */
public List<String> getAllFlashFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("flash-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>flash-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFlashFactory()
   {
      childNode.removeChildren("flash-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : flow-handler-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>flow-handler-factory</code> elements, 
    * a new <code>flow-handler-factory</code> element 
    * @param values list of <code>flow-handler-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> flowHandlerFactory(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("flow-handler-factory").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>flow-handler-factory</code> elements
    * @return list of <code>flow-handler-factory</code> 
    */
public List<String> getAllFlowHandlerFactory()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("flow-handler-factory");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>flow-handler-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFlowHandlerFactory()
   {
      childNode.removeChildren("flow-handler-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: javaee:faces-config-factory-extensionType ElementType : factory-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> factoryExtension()
   {
      childNode.getOrCreate("factory-extension");
      return this;
   }

   /**
    * Removes the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public Boolean isFactoryExtension()
   {
      return childNode.getSingle("factory-extension") != null;
   }

   /**
    * Removes the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeFactoryExtension()
   {
      childNode.removeChild("factory-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
