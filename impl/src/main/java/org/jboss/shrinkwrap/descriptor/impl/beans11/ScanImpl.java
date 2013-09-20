package org.jboss.shrinkwrap.descriptor.impl.beans11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.beans11.Scan;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.beans11.Exclude;
import org.jboss.shrinkwrap.descriptor.impl.beans11.ExcludeImpl;

/**
 * This class implements the <code> scan </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ScanImpl<T> implements Child<T>, Scan<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ScanImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ScanImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Scan ElementName: javaee:exclude ElementType : exclude
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude</code> element will be returned.
    * @return  a new or existing instance of <code>Exclude<Scan<T>></code> 
    */
   public Exclude<Scan<T>> getOrCreateExclude()
   {
      Node node = childNode.getOrCreate("exclude");
      Exclude<Scan<T>> exclude = new ExcludeImpl<Scan<T>>(this, "exclude", childNode, node);
      return exclude;
   }

   /**
    * Removes the <code>exclude</code> element 
    * @return the current instance of <code>Scan<T></code> 
    */
   public Scan<T> removeExclude()
   {
      childNode.removeChildren("exclude");
      return this;
   }
}
