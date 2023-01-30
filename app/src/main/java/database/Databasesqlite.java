package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class Databasesqlite extends SQLiteOpenHelper {
    public static final String DatabaseName="app.db";
    //counstractor

    public Databasesqlite(Context con)
    {
        super(con, DatabaseName,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //sqlدي الفيها دالة ال insert
        db.execSQL("create table student(id String ,password String)");

    }

    @Override
    //edite on table, avoid wrongs
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS student");
        onCreate(db);
    }
    public Boolean insert_data(String ID, String password){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        //عشان املي البيانات
        ContentValues Values = new ContentValues();
        Values.put("id",ID);
        Values.put("password",password);
        long result =sqLiteDatabase.insert("student",null,Values);
       if (result==-1) {
           return false;
       }
       else{
           return true;
       }
    }
    //عشان اعرض ال داتا الهيتعملها insert
    public Boolean checkID( String ID){

        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        //عشان اخزن الداتا و اعرضها  دا امر من اوامر ال داتا بيز
        Cursor c=sqLiteDatabase.rawQuery("select*from student where ID=?",new  String[]  {ID});
        if (c.getCount()>0){
            return true;}
        else {
            return false;
        }

        }
        public  Boolean checkIDPassword(String ID ,String password){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select*from student where ID=? and password=?",new String[]{ID,password});
if (cursor.getCount()>0) {
    return true;
}
else {
    return false;}

}

    }

