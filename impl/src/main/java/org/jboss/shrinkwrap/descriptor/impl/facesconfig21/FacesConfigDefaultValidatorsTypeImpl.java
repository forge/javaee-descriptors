package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigDefaultValidatorsType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-default-validatorsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigDefaultValidatorsTypeImpl<T> implements Child<T>, FacesConfigDefaultValidatorsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigDefaultValidatorsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigDefaultValidatorsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigDefaultValidatorsType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>validator-id</code> elements, 
    * a new <code>validator-id</code> element 
    * @param values list of <code>validator-id</code> objects 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> validatorId(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("validator-id").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>validator-id</code> elements
    * @return list of <code>validator-id</code> 
    */
public List<String> getAllValidatorId()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("validator-id");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> removeAllValidatorId()
   {
      childNode.removeChildren("validator-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigDefaultValidatorsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<T></code> 
    */
   public FacesConfigDefaultValidatorsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
