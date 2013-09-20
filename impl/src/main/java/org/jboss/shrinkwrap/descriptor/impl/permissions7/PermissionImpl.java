package org.jboss.shrinkwrap.descriptor.impl.permissions7; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permission;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> permission </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PermissionImpl<T> implements Child<T>, Permission<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PermissionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PermissionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> className(String className)
   {
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.getTextValueForPatternName("class-name");
   }

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeClassName()
   {
      childNode.removeChildren("class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : actions
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>actions</code> element
    * @param actions the value for the element <code>actions</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> actions(String actions)
   {
      childNode.getOrCreate("actions").text(actions);
      return this;
   }

   /**
    * Returns the <code>actions</code> element
    * @return the node defined for the element <code>actions</code> 
    */
   public String getActions()
   {
      return childNode.getTextValueForPatternName("actions");
   }

   /**
    * Removes the <code>actions</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeActions()
   {
      childNode.removeChildren("actions");
      return this;
   }
}
