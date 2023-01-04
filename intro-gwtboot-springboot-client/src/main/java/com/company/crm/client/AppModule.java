package com.company.crm.client;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    PersonClientFactory personClientFactory() {
        return PersonClientFactory.INSTANCE;
    }

}
