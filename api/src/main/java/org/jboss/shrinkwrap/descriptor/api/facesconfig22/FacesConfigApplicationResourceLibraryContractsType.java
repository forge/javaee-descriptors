package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationResourceLibraryContractsContractMappingType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-application-resource-library-contractsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigApplicationResourceLibraryContractsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceLibraryContractsType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: javaee:faces-config-application-resource-library-contracts-contract-mappingType ElementType : contract-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>contract-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>contract-mapping</code> element will be returned.
    * @return the instance defined for the element <code>contract-mapping</code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>> getOrCreateContractMapping();

   /**
    * Creates a new <code>contract-mapping</code> element 
    * @return the new created instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>> createContractMapping();

   /**
    * Returns all <code>contract-mapping</code> elements
    * @return list of <code>contract-mapping</code> 
    */
   public List<FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>>> getAllContractMapping();

   /**
    * Removes all <code>contract-mapping</code> elements 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<FacesConfigApplicationResourceLibraryContractsType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeAllContractMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<T> removeId();
}
