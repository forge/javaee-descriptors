package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> multipart-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MultipartConfigTypeImpl<T> implements Child<T>, MultipartConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MultipartConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MultipartConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:token ElementType : location
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>location</code> element
    * @param location the value for the element <code>location</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> location(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation()
   {
      return childNode.getTextValueForPatternName("location");
   }

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeLocation()
   {
      childNode.removeChildren("location");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:long ElementType : max-file-size
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-file-size</code> element
    * @param maxFileSize the value for the element <code>max-file-size</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> maxFileSize(Long maxFileSize)
   {
      childNode.getOrCreate("max-file-size").text(maxFileSize);
      return this;
   }

   /**
    * Returns the <code>max-file-size</code> element
    * @return the node defined for the element <code>max-file-size</code> 
    */
   public Long getMaxFileSize()
   {
      if (childNode.getTextValueForPatternName("max-file-size") != null && !childNode.getTextValueForPatternName("max-file-size").equals("null")) {
         return Long.valueOf(childNode.getTextValueForPatternName("max-file-size"));
      }
      return null;
   }

   /**
    * Removes the <code>max-file-size</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeMaxFileSize()
   {
      childNode.removeChildren("max-file-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:long ElementType : max-request-size
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-request-size</code> element
    * @param maxRequestSize the value for the element <code>max-request-size</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> maxRequestSize(Long maxRequestSize)
   {
      childNode.getOrCreate("max-request-size").text(maxRequestSize);
      return this;
   }

   /**
    * Returns the <code>max-request-size</code> element
    * @return the node defined for the element <code>max-request-size</code> 
    */
   public Long getMaxRequestSize()
   {
      if (childNode.getTextValueForPatternName("max-request-size") != null && !childNode.getTextValueForPatternName("max-request-size").equals("null")) {
         return Long.valueOf(childNode.getTextValueForPatternName("max-request-size"));
      }
      return null;
   }

   /**
    * Removes the <code>max-request-size</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeMaxRequestSize()
   {
      childNode.removeChildren("max-request-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:integer ElementType : file-size-threshold
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>file-size-threshold</code> element
    * @param fileSizeThreshold the value for the element <code>file-size-threshold</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> fileSizeThreshold(Integer fileSizeThreshold)
   {
      childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
      return this;
   }

   /**
    * Returns the <code>file-size-threshold</code> element
    * @return the node defined for the element <code>file-size-threshold</code> 
    */
   public Integer getFileSizeThreshold()
   {
      if (childNode.getTextValueForPatternName("file-size-threshold") != null && !childNode.getTextValueForPatternName("file-size-threshold").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("file-size-threshold"));
      }
      return null;
   }

   /**
    * Removes the <code>file-size-threshold</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeFileSizeThreshold()
   {
      childNode.removeChildren("file-size-threshold");
      return this;
   }
}
