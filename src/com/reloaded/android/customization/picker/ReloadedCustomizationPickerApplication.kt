package com.reloaded.android.customization.picker

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;

import com.reloaded.android.customization.module.ReloadedThemePickerInjector;

public class ReloadedCustomizationPickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(ReloadedThemePickerInjector());
    }

}
