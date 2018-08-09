package com.tiger.rx_component;

import android.app.Application;

import com.tiger.rx_component.di.AppComponent;
import com.tiger.rx_component.di.AppModule;
import com.tiger.rx_component.di.DaggerAppComponent;

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent =  DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
