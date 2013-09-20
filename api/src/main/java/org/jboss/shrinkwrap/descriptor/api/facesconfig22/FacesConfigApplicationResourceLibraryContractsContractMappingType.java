package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-application-resource-library-contracts-contract-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigApplicationResourceLibraryContractsContractMappingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceLibraryContractsContractMappingType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllUrlPattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:token ElementType : contracts
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>contracts</code> elements, 
    * a new <code>contracts</code> element 
    * @param values list of <code>contracts</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> contracts(String ... values);

   /**
    * Returns all <code>contracts</code> elements
    * @return list of <code>contracts</code> 
    */
   public List<String> getAllContracts();

   /**
    * Removes the <code>contracts</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeAllContracts();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceLibraryContractsContractMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsContractMappingType<T></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsContractMappingType<T> removeId();
}
