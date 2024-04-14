// Generated by Dagger (https://dagger.dev).
package com.dignalott.di;

import com.dignalott.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideMovieRepositoryFactory implements Factory<MovieRepository> {
  @Override
  public MovieRepository get() {
    return provideMovieRepository();
  }

  public static AppModule_ProvideMovieRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MovieRepository provideMovieRepository() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieRepository());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideMovieRepositoryFactory INSTANCE = new AppModule_ProvideMovieRepositoryFactory();
  }
}
