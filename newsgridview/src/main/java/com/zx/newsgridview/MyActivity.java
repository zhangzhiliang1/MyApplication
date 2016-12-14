package com.zx.newsgridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by zzl on 2016/11/17.
 */

public class MyActivity extends Activity {
    GridView gv;
    String[] str = new String[]{"QQ","游戏","微信","商店","淘宝","天猫","微博"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        gv = (GridView) findViewById(R.id.gv_G);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.gridview_time,R.id.tv_item,str);
        gv.setAdapter(adapter);
    }

}
