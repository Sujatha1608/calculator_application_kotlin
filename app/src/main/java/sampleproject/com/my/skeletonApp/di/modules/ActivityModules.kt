package sampleproject.com.my.skeletonApp.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sampleproject.com.my.skeletonApp.feature.login.GetDataActivity


@Module
abstract class ActivityModules {

    @ContributesAndroidInjector
    internal abstract fun contributeLoginActivity(): GetDataActivity

}

