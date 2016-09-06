package com.example.administrator.news.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.news.R;
import com.example.administrator.news.base.MyBaseAdapter;
import com.example.administrator.news.model_entity.News;

/**
 * 新闻数据适配器
 *
 * 1.holdview 绑定控件三个控件赋值图片为默认
 */
public class NewsAdapter extends MyBaseAdapter<News> {

    /**
     * 加载图片之前默认图片
     */
    private Bitmap defaultBitmap;
    private ListView listview;

    public NewsAdapter(Context c, ListView lv) {
        super(c);
        defaultBitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.cccc);
        listview=lv;
    }

    /***返回每一个子条目的视图*/
    @Override
    public View getMyView(int position, View convertView, ViewGroup parent) {
        HoldView holdView=null;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.item_list_news, null);
            holdView=new HoldView(convertView);
            convertView.setTag(holdView);
        }else{
            holdView=(HoldView) convertView.getTag();
        }
        News news=list.get(position);
        holdView.tv_title.setText(news.getTitle());
        holdView.tv_text.setText(news.getSummary());
        holdView.iv_list_image.setImageBitmap(defaultBitmap);//默认图片
        return convertView;
    }

    /**标签类*/
    public class HoldView {
        public ImageView iv_list_image;
        public TextView tv_title;
        public TextView tv_text;


        public HoldView(View view) {
            iv_list_image = (ImageView) view.findViewById(R.id.imageView1);
            tv_title = (TextView) view.findViewById(R.id.textView1);
            tv_text = (TextView) view.findViewById(R.id.textView2);
        }
    }
}

