package com.tiger.mbaas.entity.response;


/**
 * Created by tigershen on 2017/12/13.
 */

public class StudyContextResponse extends ServiceResponse {
    StudyContextDTO context;

    public StudyContextDTO getContext() {
        return context;
    }

    public void setContext(StudyContextDTO context) {
        this.context = context;
    }
}
