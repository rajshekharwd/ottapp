package com.dignalott.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/dignalott/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dignalott/repository/MovieRepository;", "(Lcom/dignalott/repository/MovieRepository;)V", "_moviesList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dignalott/models/Movies;", "moviesList", "Landroidx/lifecycle/LiveData;", "getMoviesList", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lcom/dignalott/repository/MovieRepository;", "secondLoaded", "", "getSecondLoaded", "()Z", "setSecondLoaded", "(Z)V", "thirdLoaded", "getThirdLoaded", "setThirdLoaded", "getMovieList", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "loadSecond", "loadThird", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dignalott.repository.MovieRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.dignalott.models.Movies> _moviesList = null;
    private boolean secondLoaded = false;
    private boolean thirdLoaded = false;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.dignalott.repository.MovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dignalott.repository.MovieRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dignalott.models.Movies> getMoviesList() {
        return null;
    }
    
    public final boolean getSecondLoaded() {
        return false;
    }
    
    public final void setSecondLoaded(boolean p0) {
    }
    
    public final boolean getThirdLoaded() {
        return false;
    }
    
    public final void setThirdLoaded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getMovieList(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job loadSecond(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job loadThird(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}