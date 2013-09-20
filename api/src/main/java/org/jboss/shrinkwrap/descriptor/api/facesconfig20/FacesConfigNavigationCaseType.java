package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRedirectType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-navigation-caseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigNavigationCaseType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigNavigationCaseType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigNavigationCaseType<T>></code> 
    */
   public IconType<FacesConfigNavigationCaseType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigNavigationCaseType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigNavigationCaseType<T>></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:string ElementType : from-action
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-action</code> element
    * @param fromAction the value for the element <code>from-action</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> fromAction(String fromAction);

   /**
    * Returns the <code>from-action</code> element
    * @return the node defined for the element <code>from-action</code> 
    */
   public String getFromAction();

   /**
    * Removes the <code>from-action</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeFromAction();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:token ElementType : from-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-outcome</code> element
    * @param fromOutcome the value for the element <code>from-outcome</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> fromOutcome(String fromOutcome);

   /**
    * Returns the <code>from-outcome</code> element
    * @return the node defined for the element <code>from-outcome</code> 
    */
   public String getFromOutcome();

   /**
    * Removes the <code>from-outcome</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeFromOutcome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:string ElementType : if
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>if</code> element
    * @param _if the value for the element <code>if</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> _if(String _if);

   /**
    * Returns the <code>if</code> element
    * @return the node defined for the element <code>if</code> 
    */
   public String getIf();

   /**
    * Removes the <code>if</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeIf();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:string ElementType : to-view-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to-view-id</code> element
    * @param toViewId the value for the element <code>to-view-id</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> toViewId(String toViewId);

   /**
    * Returns the <code>to-view-id</code> element
    * @return the node defined for the element <code>to-view-id</code> 
    */
   public String getToViewId();

   /**
    * Removes the <code>to-view-id</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeToViewId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:faces-config-redirectType ElementType : redirect
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigRedirectType<FacesConfigNavigationCaseType<T>></code> 
    */
   public FacesConfigRedirectType<FacesConfigNavigationCaseType<T>> getOrCreateRedirect();

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeRedirect();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeId();
}
