package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> multipart-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MultipartConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:token ElementType : location
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>location</code> element
    * @param location the value for the element <code>location</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> location(String location);

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation();

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeLocation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:long ElementType : max-file-size
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-file-size</code> element
    * @param maxFileSize the value for the element <code>max-file-size</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> maxFileSize(Long maxFileSize);

   /**
    * Returns the <code>max-file-size</code> element
    * @return the node defined for the element <code>max-file-size</code> 
    */
   public Long getMaxFileSize();

   /**
    * Removes the <code>max-file-size</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeMaxFileSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:long ElementType : max-request-size
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-request-size</code> element
    * @param maxRequestSize the value for the element <code>max-request-size</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> maxRequestSize(Long maxRequestSize);

   /**
    * Returns the <code>max-request-size</code> element
    * @return the node defined for the element <code>max-request-size</code> 
    */
   public Long getMaxRequestSize();

   /**
    * Removes the <code>max-request-size</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeMaxRequestSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MultipartConfigType ElementName: xsd:integer ElementType : file-size-threshold
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>file-size-threshold</code> element
    * @param fileSizeThreshold the value for the element <code>file-size-threshold</code> 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> fileSizeThreshold(Integer fileSizeThreshold);

   /**
    * Returns the <code>file-size-threshold</code> element
    * @return the node defined for the element <code>file-size-threshold</code> 
    */
   public Integer getFileSizeThreshold();

   /**
    * Removes the <code>file-size-threshold</code> element 
    * @return the current instance of <code>MultipartConfigType<T></code> 
    */
   public MultipartConfigType<T> removeFileSizeThreshold();
}
