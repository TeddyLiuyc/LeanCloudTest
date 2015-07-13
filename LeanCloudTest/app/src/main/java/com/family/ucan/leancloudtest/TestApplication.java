package com.family.ucan.leancloudtest;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by LiuYucan on 15-7-13.
 */
public class TestApplication extends Application {
    public TestApplication(){}

    @Override
    public void onCreate(){
        super.onCreate();
        AVOSCloud.initialize(this, "x3l7xw37tv6r8cegyt7x5z80y0bv96up4qhdbagzgnpp7i3p",
                "usclolx0qm2hcpl595ywksccloag4ebv80mptklb3pi7wacu");

    }
}
