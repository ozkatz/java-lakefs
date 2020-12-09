# ExportApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContinuousExport**](ExportApi.md#getContinuousExport) | **GET** /repositories/{repository}/branches/{branch}/continuous-export | returns the current continuous export configuration of a branch
[**repair**](ExportApi.md#repair) | **POST** /repositories/{repository}/branches/{branch}/repair-export | set continuous export state as repaired
[**run**](ExportApi.md#run) | **POST** /repositories/{repository}/branches/{branch}/export-hook | hook to be called in order to execute continuous export on branch
[**setContinuousExport**](ExportApi.md#setContinuousExport) | **PUT** /repositories/{repository}/branches/{branch}/continuous-export | sets a new continuous export configuration of a branch


<a name="getContinuousExport"></a>
# **getContinuousExport**
> ContinuousExportConfiguration getContinuousExport(repository, branch)

returns the current continuous export configuration of a branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportApi;

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

    ExportApi apiInstance = new ExportApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      ContinuousExportConfiguration result = apiInstance.getContinuousExport(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#getContinuousExport");
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
 **branch** | **String**|  |

### Return type

[**ContinuousExportConfiguration**](ContinuousExportConfiguration.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | continuous export policy |  -  |
**401** | Unauthorized |  -  |
**404** | no continuous export policy defined |  -  |
**0** | generic error response |  -  |

<a name="repair"></a>
# **repair**
> repair(repository, branch)

set continuous export state as repaired

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportApi;

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

    ExportApi apiInstance = new ExportApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      apiInstance.repair(repository, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#repair");
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
 **branch** | **String**|  |

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
**201** | continuous export status successfully changed to repaired |  -  |
**401** | Unauthorized |  -  |
**404** | no branch defined at that repo |  -  |
**0** | generic error response |  -  |

<a name="run"></a>
# **run**
> String run(repository, branch)

hook to be called in order to execute continuous export on branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportApi;

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

    ExportApi apiInstance = new ExportApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      String result = apiInstance.run(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#run");
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
 **branch** | **String**|  |

### Return type

**String**

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | continuous export successfully started |  -  |
**401** | Unauthorized |  -  |
**404** | no branch defined at that repo |  -  |
**0** | generic error response |  -  |

<a name="setContinuousExport"></a>
# **setContinuousExport**
> setContinuousExport(repository, branch, config)

sets a new continuous export configuration of a branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportApi;

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

    ExportApi apiInstance = new ExportApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    ContinuousExportConfiguration config = new ContinuousExportConfiguration(); // ContinuousExportConfiguration | 
    try {
      apiInstance.setContinuousExport(repository, branch, config);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#setContinuousExport");
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
 **branch** | **String**|  |
 **config** | [**ContinuousExportConfiguration**](ContinuousExportConfiguration.md)|  |

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
**201** | continuous export successfullyconfigured |  -  |
**401** | Unauthorized |  -  |
**404** | no branch defined at that repo |  -  |
**0** | generic error response |  -  |

