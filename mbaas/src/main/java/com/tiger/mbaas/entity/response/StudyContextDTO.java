package com.tiger.mbaas.entity.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by tigershen on 2017/12/13.
 */

public class StudyContextDTO {
    private String siteVersion;
    private ProfileDTO profile;
    private BootstrapDTO bootstrap;
    private List<EnrollmentDTO> enrollments = new ArrayList<EnrollmentDTO>();
    private List<BlurbTranslationDTO> blurbTranslations;
    private String features;
    private Set<String> supportedCourseTypes;

    public StudyContextDTO() {

    }

    /**
     *
     * @return
     *     The siteVersion
     */
    public String getSiteVersion() {
        return siteVersion;
    }

    /**
     *
     * @param siteVersion
     *     The siteVersion
     */
    public void setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
    }

    /**
     *
     * @return
     *     The profile
     */
    public ProfileDTO getProfile() {
        return profile;
    }

    /**
     *
     * @param profile
     *     The profile
     */
    public void setProfile(ProfileDTO profile) {
        this.profile = profile;
    }

    /**
     *
     * @return
     *     The bootstrap
     */
    public BootstrapDTO getBootstrap() {
        return bootstrap;
    }

    /**
     *
     * @param bootstrap
     *     The bootstrap
     */
    public void setBootstrap(BootstrapDTO bootstrap) {
        this.bootstrap = bootstrap;
    }

    /**
     *
     * @return
     *     The enrollments
     */
    public List<EnrollmentDTO> getEnrollments() {
        return enrollments;
    }

    @Override
    public String toString() {
        return "StudyContext{" +
                "siteVersion='" + siteVersion + '\'' +
                ", profile=" + profile +
                ", bootstrap=" + bootstrap +
                ", enrollments=" + enrollments +
                '}';
    }

    public List<BlurbTranslationDTO> getBlurbTranslations() {
        return blurbTranslations;
    }

    public void setEnrollments(List<EnrollmentDTO> enrollments) {
        this.enrollments = enrollments;
    }

    public void setBlurbTranslations(List<BlurbTranslationDTO> blurbTranslations) {
        this.blurbTranslations = blurbTranslations;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getFeatures() {
        return features;
    }

    public Set<String> getSupportedCourseTypes() {
        return supportedCourseTypes;
    }

    public void setSupportedCourseTypes(Set<String> supportedCourseTypes) {
        this.supportedCourseTypes = supportedCourseTypes;
    }
}
