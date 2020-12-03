package com.example.ss;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//تابع لقواعد البيانات الخارجية
public class DatabaseAccess  {
    /*
    private SQLiteDatabase database;
    private SQLiteOpenHelper  openHelper;
    private static DatabaseAccess instance;
    private DatabaseAccess (Context context)   {

    }

    public static DatabaseAccess getInstance(Context context){
        if (instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;

    }

    //اي عملية على الداتا بيس نفتح خط مع الداتا بيس ثم ننفذ العملية ثم نغلق الخط مع الداتا بيس

    public void open (){//نفتح الخط مع قواعد البيانات
        this.database = this.openHelper.getWritableDatabase();

    }

    public void close () {//نغلق الخط مع قواعد لبيانات
        if (this.database != null){
            this.database.close();
        }

    }





    //دالة الاضافة
    public boolean insertCar(Car car) {
    //    SQLiteDatabase db = getWritableDatabase();// نستدعي مؤشر الداتا بيس الخاص بالكتابة
        ContentValues values = new ContentValues();
        values.put(MyDatabase.CAR_CLN_MODEL, car.getModel());
        values.put((MyDatabase.CAR_CLN_COLOR, car.getColor());
        values.put((MyDatabase.CAR_CLN_DPL, car.getDp1());


        long result = database.insert (MyDatabase.CAR_TB_NAME, null , values);
        return result !=-1;
    }

    //دالة التعديل

    public boolean updateCar(Car car) {
     //   SQLiteDatabase db = getWritableDatabase();/// نستدعي مؤشر الداتا بيس الخاص بالكتابة


        ContentValues values = new ContentValues();//نستدعي هذا الكلاس
        //نملىء البيانات
        values.put(MyDatabase.CAR_CLN_MODEL, car.getModel());
        values.put(MyDatabase.CAR_CLN_COLOR, car.getColor());
        values.put(MyDatabase.CAR_CLN_DPL, car.getDp1());

        String args [] = {String.valueOf(car.getId())};
        int  result = database.update (MyDatabase.CAR_TB_NAME, values, "id=?", args);
        //اذا القيمة اكبر من صفر يعني يوجد تعديل واذا صفر يعني لايوجد تعديل
        return result >0;
    }


    //ارجاع عدد الصفوف في جدول معين
    public long getCarsCount(){
       // SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(database,MyDatabase.CAR_TB_NAME);
    }



    //دالة الحذف
    public boolean deleteCar(Car car) {
     //   SQLiteDatabase db = getWritableDatabase();//عملية الحذف تعتبر عملية قراءة


  //     ContentValues values = new ContentValues();
    //    values.put(CAR_CLN_MODEL, car.getModel());
    //    values.put(CAR_CLN_COLOR, car.getColor());
     //   values.put(CAR_CLN_DPL, car.getDp1());


        String args [] = {String.valueOf(car.getId())};
        int  result = database.delete (MyDatabase.CAR_TB_NAME,  "id=?", args);
        return result >0;
    }



    //دالة الاستراجاع
    public ArrayList <Car> getAllCars(){
        ArrayList<Car> cars = new ArrayList<>();
       // SQLiteDatabase db =  getReadableDatabase();
        Cursor cursor =   database.rawQuery( "SELECT *  FROM "+MyDatabase.CAR_TB_NAME , null);
        //كود التعامل مع ال Cursorوتحويله لمصفوفة من نوع Car
        //فحص هل ال Cursorيحتوي على بيانات

        if(cursor != null && cursor.moveToFirst()){
            do{
                int id = cursor.getInt(cursor.getColumnIndex(CAR_CLN_ID));
                String model = cursor.getString(cursor.getColumnIndex(CAR_CLN_MODEL));
                String color = cursor.getString(cursor.getColumnIndex(CAR_CLN_COLOR));
                double dbl   = cursor.getDouble(cursor.getColumnIndex(CAR_CLN_DPL));

                Car c = new Car(id,model,color,dbl);//ننشأ سيارة جديدة
                cars.add(c);
            }

            while (cursor.moveToNext());
            cursor.close();//غلق ال crusor حتى لايبقى مفتوح
        }

        return cars;
    }




    //دالة البحث
    //يرجى فصل دالة البحث عن الملف في ملف اخر
    public ArrayList <Car> getCars(String modelsearch){//البحث عن موديل السيارات
        ArrayList<Car> cars = new ArrayList<>();
      //  SQLiteDatabase db =  getReadableDatabase();
        Cursor cursor =   database.rawQuery( "SELECT *  FROM "+MyDatabase.CAR_TB_NAME+" WHERE "+MyDatabase.CAR_CLN_MODEL+" =? " ,new  String[]{modelsearch});

        if(cursor != null && cursor.moveToFirst()){
            do{
                int id = cursor.getInt(cursor.getColumnIndex(CAR_CLN_ID));
                String model = cursor.getString(cursor.getColumnIndex(CAR_CLN_MODEL));
                String color = cursor.getString(cursor.getColumnIndex(CAR_CLN_COLOR));
                double dbl   = cursor.getDouble(cursor.getColumnIndex(CAR_CLN_DPL));

                Car c = new Car(id,model,color,dbl);
                cars.add(c);
            }

            while (cursor.moveToNext());
            cursor.close();
        }

        return cars;
    }

     */

}
