# RefsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diffRefs**](RefsApi.md#diffRefs) | **GET** /repositories/{repository}/refs/{leftRef}/diff/{rightRef} | diff references
[**mergeIntoBranch**](RefsApi.md#mergeIntoBranch) | **POST** /repositories/{repository}/refs/{sourceRef}/merge/{destinationRef} | merge references


<a name="diffRefs"></a>
# **diffRefs**
> InlineResponse2008 diffRefs(repository, leftRef, rightRef, after, amount)

diff references

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefsApi;

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

    RefsApi apiInstance = new RefsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String leftRef = "leftRef_example"; // String | a reference (could be either a branch or a commit ID)
    String rightRef = "rightRef_example"; // String | a reference (could be either a branch or a commit ID) to compare against
    String after = "after_example"; // String | 
    Integer amount = 100; // Integer | 
    try {
      InlineResponse2008 result = apiInstance.diffRefs(repository, leftRef, rightRef, after, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefsApi#diffRefs");
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
 **leftRef** | **String**| a reference (could be either a branch or a commit ID) |
 **rightRef** | **String**| a reference (could be either a branch or a commit ID) to compare against |
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
**200** | diff between refs |  -  |
**401** | Unauthorized |  -  |
**404** | reference not found |  -  |
**0** | generic error response |  -  |

<a name="mergeIntoBranch"></a>
# **mergeIntoBranch**
> MergeResult mergeIntoBranch(repository, sourceRef, destinationRef, merge)

merge references

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefsApi;

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

    RefsApi apiInstance = new RefsApi(defaultClient);
    String repository = "repository_example"; // String | 
    String sourceRef = "sourceRef_example"; // String | source branch name
    String destinationRef = "destinationRef_example"; // String | destination branch name
    Merge merge = new Merge(); // Merge | 
    try {
      MergeResult result = apiInstance.mergeIntoBranch(repository, sourceRef, destinationRef, merge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefsApi#mergeIntoBranch");
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
 **sourceRef** | **String**| source branch name |
 **destinationRef** | **String**| destination branch name |
 **merge** | [**Merge**](Merge.md)|  | [optional]

### Return type

[**MergeResult**](MergeResult.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | merge completed |  -  |
**401** | Unauthorized |  -  |
**404** | reference not found |  -  |
**409** | conflict |  -  |
**0** | generic error response |  -  |

