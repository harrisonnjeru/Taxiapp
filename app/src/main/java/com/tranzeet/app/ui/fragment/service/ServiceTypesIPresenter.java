package com.tranzeet.app.ui.fragment.service;

import com.tranzeet.app.base.MvpPresenter;

import java.util.HashMap;

public interface ServiceTypesIPresenter<V extends ServiceTypesIView> extends MvpPresenter<V> {

    void services();

    void rideNow(HashMap<String, Object> obj);

}
