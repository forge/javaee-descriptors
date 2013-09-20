package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintDefinitionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ValidatedByType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.ValidatedByTypeImpl;

/**
 * This class implements the <code> constraint-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConstraintDefinitionTypeImpl<T> implements Child<T>, ConstraintDefinitionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConstraintDefinitionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConstraintDefinitionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintDefinitionType ElementName: map:validated-byType ElementType : validated-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validated-by</code> element with the given value will be created.
    * Otherwise, the existing <code>validated-by</code> element will be returned.
    * @return  a new or existing instance of <code>ValidatedByType<ConstraintDefinitionType<T>></code> 
    */
   public ValidatedByType<ConstraintDefinitionType<T>> getOrCreateValidatedBy()
   {
      Node node = childNode.getOrCreate("validated-by");
      ValidatedByType<ConstraintDefinitionType<T>> validatedBy = new ValidatedByTypeImpl<ConstraintDefinitionType<T>>(this, "validated-by", childNode, node);
      return validatedBy;
   }

   /**
    * Removes the <code>validated-by</code> element 
    * @return the current instance of <code>ConstraintDefinitionType<T></code> 
    */
   public ConstraintDefinitionType<T> removeValidatedBy()
   {
      childNode.removeChildren("validated-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintDefinitionType ElementName: xsd:string ElementType : annotation
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>annotation</code> attribute
    * @param annotation the value for the attribute <code>annotation</code> 
    * @return the current instance of <code>ConstraintDefinitionType<T></code> 
    */
   public ConstraintDefinitionType<T> annotation(String annotation)
   {
      childNode.attribute("annotation", annotation);
      return this;
   }

   /**
    * Returns the <code>annotation</code> attribute
    * @return the value defined for the attribute <code>annotation</code> 
    */
      public String getAnnotation()
   {
      return childNode.getAttribute("annotation");
   }

   /**
    * Removes the <code>annotation</code> attribute 
    * @return the current instance of <code>ConstraintDefinitionType<T></code> 
    */
   public ConstraintDefinitionType<T> removeAnnotation()
   {
      childNode.removeAttribute("annotation");
      return this;
   }
}
