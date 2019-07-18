package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static class TodoNote implements BaseColumns{
        public static final String TABLE_NAME = "note";
        public static final String DATE = "date";
        public static final String CONTENT = "content";
        public static final String STATE = "state";
    }

    public static final String SQL_CREATE_NOTES =
            "CREATE TABLE " + TodoNote.TABLE_NAME + "("
            +TodoNote._ID +" INTEGER PRIMARY KEY,"
            +TodoNote.DATE + " INTEGER,"
            +TodoNote.STATE + " INTEGER,"
            +TodoNote.CONTENT + " TEXT)";

    private static final String SQL_DELETE_NOTES =
            "DROP TABLE IF EXISTS" + TodoNote.TABLE_NAME;

    private TodoContract() {
    }

}
