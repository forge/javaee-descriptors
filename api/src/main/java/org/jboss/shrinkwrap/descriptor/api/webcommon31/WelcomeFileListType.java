package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> welcome-file-listType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WelcomeFileListType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WelcomeFileListType ElementName: xsd:string ElementType : welcome-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>welcome-file</code> elements, 
    * a new <code>welcome-file</code> element 
    * @param values list of <code>welcome-file</code> objects 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> welcomeFile(String ... values);

   /**
    * Returns all <code>welcome-file</code> elements
    * @return list of <code>welcome-file</code> 
    */
   public List<String> getAllWelcomeFile();

   /**
    * Removes the <code>welcome-file</code> element 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> removeAllWelcomeFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WelcomeFileListType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WelcomeFileListType<T></code> 
    */
   public WelcomeFileListType<T> removeId();
}
