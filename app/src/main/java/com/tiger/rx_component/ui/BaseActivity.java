package com.tiger.rx_component.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T> extends AppCompatActivity{

    private static final String KEY_IS_RETAINED = "KEY_IS_RETAINED";

    private T component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies(getActivityComponent());
    }

    protected abstract void injectDependencies(final T activityComponent);

    protected T getActivityComponent() {
        if (null != component) {
            return component;
        }
        final Object retainedObject = getLastCustomNonConfigurationInstance();
        if (retainedObject != null) {
            //we are retaining the object, so we can safely cast it to our component class.
            component = (T) retainedObject;
        } else {
            component = newComponent();
        }
        return component;
    }

    protected abstract T newComponent();

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return getActivityComponent();
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_IS_RETAINED, isChangingConfigurations());
    }

    protected boolean isRetained(final Bundle state) {
        return state != null && state.containsKey(KEY_IS_RETAINED) && state.getBoolean(KEY_IS_RETAINED);
    }
}
