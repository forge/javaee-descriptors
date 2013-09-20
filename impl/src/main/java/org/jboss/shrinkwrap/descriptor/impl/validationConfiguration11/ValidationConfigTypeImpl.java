package org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableValidationType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ValidationConfigType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> validation-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ValidationConfigTypeImpl<T> implements Child<T>, ValidationConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidationConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ValidationConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : default-provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-provider</code> element
    * @param defaultProvider the value for the element <code>default-provider</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> defaultProvider(String defaultProvider)
   {
      childNode.getOrCreate("default-provider").text(defaultProvider);
      return this;
   }

   /**
    * Returns the <code>default-provider</code> element
    * @return the node defined for the element <code>default-provider</code> 
    */
   public String getDefaultProvider()
   {
      return childNode.getTextValueForPatternName("default-provider");
   }

   /**
    * Removes the <code>default-provider</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeDefaultProvider()
   {
      childNode.removeChildren("default-provider");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : message-interpolator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-interpolator</code> element
    * @param messageInterpolator the value for the element <code>message-interpolator</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> messageInterpolator(String messageInterpolator)
   {
      childNode.getOrCreate("message-interpolator").text(messageInterpolator);
      return this;
   }

   /**
    * Returns the <code>message-interpolator</code> element
    * @return the node defined for the element <code>message-interpolator</code> 
    */
   public String getMessageInterpolator()
   {
      return childNode.getTextValueForPatternName("message-interpolator");
   }

   /**
    * Removes the <code>message-interpolator</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeMessageInterpolator()
   {
      childNode.removeChildren("message-interpolator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : traversable-resolver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>traversable-resolver</code> element
    * @param traversableResolver the value for the element <code>traversable-resolver</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> traversableResolver(String traversableResolver)
   {
      childNode.getOrCreate("traversable-resolver").text(traversableResolver);
      return this;
   }

   /**
    * Returns the <code>traversable-resolver</code> element
    * @return the node defined for the element <code>traversable-resolver</code> 
    */
   public String getTraversableResolver()
   {
      return childNode.getTextValueForPatternName("traversable-resolver");
   }

   /**
    * Removes the <code>traversable-resolver</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeTraversableResolver()
   {
      childNode.removeChildren("traversable-resolver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : constraint-validator-factory
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-validator-factory</code> element
    * @param constraintValidatorFactory the value for the element <code>constraint-validator-factory</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> constraintValidatorFactory(String constraintValidatorFactory)
   {
      childNode.getOrCreate("constraint-validator-factory").text(constraintValidatorFactory);
      return this;
   }

   /**
    * Returns the <code>constraint-validator-factory</code> element
    * @return the node defined for the element <code>constraint-validator-factory</code> 
    */
   public String getConstraintValidatorFactory()
   {
      return childNode.getTextValueForPatternName("constraint-validator-factory");
   }

   /**
    * Removes the <code>constraint-validator-factory</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeConstraintValidatorFactory()
   {
      childNode.removeChildren("constraint-validator-factory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : parameter-name-provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>parameter-name-provider</code> element
    * @param parameterNameProvider the value for the element <code>parameter-name-provider</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> parameterNameProvider(String parameterNameProvider)
   {
      childNode.getOrCreate("parameter-name-provider").text(parameterNameProvider);
      return this;
   }

   /**
    * Returns the <code>parameter-name-provider</code> element
    * @return the node defined for the element <code>parameter-name-provider</code> 
    */
   public String getParameterNameProvider()
   {
      return childNode.getTextValueForPatternName("parameter-name-provider");
   }

   /**
    * Removes the <code>parameter-name-provider</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeParameterNameProvider()
   {
      childNode.removeChildren("parameter-name-provider");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: config:executable-validationType ElementType : executable-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>executable-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>executable-validation</code> element will be returned.
    * @return  a new or existing instance of <code>ExecutableValidationType<ValidationConfigType<T>></code> 
    */
   public ExecutableValidationType<ValidationConfigType<T>> getOrCreateExecutableValidation()
   {
      Node node = childNode.getOrCreate("executable-validation");
      ExecutableValidationType<ValidationConfigType<T>> executableValidation = new ExecutableValidationTypeImpl<ValidationConfigType<T>>(this, "executable-validation", childNode, node);
      return executableValidation;
   }

   /**
    * Removes the <code>executable-validation</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeExecutableValidation()
   {
      childNode.removeChildren("executable-validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : constraint-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>constraint-mapping</code> elements, 
    * a new <code>constraint-mapping</code> element 
    * @param values list of <code>constraint-mapping</code> objects 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> constraintMapping(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("constraint-mapping").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>constraint-mapping</code> elements
    * @return list of <code>constraint-mapping</code> 
    */
public List<String> getAllConstraintMapping()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("constraint-mapping");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>constraint-mapping</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeAllConstraintMapping()
   {
      childNode.removeChildren("constraint-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: config:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ValidationConfigType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<ValidationConfigType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ValidationConfigType<T>></code> 
    */
   public PropertyType<ValidationConfigType<T>> createProperty()
   {
      return new PropertyTypeImpl<ValidationConfigType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ValidationConfigType<T>>> getAllProperty()
   {
      List<PropertyType<ValidationConfigType<T>>> list = new ArrayList<PropertyType<ValidationConfigType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<ValidationConfigType<T>>  type = new PropertyTypeImpl<ValidationConfigType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ValidationConfigType<T>></code> 
    */
   public ValidationConfigType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
