<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>DELETE</name>
   <tag></tag>
   <elementGuidId>16c5723d-a9fc-41cb-a507-29398f1e3ad3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkdhbmRoeSIsInBhc3N3b3JkIjoiSmVubmVrZXBva2V0MTAjIiwiaWF0IjoxNzAxNDA2MjcyfQ.NwOJwQ6sFFQmhgUSXh2zEOEYdkshV5jnrqMJz0hzQv4</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;isbn\&quot;: \&quot;${GlobalVariable.EliminarISBN}\&quot;,\n  \&quot;userId\&quot;: \&quot;${GlobalVariable.userid}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>3caf371e-d8e6-4281-a6c6-1a9a8f562527</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkdhbmRoeSIsInBhc3N3b3JkIjoiSmVubmVrZXBva2V0MTAjIiwiaWF0IjoxNzAxNDA2MjcyfQ.NwOJwQ6sFFQmhgUSXh2zEOEYdkshV5jnrqMJz0hzQv4</value>
      <webElementGuid>7f962634-f020-4986-b5ae-795bc9882ba1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.0.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>DELETE</restRequestMethod>
   <restUrl>https://demoqa.com/BookStore/v1/Books?UserId=dd914370-1828-43f6-9e26-002e143e1cd3</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
