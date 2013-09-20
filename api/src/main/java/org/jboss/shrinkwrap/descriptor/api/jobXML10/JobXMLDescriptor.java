package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     JobXMLDescriptor descriptor = Descriptors.create(JobXMLDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JobXMLDescriptor extends Descriptor, DescriptorNamespace<JobXMLDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<JobXMLDescriptor></code> 
    */
   public Properties<JobXMLDescriptor> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeProperties();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<JobXMLDescriptor></code> 
    */
   public Listeners<JobXMLDescriptor> getOrCreateListeners();

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeListeners();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<JobXMLDescriptor> getOrCreateDecision();

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<JobXMLDescriptor></code> 
    */
   public Decision<JobXMLDescriptor> createDecision();

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<JobXMLDescriptor>> getAllDecision();

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllDecision();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<JobXMLDescriptor> getOrCreateFlow();

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<JobXMLDescriptor></code> 
    */
   public Flow<JobXMLDescriptor> createFlow();

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<JobXMLDescriptor>> getAllFlow();

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllFlow();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<JobXMLDescriptor> getOrCreateSplit();

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<JobXMLDescriptor></code> 
    */
   public Split<JobXMLDescriptor> createSplit();

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<JobXMLDescriptor>> getAllSplit();

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllSplit();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<JobXMLDescriptor> getOrCreateStep();

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<JobXMLDescriptor></code> 
    */
   public Step<JobXMLDescriptor> createStep();

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<JobXMLDescriptor>> getAllStep();

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllStep();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.0";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:string ElementType : restartable
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restartable</code> attribute
    * @param restartable the value for the attribute <code>restartable</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor restartable(String restartable);

   /**
    * Returns the <code>restartable</code> attribute
    * @return the value defined for the attribute <code>restartable</code> 
    */
   public String getRestartable();

   /**
    * Removes the <code>restartable</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeRestartable();
}
