package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNavigationCaseType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNavigationRuleExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNavigationCaseType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigNavigationRuleExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-navigation-ruleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigNavigationRuleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigNavigationRuleType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigNavigationRuleType<T>></code> 
    */
   public IconType<FacesConfigNavigationRuleType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigNavigationRuleType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:string ElementType : from-view-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-view-id</code> element
    * @param fromViewId the value for the element <code>from-view-id</code> 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> fromViewId(String fromViewId);

   /**
    * Returns the <code>from-view-id</code> element
    * @return the node defined for the element <code>from-view-id</code> 
    */
   public String getFromViewId();

   /**
    * Removes the <code>from-view-id</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeFromViewId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:faces-config-navigation-caseType ElementType : navigation-case
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-case</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-case</code> element will be returned.
    * @return the instance defined for the element <code>navigation-case</code> 
    */
   public FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>> getOrCreateNavigationCase();

   /**
    * Creates a new <code>navigation-case</code> element 
    * @return the new created instance of <code>FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>> createNavigationCase();

   /**
    * Returns all <code>navigation-case</code> elements
    * @return list of <code>navigation-case</code> 
    */
   public List<FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>>> getAllNavigationCase();

   /**
    * Removes all <code>navigation-case</code> elements 
    * @return the current instance of <code>FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllNavigationCase();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:faces-config-navigation-rule-extensionType ElementType : navigation-rule-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> navigationRuleExtension();

   /**
    * Removes the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public Boolean isNavigationRuleExtension();

   /**
    * Removes the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeNavigationRuleExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeId();
}
