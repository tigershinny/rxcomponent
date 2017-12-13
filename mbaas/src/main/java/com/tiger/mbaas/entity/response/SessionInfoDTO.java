package com.tiger.mbaas.entity.response;

public class SessionInfoDTO extends ServiceResponse{
    private String token;

    private String sessionId;

    private long memberId;

    /***
     * The actual target endpoints which could be available for further requests .
     */
    private String http;

    private String https;

    /***
     * data store set as a cookie
     */
    private String dataStore;

    public SessionInfoDTO() {
    }

    public String getToken() {
        return token;
    }

    public String getSessionId() {
        return sessionId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "SessionInfoDTO{" +
                "token='" + token + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", http='" + http + '\'' +
                ", https='" + https + '\'' +
                ", dataStore='" + dataStore + '\'' +
                '}';
    }

    public String getHttp() {
        return http;
    }

    public String getHttps() {
        return https;
    }

    public String getDataStore() {
        return dataStore;
    }
}