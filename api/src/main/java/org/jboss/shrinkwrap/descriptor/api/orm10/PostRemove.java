package org.jboss.shrinkwrap.descriptor.api.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> post-remove </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PostRemove<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PostRemove ElementName: xsd:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> attribute
    * @param methodName the value for the attribute <code>method-name</code> 
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> methodName(String methodName);

   /**
    * Returns the <code>method-name</code> attribute
    * @return the value defined for the attribute <code>method-name</code> 
    */
   public String getMethodName();

   /**
    * Removes the <code>method-name</code> attribute 
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> removeMethodName();
}
