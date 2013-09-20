package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TransportGuaranteeType;

/**
 * This class implements the <code> user-data-constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class UserDataConstraintTypeImpl<T> implements Child<T>, UserDataConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public UserDataConstraintTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public UserDataConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> description(String ... values)
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
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: javaee:transport-guaranteeType ElementType : transport-guarantee
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transport-guarantee</code> element
    * @param transportGuarantee the value for the element <code>transport-guarantee</code> 
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> transportGuarantee(TransportGuaranteeType transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }
   /**
    * Sets the <code>transport-guarantee</code> element
    * @param transportGuarantee the value for the element <code>transport-guarantee</code> 
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> transportGuarantee(String transportGuarantee)
   {
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   /**
    * Returns the <code>transport-guarantee</code> element
    * @return the value found for the element <code>transport-guarantee</code> 
    */
   public TransportGuaranteeType getTransportGuarantee()
   {
      return TransportGuaranteeType.getFromStringValue(childNode.getTextValueForPatternName("transport-guarantee"));
   }

   /**
    * Returns the <code>transport-guarantee</code> element
    * @return the value found for the element <code>transport-guarantee</code> 
    */
   public String  getTransportGuaranteeAsString()
   {
      return childNode.getTextValueForPatternName("transport-guarantee");
   }

   /**
    * Removes the <code>transport-guarantee</code> attribute 
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> removeTransportGuarantee()
   {
      childNode.removeAttribute("transport-guarantee");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> id(String id)
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
    * @return the current instance of <code>UserDataConstraintType<T></code> 
    */
   public UserDataConstraintType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
