package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLifecycleExtensionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLifecycleExtensionType;
/**
 * This interface defines the contract for the <code> faces-config-lifecycleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigLifecycleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: xsd:token ElementType : phase-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>phase-listener</code> elements, 
    * a new <code>phase-listener</code> element 
    * @param values list of <code>phase-listener</code> objects 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> phaseListener(String ... values);

   /**
    * Returns all <code>phase-listener</code> elements
    * @return list of <code>phase-listener</code> 
    */
   public List<String> getAllPhaseListener();

   /**
    * Removes the <code>phase-listener</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeAllPhaseListener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: javaee:faces-config-lifecycle-extensionType ElementType : lifecycle-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> lifecycleExtension();

   /**
    * Removes the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public Boolean isLifecycleExtension();

   /**
    * Removes the <code>lifecycle-extension</code> element 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeLifecycleExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLifecycleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigLifecycleType<T></code> 
    */
   public FacesConfigLifecycleType<T> removeId();
}
