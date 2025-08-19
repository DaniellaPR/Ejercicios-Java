package com.kaputt.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "KaputtDB.db";
    private static final int DB_VERSION = 6;


    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Usuario
        db.execSQL("CREATE TABLE USUARIO (" +
                "USU_ID TEXT PRIMARY KEY, " +
                "USU_nombre TEXT NOT NULL)");

        // Clasificación
        db.execSQL("CREATE TABLE CLASIFICACION (" +
                "CLA_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "CLA_nombre TEXT, " +
                "CLA_descr TEXT)");

        // Presupuesto
        db.execSQL("CREATE TABLE PRESUPUESTO (" +
                "PRE_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "PRE_monto REAL NOT NULL, " +
                "PRE_FechaIn TEXT NOT NULL, " +
                "PRE_FechaFn TEXT NOT NULL, " +
                "USU_ID TEXT NOT NULL, " +
                "FOREIGN KEY (USU_ID) REFERENCES USUARIO(USU_ID))");

        // Meta
        db.execSQL("CREATE TABLE META (" +
                "MET_idMeta INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "MET_nombre TEXT NOT NULL, " +
                "MET_descrip TEXT, " +
                "USU_ID TEXT NOT NULL, " +
                "FOREIGN KEY (USU_ID) REFERENCES USUARIO(USU_ID))");

        // Retos
        db.execSQL("CREATE TABLE RETOS (" +
                "RET_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "RET_nombre TEXT NOT NULL, " +
                "RET_descrip TEXT, " +
                "USU_ID TEXT NOT NULL, " +
                "FOREIGN KEY (USU_ID) REFERENCES USUARIO(USU_ID))");

        // Ingresos
        db.execSQL("CREATE TABLE INGRESOS (" +
                "ING_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "ING_monto REAL NOT NULL, " +
                "ING_desc TEXT, " +
                "ING_Fecha TEXT NOT NULL, " +
                "PRE_ID INTEGER NOT NULL, " +
                "FOREIGN KEY (PRE_ID) REFERENCES PRESUPUESTO(PRE_ID))");

        // Gastos
        db.execSQL("CREATE TABLE GASTOS (" +
                "GAS_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "GAS_monto REAL NOT NULL, " +
                "GAS_desc TEXT, " +
                "GAS_Fecha TEXT NOT NULL, " +
                "PRE_ID INTEGER NOT NULL, " +
                "FOREIGN KEY (PRE_ID) REFERENCES PRESUPUESTO(PRE_ID))");

        // Tabla intermedia
        db.execSQL("CREATE TABLE CLAS_GASTOS (" +
                "GAS_ID INTEGER, " +
                "CLA_ID INTEGER, " +
                "PRIMARY KEY (GAS_ID, CLA_ID), " +
                "FOREIGN KEY (GAS_ID) REFERENCES GASTOS(GAS_ID), " +
                "FOREIGN KEY (CLA_ID) REFERENCES CLASIFICACION(CLA_ID))");
    }

    // Usuario
    public boolean insertarUsuario(String id, String nombre) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("USU_ID", id);
        valores.put("USU_nombre", nombre);
        long resultado = db.insert("USUARIO", null, valores);
        return resultado != -1;
    }

    // Meta
    public boolean insertarMeta(String nombre, String descrip, String usuId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("MET_nombre", nombre);
        valores.put("MET_descrip", descrip);
        valores.put("USU_ID", usuId);
        long resultado = db.insert("META", null, valores);
        return resultado != -1;
    }

    // Retos
    public boolean insertarReto(String nombre, String descrip, String usuId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("RET_nombre", nombre);
        valores.put("RET_descrip", descrip);
        valores.put("USU_ID", usuId);
        long resultado = db.insert("RETOS", null, valores);
        return resultado != -1;
    }

    // Presupuesto
    public boolean insertarPresupuesto(double monto, String fechaIn, String fechaFn, String usuId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("PRE_monto", monto);
        valores.put("PRE_FechaIn", fechaIn);
        valores.put("PRE_FechaFn", fechaFn);
        valores.put("USU_ID", usuId);
        long resultado = db.insert("PRESUPUESTO", null, valores);
        return resultado != -1;
    }

    //Ingresos
    public boolean insertarIngreso(double monto, String descripcion, String fecha, int preId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("ING_monto", monto);
        valores.put("ING_desc", descripcion);
        valores.put("ING_Fecha", fecha);
        valores.put("PRE_ID", preId);
        long resultado = db.insert("INGRESOS", null, valores);
        return resultado != -1;
    }

    //Gastos
    public boolean insertarGasto(double monto, String descripcion, String fecha, int preId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("GAS_monto", monto);
        valores.put("GAS_desc", descripcion);
        valores.put("GAS_Fecha", fecha);
        valores.put("PRE_ID", preId);
        long resultado = db.insert("GASTOS", null, valores);
        return resultado != -1;
    }

    //CLasificacion
    public boolean insertarClasificacion(String nombre, String descripcion) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("CLA_nombre", nombre);
        valores.put("CLA_descr", descripcion);
        long resultado = db.insert("CLASIFICACION", null, valores);
        return resultado != -1;
    }

    //Tabla Intermedia
    public boolean insertarClasificacionGasto(int gasId, int claId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("GAS_ID", gasId);
        valores.put("CLA_ID", claId);
        long resultado = db.insert("CLAS_GASTOS", null, valores);
        return resultado != -1;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS CLAS_GASTOS");
        db.execSQL("DROP TABLE IF EXISTS GASTOS");
        db.execSQL("DROP TABLE IF EXISTS INGRESOS");
        db.execSQL("DROP TABLE IF EXISTS RETOS");
        db.execSQL("DROP TABLE IF EXISTS META");
        db.execSQL("DROP TABLE IF EXISTS PRESUPUESTO");
        db.execSQL("DROP TABLE IF EXISTS CLASIFICACION");
        db.execSQL("DROP TABLE IF EXISTS USUARIO");

        // Crea las tablas de nuevo
        onCreate(db);
    }

}