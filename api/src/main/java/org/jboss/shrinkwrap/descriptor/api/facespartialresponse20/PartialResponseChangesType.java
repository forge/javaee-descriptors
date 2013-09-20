package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> partial-response-changesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseChangesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-updateType ElementType : update
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>update</code> element will be created and returned.
    * Otherwise, the first existing <code>update</code> element will be returned.
    * @return the instance defined for the element <code>update</code> 
    */
   public PartialResponseUpdateType<PartialResponseChangesType<T>> getOrCreateUpdate();

   /**
    * Creates a new <code>update</code> element 
    * @return the new created instance of <code>PartialResponseUpdateType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseUpdateType<PartialResponseChangesType<T>> createUpdate();

   /**
    * Returns all <code>update</code> elements
    * @return list of <code>update</code> 
    */
   public List<PartialResponseUpdateType<PartialResponseChangesType<T>>> getAllUpdate();

   /**
    * Removes all <code>update</code> elements 
    * @return the current instance of <code>PartialResponseUpdateType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-insertType ElementType : insert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>insert</code> element will be created and returned.
    * Otherwise, the first existing <code>insert</code> element will be returned.
    * @return the instance defined for the element <code>insert</code> 
    */
   public PartialResponseInsertType<PartialResponseChangesType<T>> getOrCreateInsert();

   /**
    * Creates a new <code>insert</code> element 
    * @return the new created instance of <code>PartialResponseInsertType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseInsertType<PartialResponseChangesType<T>> createInsert();

   /**
    * Returns all <code>insert</code> elements
    * @return list of <code>insert</code> 
    */
   public List<PartialResponseInsertType<PartialResponseChangesType<T>>> getAllInsert();

   /**
    * Removes all <code>insert</code> elements 
    * @return the current instance of <code>PartialResponseInsertType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllInsert();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-deleteType ElementType : delete
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>delete</code> element will be created and returned.
    * Otherwise, the first existing <code>delete</code> element will be returned.
    * @return the instance defined for the element <code>delete</code> 
    */
   public PartialResponseDeleteType<PartialResponseChangesType<T>> getOrCreateDelete();

   /**
    * Creates a new <code>delete</code> element 
    * @return the new created instance of <code>PartialResponseDeleteType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseDeleteType<PartialResponseChangesType<T>> createDelete();

   /**
    * Returns all <code>delete</code> elements
    * @return list of <code>delete</code> 
    */
   public List<PartialResponseDeleteType<PartialResponseChangesType<T>>> getAllDelete();

   /**
    * Removes all <code>delete</code> elements 
    * @return the current instance of <code>PartialResponseDeleteType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllDelete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-attributesType ElementType : attributes
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element will be created and returned.
    * Otherwise, the first existing <code>attributes</code> element will be returned.
    * @return the instance defined for the element <code>attributes</code> 
    */
   public PartialResponseAttributesType<PartialResponseChangesType<T>> getOrCreateAttributes();

   /**
    * Creates a new <code>attributes</code> element 
    * @return the new created instance of <code>PartialResponseAttributesType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseAttributesType<PartialResponseChangesType<T>> createAttributes();

   /**
    * Returns all <code>attributes</code> elements
    * @return list of <code>attributes</code> 
    */
   public List<PartialResponseAttributesType<PartialResponseChangesType<T>>> getAllAttributes();

   /**
    * Removes all <code>attributes</code> elements 
    * @return the current instance of <code>PartialResponseAttributesType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllAttributes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: xsd:string ElementType : eval
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>eval</code> elements, 
    * a new <code>eval</code> element 
    * @param values list of <code>eval</code> objects 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> eval(String ... values);

   /**
    * Returns all <code>eval</code> elements
    * @return list of <code>eval</code> 
    */
   public List<String> getAllEval();

   /**
    * Removes the <code>eval</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> removeAllEval();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-extensionType ElementType : extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> extension();

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public Boolean isExtension();

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> removeExtension();
}
