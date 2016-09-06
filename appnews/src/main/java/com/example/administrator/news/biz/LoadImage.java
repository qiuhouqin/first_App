/*
package com.example.administrator.news.biz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

*/
/**
 *  获取图片的公共类
 *  根据图片的 uri 存放两个方法
 *  1.存文件  2.存内存
 *  2.取得文件 2.1 从网络获取  2.2 从文件获取 2.3 从内存获取
 *  3.最终调用的方法得到图片先判断是不是内存 --文件 --网络
 *//*

public class LoadImage {
    private Context context;

    private ImageLoadListener listener;
    */
/**
     * 构造方法赋值
     * @param context
     * @param listener
     *//*

    public LoadImage(Context context, ImageLoadListener listener) {
        this.context = context;
        this.listener = listener;
    }
    */
/**
     * 自定义回调接口传递图片和图片路径
     *//*

    public interface ImageLoadListener{
        void imageLoadOk(Bitmap bitmap, String url);
    }

    */
/**
     * 异步加载类
     * 1.Url 处理的网络路径
     * 2.无 Void  当加载一条时传递的类型
     * 3.返回的加载后的数据：Bitmap
     *//*

    private class ImageAsyncTask extends AsyncTask<String, Void, Bitmap> {
        private String url;
        //执行之前 ui线程
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        //后台运行新线程的代码不能修改 ui
        @Override
        protected Bitmap doInBackground(String... params) {
            //单条加载更新 ui
            //publishProgress(values);
            url=params[0];
            Bitmap bitmap=null;

        try {
            //建立网络连接
            URL url=new URL(params[0]);
            HttpURLConnection conn=(HttpURLConnection)
                    url.openConnection();
            //得到输入字节流
            InputStream is=conn.getInputStream();
            //得到图片
            bitmap= BitmapFactory.decodeStream(is);
            //存入软引用中
            saveSoftReferences(params[0], bitmap);
            //存在缓存文件中
            saveCachFile(params[0], bitmap);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
        //如果新线程中执行了 publishProgress(values);
        //就会执行此方法实现一条一条的更新 ui
        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
        //doInBackground 执行 return后马上执行ui线程并把结果传递给此方法 execute(url)
        @Override
        protected void onPostExecute(Bitmap result) {
            super.onPostExecute(result);
            if(listener!=null){
                //线程结束后返回图片和路径
                listener.imageLoadOk(result, url);
            }
        }
    }
}
*/
