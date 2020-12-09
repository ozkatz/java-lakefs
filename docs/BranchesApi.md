# BranchesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBranch**](BranchesApi.md#createBranch) | **POST** /repositories/{repository}/branches | create branch
[**deleteBranch**](BranchesApi.md#deleteBranch) | **DELETE** /repositories/{repository}/branches/{branch} | delete branch
[**diffBranch**](BranchesApi.md#diffBranch) | **GET** /repositories/{repository}/branches/{branch}/diff | diff branch
[**getBranch**](BranchesApi.md#getBranch) | **GET** /repositories/{repository}/branches/{branch} | get branch
[**getContinuousExport**](BranchesApi.md#getContinuousExport) | **GET** /repositories/{repository}/branches/{branch}/continuous-export | returns the current continuous export configuration of a branch
[**listBranches**](BranchesApi.md#listBranches) | **GET** /repositories/{repository}/branches | list branches
[**repair**](BranchesApi.md#repair) | **POST** /repositories/{repository}/branches/{branch}/repair-export | set continuous export state as repaired
[**revertBranch**](BranchesApi.md#revertBranch) | **PUT** /repositories/{repository}/branches/{branch} | revert branch
[**run**](BranchesApi.md#run) | **POST** /repositories/{repository}/branches/{branch}/export-hook | hook to be called in order to execute continuous export on branch
[**setContinuousExport**](BranchesApi.md#setContinuousExport) | **PUT** /repositories/{repository}/branches/{branch}/continuous-export | sets a new continuous export configuration of a branch


<a name="createBranch"></a>
# **createBranch**
> String createBranch(repository, branch)

create branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    BranchCreation branch = new BranchCreation(); // BranchCreation | 
    try {
      String result = apiInstance.createBranch(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#createBranch");
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
 **branch** | [**BranchCreation**](BranchCreation.md)|  | [optional]

### Return type

**String**

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | reference |  -  |
**400** | validation error |  -  |
**401** | Unauthorized |  -  |
**0** | generic error response |  -  |

<a name="deleteBranch"></a>
# **deleteBranch**
> deleteBranch(repository, branch)

delete branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      apiInstance.deleteBranch(repository, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#deleteBranch");
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
**204** | branch deleted successfully |  -  |
**401** | Unauthorized |  -  |
**404** | branch not found |  -  |
**0** | generic error response |  -  |

<a name="diffBranch"></a>
# **diffBranch**
> InlineResponse2008 diffBranch(repository, branch, after, amount)

diff branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2008 result = apiInstance.diffBranch(repository, branch, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#diffBranch");
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
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | diff of branch uncommitted changes |  -  |
**401** | Unauthorized |  -  |
**404** | branch not found |  -  |
**0** | generic error response |  -  |

<a name="getBranch"></a>
# **getBranch**
> String getBranch(repository, branch)

get branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      String result = apiInstance.getBranch(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getBranch");
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
**200** | branch |  -  |
**401** | Unauthorized |  -  |
**404** | branch not found |  -  |
**0** | generic error response |  -  |

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
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      ContinuousExportConfiguration result = apiInstance.getContinuousExport(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getContinuousExport");
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

<a name="listBranches"></a>
# **listBranches**
> InlineResponse2006 listBranches(repository, after, amount)

list branches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2006 result = apiInstance.listBranches(repository, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#listBranches");
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
 **after** | **String**|  | [optional]
 **amount** | **Integer**|  | [optional] [default to 100]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | branch list |  -  |
**401** | Unauthorized |  -  |
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
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      apiInstance.repair(repository, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#repair");
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

<a name="revertBranch"></a>
# **revertBranch**
> revertBranch(repository, branch, revert)

revert branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    RevertCreation revert = new RevertCreation(); // RevertCreation | revert parameters
    try {
      apiInstance.revertBranch(repository, branch, revert);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#revertBranch");
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
 **revert** | [**RevertCreation**](RevertCreation.md)| revert parameters | [optional]

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
**204** | reverted |  -  |
**401** | Unauthorized |  -  |
**404** | resource not found |  -  |
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
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    try {
      String result = apiInstance.run(repository, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#run");
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
import org.openapitools.client.api.BranchesApi;

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

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    ContinuousExportConfiguration config = new ContinuousExportConfiguration(); // ContinuousExportConfiguration | 
    try {
      apiInstance.setContinuousExport(repository, branch, config);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#setContinuousExport");
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

