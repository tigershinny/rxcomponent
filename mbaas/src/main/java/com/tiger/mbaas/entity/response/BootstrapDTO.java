package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/13.
 */

public class BootstrapDTO {

    private SettingsDTO settings;

    public BootstrapDTO() {
    }

    /**
     *

     * @return
     *     The settings
     */
    public SettingsDTO getSettings() {
        return settings;
    }

    /**
     *
     * @param settings
     *     The settings
     */
    public void setSettings(SettingsDTO settings) {
        this.settings = settings;
    }

}
