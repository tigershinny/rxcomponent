package com.tiger.mbaas.entity.request;

/**
 * Created by tigershen on 2017/12/13.
 */

public class StudyContextRequest extends BaseRequest {

    static class TestServiceRequest extends BaseTokenRequest {

        final boolean onlyTSTCourse = true;

        public TestServiceRequest(String token, String culturecode, String sessionId) {
            super(token, culturecode, sessionId);
        }
    }

    public StudyContextRequest(String token, String cultureCode, String sessionId, Boolean testCourse) {

        if (testCourse) {

            serviceRequest = new TestServiceRequest(token, cultureCode, sessionId);

        } else {

            serviceRequest = new BaseTokenRequest(token, cultureCode, sessionId);
        }
    }
}
