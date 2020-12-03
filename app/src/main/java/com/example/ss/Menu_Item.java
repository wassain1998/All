package com.example.ss;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Menu_Item extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__item);
        TextView tv = findViewById(R.id.main_tv);//لغرض ال  Context menu
        registerForContextMenu(tv);
    }


    //دالة تنصيب القائمة في ال Toolbar
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        //الاشعارات تبدأ من هنا
        MenuItem item = menu.findItem(R.id.menu_notification);
        View v = item.getActionView();
        TextView tv = v.findViewById(R.id.costm_notification_tv);


        tv.setText("5");  // اخر سطر في الاشعارات
        //ملاحظة: مشكلة في سطور الاشعارات حيث ايقونة الاشعارات لاتظهر على التولبار

        return true;
    }


//دالة التحكم في العنصر على القائمة
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.menu_setting:
               Toast.makeText(this, "setting item", Toast.LENGTH_LONG ).show();
               Intent intent = new Intent(Menu_Item.this, MainActivity.class);
               startActivity(intent);
               return true;

           case R.id.menu_notification:
               Toast.makeText(this, "notification item", Toast.LENGTH_LONG ).show();
               return true;


       }
       return false;
    }



    // Context  دالة


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
        case R.id.menu_setting:
        Toast.makeText(this, "setting item", Toast.LENGTH_LONG ).show();
        Intent intent = new Intent(Menu_Item.this, MainActivity.class);
        startActivity(intent);
        return true;

        case R.id.menu_notification:
        Toast.makeText(this, "notification item", Toast.LENGTH_LONG ).show();
        return true;


    }
       return false;
    }
}