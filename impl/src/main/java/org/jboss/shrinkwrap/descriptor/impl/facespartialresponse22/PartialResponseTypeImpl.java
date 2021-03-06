package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseChangesType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseErrorType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseRedirectType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> partial-responseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseTypeImpl<T> implements Child<T>, PartialResponseType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-changesType ElementType : changes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>changes</code> element with the given value will be created.
    * Otherwise, the existing <code>changes</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseChangesType<PartialResponseType<T>></code> 
    */
   public PartialResponseChangesType<PartialResponseType<T>> getOrCreateChanges()
   {
      Node node = childNode.getOrCreate("changes");
      PartialResponseChangesType<PartialResponseType<T>> changes = new PartialResponseChangesTypeImpl<PartialResponseType<T>>(this, "changes", childNode, node);
      return changes;
   }

   /**
    * Removes the <code>changes</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeChanges()
   {
      childNode.removeChildren("changes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-redirectType ElementType : redirect
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseRedirectType<PartialResponseType<T>></code> 
    */
   public PartialResponseRedirectType<PartialResponseType<T>> getOrCreateRedirect()
   {
      Node node = childNode.getOrCreate("redirect");
      PartialResponseRedirectType<PartialResponseType<T>> redirect = new PartialResponseRedirectTypeImpl<PartialResponseType<T>>(this, "redirect", childNode, node);
      return redirect;
   }

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeRedirect()
   {
      childNode.removeChildren("redirect");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-errorType ElementType : error
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error</code> element with the given value will be created.
    * Otherwise, the existing <code>error</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseErrorType<PartialResponseType<T>></code> 
    */
   public PartialResponseErrorType<PartialResponseType<T>> getOrCreateError()
   {
      Node node = childNode.getOrCreate("error");
      PartialResponseErrorType<PartialResponseType<T>> error = new PartialResponseErrorTypeImpl<PartialResponseType<T>>(this, "error", childNode, node);
      return error;
   }

   /**
    * Removes the <code>error</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeError()
   {
      childNode.removeChildren("error");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> id(String id)
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
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
