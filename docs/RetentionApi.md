# RetentionApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRetentionPolicy**](RetentionApi.md#getRetentionPolicy) | **GET** /repositories/{repository}/retention | 
[**updateRetentionPolicy**](RetentionApi.md#updateRetentionPolicy) | **PUT** /repositories/{repository}/retention | 


<a name="getRetentionPolicy"></a>
# **getRetentionPolicy**
> RetentionPolicyWithCreationDate getRetentionPolicy(repository)



get retention policy for repository

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetentionApi;

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

    RetentionApi apiInstance = new RetentionApi(defaultClient);
    String repository = "repository_example"; // String | 
    try {
      RetentionPolicyWithCreationDate result = apiInstance.getRetentionPolicy(repository);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionApi#getRetentionPolicy");
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
 **repository** | **String**|  |

### Return type

[**RetentionPolicyWithCreationDate**](RetentionPolicyWithCreationDate.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | retention policy |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="updateRetentionPolicy"></a>
# **updateRetentionPolicy**
> updateRetentionPolicy(repository, policy)



set retention policy for repository

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetentionApi;

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

    RetentionApi apiInstance = new RetentionApi(defaultClient);
    String repository = "repository_example"; // String | 
    RetentionPolicy policy = new RetentionPolicy(); // RetentionPolicy | 
    try {
      apiInstance.updateRetentionPolicy(repository, policy);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionApi#updateRetentionPolicy");
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
 **repository** | **String**|  |
 **policy** | [**RetentionPolicy**](RetentionPolicy.md)|  |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | policy attached successfully |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

