package com.tiger.rx_component.viewmodel;

import android.os.Bundle;

public interface BaseViewModel {

    void onLoad(final Bundle bundle);

    void dispose();
}
