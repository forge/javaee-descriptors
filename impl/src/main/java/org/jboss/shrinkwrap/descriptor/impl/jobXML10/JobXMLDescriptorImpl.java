package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.jobXML10.JobXMLDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PropertiesImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.ListenersImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.DecisionImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.FlowImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.SplitImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.StepImpl;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

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
public class JobXMLDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<JobXMLDescriptor>, JobXMLDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JobXMLDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("job"));
   }

   public JobXMLDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/jobXML_1_0.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<JobXMLDescriptor></code> 
    */
   public Properties<JobXMLDescriptor> getOrCreateProperties()
   {
      Node node = model.getOrCreate("properties");
      Properties<JobXMLDescriptor> properties = new PropertiesImpl<JobXMLDescriptor>(this, "properties", model, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeProperties()
   {
      model.removeChildren("properties");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<JobXMLDescriptor></code> 
    */
   public Listeners<JobXMLDescriptor> getOrCreateListeners()
   {
      Node node = model.getOrCreate("listeners");
      Listeners<JobXMLDescriptor> listeners = new ListenersImpl<JobXMLDescriptor>(this, "listeners", model, node);
      return listeners;
   }

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeListeners()
   {
      model.removeChildren("listeners");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<JobXMLDescriptor> getOrCreateDecision()
   {
      List<Node> nodeList = model.get("decision");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DecisionImpl<JobXMLDescriptor>(this, "decision", model, nodeList.get(0));
      }
      return createDecision();
   }

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<JobXMLDescriptor></code> 
    */
   public Decision<JobXMLDescriptor> createDecision()
   {
      return new DecisionImpl<JobXMLDescriptor>(this, "decision", model);
   }

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<JobXMLDescriptor>> getAllDecision()
   {
      List<Decision<JobXMLDescriptor>> list = new ArrayList<Decision<JobXMLDescriptor>>();
      List<Node> nodeList = model.get("decision");
      for(Node node: nodeList)
      {
         Decision<JobXMLDescriptor>  type = new DecisionImpl<JobXMLDescriptor>(this, "decision", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllDecision()
   {
      model.removeChildren("decision");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<JobXMLDescriptor> getOrCreateFlow()
   {
      List<Node> nodeList = model.get("flow");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FlowImpl<JobXMLDescriptor>(this, "flow", model, nodeList.get(0));
      }
      return createFlow();
   }

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<JobXMLDescriptor></code> 
    */
   public Flow<JobXMLDescriptor> createFlow()
   {
      return new FlowImpl<JobXMLDescriptor>(this, "flow", model);
   }

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<JobXMLDescriptor>> getAllFlow()
   {
      List<Flow<JobXMLDescriptor>> list = new ArrayList<Flow<JobXMLDescriptor>>();
      List<Node> nodeList = model.get("flow");
      for(Node node: nodeList)
      {
         Flow<JobXMLDescriptor>  type = new FlowImpl<JobXMLDescriptor>(this, "flow", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllFlow()
   {
      model.removeChildren("flow");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<JobXMLDescriptor> getOrCreateSplit()
   {
      List<Node> nodeList = model.get("split");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SplitImpl<JobXMLDescriptor>(this, "split", model, nodeList.get(0));
      }
      return createSplit();
   }

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<JobXMLDescriptor></code> 
    */
   public Split<JobXMLDescriptor> createSplit()
   {
      return new SplitImpl<JobXMLDescriptor>(this, "split", model);
   }

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<JobXMLDescriptor>> getAllSplit()
   {
      List<Split<JobXMLDescriptor>> list = new ArrayList<Split<JobXMLDescriptor>>();
      List<Node> nodeList = model.get("split");
      for(Node node: nodeList)
      {
         Split<JobXMLDescriptor>  type = new SplitImpl<JobXMLDescriptor>(this, "split", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllSplit()
   {
      model.removeChildren("split");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<JobXMLDescriptor> getOrCreateStep()
   {
      List<Node> nodeList = model.get("step");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StepImpl<JobXMLDescriptor>(this, "step", model, nodeList.get(0));
      }
      return createStep();
   }

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<JobXMLDescriptor></code> 
    */
   public Step<JobXMLDescriptor> createStep()
   {
      return new StepImpl<JobXMLDescriptor>(this, "step", model);
   }

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<JobXMLDescriptor>> getAllStep()
   {
      List<Step<JobXMLDescriptor>> list = new ArrayList<Step<JobXMLDescriptor>>();
      List<Node> nodeList = model.get("step");
      for(Node node: nodeList)
      {
         Step<JobXMLDescriptor>  type = new StepImpl<JobXMLDescriptor>(this, "step", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<JobXMLDescriptor></code> 
    */
   public JobXMLDescriptor removeAllStep()
   {
      model.removeChildren("step");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JobXMLDescriptor ElementName: xsd:string ElementType : restartable
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restartable</code> attribute
    * @param restartable the value for the attribute <code>restartable</code> 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor restartable(String restartable)
   {
      model.attribute("restartable", restartable);
      return this;
   }

   /**
    * Returns the <code>restartable</code> attribute
    * @return the value defined for the attribute <code>restartable</code> 
    */
      public String getRestartable()
   {
      return model.getAttribute("restartable");
   }

   /**
    * Removes the <code>restartable</code> attribute 
    * @return the current instance of <code>JobXMLDescriptor</code> 
    */
   public JobXMLDescriptor removeRestartable()
   {
      model.removeAttribute("restartable");
      return this;
   }

}
