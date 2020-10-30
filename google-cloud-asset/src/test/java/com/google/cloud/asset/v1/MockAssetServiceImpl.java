/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.asset.v1;

import com.google.api.core.BetaApi;
import com.google.cloud.asset.v1.AssetServiceGrpc.AssetServiceImplBase;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockAssetServiceImpl extends AssetServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockAssetServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void exportAssets(
      ExportAssetsRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void batchGetAssetsHistory(
      BatchGetAssetsHistoryRequest request,
      StreamObserver<BatchGetAssetsHistoryResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof BatchGetAssetsHistoryResponse) {
      requests.add(request);
      responseObserver.onNext((BatchGetAssetsHistoryResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createFeed(CreateFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext((Feed) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getFeed(GetFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext((Feed) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listFeeds(
      ListFeedsRequest request, StreamObserver<ListFeedsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListFeedsResponse) {
      requests.add(request);
      responseObserver.onNext((ListFeedsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateFeed(UpdateFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext((Feed) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteFeed(DeleteFeedRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void searchAllResources(
      SearchAllResourcesRequest request,
      StreamObserver<SearchAllResourcesResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SearchAllResourcesResponse) {
      requests.add(request);
      responseObserver.onNext((SearchAllResourcesResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void searchAllIamPolicies(
      SearchAllIamPoliciesRequest request,
      StreamObserver<SearchAllIamPoliciesResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof SearchAllIamPoliciesResponse) {
      requests.add(request);
      responseObserver.onNext((SearchAllIamPoliciesResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void analyzeIamPolicy(
      AnalyzeIamPolicyRequest request, StreamObserver<AnalyzeIamPolicyResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof AnalyzeIamPolicyResponse) {
      requests.add(request);
      responseObserver.onNext((AnalyzeIamPolicyResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void analyzeIamPolicyLongrunning(
      AnalyzeIamPolicyLongrunningRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
