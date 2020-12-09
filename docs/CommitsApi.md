# CommitsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commit**](CommitsApi.md#commit) | **POST** /repositories/{repository}/branches/{branch}/commits | create commit
[**getBranchCommitLog**](CommitsApi.md#getBranchCommitLog) | **GET** /repositories/{repository}/branches/{branch}/commits | get commit log for branch
[**getCommit**](CommitsApi.md#getCommit) | **GET** /repositories/{repository}/commits/{commitId} | get commit


<a name="commit"></a>
# **commit**
> Commit commit(repository, branch, commit)

create commit

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommitsApi;

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

    CommitsApi apiInstance = new CommitsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    CommitCreation commit = new CommitCreation(); // CommitCreation | 
    try {
      Commit result = apiInstance.commit(repository, branch, commit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitsApi#commit");
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
 **commit** | [**CommitCreation**](CommitCreation.md)|  | [optional]

### Return type

[**Commit**](Commit.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | commit |  -  |
**401** | Unauthorized |  -  |
**404** | branch not found |  -  |
**0** | generic error response |  -  |

<a name="getBranchCommitLog"></a>
# **getBranchCommitLog**
> InlineResponse2007 getBranchCommitLog(repository, branch, after, amount)

get commit log for branch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommitsApi;

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

    CommitsApi apiInstance = new CommitsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String branch = "branch_example"; // String | 
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2007 result = apiInstance.getBranchCommitLog(repository, branch, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitsApi#getBranchCommitLog");
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | commit log |  -  |
**401** | Unauthorized |  -  |
**404** | branch not found |  -  |
**0** | generic error response |  -  |

<a name="getCommit"></a>
# **getCommit**
> Commit getCommit(repository, commitId)

get commit

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommitsApi;

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

    CommitsApi apiInstance = new CommitsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String commitId = "commitId_example"; // String | 
    try {
      Commit result = apiInstance.getCommit(repository, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitsApi#getCommit");
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
 **commitId** | **String**|  |

### Return type

[**Commit**](Commit.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | commit |  -  |
**401** | Unauthorized |  -  |
**404** | commit not found |  -  |
**0** | generic error response |  -  |

