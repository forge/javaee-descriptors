package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedStoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.StoredProcedureParameter;
import org.jboss.shrinkwrap.descriptor.impl.orm21.StoredProcedureParameterImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.QueryHint;
import org.jboss.shrinkwrap.descriptor.impl.orm21.QueryHintImpl;

/**
 * This class implements the <code> named-stored-procedure-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedStoredProcedureQueryImpl<T> implements Child<T>, NamedStoredProcedureQuery<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedStoredProcedureQueryImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedStoredProcedureQueryImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: orm:stored-procedure-parameter ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public StoredProcedureParameter<NamedStoredProcedureQuery<T>> getOrCreateParameter()
   {
      List<Node> nodeList = childNode.get("parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StoredProcedureParameterImpl<NamedStoredProcedureQuery<T>>(this, "parameter", childNode, nodeList.get(0));
      }
      return createParameter();
   }

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>StoredProcedureParameter<NamedStoredProcedureQuery<T>></code> 
    */
   public StoredProcedureParameter<NamedStoredProcedureQuery<T>> createParameter()
   {
      return new StoredProcedureParameterImpl<NamedStoredProcedureQuery<T>>(this, "parameter", childNode);
   }

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<StoredProcedureParameter<NamedStoredProcedureQuery<T>>> getAllParameter()
   {
      List<StoredProcedureParameter<NamedStoredProcedureQuery<T>>> list = new ArrayList<StoredProcedureParameter<NamedStoredProcedureQuery<T>>>();
      List<Node> nodeList = childNode.get("parameter");
      for(Node node: nodeList)
      {
         StoredProcedureParameter<NamedStoredProcedureQuery<T>>  type = new StoredProcedureParameterImpl<NamedStoredProcedureQuery<T>>(this, "parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>StoredProcedureParameter<NamedStoredProcedureQuery<T>></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllParameter()
   {
      childNode.removeChildren("parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : result-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>result-class</code> elements, 
    * a new <code>result-class</code> element 
    * @param values list of <code>result-class</code> objects 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> resultClass(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("result-class").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>result-class</code> elements
    * @return list of <code>result-class</code> 
    */
public List<String> getAllResultClass()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("result-class");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>result-class</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllResultClass()
   {
      childNode.removeChildren("result-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>result-set-mapping</code> elements, 
    * a new <code>result-set-mapping</code> element 
    * @param values list of <code>result-set-mapping</code> objects 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> resultSetMapping(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("result-set-mapping").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>result-set-mapping</code> elements
    * @return list of <code>result-set-mapping</code> 
    */
public List<String> getAllResultSetMapping()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("result-set-mapping");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>result-set-mapping</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllResultSetMapping()
   {
      childNode.removeChildren("result-set-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedStoredProcedureQuery<T>> getOrCreateHint()
   {
      List<Node> nodeList = childNode.get("hint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new QueryHintImpl<NamedStoredProcedureQuery<T>>(this, "hint", childNode, nodeList.get(0));
      }
      return createHint();
   }

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedStoredProcedureQuery<T>></code> 
    */
   public QueryHint<NamedStoredProcedureQuery<T>> createHint()
   {
      return new QueryHintImpl<NamedStoredProcedureQuery<T>>(this, "hint", childNode);
   }

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedStoredProcedureQuery<T>>> getAllHint()
   {
      List<QueryHint<NamedStoredProcedureQuery<T>>> list = new ArrayList<QueryHint<NamedStoredProcedureQuery<T>>>();
      List<Node> nodeList = childNode.get("hint");
      for(Node node: nodeList)
      {
         QueryHint<NamedStoredProcedureQuery<T>>  type = new QueryHintImpl<NamedStoredProcedureQuery<T>>(this, "hint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedStoredProcedureQuery<T>></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllHint()
   {
      childNode.removeChildren("hint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : procedure-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>procedure-name</code> attribute
    * @param procedureName the value for the attribute <code>procedure-name</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> procedureName(String procedureName)
   {
      childNode.attribute("procedure-name", procedureName);
      return this;
   }

   /**
    * Returns the <code>procedure-name</code> attribute
    * @return the value defined for the attribute <code>procedure-name</code> 
    */
      public String getProcedureName()
   {
      return childNode.getAttribute("procedure-name");
   }

   /**
    * Removes the <code>procedure-name</code> attribute 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeProcedureName()
   {
      childNode.removeAttribute("procedure-name");
      return this;
   }
}
