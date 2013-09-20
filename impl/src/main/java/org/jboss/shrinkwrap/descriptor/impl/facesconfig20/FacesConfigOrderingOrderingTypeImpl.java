package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-ordering-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigOrderingOrderingTypeImpl<T> implements Child<T>, FacesConfigOrderingOrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigOrderingOrderingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigOrderingOrderingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingOrderingType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> name(String ... values)
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
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> removeAllName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingOrderingType ElementName: javaee:faces-config-ordering-othersType ElementType : others
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> others()
   {
      childNode.getOrCreate("others");
      return this;
   }

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public Boolean isOthers()
   {
      return childNode.getSingle("others") != null;
   }

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>FacesConfigOrderingOrderingType<T></code> 
    */
   public FacesConfigOrderingOrderingType<T> removeOthers()
   {
      childNode.removeChild("others");
      return this;
   }
}
