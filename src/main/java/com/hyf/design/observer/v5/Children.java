package com.hyf.design.observer.v5;

import java.util.ArrayList;
import java.util.List;

class Children{

    private boolean isCry =false;

    private String name;

    public Children(String name) {
        this.name = name;
    }

    private List<Observer> observerList = new ArrayList<>();

    public void wake(){
        isCry =true;
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(),"宝宝掉地上了",this);
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).wake(wakeUpEvent);
        }
    }

    public String getName() {
        return name;
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }
}

