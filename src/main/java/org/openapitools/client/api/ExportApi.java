/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ContinuousExportConfiguration;
import org.openapitools.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportApi {
    private ApiClient localVarApiClient;

    public ExportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExportApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getContinuousExport
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> continuous export policy </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no continuous export policy defined </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getContinuousExportCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/continuous-export"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContinuousExportValidateBeforeCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling getContinuousExport(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling getContinuousExport(Async)");
        }
        

        okhttp3.Call localVarCall = getContinuousExportCall(repository, branch, _callback);
        return localVarCall;

    }

    /**
     * returns the current continuous export configuration of a branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @return ContinuousExportConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> continuous export policy </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no continuous export policy defined </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public ContinuousExportConfiguration getContinuousExport(String repository, String branch) throws ApiException {
        ApiResponse<ContinuousExportConfiguration> localVarResp = getContinuousExportWithHttpInfo(repository, branch);
        return localVarResp.getData();
    }

    /**
     * returns the current continuous export configuration of a branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @return ApiResponse&lt;ContinuousExportConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> continuous export policy </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no continuous export policy defined </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContinuousExportConfiguration> getContinuousExportWithHttpInfo(String repository, String branch) throws ApiException {
        okhttp3.Call localVarCall = getContinuousExportValidateBeforeCall(repository, branch, null);
        Type localVarReturnType = new TypeToken<ContinuousExportConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * returns the current continuous export configuration of a branch (asynchronously)
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> continuous export policy </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no continuous export policy defined </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getContinuousExportAsync(String repository, String branch, final ApiCallback<ContinuousExportConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContinuousExportValidateBeforeCall(repository, branch, _callback);
        Type localVarReturnType = new TypeToken<ContinuousExportConfiguration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for repair
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export status successfully changed to repaired </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call repairCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/repair-export"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call repairValidateBeforeCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling repair(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling repair(Async)");
        }
        

        okhttp3.Call localVarCall = repairCall(repository, branch, _callback);
        return localVarCall;

    }

    /**
     * set continuous export state as repaired
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export status successfully changed to repaired </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public void repair(String repository, String branch) throws ApiException {
        repairWithHttpInfo(repository, branch);
    }

    /**
     * set continuous export state as repaired
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export status successfully changed to repaired </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> repairWithHttpInfo(String repository, String branch) throws ApiException {
        okhttp3.Call localVarCall = repairValidateBeforeCall(repository, branch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * set continuous export state as repaired (asynchronously)
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export status successfully changed to repaired </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call repairAsync(String repository, String branch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = repairValidateBeforeCall(repository, branch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for run
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfully started </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/export-hook"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runValidateBeforeCall(String repository, String branch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling run(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling run(Async)");
        }
        

        okhttp3.Call localVarCall = runCall(repository, branch, _callback);
        return localVarCall;

    }

    /**
     * hook to be called in order to execute continuous export on branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfully started </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public String run(String repository, String branch) throws ApiException {
        ApiResponse<String> localVarResp = runWithHttpInfo(repository, branch);
        return localVarResp.getData();
    }

    /**
     * hook to be called in order to execute continuous export on branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfully started </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> runWithHttpInfo(String repository, String branch) throws ApiException {
        okhttp3.Call localVarCall = runValidateBeforeCall(repository, branch, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * hook to be called in order to execute continuous export on branch (asynchronously)
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfully started </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runAsync(String repository, String branch, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = runValidateBeforeCall(repository, branch, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setContinuousExport
     * @param repository  (required)
     * @param branch  (required)
     * @param config  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfullyconfigured </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setContinuousExportCall(String repository, String branch, ContinuousExportConfiguration config, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = config;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/continuous-export"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setContinuousExportValidateBeforeCall(String repository, String branch, ContinuousExportConfiguration config, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling setContinuousExport(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling setContinuousExport(Async)");
        }
        
        // verify the required parameter 'config' is set
        if (config == null) {
            throw new ApiException("Missing the required parameter 'config' when calling setContinuousExport(Async)");
        }
        

        okhttp3.Call localVarCall = setContinuousExportCall(repository, branch, config, _callback);
        return localVarCall;

    }

    /**
     * sets a new continuous export configuration of a branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param config  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfullyconfigured </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public void setContinuousExport(String repository, String branch, ContinuousExportConfiguration config) throws ApiException {
        setContinuousExportWithHttpInfo(repository, branch, config);
    }

    /**
     * sets a new continuous export configuration of a branch
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param config  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfullyconfigured </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> setContinuousExportWithHttpInfo(String repository, String branch, ContinuousExportConfiguration config) throws ApiException {
        okhttp3.Call localVarCall = setContinuousExportValidateBeforeCall(repository, branch, config, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * sets a new continuous export configuration of a branch (asynchronously)
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param config  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> continuous export successfullyconfigured </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no branch defined at that repo </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> generic error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setContinuousExportAsync(String repository, String branch, ContinuousExportConfiguration config, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = setContinuousExportValidateBeforeCall(repository, branch, config, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
