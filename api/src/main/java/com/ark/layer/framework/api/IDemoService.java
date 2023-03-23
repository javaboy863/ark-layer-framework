package com.ark.layer.framework.api;


import com.ark.layer.framework.api.request.DemoRequest;
import com.ark.layer.framework.api.response.DemoResponse;
import com.ark.layer.framework.api.response.Result;

public interface IDemoService {

    Result<DemoResponse> getDemo(DemoRequest req);

}
