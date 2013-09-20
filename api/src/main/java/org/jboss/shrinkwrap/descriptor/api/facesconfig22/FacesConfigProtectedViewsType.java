package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-protected-viewsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigProtectedViewsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigProtectedViewsType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FacesConfigProtectedViewsType<T></code> 
    */
   public FacesConfigProtectedViewsType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>FacesConfigProtectedViewsType<T></code> 
    */
   public FacesConfigProtectedViewsType<T> removeAllUrlPattern();
}
