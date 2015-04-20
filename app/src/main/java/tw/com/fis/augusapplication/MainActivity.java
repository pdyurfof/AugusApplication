package tw.com.fis.augusapplication;//像.net的namespace

import android.support.v7.app.ActionBarActivity; //引用sdk lib
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;// android.view為package名稱 最後為class或interface


public class MainActivity extends ActionBarActivity //extends繼承 某個class 在這為ActionBarActivity
{

    @Override //覆寫繼承class中的方法 //語法名稱annotation 為新的java語法用法
    protected void onCreate(Bundle savedInstanceState) {
        //super表示使用父類別的方法
        super.onCreate(savedInstanceState);
        //在畫面中載入此layout
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //載入Menu的xml畫面
        // Inflate the menu; this adds items to the action bar if it is present.
        //R表示res目錄的縮寫
        getMenuInflater().inflate(R.menu.menu_main, menu);


        
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {//偵測操作時點選了哪個MenuItem
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void SetTitle()
    {

    }
}
