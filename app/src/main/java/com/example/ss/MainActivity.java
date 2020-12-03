package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;








public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void ridobootton (View view){
        Intent intent = new Intent( MainActivity.this, RidoBootton.class);
        startActivity(intent);
    }

    public void ProgressBar (View view){
        Intent intent = new Intent( MainActivity.this, Progressxxx.class);
        startActivity(intent);

    }



    public void CheckBox (View view){
        Intent intent = new Intent( MainActivity.this, CheckBox.class);
        startActivity(intent);

    }


    public void progressbar (View view){
        Intent intent = new Intent( MainActivity.this, Progressxxx.class);
        startActivity(intent);

    }

    public void seekbar (View view){
        Intent intent = new Intent( MainActivity.this, Seekxxx.class);
        startActivity(intent);

    }

    public void RatingBar (View view){
        Intent intent = new Intent( MainActivity.this, tingxxx.class);
        startActivity(intent);

    }

    public void ListView (View view){
        Intent intent = new Intent( MainActivity.this, Listsss.class);
        startActivity(intent);

    }

    public void NumberPicker (View view){
        Intent intent = new Intent( MainActivity.this, NumberPsss.class);
        startActivity(intent);

    }

    public void calendarview (View view){
        Intent intent = new Intent( MainActivity.this, Calendarsss.class);
        startActivity(intent);

    }


    public void explicitintent (View view){
        Intent intent = new Intent( MainActivity.this, Explicitsss.class);
        startActivity(intent);

    }

    public void explicitintent2 (View view){
        Intent intent = new Intent( MainActivity.this, send.class);
        startActivity(intent);

    }

    public void btn_call (View view){
        Intent intent = new Intent( MainActivity.this, Implicitcall.class);
        startActivity(intent);

    }

    public void tamreen (View view){
        Intent intent = new Intent( MainActivity.this, Explicittamreen.class);
        startActivity(intent);

    }


    public void img_cam (View view){
        Intent intent = new Intent( MainActivity.this, ImgCam.class);
        startActivity(intent);

    }

    public void array_adapter (View view){
        Intent intent = new Intent( MainActivity.this, Adapter.class);
        startActivity(intent);

    }


    public void custom_adapter (View view){
        Intent intent = new Intent( MainActivity.this, test_adapter.class);
        startActivity(intent);

    }


    public void menu (View view){
        Intent intent = new Intent( MainActivity.this, Menu_Item.class);
        startActivity(intent);

    }




    public void customtoast (View view){
        Intent intent = new Intent( MainActivity.this, CustomToast.class);
        startActivity(intent);

    }



    public void snackbar (View view){
        Intent intent = new Intent( MainActivity.this, SnackBar.class);
        startActivity(intent);

    }



    public void snackbar_with_action (View view){
        Intent intent = new Intent( MainActivity.this, SnackBarWithAction.class);
        startActivity(intent);

    }


    public void shared_preferences (View view){
        Intent intent = new Intent( MainActivity.this, Shared_Preferences.class);
        startActivity(intent);
    }


    public void shared_preferences_two (View view){
        Intent intent = new Intent(MainActivity.this, Shared_Preferences_Two.class);
        startActivity(intent);
    }



    public void shared_preferences_exercise (View view){
        Intent intent = new Intent(MainActivity.this, Shared_Preferences_Exercise.class);
        startActivity(intent);
    }


    public void internal_storage (View view){
        Intent intent = new Intent(MainActivity.this, Internal_Storage.class);
        startActivity(intent);
    }



    public void  External_Storage (View view){
        Intent intent = new Intent(MainActivity.this, External_Storage.class);
        startActivity(intent);
    }


    public void  data_base (View view){
        Intent intent = new Intent(MainActivity.this, DataBase.class);
        startActivity(intent);
    }




    public void  material_design (View view){
        Intent intent = new Intent(MainActivity.this, Material_Design.class);
        startActivity(intent);
    }



    public void  cardview (View view){
        Intent intent = new Intent(MainActivity.this, Card_View.class);
        startActivity(intent);
    }




    public void  recyclerview (View view){
        Intent intent = new Intent(MainActivity.this, Recycler_View.class);
        startActivity(intent);
    }



    public void  externaldatabase  (View view){
        Intent intent = new Intent(MainActivity.this, External_Database.class);
        startActivity(intent);
    }

    public void spinar  (View view){
        Intent intent = new Intent(MainActivity.this, Spinnar.class);
        startActivity(intent);
    }

}



