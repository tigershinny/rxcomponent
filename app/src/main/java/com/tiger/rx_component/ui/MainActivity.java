package com.tiger.rx_component.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.tiger.rx_component.App;
import com.tiger.rx_component.BR;
import com.tiger.rx_component.R;
import com.tiger.rx_component.di.MainActivityModule;
import com.tiger.rx_component.di.MainActivitySubComponent;
import com.tiger.rx_component.viewmodel.NewsListViewModel;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainActivitySubComponent> {

    @Inject
    NewsListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVariable(BR.model, viewModel);
        if (! isRetained(savedInstanceState)){
            viewModel.onLoad(null);
        }
    }

    @Override
    protected void injectDependencies(MainActivitySubComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    protected MainActivitySubComponent newComponent() {
        return ((App)getApplication())
                .getAppComponent()
                .newMainActivitySubComponent(new MainActivityModule(this));
    }

    @Override
    protected void onDestroy() {
        if(!isChangingConfigurations()) {
            viewModel.dispose();
        }
        super.onDestroy();
    }

}
