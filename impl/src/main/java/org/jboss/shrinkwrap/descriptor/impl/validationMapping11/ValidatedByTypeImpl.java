package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ValidatedByType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> validated-byType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ValidatedByTypeImpl<T> implements Child<T>, ValidatedByType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidatedByTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ValidatedByTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatedByType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> value(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("value").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
public List<String> getAllValue()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("value");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> removeAllValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatedByType ElementName: xsd:boolean ElementType : include-existing-validators
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-existing-validators</code> attribute
    * @param includeExistingValidators the value for the attribute <code>include-existing-validators</code> 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> includeExistingValidators(Boolean includeExistingValidators)
   {
      childNode.attribute("include-existing-validators", includeExistingValidators);
      return this;
   }

   /**
    * Returns the <code>include-existing-validators</code> attribute
    * @return the value defined for the attribute <code>include-existing-validators</code> 
    */
   public Boolean isIncludeExistingValidators()
   {
      return Strings.isTrue(childNode.getAttribute("include-existing-validators"));
   }

   /**
    * Removes the <code>include-existing-validators</code> attribute 
    * @return the current instance of <code>ValidatedByType<T></code> 
    */
   public ValidatedByType<T> removeIncludeExistingValidators()
   {
      childNode.removeAttribute("include-existing-validators");
      return this;
   }
}
