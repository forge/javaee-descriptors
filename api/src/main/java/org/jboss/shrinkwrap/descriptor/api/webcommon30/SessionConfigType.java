package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
/**
 * This interface defines the contract for the <code> session-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SessionConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:integer ElementType : session-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>session-timeout</code> element
    * @param sessionTimeout the value for the element <code>session-timeout</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> sessionTimeout(Integer sessionTimeout);

   /**
    * Returns the <code>session-timeout</code> element
    * @return the node defined for the element <code>session-timeout</code> 
    */
   public Integer getSessionTimeout();

   /**
    * Removes the <code>session-timeout</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeSessionTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: javaee:cookie-configType ElementType : cookie-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cookie-config</code> element with the given value will be created.
    * Otherwise, the existing <code>cookie-config</code> element will be returned.
    * @return  a new or existing instance of <code>CookieConfigType<SessionConfigType<T>></code> 
    */
   public CookieConfigType<SessionConfigType<T>> getOrCreateCookieConfig();

   /**
    * Removes the <code>cookie-config</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeCookieConfig();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: javaee:tracking-modeType ElementType : tracking-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all javaee:tracking-modeType objects representing <code>tracking-mode</code> elements, 
    * a new <code>tracking-mode</code> element 
    * @param values list of <code>tracking-mode</code> objects 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> trackingMode(TrackingModeType ... values);

   /**
    * Creates for all String objects representing <code>tracking-mode</code> elements, 
    * a new <code>tracking-mode</code> element 
    * @param values list of <code>tracking-mode</code> objects 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> trackingMode(String ... values);

   /**
    * Returns all <code>tracking-mode</code> elements
    * @return list of <code>tracking-mode</code> 
    */
   public List<String> getAllTrackingMode();

   /**
    * Removes the <code>tracking-mode</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeAllTrackingMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeId();
}
