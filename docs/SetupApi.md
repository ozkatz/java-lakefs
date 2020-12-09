# SetupApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setupLakeFS**](SetupApi.md#setupLakeFS) | **POST** /setup_lakefs | setup lakeFS and create the first user


<a name="setupLakeFS"></a>
# **setupLakeFS**
> CredentialsWithSecret setupLakeFS(user)

setup lakeFS and create the first user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SetupApi;

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

    SetupApi apiInstance = new SetupApi(defaultClient);
    Setup user = new Setup(); // Setup | 
    try {
      CredentialsWithSecret result = apiInstance.setupLakeFS(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SetupApi#setupLakeFS");
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
 **user** | [**Setup**](Setup.md)|  | [optional]

### Return type

[**CredentialsWithSecret**](CredentialsWithSecret.md)

### Authorization

[basic_auth](../README.md#basic_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | user created successfully |  -  |
**400** | bad request |  -  |
**409** | setup was already called |  -  |
**0** | generic error response |  -  |

