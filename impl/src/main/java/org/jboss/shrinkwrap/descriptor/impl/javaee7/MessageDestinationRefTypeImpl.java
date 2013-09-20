package org.jboss.shrinkwrap.descriptor.impl.javaee7; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationUsageType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> message-destination-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MessageDestinationRefTypeImpl<T> implements Child<T>, MessageDestinationRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDestinationRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MessageDestinationRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> lookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.getTextValueForPatternName("lookup-name");
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeLookupName()
   {
      childNode.removeChildren("lookup-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> getOrCreateInjectionTarget()
   {
      List<Node> nodeList = childNode.get("injection-target");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "injection-target", childNode, nodeList.get(0));
      }
      return createInjectionTarget();
   }

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<MessageDestinationRefType<T>></code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> createInjectionTarget()
   {
      return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getAllInjectionTarget()
   {
      List<InjectionTargetType<MessageDestinationRefType<T>>> list = new ArrayList<InjectionTargetType<MessageDestinationRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for(Node node: nodeList)
      {
         InjectionTargetType<MessageDestinationRefType<T>>  type = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<MessageDestinationRefType<T>></code> 
    */
   public MessageDestinationRefType<T> removeAllInjectionTarget()
   {
      childNode.removeChildren("injection-target");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:token ElementType : message-destination-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-ref-name</code> element
    * @param messageDestinationRefName the value for the element <code>message-destination-ref-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationRefName(String messageDestinationRefName)
   {
      childNode.getOrCreate("message-destination-ref-name").text(messageDestinationRefName);
      return this;
   }

   /**
    * Returns the <code>message-destination-ref-name</code> element
    * @return the node defined for the element <code>message-destination-ref-name</code> 
    */
   public String getMessageDestinationRefName()
   {
      return childNode.getTextValueForPatternName("message-destination-ref-name");
   }

   /**
    * Removes the <code>message-destination-ref-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationRefName()
   {
      childNode.removeChildren("message-destination-ref-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:fully-qualified-classType ElementType : message-destination-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-type</code> element
    * @param messageDestinationType the value for the element <code>message-destination-type</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType()
   {
      return childNode.getTextValueForPatternName("message-destination-type");
   }

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationType()
   {
      childNode.removeChildren("message-destination-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:message-destination-usageType ElementType : message-destination-usage
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>message-destination-usage</code> element
    * @param messageDestinationUsage the value for the element <code>message-destination-usage</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationUsage(MessageDestinationUsageType messageDestinationUsage)
   {
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }
   /**
    * Sets the <code>message-destination-usage</code> element
    * @param messageDestinationUsage the value for the element <code>message-destination-usage</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationUsage(String messageDestinationUsage)
   {
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the value found for the element <code>message-destination-usage</code> 
    */
   public MessageDestinationUsageType getMessageDestinationUsage()
   {
      return MessageDestinationUsageType.getFromStringValue(childNode.getTextValueForPatternName("message-destination-usage"));
   }

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the value found for the element <code>message-destination-usage</code> 
    */
   public String  getMessageDestinationUsageAsString()
   {
      return childNode.getTextValueForPatternName("message-destination-usage");
   }

   /**
    * Removes the <code>message-destination-usage</code> attribute 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationUsage()
   {
      childNode.removeAttribute("message-destination-usage");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:string ElementType : message-destination-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-link</code> element
    * @param messageDestinationLink the value for the element <code>message-destination-link</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink()
   {
      return childNode.getTextValueForPatternName("message-destination-link");
   }

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationLink()
   {
      childNode.removeChildren("message-destination-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
