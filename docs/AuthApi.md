# AuthApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupMembership**](AuthApi.md#addGroupMembership) | **PUT** /auth/groups/{groupId}/members/{userId} | add group membership
[**attachPolicyToGroup**](AuthApi.md#attachPolicyToGroup) | **PUT** /auth/groups/{groupId}/policies/{policyId} | attach policy to group
[**attachPolicyToUser**](AuthApi.md#attachPolicyToUser) | **PUT** /auth/users/{userId}/policies/{policyId} | attach policy to user
[**createCredentials**](AuthApi.md#createCredentials) | **POST** /auth/users/{userId}/credentials | create credentials
[**createGroup**](AuthApi.md#createGroup) | **POST** /auth/groups | create group
[**createPolicy**](AuthApi.md#createPolicy) | **POST** /auth/policies | create policy
[**createUser**](AuthApi.md#createUser) | **POST** /auth/users | create user
[**deleteCredentials**](AuthApi.md#deleteCredentials) | **DELETE** /auth/users/{userId}/credentials/{accessKeyId} | delete credentials
[**deleteGroup**](AuthApi.md#deleteGroup) | **DELETE** /auth/groups/{groupId} | delete group
[**deleteGroupMembership**](AuthApi.md#deleteGroupMembership) | **DELETE** /auth/groups/{groupId}/members/{userId} | delete group membership
[**deletePolicy**](AuthApi.md#deletePolicy) | **DELETE** /auth/policies/{policyId} | delete policy
[**deleteUser**](AuthApi.md#deleteUser) | **DELETE** /auth/users/{userId} | delete user
[**detachPolicyFromGroup**](AuthApi.md#detachPolicyFromGroup) | **DELETE** /auth/groups/{groupId}/policies/{policyId} | detach policy from group
[**detachPolicyFromUser**](AuthApi.md#detachPolicyFromUser) | **DELETE** /auth/users/{userId}/policies/{policyId} | detach policy from user
[**getCredentials**](AuthApi.md#getCredentials) | **GET** /auth/users/{userId}/credentials/{accessKeyId} | get credentials
[**getCurrentUser**](AuthApi.md#getCurrentUser) | **GET** /user | get current user
[**getGroup**](AuthApi.md#getGroup) | **GET** /auth/groups/{groupId} | get group
[**getPolicy**](AuthApi.md#getPolicy) | **GET** /auth/policies/{policyId} | get policy
[**getUser**](AuthApi.md#getUser) | **GET** /auth/users/{userId} | get user
[**listGroupMembers**](AuthApi.md#listGroupMembers) | **GET** /auth/groups/{groupId}/members | list group members
[**listGroupPolicies**](AuthApi.md#listGroupPolicies) | **GET** /auth/groups/{groupId}/policies | list group policies
[**listGroups**](AuthApi.md#listGroups) | **GET** /auth/groups | list groups
[**listPolicies**](AuthApi.md#listPolicies) | **GET** /auth/policies | list policies
[**listUserCredentials**](AuthApi.md#listUserCredentials) | **GET** /auth/users/{userId}/credentials | list user credentials
[**listUserGroups**](AuthApi.md#listUserGroups) | **GET** /auth/users/{userId}/groups | list user groups
[**listUserPolicies**](AuthApi.md#listUserPolicies) | **GET** /auth/users/{userId}/policies | list user policies
[**listUsers**](AuthApi.md#listUsers) | **GET** /auth/users | list users
[**updatePolicy**](AuthApi.md#updatePolicy) | **PUT** /auth/policies/{policyId} | update policy


<a name="addGroupMembership"></a>
# **addGroupMembership**
> addGroupMembership(groupId, userId)

add group membership

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      apiInstance.addGroupMembership(groupId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#addGroupMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **userId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | membership added successfully |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="attachPolicyToGroup"></a>
# **attachPolicyToGroup**
> attachPolicyToGroup(groupId, policyId)

attach policy to group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.attachPolicyToGroup(groupId, policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#attachPolicyToGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **policyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | policy attached successfully |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="attachPolicyToUser"></a>
# **attachPolicyToUser**
> attachPolicyToUser(userId, policyId)

attach policy to user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.attachPolicyToUser(userId, policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#attachPolicyToUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **policyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | policy attached successfully |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="createCredentials"></a>
# **createCredentials**
> CredentialsWithSecret createCredentials(userId)

create credentials

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      CredentialsWithSecret result = apiInstance.createCredentials(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#createCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**CredentialsWithSecret**](CredentialsWithSecret.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | credentials |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(group)

create group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    GroupCreation group = new GroupCreation(); // GroupCreation | 
    try {
      Group result = apiInstance.createGroup(group);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#createGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**GroupCreation**](GroupCreation.md)|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | group |  -  |
**400** | validation error |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="createPolicy"></a>
# **createPolicy**
> Policy createPolicy(policy)

create policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Policy policy = new Policy(); // Policy | 
    try {
      Policy result = apiInstance.createPolicy(policy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#createPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy** | [**Policy**](Policy.md)|  | [optional]

### Return type

[**Policy**](Policy.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | policy |  -  |
**400** | validation error |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="createUser"></a>
# **createUser**
> User createUser(user)

create user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    UserCreation user = new UserCreation(); // UserCreation | 
    try {
      User result = apiInstance.createUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserCreation**](UserCreation.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | user |  -  |
**400** | validation error |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="deleteCredentials"></a>
# **deleteCredentials**
> deleteCredentials(userId, accessKeyId)

delete credentials

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String accessKeyId = "accessKeyId_example"; // String | 
    try {
      apiInstance.deleteCredentials(userId, accessKeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **accessKeyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | credentials deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | credentials not found |  -  |
**0** | generic error response |  -  |

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupId)

delete group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    try {
      apiInstance.deleteGroup(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | group deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | group not found |  -  |
**0** | generic error response |  -  |

<a name="deleteGroupMembership"></a>
# **deleteGroupMembership**
> deleteGroupMembership(groupId, userId)

delete group membership

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      apiInstance.deleteGroupMembership(groupId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteGroupMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **userId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | membership deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | membership not found |  -  |
**0** | generic error response |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(policyId)

delete policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.deletePolicy(policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deletePolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | policy deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | policy not found |  -  |
**0** | generic error response |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

delete user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      apiInstance.deleteUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | user deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | user not found |  -  |
**0** | generic error response |  -  |

<a name="detachPolicyFromGroup"></a>
# **detachPolicyFromGroup**
> detachPolicyFromGroup(groupId, policyId)

detach policy from group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.detachPolicyFromGroup(groupId, policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#detachPolicyFromGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **policyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | policy detached successfully |  -  |
**401** | Unauthorized |  -  |
**404** | policy attachment not found |  -  |
**0** | generic error response |  -  |

<a name="detachPolicyFromUser"></a>
# **detachPolicyFromUser**
> detachPolicyFromUser(userId, policyId)

detach policy from user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.detachPolicyFromUser(userId, policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#detachPolicyFromUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **policyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | policy detached successfully |  -  |
**401** | Unauthorized |  -  |
**404** | policy attachment not found |  -  |
**0** | generic error response |  -  |

<a name="getCredentials"></a>
# **getCredentials**
> Credentials getCredentials(userId, accessKeyId)

get credentials

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String accessKeyId = "accessKeyId_example"; // String | 
    try {
      Credentials result = apiInstance.getCredentials(userId, accessKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **accessKeyId** | **String**|  |

### Return type

[**Credentials**](Credentials.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | credentials |  -  |
**401** | Unauthorized |  -  |
**404** | credentials not found |  -  |
**0** | generic error response |  -  |

<a name="getCurrentUser"></a>
# **getCurrentUser**
> InlineResponse200 getCurrentUser()

get current user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      InlineResponse200 result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | user |  -  |

<a name="getGroup"></a>
# **getGroup**
> Group getGroup(groupId)

get group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    try {
      Group result = apiInstance.getGroup(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

[**Group**](Group.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | group |  -  |
**401** | Unauthorized |  -  |
**404** | group not found |  -  |
**0** | generic error response |  -  |

<a name="getPolicy"></a>
# **getPolicy**
> Policy getPolicy(policyId)

get policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      Policy result = apiInstance.getPolicy(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**|  |

### Return type

[**Policy**](Policy.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | policy |  -  |
**401** | Unauthorized |  -  |
**404** | policy not found |  -  |
**0** | generic error response |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser(userId)

get user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      User result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | user |  -  |
**401** | Unauthorized |  -  |
**404** | user not found |  -  |
**0** | generic error response |  -  |

<a name="listGroupMembers"></a>
# **listGroupMembers**
> InlineResponse2001 listGroupMembers(groupId, after, amount)

list group members

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2001 result = apiInstance.listGroupMembers(groupId, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listGroupMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | user list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listGroupPolicies"></a>
# **listGroupPolicies**
> InlineResponse2003 listGroupPolicies(groupId, after, amount)

list group policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2003 result = apiInstance.listGroupPolicies(groupId, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listGroupPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | policy list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listGroups"></a>
# **listGroups**
> InlineResponse2002 listGroups(after, amount)

list groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2002 result = apiInstance.listGroups(after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | group list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listPolicies"></a>
# **listPolicies**
> InlineResponse2003 listPolicies(after, amount)

list policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2003 result = apiInstance.listPolicies(after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | policy list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listUserCredentials"></a>
# **listUserCredentials**
> InlineResponse2004 listUserCredentials(userId, after, amount)

list user credentials

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2004 result = apiInstance.listUserCredentials(userId, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listUserCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | credential list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listUserGroups"></a>
# **listUserGroups**
> InlineResponse2002 listUserGroups(userId, after, amount)

list user groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2002 result = apiInstance.listUserGroups(userId, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listUserGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | group list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listUserPolicies"></a>
# **listUserPolicies**
> InlineResponse2003 listUserPolicies(userId, after, amount, effective)

list user policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    Boolean effective = false; // Boolean | will return all distinct policies attached to the user or any of its groups
    try {
      InlineResponse2003 result = apiInstance.listUserPolicies(userId, after, amount, effective);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listUserPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]
 **effective** | **Boolean**| will return all distinct policies attached to the user or any of its groups | [optional] [default to false]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | policy list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="listUsers"></a>
# **listUsers**
> InlineResponse2001 listUsers(after, amount)

list users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2001 result = apiInstance.listUsers(after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#listUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | user list |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="updatePolicy"></a>
# **updatePolicy**
> Policy updatePolicy(policyId, policy)

update policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");
    
    // Configure HTTP basic authorization: basic_auth
    HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
    basic_auth.setUsername("YOUR USERNAME");
    basic_auth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: jwt_token
    ApiKeyAuth jwt_token = (ApiKeyAuth) defaultClient.getAuthentication("jwt_token");
    jwt_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt_token.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Policy policy = new Policy(); // Policy | 
    try {
      Policy result = apiInstance.updatePolicy(policyId, policy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#updatePolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**|  |
 **policy** | [**Policy**](Policy.md)|  | [optional]

### Return type

[**Policy**](Policy.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | policy |  -  |
**400** | validation error |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

