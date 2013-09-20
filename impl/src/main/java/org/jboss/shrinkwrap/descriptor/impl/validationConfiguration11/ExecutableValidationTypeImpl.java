package org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableValidationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.DefaultValidatedExecutableTypesType;
import org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11.DefaultValidatedExecutableTypesTypeImpl;

/**
 * This class implements the <code> executable-validationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExecutableValidationTypeImpl<T> implements Child<T>, ExecutableValidationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExecutableValidationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExecutableValidationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExecutableValidationType ElementName: config:default-validated-executable-typesType ElementType : default-validated-executable-types
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-validated-executable-types</code> element with the given value will be created.
    * Otherwise, the existing <code>default-validated-executable-types</code> element will be returned.
    * @return  a new or existing instance of <code>DefaultValidatedExecutableTypesType<ExecutableValidationType<T>></code> 
    */
   public DefaultValidatedExecutableTypesType<ExecutableValidationType<T>> getOrCreateDefaultValidatedExecutableTypes()
   {
      Node node = childNode.getOrCreate("default-validated-executable-types");
      DefaultValidatedExecutableTypesType<ExecutableValidationType<T>> defaultValidatedExecutableTypes = new DefaultValidatedExecutableTypesTypeImpl<ExecutableValidationType<T>>(this, "default-validated-executable-types", childNode, node);
      return defaultValidatedExecutableTypes;
   }

   /**
    * Removes the <code>default-validated-executable-types</code> element 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> removeDefaultValidatedExecutableTypes()
   {
      childNode.removeChildren("default-validated-executable-types");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExecutableValidationType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> enabled(Boolean enabled)
   {
      childNode.attribute("enabled", enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getAttribute("enabled"));
   }

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>ExecutableValidationType<T></code> 
    */
   public ExecutableValidationType<T> removeEnabled()
   {
      childNode.removeAttribute("enabled");
      return this;
   }
}
