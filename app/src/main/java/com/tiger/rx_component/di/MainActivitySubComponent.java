package com.tiger.rx_component.di;

import com.tiger.rx_component.ui.MainActivity;

import dagger.Subcomponent;

@MainActivityScope
@Subcomponent(modules={ MainActivityModule.class })
public interface MainActivitySubComponent {

    void inject(MainActivity mainActivity);
}