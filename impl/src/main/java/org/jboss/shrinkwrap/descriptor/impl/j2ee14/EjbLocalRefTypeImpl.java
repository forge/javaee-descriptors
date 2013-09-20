package org.jboss.shrinkwrap.descriptor.impl.j2ee14; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> ejb-local-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbLocalRefTypeImpl<T> implements Child<T>, EjbLocalRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> description(String ... values)
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
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:token ElementType : ejb-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ref-name</code> element
    * @param ejbRefName the value for the element <code>ejb-ref-name</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefName(String ejbRefName)
   {
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   /**
    * Returns the <code>ejb-ref-name</code> element
    * @return the node defined for the element <code>ejb-ref-name</code> 
    */
   public String getEjbRefName()
   {
      return childNode.getTextValueForPatternName("ejb-ref-name");
   }

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbRefName()
   {
      childNode.removeChildren("ejb-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:ejb-ref-typeType ElementType : ejb-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefType(EjbRefTypeType ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbRefType(String ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the value found for the element <code>ejb-ref-type</code> 
    */
   public EjbRefTypeType getEjbRefType()
   {
      return EjbRefTypeType.getFromStringValue(childNode.getTextValueForPatternName("ejb-ref-type"));
   }

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the value found for the element <code>ejb-ref-type</code> 
    */
   public String  getEjbRefTypeAsString()
   {
      return childNode.getTextValueForPatternName("ejb-ref-type");
   }

   /**
    * Removes the <code>ejb-ref-type</code> attribute 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbRefType()
   {
      childNode.removeAttribute("ejb-ref-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> localHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome()
   {
      return childNode.getTextValueForPatternName("local-home");
   }

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeLocalHome()
   {
      childNode.removeChildren("local-home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: j2ee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> local(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal()
   {
      return childNode.getTextValueForPatternName("local");
   }

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeLocal()
   {
      childNode.removeChildren("local");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:token ElementType : ejb-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-link</code> element
    * @param ejbLink the value for the element <code>ejb-link</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> ejbLink(String ejbLink)
   {
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink()
   {
      return childNode.getTextValueForPatternName("ejb-link");
   }

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeEjbLink()
   {
      childNode.removeChildren("ejb-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbLocalRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> id(String id)
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
    * @return the current instance of <code>EjbLocalRefType<T></code> 
    */
   public EjbLocalRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
