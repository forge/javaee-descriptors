/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

import java.util.List;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface WebResourceCollectionCommonType<ORIGIN extends WebResourceCollectionCommonType<ORIGIN>>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : web-resource-name
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>web-resource-name</code> element
    * 
    * @param webResourceName the value for the element <code>web-resource-name</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN webResourceName(String webResourceName);

   /**
    * Returns the <code>web-resource-name</code> element
    * 
    * @return the node defined for the element <code>web-resource-name</code>
    */
   public String getWebResourceName();

   /**
    * Removes the <code>web-resource-name</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeWebResourceName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN description(String... values);

   /**
    * Returns all <code>description</code> elements
    * 
    * @return list of <code>description</code>
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, a new <code>url-pattern</code>
    * element
    * 
    * @param values list of <code>url-pattern</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN urlPattern(String... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * 
    * @return list of <code>url-pattern</code>
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllUrlPattern();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : http-method
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>http-method</code> elements, a new <code>http-method</code>
    * element
    * 
    * @param values list of <code>http-method</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN httpMethod(String... values);

   /**
    * Returns all <code>http-method</code> elements
    * 
    * @return list of <code>http-method</code>
    */
   public List<String> getAllHttpMethod();

   /**
    * Removes the <code>http-method</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllHttpMethod();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeId();

}
