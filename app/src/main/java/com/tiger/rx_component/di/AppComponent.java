package com.tiger.rx_component.di;

import android.content.Context;

import com.tiger.rx_component.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
        }
)
public interface AppComponent {

     void inject(App app);

     Context getContext();

    MainActivitySubComponent newMainActivitySubComponent(MainActivityModule module);

}
