package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigProtectedViewsType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-protected-viewsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigProtectedViewsTypeImpl<T> implements Child<T>, FacesConfigProtectedViewsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigProtectedViewsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigProtectedViewsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigProtectedViewsType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FacesConfigProtectedViewsType<T></code> 
    */
   public FacesConfigProtectedViewsType<T> urlPattern(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("url-pattern").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
public List<String> getAllUrlPattern()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>FacesConfigProtectedViewsType<T></code> 
    */
   public FacesConfigProtectedViewsType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }
}
