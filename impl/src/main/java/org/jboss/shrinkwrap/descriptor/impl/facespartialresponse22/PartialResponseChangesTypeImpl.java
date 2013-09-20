package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseChangesType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseUpdateType;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.PartialResponseUpdateTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseInsertType;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.PartialResponseInsertTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseDeleteType;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.PartialResponseDeleteTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseAttributesType;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.PartialResponseAttributesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.PartialResponseExtensionTypeImpl;

/**
 * This class implements the <code> partial-response-changesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseChangesTypeImpl<T> implements Child<T>, PartialResponseChangesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseChangesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseChangesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-updateType ElementType : update
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>update</code> element will be created and returned.
    * Otherwise, the first existing <code>update</code> element will be returned.
    * @return the instance defined for the element <code>update</code> 
    */
   public PartialResponseUpdateType<PartialResponseChangesType<T>> getOrCreateUpdate()
   {
      List<Node> nodeList = childNode.get("update");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PartialResponseUpdateTypeImpl<PartialResponseChangesType<T>>(this, "update", childNode, nodeList.get(0));
      }
      return createUpdate();
   }

   /**
    * Creates a new <code>update</code> element 
    * @return the new created instance of <code>PartialResponseUpdateType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseUpdateType<PartialResponseChangesType<T>> createUpdate()
   {
      return new PartialResponseUpdateTypeImpl<PartialResponseChangesType<T>>(this, "update", childNode);
   }

   /**
    * Returns all <code>update</code> elements
    * @return list of <code>update</code> 
    */
   public List<PartialResponseUpdateType<PartialResponseChangesType<T>>> getAllUpdate()
   {
      List<PartialResponseUpdateType<PartialResponseChangesType<T>>> list = new ArrayList<PartialResponseUpdateType<PartialResponseChangesType<T>>>();
      List<Node> nodeList = childNode.get("update");
      for(Node node: nodeList)
      {
         PartialResponseUpdateType<PartialResponseChangesType<T>>  type = new PartialResponseUpdateTypeImpl<PartialResponseChangesType<T>>(this, "update", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>update</code> elements 
    * @return the current instance of <code>PartialResponseUpdateType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllUpdate()
   {
      childNode.removeChildren("update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-insertType ElementType : insert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>insert</code> element will be created and returned.
    * Otherwise, the first existing <code>insert</code> element will be returned.
    * @return the instance defined for the element <code>insert</code> 
    */
   public PartialResponseInsertType<PartialResponseChangesType<T>> getOrCreateInsert()
   {
      List<Node> nodeList = childNode.get("insert");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PartialResponseInsertTypeImpl<PartialResponseChangesType<T>>(this, "insert", childNode, nodeList.get(0));
      }
      return createInsert();
   }

   /**
    * Creates a new <code>insert</code> element 
    * @return the new created instance of <code>PartialResponseInsertType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseInsertType<PartialResponseChangesType<T>> createInsert()
   {
      return new PartialResponseInsertTypeImpl<PartialResponseChangesType<T>>(this, "insert", childNode);
   }

   /**
    * Returns all <code>insert</code> elements
    * @return list of <code>insert</code> 
    */
   public List<PartialResponseInsertType<PartialResponseChangesType<T>>> getAllInsert()
   {
      List<PartialResponseInsertType<PartialResponseChangesType<T>>> list = new ArrayList<PartialResponseInsertType<PartialResponseChangesType<T>>>();
      List<Node> nodeList = childNode.get("insert");
      for(Node node: nodeList)
      {
         PartialResponseInsertType<PartialResponseChangesType<T>>  type = new PartialResponseInsertTypeImpl<PartialResponseChangesType<T>>(this, "insert", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>insert</code> elements 
    * @return the current instance of <code>PartialResponseInsertType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllInsert()
   {
      childNode.removeChildren("insert");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-deleteType ElementType : delete
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>delete</code> element will be created and returned.
    * Otherwise, the first existing <code>delete</code> element will be returned.
    * @return the instance defined for the element <code>delete</code> 
    */
   public PartialResponseDeleteType<PartialResponseChangesType<T>> getOrCreateDelete()
   {
      List<Node> nodeList = childNode.get("delete");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PartialResponseDeleteTypeImpl<PartialResponseChangesType<T>>(this, "delete", childNode, nodeList.get(0));
      }
      return createDelete();
   }

   /**
    * Creates a new <code>delete</code> element 
    * @return the new created instance of <code>PartialResponseDeleteType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseDeleteType<PartialResponseChangesType<T>> createDelete()
   {
      return new PartialResponseDeleteTypeImpl<PartialResponseChangesType<T>>(this, "delete", childNode);
   }

   /**
    * Returns all <code>delete</code> elements
    * @return list of <code>delete</code> 
    */
   public List<PartialResponseDeleteType<PartialResponseChangesType<T>>> getAllDelete()
   {
      List<PartialResponseDeleteType<PartialResponseChangesType<T>>> list = new ArrayList<PartialResponseDeleteType<PartialResponseChangesType<T>>>();
      List<Node> nodeList = childNode.get("delete");
      for(Node node: nodeList)
      {
         PartialResponseDeleteType<PartialResponseChangesType<T>>  type = new PartialResponseDeleteTypeImpl<PartialResponseChangesType<T>>(this, "delete", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>delete</code> elements 
    * @return the current instance of <code>PartialResponseDeleteType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllDelete()
   {
      childNode.removeChildren("delete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-attributesType ElementType : attributes
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element will be created and returned.
    * Otherwise, the first existing <code>attributes</code> element will be returned.
    * @return the instance defined for the element <code>attributes</code> 
    */
   public PartialResponseAttributesType<PartialResponseChangesType<T>> getOrCreateAttributes()
   {
      List<Node> nodeList = childNode.get("attributes");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PartialResponseAttributesTypeImpl<PartialResponseChangesType<T>>(this, "attributes", childNode, nodeList.get(0));
      }
      return createAttributes();
   }

   /**
    * Creates a new <code>attributes</code> element 
    * @return the new created instance of <code>PartialResponseAttributesType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseAttributesType<PartialResponseChangesType<T>> createAttributes()
   {
      return new PartialResponseAttributesTypeImpl<PartialResponseChangesType<T>>(this, "attributes", childNode);
   }

   /**
    * Returns all <code>attributes</code> elements
    * @return list of <code>attributes</code> 
    */
   public List<PartialResponseAttributesType<PartialResponseChangesType<T>>> getAllAttributes()
   {
      List<PartialResponseAttributesType<PartialResponseChangesType<T>>> list = new ArrayList<PartialResponseAttributesType<PartialResponseChangesType<T>>>();
      List<Node> nodeList = childNode.get("attributes");
      for(Node node: nodeList)
      {
         PartialResponseAttributesType<PartialResponseChangesType<T>>  type = new PartialResponseAttributesTypeImpl<PartialResponseChangesType<T>>(this, "attributes", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attributes</code> elements 
    * @return the current instance of <code>PartialResponseAttributesType<PartialResponseChangesType<T>></code> 
    */
   public PartialResponseChangesType<T> removeAllAttributes()
   {
      childNode.removeChildren("attributes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: xsd:string ElementType : eval
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>eval</code> elements, 
    * a new <code>eval</code> element 
    * @param values list of <code>eval</code> objects 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> eval(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("eval").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>eval</code> elements
    * @return list of <code>eval</code> 
    */
public List<String> getAllEval()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("eval");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>eval</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> removeAllEval()
   {
      childNode.removeChildren("eval");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseChangesType ElementName: javaee:partial-response-extensionType ElementType : extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> extension()
   {
      childNode.getOrCreate("extension");
      return this;
   }

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public Boolean isExtension()
   {
      return childNode.getSingle("extension") != null;
   }

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of <code>PartialResponseChangesType<T></code> 
    */
   public PartialResponseChangesType<T> removeExtension()
   {
      childNode.removeChild("extension");
      return this;
   }
}
