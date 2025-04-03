
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32633.3901", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32633.3903", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32633.3905", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32633.3907", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32633.3909", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32633.3911", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32633.3913", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32633.3915", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32633.3917", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32633.3919", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32633.3921", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32633.3923", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32633.3925", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32633.3927", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32633.3929", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32633.3931", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32633.3933", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32633.3935", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32633.3937", "" ) );


objectMap.put( "32633.3901", bC );


bC = new ByFactoryCollection("pass", "32633.3941", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32633.3943", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32633.3945", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32633.3947", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32633.3949", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32633.3951", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32633.3953", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32633.3955", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32633.3957", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32633.3959", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32633.3961", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32633.3963", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32633.3965", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32633.3967", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32633.3969", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32633.3971", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32633.3973", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32633.3975", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32633.3977", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32633.3979", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32633.3981", "" ) );


objectMap.put( "32633.3941", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
