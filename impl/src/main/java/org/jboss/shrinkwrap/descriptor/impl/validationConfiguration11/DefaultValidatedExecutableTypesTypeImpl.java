package org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.DefaultValidatedExecutableTypesType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> default-validated-executable-typesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DefaultValidatedExecutableTypesTypeImpl<T> implements Child<T>, DefaultValidatedExecutableTypesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DefaultValidatedExecutableTypesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DefaultValidatedExecutableTypesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DefaultValidatedExecutableTypesType ElementName: config:executable-type ElementType : executable-type
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all config:executable-type objects representing <code>executable-type</code> elements, 
    * a new <code>executable-type</code> element 
    * @param values list of <code>executable-type</code> objects 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> executableType(ExecutableType ... values)
   {
      if (values != null)
      {
         for(ExecutableType name: values)
         {
            childNode.createChild("executable-type").text(name);
         }
      }
      return this;
   }

   /**
    * Creates for all String objects representing <code>executable-type</code> elements, 
    * a new <code>executable-type</code> element 
    * @param values list of <code>executable-type</code> objects 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> executableType(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("executable-type").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>executable-type</code> elements
    * @return list of <code>executable-type</code> 
    */
public List<String> getAllExecutableType()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("executable-type");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>executable-type</code> element 
    * @return the current instance of <code>DefaultValidatedExecutableTypesType<T></code> 
    */
   public DefaultValidatedExecutableTypesType<T> removeAllExecutableType()
   {
      childNode.removeChildren("executable-type");
      return this;
   }
}
