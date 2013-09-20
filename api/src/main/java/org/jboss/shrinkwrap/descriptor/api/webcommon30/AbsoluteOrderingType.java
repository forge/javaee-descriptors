package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOthersType;
/**
 * This interface defines the contract for the <code> absoluteOrderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AbsoluteOrderingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AbsoluteOrderingType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>AbsoluteOrderingType<T></code> 
    */
   public AbsoluteOrderingType<T> name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>AbsoluteOrderingType<T></code> 
    */
   public AbsoluteOrderingType<T> removeAllName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AbsoluteOrderingType ElementName: javaee:ordering-othersType ElementType : others
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>others</code> element 
    * @return the current instance of <code>AbsoluteOrderingType<T></code> 
    */
   public AbsoluteOrderingType<T> others();

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>AbsoluteOrderingType<T></code> 
    */
   public Boolean isOthers();

   /**
    * Removes the <code>others</code> element 
    * @return the current instance of <code>AbsoluteOrderingType<T></code> 
    */
   public AbsoluteOrderingType<T> removeOthers();
}
