package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> welcome-file-listType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WelcomeFileListTypeImpl<T> implements Child<T>, WelcomeFileListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WelcomeFileListTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WelcomeFileListTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WelcomeFileListType ElementName: xsd:string ElementType : welcome-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>welcome-file</code> elements, 
    * a new <code>welcome-file</code> element 
    * @param values list of <code>welcome-file</code> objects 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> welcomeFile(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("welcome-file").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>welcome-file</code> elements
    * @return list of <code>welcome-file</code> 
    */
public List<String> getAllWelcomeFile()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("welcome-file");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>welcome-file</code> element 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> removeAllWelcomeFile()
   {
      childNode.removeChildren("welcome-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WelcomeFileListType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> id(String id)
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
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
