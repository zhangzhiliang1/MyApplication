package com.zx.newsgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] imgId = {R.mipmap.a4,R.mipmap.arrawdown,R.mipmap.art,R.mipmap.bag,R.mipmap.barchart
    ,R.mipmap.bicker,R.mipmap.bickwheel};
    GridView gv;
    String[] str = new String[]{"QQ","游戏","微信","商店","淘宝","天猫","微博"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (GridView) findViewById(R.id.gv);
        gv.setAdapter(new GridAdapter());
    }
    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imgId.length;
        }

        @Override
        public Object getItem(int i) {
            return imgId[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.tiem,null);
            TextView tv = (TextView) v.findViewById(R.id.tv);
            ImageView iv = (ImageView) v.findViewById(R.id.iv);
            tv.setText(str[i]);
            iv.setImageResource(imgId[i]);
            return v;
        }
    }
}
