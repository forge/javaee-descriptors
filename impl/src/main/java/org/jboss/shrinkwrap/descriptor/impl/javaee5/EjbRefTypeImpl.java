package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> ejb-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EjbRefTypeImpl<T> implements Child<T>, EjbRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EjbRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EjbRefType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<EjbRefType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<EjbRefType<T>></code> 
    */
   public InjectionTargetType<EjbRefType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<EjbRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EjbRefType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<EjbRefType<T>>> list = new ArrayList<InjectionTargetType<EjbRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<EjbRefType<T>>  type = new InjectionTargetTypeImpl<EjbRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<EjbRefType<T>></code> 
    */
   public EjbRefType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> description(String ... values)
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
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:token ElementType : ejb-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ref-name</code> element
    * @param ejbRefName the value for the element <code>ejb-ref-name</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefName(String ejbRefName)
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
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbRefName()
   {
      childNode.removeChildren("ejb-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: javaee:ejb-ref-typeType ElementType : ejb-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefType(EjbRefTypeType ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }
   /**
    * Sets the <code>ejb-ref-type</code> element
    * @param ejbRefType the value for the element <code>ejb-ref-type</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbRefType(String ejbRefType)
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
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbRefType()
   {
      childNode.removeAttribute("ejb-ref-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: javaee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> home(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome()
   {
      return childNode.getTextValueForPatternName("home");
   }

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeHome()
   {
      childNode.removeChildren("home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: javaee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> remote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote()
   {
      return childNode.getTextValueForPatternName("remote");
   }

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeRemote()
   {
      childNode.removeChildren("remote");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:token ElementType : ejb-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-link</code> element
    * @param ejbLink the value for the element <code>ejb-link</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> ejbLink(String ejbLink)
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
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeEjbLink()
   {
      childNode.removeChildren("ejb-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> id(String id)
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
    * @return the current instance of <code>EjbRefType<T></code> 
    */
   public EjbRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
