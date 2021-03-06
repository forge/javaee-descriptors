package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseChangesType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseErrorType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseRedirectType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.WebFacesPartialResponseDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacesPartialResponseDescriptor descriptor = Descriptors.create(WebFacesPartialResponseDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFacesPartialResponseDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebFacesPartialResponseDescriptor>, WebFacesPartialResponseDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFacesPartialResponseDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("partial-response"));
   }

   public WebFacesPartialResponseDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-partialresponse_2_2.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-changesType ElementType : changes
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>changes</code> element with the given value will be created.
    * Otherwise, the existing <code>changes</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseChangesType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseChangesType<WebFacesPartialResponseDescriptor> getOrCreateChanges()
   {
      Node node = model.getOrCreate("changes");
      PartialResponseChangesType<WebFacesPartialResponseDescriptor> changes = new PartialResponseChangesTypeImpl<WebFacesPartialResponseDescriptor>(this, "changes", model, node);
      return changes;
   }

   /**
    * Removes the <code>changes</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeChanges()
   {
      model.removeChildren("changes");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-redirectType ElementType : redirect
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseRedirectType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseRedirectType<WebFacesPartialResponseDescriptor> getOrCreateRedirect()
   {
      Node node = model.getOrCreate("redirect");
      PartialResponseRedirectType<WebFacesPartialResponseDescriptor> redirect = new PartialResponseRedirectTypeImpl<WebFacesPartialResponseDescriptor>(this, "redirect", model, node);
      return redirect;
   }

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeRedirect()
   {
      model.removeChildren("redirect");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-errorType ElementType : error
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error</code> element with the given value will be created.
    * Otherwise, the existing <code>error</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseErrorType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseErrorType<WebFacesPartialResponseDescriptor> getOrCreateError()
   {
      Node node = model.getOrCreate("error");
      PartialResponseErrorType<WebFacesPartialResponseDescriptor> error = new PartialResponseErrorTypeImpl<WebFacesPartialResponseDescriptor>(this, "error", model, node);
      return error;
   }

   /**
    * Removes the <code>error</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeError()
   {
      model.removeChildren("error");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }

}
