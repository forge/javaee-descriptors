package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigApplicationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigAbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigAbsoluteOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFactoryType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFactoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigComponentType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigComponentTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigConverterType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigConverterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigManagedBeanType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigManagedBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFlowDefinitionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigNavigationRuleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigProtectedViewsType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigProtectedViewsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigReferencedBeanType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigReferencedBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRenderKitType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigRenderKitTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigLifecycleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigLifecycleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigValidatorType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigValidatorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigBehaviorType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigBehaviorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigVersionType;

/**
 * This class implements the <code> faces-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigTypeImpl<T> implements Child<T>, FacesConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-applicationType ElementType : application
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application</code> element will be created and returned.
    * Otherwise, the first existing <code>application</code> element will be returned.
    * @return the instance defined for the element <code>application</code> 
    */
   public FacesConfigApplicationType<FacesConfigType<T>> getOrCreateApplication()
   {
      List<Node> nodeList = childNode.get("application");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigApplicationTypeImpl<FacesConfigType<T>>(this, "application", childNode, nodeList.get(0));
      }
      return createApplication();
   }

   /**
    * Creates a new <code>application</code> element 
    * @return the new created instance of <code>FacesConfigApplicationType<FacesConfigType<T>></code> 
    */
   public FacesConfigApplicationType<FacesConfigType<T>> createApplication()
   {
      return new FacesConfigApplicationTypeImpl<FacesConfigType<T>>(this, "application", childNode);
   }

   /**
    * Returns all <code>application</code> elements
    * @return list of <code>application</code> 
    */
   public List<FacesConfigApplicationType<FacesConfigType<T>>> getAllApplication()
   {
      List<FacesConfigApplicationType<FacesConfigType<T>>> list = new ArrayList<FacesConfigApplicationType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("application");
      for(Node node: nodeList)
      {
         FacesConfigApplicationType<FacesConfigType<T>>  type = new FacesConfigApplicationTypeImpl<FacesConfigType<T>>(this, "application", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>application</code> elements 
    * @return the current instance of <code>FacesConfigApplicationType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllApplication()
   {
      childNode.removeChildren("application");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public FacesConfigOrderingType<FacesConfigType<T>> getOrCreateOrdering()
   {
      List<Node> nodeList = childNode.get("ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigOrderingTypeImpl<FacesConfigType<T>>(this, "ordering", childNode, nodeList.get(0));
      }
      return createOrdering();
   }

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>FacesConfigOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigOrderingType<FacesConfigType<T>> createOrdering()
   {
      return new FacesConfigOrderingTypeImpl<FacesConfigType<T>>(this, "ordering", childNode);
   }

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<FacesConfigOrderingType<FacesConfigType<T>>> getAllOrdering()
   {
      List<FacesConfigOrderingType<FacesConfigType<T>>> list = new ArrayList<FacesConfigOrderingType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("ordering");
      for(Node node: nodeList)
      {
         FacesConfigOrderingType<FacesConfigType<T>>  type = new FacesConfigOrderingTypeImpl<FacesConfigType<T>>(this, "ordering", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>FacesConfigOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllOrdering()
   {
      childNode.removeChildren("ordering");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public FacesConfigAbsoluteOrderingType<FacesConfigType<T>> getOrCreateAbsoluteOrdering()
   {
      List<Node> nodeList = childNode.get("absolute-ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAbsoluteOrderingTypeImpl<FacesConfigType<T>>(this, "absolute-ordering", childNode, nodeList.get(0));
      }
      return createAbsoluteOrdering();
   }

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>FacesConfigAbsoluteOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigAbsoluteOrderingType<FacesConfigType<T>> createAbsoluteOrdering()
   {
      return new FacesConfigAbsoluteOrderingTypeImpl<FacesConfigType<T>>(this, "absolute-ordering", childNode);
   }

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<FacesConfigAbsoluteOrderingType<FacesConfigType<T>>> getAllAbsoluteOrdering()
   {
      List<FacesConfigAbsoluteOrderingType<FacesConfigType<T>>> list = new ArrayList<FacesConfigAbsoluteOrderingType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("absolute-ordering");
      for(Node node: nodeList)
      {
         FacesConfigAbsoluteOrderingType<FacesConfigType<T>>  type = new FacesConfigAbsoluteOrderingTypeImpl<FacesConfigType<T>>(this, "absolute-ordering", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>FacesConfigAbsoluteOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllAbsoluteOrdering()
   {
      childNode.removeChildren("absolute-ordering");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-factoryType ElementType : factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>factory</code> element will be created and returned.
    * Otherwise, the first existing <code>factory</code> element will be returned.
    * @return the instance defined for the element <code>factory</code> 
    */
   public FacesConfigFactoryType<FacesConfigType<T>> getOrCreateFactory()
   {
      List<Node> nodeList = childNode.get("factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFactoryTypeImpl<FacesConfigType<T>>(this, "factory", childNode, nodeList.get(0));
      }
      return createFactory();
   }

   /**
    * Creates a new <code>factory</code> element 
    * @return the new created instance of <code>FacesConfigFactoryType<FacesConfigType<T>></code> 
    */
   public FacesConfigFactoryType<FacesConfigType<T>> createFactory()
   {
      return new FacesConfigFactoryTypeImpl<FacesConfigType<T>>(this, "factory", childNode);
   }

   /**
    * Returns all <code>factory</code> elements
    * @return list of <code>factory</code> 
    */
   public List<FacesConfigFactoryType<FacesConfigType<T>>> getAllFactory()
   {
      List<FacesConfigFactoryType<FacesConfigType<T>>> list = new ArrayList<FacesConfigFactoryType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("factory");
      for(Node node: nodeList)
      {
         FacesConfigFactoryType<FacesConfigType<T>>  type = new FacesConfigFactoryTypeImpl<FacesConfigType<T>>(this, "factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>factory</code> elements 
    * @return the current instance of <code>FacesConfigFactoryType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllFactory()
   {
      childNode.removeChildren("factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-componentType ElementType : component
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element will be created and returned.
    * Otherwise, the first existing <code>component</code> element will be returned.
    * @return the instance defined for the element <code>component</code> 
    */
   public FacesConfigComponentType<FacesConfigType<T>> getOrCreateComponent()
   {
      List<Node> nodeList = childNode.get("component");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigComponentTypeImpl<FacesConfigType<T>>(this, "component", childNode, nodeList.get(0));
      }
      return createComponent();
   }

   /**
    * Creates a new <code>component</code> element 
    * @return the new created instance of <code>FacesConfigComponentType<FacesConfigType<T>></code> 
    */
   public FacesConfigComponentType<FacesConfigType<T>> createComponent()
   {
      return new FacesConfigComponentTypeImpl<FacesConfigType<T>>(this, "component", childNode);
   }

   /**
    * Returns all <code>component</code> elements
    * @return list of <code>component</code> 
    */
   public List<FacesConfigComponentType<FacesConfigType<T>>> getAllComponent()
   {
      List<FacesConfigComponentType<FacesConfigType<T>>> list = new ArrayList<FacesConfigComponentType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("component");
      for(Node node: nodeList)
      {
         FacesConfigComponentType<FacesConfigType<T>>  type = new FacesConfigComponentTypeImpl<FacesConfigType<T>>(this, "component", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>component</code> elements 
    * @return the current instance of <code>FacesConfigComponentType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllComponent()
   {
      childNode.removeChildren("component");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-converterType ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public FacesConfigConverterType<FacesConfigType<T>> getOrCreateConverter()
   {
      List<Node> nodeList = childNode.get("converter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigConverterTypeImpl<FacesConfigType<T>>(this, "converter", childNode, nodeList.get(0));
      }
      return createConverter();
   }

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>FacesConfigConverterType<FacesConfigType<T>></code> 
    */
   public FacesConfigConverterType<FacesConfigType<T>> createConverter()
   {
      return new FacesConfigConverterTypeImpl<FacesConfigType<T>>(this, "converter", childNode);
   }

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<FacesConfigConverterType<FacesConfigType<T>>> getAllConverter()
   {
      List<FacesConfigConverterType<FacesConfigType<T>>> list = new ArrayList<FacesConfigConverterType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("converter");
      for(Node node: nodeList)
      {
         FacesConfigConverterType<FacesConfigType<T>>  type = new FacesConfigConverterTypeImpl<FacesConfigType<T>>(this, "converter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>FacesConfigConverterType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllConverter()
   {
      childNode.removeChildren("converter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-managed-beanType ElementType : managed-bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-bean</code> element will be returned.
    * @return the instance defined for the element <code>managed-bean</code> 
    */
   public FacesConfigManagedBeanType<FacesConfigType<T>> getOrCreateManagedBean()
   {
      List<Node> nodeList = childNode.get("managed-bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigManagedBeanTypeImpl<FacesConfigType<T>>(this, "managed-bean", childNode, nodeList.get(0));
      }
      return createManagedBean();
   }

   /**
    * Creates a new <code>managed-bean</code> element 
    * @return the new created instance of <code>FacesConfigManagedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigManagedBeanType<FacesConfigType<T>> createManagedBean()
   {
      return new FacesConfigManagedBeanTypeImpl<FacesConfigType<T>>(this, "managed-bean", childNode);
   }

   /**
    * Returns all <code>managed-bean</code> elements
    * @return list of <code>managed-bean</code> 
    */
   public List<FacesConfigManagedBeanType<FacesConfigType<T>>> getAllManagedBean()
   {
      List<FacesConfigManagedBeanType<FacesConfigType<T>>> list = new ArrayList<FacesConfigManagedBeanType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("managed-bean");
      for(Node node: nodeList)
      {
         FacesConfigManagedBeanType<FacesConfigType<T>>  type = new FacesConfigManagedBeanTypeImpl<FacesConfigType<T>>(this, "managed-bean", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>managed-bean</code> elements 
    * @return the current instance of <code>FacesConfigManagedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllManagedBean()
   {
      childNode.removeChildren("managed-bean");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-flow-definitionType ElementType : flow-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-definition</code> element will be returned.
    * @return the instance defined for the element <code>flow-definition</code> 
    */
   public FacesConfigFlowDefinitionType<FacesConfigType<T>> getOrCreateFlowDefinition()
   {
      List<Node> nodeList = childNode.get("flow-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionTypeImpl<FacesConfigType<T>>(this, "flow-definition", childNode, nodeList.get(0));
      }
      return createFlowDefinition();
   }

   /**
    * Creates a new <code>flow-definition</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionType<FacesConfigType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<FacesConfigType<T>> createFlowDefinition()
   {
      return new FacesConfigFlowDefinitionTypeImpl<FacesConfigType<T>>(this, "flow-definition", childNode);
   }

   /**
    * Returns all <code>flow-definition</code> elements
    * @return list of <code>flow-definition</code> 
    */
   public List<FacesConfigFlowDefinitionType<FacesConfigType<T>>> getAllFlowDefinition()
   {
      List<FacesConfigFlowDefinitionType<FacesConfigType<T>>> list = new ArrayList<FacesConfigFlowDefinitionType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("flow-definition");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionType<FacesConfigType<T>>  type = new FacesConfigFlowDefinitionTypeImpl<FacesConfigType<T>>(this, "flow-definition", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow-definition</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllFlowDefinition()
   {
      childNode.removeChildren("flow-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> name(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
public List<String> getAllName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeAllName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigType<T>> getOrCreateNavigationRule()
   {
      List<Node> nodeList = childNode.get("navigation-rule");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigNavigationRuleTypeImpl<FacesConfigType<T>>(this, "navigation-rule", childNode, nodeList.get(0));
      }
      return createNavigationRule();
   }

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<FacesConfigType<T>></code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigType<T>> createNavigationRule()
   {
      return new FacesConfigNavigationRuleTypeImpl<FacesConfigType<T>>(this, "navigation-rule", childNode);
   }

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<FacesConfigType<T>>> getAllNavigationRule()
   {
      List<FacesConfigNavigationRuleType<FacesConfigType<T>>> list = new ArrayList<FacesConfigNavigationRuleType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("navigation-rule");
      for(Node node: nodeList)
      {
         FacesConfigNavigationRuleType<FacesConfigType<T>>  type = new FacesConfigNavigationRuleTypeImpl<FacesConfigType<T>>(this, "navigation-rule", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllNavigationRule()
   {
      childNode.removeChildren("navigation-rule");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-protected-viewsType ElementType : protected-views
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>protected-views</code> element will be created and returned.
    * Otherwise, the first existing <code>protected-views</code> element will be returned.
    * @return the instance defined for the element <code>protected-views</code> 
    */
   public FacesConfigProtectedViewsType<FacesConfigType<T>> getOrCreateProtectedViews()
   {
      List<Node> nodeList = childNode.get("protected-views");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigProtectedViewsTypeImpl<FacesConfigType<T>>(this, "protected-views", childNode, nodeList.get(0));
      }
      return createProtectedViews();
   }

   /**
    * Creates a new <code>protected-views</code> element 
    * @return the new created instance of <code>FacesConfigProtectedViewsType<FacesConfigType<T>></code> 
    */
   public FacesConfigProtectedViewsType<FacesConfigType<T>> createProtectedViews()
   {
      return new FacesConfigProtectedViewsTypeImpl<FacesConfigType<T>>(this, "protected-views", childNode);
   }

   /**
    * Returns all <code>protected-views</code> elements
    * @return list of <code>protected-views</code> 
    */
   public List<FacesConfigProtectedViewsType<FacesConfigType<T>>> getAllProtectedViews()
   {
      List<FacesConfigProtectedViewsType<FacesConfigType<T>>> list = new ArrayList<FacesConfigProtectedViewsType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("protected-views");
      for(Node node: nodeList)
      {
         FacesConfigProtectedViewsType<FacesConfigType<T>>  type = new FacesConfigProtectedViewsTypeImpl<FacesConfigType<T>>(this, "protected-views", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>protected-views</code> elements 
    * @return the current instance of <code>FacesConfigProtectedViewsType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllProtectedViews()
   {
      childNode.removeChildren("protected-views");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-referenced-beanType ElementType : referenced-bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>referenced-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>referenced-bean</code> element will be returned.
    * @return the instance defined for the element <code>referenced-bean</code> 
    */
   public FacesConfigReferencedBeanType<FacesConfigType<T>> getOrCreateReferencedBean()
   {
      List<Node> nodeList = childNode.get("referenced-bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigReferencedBeanTypeImpl<FacesConfigType<T>>(this, "referenced-bean", childNode, nodeList.get(0));
      }
      return createReferencedBean();
   }

   /**
    * Creates a new <code>referenced-bean</code> element 
    * @return the new created instance of <code>FacesConfigReferencedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigReferencedBeanType<FacesConfigType<T>> createReferencedBean()
   {
      return new FacesConfigReferencedBeanTypeImpl<FacesConfigType<T>>(this, "referenced-bean", childNode);
   }

   /**
    * Returns all <code>referenced-bean</code> elements
    * @return list of <code>referenced-bean</code> 
    */
   public List<FacesConfigReferencedBeanType<FacesConfigType<T>>> getAllReferencedBean()
   {
      List<FacesConfigReferencedBeanType<FacesConfigType<T>>> list = new ArrayList<FacesConfigReferencedBeanType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("referenced-bean");
      for(Node node: nodeList)
      {
         FacesConfigReferencedBeanType<FacesConfigType<T>>  type = new FacesConfigReferencedBeanTypeImpl<FacesConfigType<T>>(this, "referenced-bean", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>referenced-bean</code> elements 
    * @return the current instance of <code>FacesConfigReferencedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllReferencedBean()
   {
      childNode.removeChildren("referenced-bean");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-render-kitType ElementType : render-kit
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>render-kit</code> element will be created and returned.
    * Otherwise, the first existing <code>render-kit</code> element will be returned.
    * @return the instance defined for the element <code>render-kit</code> 
    */
   public FacesConfigRenderKitType<FacesConfigType<T>> getOrCreateRenderKit()
   {
      List<Node> nodeList = childNode.get("render-kit");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigRenderKitTypeImpl<FacesConfigType<T>>(this, "render-kit", childNode, nodeList.get(0));
      }
      return createRenderKit();
   }

   /**
    * Creates a new <code>render-kit</code> element 
    * @return the new created instance of <code>FacesConfigRenderKitType<FacesConfigType<T>></code> 
    */
   public FacesConfigRenderKitType<FacesConfigType<T>> createRenderKit()
   {
      return new FacesConfigRenderKitTypeImpl<FacesConfigType<T>>(this, "render-kit", childNode);
   }

   /**
    * Returns all <code>render-kit</code> elements
    * @return list of <code>render-kit</code> 
    */
   public List<FacesConfigRenderKitType<FacesConfigType<T>>> getAllRenderKit()
   {
      List<FacesConfigRenderKitType<FacesConfigType<T>>> list = new ArrayList<FacesConfigRenderKitType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("render-kit");
      for(Node node: nodeList)
      {
         FacesConfigRenderKitType<FacesConfigType<T>>  type = new FacesConfigRenderKitTypeImpl<FacesConfigType<T>>(this, "render-kit", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>render-kit</code> elements 
    * @return the current instance of <code>FacesConfigRenderKitType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllRenderKit()
   {
      childNode.removeChildren("render-kit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-lifecycleType ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle</code> element will be created and returned.
    * Otherwise, the first existing <code>lifecycle</code> element will be returned.
    * @return the instance defined for the element <code>lifecycle</code> 
    */
   public FacesConfigLifecycleType<FacesConfigType<T>> getOrCreateLifecycle()
   {
      List<Node> nodeList = childNode.get("lifecycle");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigLifecycleTypeImpl<FacesConfigType<T>>(this, "lifecycle", childNode, nodeList.get(0));
      }
      return createLifecycle();
   }

   /**
    * Creates a new <code>lifecycle</code> element 
    * @return the new created instance of <code>FacesConfigLifecycleType<FacesConfigType<T>></code> 
    */
   public FacesConfigLifecycleType<FacesConfigType<T>> createLifecycle()
   {
      return new FacesConfigLifecycleTypeImpl<FacesConfigType<T>>(this, "lifecycle", childNode);
   }

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
   public List<FacesConfigLifecycleType<FacesConfigType<T>>> getAllLifecycle()
   {
      List<FacesConfigLifecycleType<FacesConfigType<T>>> list = new ArrayList<FacesConfigLifecycleType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("lifecycle");
      for(Node node: nodeList)
      {
         FacesConfigLifecycleType<FacesConfigType<T>>  type = new FacesConfigLifecycleTypeImpl<FacesConfigType<T>>(this, "lifecycle", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>lifecycle</code> elements 
    * @return the current instance of <code>FacesConfigLifecycleType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllLifecycle()
   {
      childNode.removeChildren("lifecycle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-validatorType ElementType : validator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element will be created and returned.
    * Otherwise, the first existing <code>validator</code> element will be returned.
    * @return the instance defined for the element <code>validator</code> 
    */
   public FacesConfigValidatorType<FacesConfigType<T>> getOrCreateValidator()
   {
      List<Node> nodeList = childNode.get("validator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigValidatorTypeImpl<FacesConfigType<T>>(this, "validator", childNode, nodeList.get(0));
      }
      return createValidator();
   }

   /**
    * Creates a new <code>validator</code> element 
    * @return the new created instance of <code>FacesConfigValidatorType<FacesConfigType<T>></code> 
    */
   public FacesConfigValidatorType<FacesConfigType<T>> createValidator()
   {
      return new FacesConfigValidatorTypeImpl<FacesConfigType<T>>(this, "validator", childNode);
   }

   /**
    * Returns all <code>validator</code> elements
    * @return list of <code>validator</code> 
    */
   public List<FacesConfigValidatorType<FacesConfigType<T>>> getAllValidator()
   {
      List<FacesConfigValidatorType<FacesConfigType<T>>> list = new ArrayList<FacesConfigValidatorType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("validator");
      for(Node node: nodeList)
      {
         FacesConfigValidatorType<FacesConfigType<T>>  type = new FacesConfigValidatorTypeImpl<FacesConfigType<T>>(this, "validator", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>validator</code> elements 
    * @return the current instance of <code>FacesConfigValidatorType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllValidator()
   {
      childNode.removeChildren("validator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-behaviorType ElementType : behavior
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element will be created and returned.
    * Otherwise, the first existing <code>behavior</code> element will be returned.
    * @return the instance defined for the element <code>behavior</code> 
    */
   public FacesConfigBehaviorType<FacesConfigType<T>> getOrCreateBehavior()
   {
      List<Node> nodeList = childNode.get("behavior");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigBehaviorTypeImpl<FacesConfigType<T>>(this, "behavior", childNode, nodeList.get(0));
      }
      return createBehavior();
   }

   /**
    * Creates a new <code>behavior</code> element 
    * @return the new created instance of <code>FacesConfigBehaviorType<FacesConfigType<T>></code> 
    */
   public FacesConfigBehaviorType<FacesConfigType<T>> createBehavior()
   {
      return new FacesConfigBehaviorTypeImpl<FacesConfigType<T>>(this, "behavior", childNode);
   }

   /**
    * Returns all <code>behavior</code> elements
    * @return list of <code>behavior</code> 
    */
   public List<FacesConfigBehaviorType<FacesConfigType<T>>> getAllBehavior()
   {
      List<FacesConfigBehaviorType<FacesConfigType<T>>> list = new ArrayList<FacesConfigBehaviorType<FacesConfigType<T>>>();
      List<Node> nodeList = childNode.get("behavior");
      for(Node node: nodeList)
      {
         FacesConfigBehaviorType<FacesConfigType<T>>  type = new FacesConfigBehaviorTypeImpl<FacesConfigType<T>>(this, "behavior", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>behavior</code> elements 
    * @return the current instance of <code>FacesConfigBehaviorType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllBehavior()
   {
      childNode.removeChildren("behavior");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-extensionType ElementType : faces-config-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> facesConfigExtension()
   {
      childNode.getOrCreate("faces-config-extension");
      return this;
   }

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public Boolean isFacesConfigExtension()
   {
      return childNode.getSingle("faces-config-extension") != null;
   }

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeFacesConfigExtension()
   {
      childNode.removeChild("faces-config-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> metadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> version(FacesConfigVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public FacesConfigVersionType getVersion()
   {
      return FacesConfigVersionType.getFromStringValue(childNode.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
