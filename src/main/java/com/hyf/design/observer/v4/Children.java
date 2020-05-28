package com.hyf.design.observer.v4;

import java.util.ArrayList;
import java.util.List;

class Children{

    private boolean isCry =false;

    private List<Observer> observerList = new ArrayList<>();

    public void wake(){
        isCry =true;
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).wake();
        }
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }
}

