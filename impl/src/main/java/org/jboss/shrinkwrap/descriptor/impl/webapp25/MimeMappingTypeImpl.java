package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webapp25.MimeMappingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> mime-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MimeMappingTypeImpl<T> implements Child<T>, MimeMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MimeMappingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MimeMappingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: xsd:token ElementType : extension
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>extension</code> element
    * @param extension the value for the element <code>extension</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> extension(String extension)
   {
      childNode.getOrCreate("extension").text(extension);
      return this;
   }

   /**
    * Returns the <code>extension</code> element
    * @return the node defined for the element <code>extension</code> 
    */
   public String getExtension()
   {
      return childNode.getTextValueForPatternName("extension");
   }

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeExtension()
   {
      childNode.removeChildren("extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: javaee:string ElementType : mime-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mime-type</code> element
    * @param mimeType the value for the element <code>mime-type</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> mimeType(String mimeType)
   {
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }

   /**
    * Returns the <code>mime-type</code> element
    * @return the node defined for the element <code>mime-type</code> 
    */
   public String getMimeType()
   {
      return childNode.getTextValueForPatternName("mime-type");
   }

   /**
    * Removes the <code>mime-type</code> element 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeMimeType()
   {
      childNode.removeChildren("mime-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MimeMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> id(String id)
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
    * @return the current instance of <code>MimeMappingType<T></code> 
    */
   public MimeMappingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
