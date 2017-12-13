package com.tiger.mbaas;

import com.tiger.mbaas.entity.request.LoginRequest;
import com.tiger.mbaas.entity.request.StudyContextRequest;
import com.tiger.mbaas.entity.response.BaseResponse;
import com.tiger.mbaas.entity.response.SessionInfoDTO;
import com.tiger.mbaas.entity.response.StudyContextResponse;
import com.tiger.mbaas.exception.WebServiceException;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by tigershen on 2017/12/12.
 */

@SuppressWarnings("unused")
public interface WebService {

    /**
     * Login
     *
     * @param loginRequest
     * @return
     */
    @POST("/services/api/mobile/service/login")
    Observable<BaseResponse<SessionInfoDTO>> login(@Body LoginRequest loginRequest) throws WebServiceException;

    /**
     * Get the study context
     *
     * @param request
     * @return
     */
    @POST("/services/api/mobile/service/studycontext")
    Observable<BaseResponse<StudyContextResponse>> getStudyContext(@Body StudyContextRequest request) throws WebServiceException;

}
