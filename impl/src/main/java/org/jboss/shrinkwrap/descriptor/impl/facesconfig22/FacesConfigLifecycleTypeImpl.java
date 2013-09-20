package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigLifecycleType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigLifecycleExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigLifecycleExtensionTypeImpl;

/**
 * This class implements the <code> faces-config-lifecycleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigLifecycleTypeImpl<T> implements Child<T>, FacesConfigLifecycleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigLifecycleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigLifecycleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: xsd:token ElementType : phase-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>phase-listener</code> elements, 
    * a new <code>phase-listener</code> element 
    * @param values list of <code>phase-listener</code> objects 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> phaseListener(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("phase-listener").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>phase-listener</code> elements
    * @return list of <code>phase-listener</code> 
    */
public List<String> getAllPhaseListener()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("phase-listener");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>phase-listener</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeAllPhaseListener()
   {
      childNode.removeChildren("phase-listener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: javaee:faces-config-lifecycle-extensionType ElementType : lifecycle-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> lifecycleExtension()
   {
      childNode.getOrCreate("lifecycle-extension");
      return this;
   }

   /**
    * Removes the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public Boolean isLifecycleExtension()
   {
      return childNode.getSingle("lifecycle-extension") != null;
   }

   /**
    * Removes the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeLifecycleExtension()
   {
      childNode.removeChild("lifecycle-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
