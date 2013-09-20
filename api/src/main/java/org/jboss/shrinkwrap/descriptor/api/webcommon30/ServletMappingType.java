package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletMappingCommonType;

/**
 * This interface defines the contract for the <code> servlet-mappingType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServletMappingType<T> extends Child<T>, ServletMappingCommonType<ServletMappingType<T>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

}
