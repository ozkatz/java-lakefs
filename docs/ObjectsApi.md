# ObjectsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteObject**](ObjectsApi.md#deleteObject) | **DELETE** /repositories/{repository}/branches/{branch}/objects | delete object
[**getObject**](ObjectsApi.md#getObject) | **GET** /repositories/{repository}/refs/{ref}/objects | get object content
[**getUnderlyingProperties**](ObjectsApi.md#getUnderlyingProperties) | **GET** /repositories/{repository}/refs/{ref}/objects/underlyingProperties/ | get object properties on underlying storage
[**listObjects**](ObjectsApi.md#listObjects) | **GET** /repositories/{repository}/refs/{ref}/objects/ls | list objects under a given prefix
[**statObject**](ObjectsApi.md#statObject) | **GET** /repositories/{repository}/refs/{ref}/objects/stat | get object metadata
[**uploadObject**](ObjectsApi.md#uploadObject) | **POST** /repositories/{repository}/branches/{branch}/objects | upload object content


<a name="deleteObject"></a>
# **deleteObject**
> deleteObject(repository, branch, path)

delete object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    String path = "path_example"; // String | 
    try {
      apiInstance.deleteObject(repository, branch, path);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#deleteObject");
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
 **path** | **String**|  |

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
**204** | object deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | path or branch not found |  -  |
**0** | generic error response |  -  |

<a name="getObject"></a>
# **getObject**
> File getObject(repository, ref, path)

get object content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String ref = "ref_example"; // String | a reference (could be either a branch or a commit ID)
    String path = "path_example"; // String | 
    try {
      File result = apiInstance.getObject(repository, ref, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#getObject");
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
 **ref** | **String**| a reference (could be either a branch or a commit ID) |
 **path** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | object content |  * ETag -  <br>  * Content-Disposition -  <br>  * Last-Modified -  <br>  * Content-Length -  <br>  |
**401** | Unauthorized |  -  |
**404** | resource not found |  -  |
**410** | object expired |  -  |
**0** | generic error response |  -  |

<a name="getUnderlyingProperties"></a>
# **getUnderlyingProperties**
> UnderlyingObjectProperties getUnderlyingProperties(repository, ref, path)

get object properties on underlying storage

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String ref = "ref_example"; // String | a reference (could be either a branch or a commit ID)
    String path = "path_example"; // String | 
    try {
      UnderlyingObjectProperties result = apiInstance.getUnderlyingProperties(repository, ref, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#getUnderlyingProperties");
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
 **ref** | **String**| a reference (could be either a branch or a commit ID) |
 **path** | **String**|  |

### Return type

[**UnderlyingObjectProperties**](UnderlyingObjectProperties.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | object metadata on underlying storage |  -  |
**401** | Unauthorized |  -  |
**404** | path or branch not found |  -  |
**0** | generic error response |  -  |

<a name="listObjects"></a>
# **listObjects**
> InlineResponse2009 listObjects(repository, ref, prefix, after, amount)

list objects under a given prefix

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String ref = "ref_example"; // String | a reference (could be either a branch or a commit ID)
    String prefix = "prefix_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2009 result = apiInstance.listObjects(repository, ref, prefix, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#listObjects");
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
 **ref** | **String**| a reference (could be either a branch or a commit ID) |
 **prefix** | **String**|  | [optional]
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | entry list |  -  |
**401** | Unauthorized |  -  |
**404** | prefix or branch not found |  -  |
**0** | generic error response |  -  |

<a name="statObject"></a>
# **statObject**
> ObjectStats statObject(repository, ref, path)

get object metadata

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String ref = "ref_example"; // String | a reference (could be either a branch or a commit ID)
    String path = "path_example"; // String | 
    try {
      ObjectStats result = apiInstance.statObject(repository, ref, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#statObject");
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
 **ref** | **String**| a reference (could be either a branch or a commit ID) |
 **path** | **String**|  |

### Return type

[**ObjectStats**](ObjectStats.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | object metadata |  -  |
**401** | Unauthorized |  -  |
**404** | path or branch not found |  -  |
**410** | object gone (but partial metadata may be available) |  -  |
**0** | generic error response |  -  |

<a name="uploadObject"></a>
# **uploadObject**
> ObjectStats uploadObject(repository, branch, path, storageClass, content)

upload object content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

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

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    String path = "path_example"; // String | 
    String storageClass = "storageClass_example"; // String | 
    File content = new File("/path/to/file"); // File | Object content to upload
    try {
      ObjectStats result = apiInstance.uploadObject(repository, branch, path, storageClass, content);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#uploadObject");
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
 **path** | **String**|  |
 **storageClass** | **String**|  | [optional]
 **content** | **File**| Object content to upload | [optional]

### Return type

[**ObjectStats**](ObjectStats.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | object metadata |  -  |
**401** | Unauthorized |  -  |
**404** | repository or branch not found |  -  |
**0** | generic error response |  -  |

