package fantastic.philosophyQuiz.dataBase;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {fantastic.philosophyQuiz.dataBase.entity.MyQuestion.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lfantastic/philosophyQuiz/dataBase/LocalDB;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "myQuestionDao", "Lfantastic/philosophyQuiz/dataBase/dao/MyQuestionDao;", "Companion", "app-quiz_release"})
public abstract class LocalDB extends android.arch.persistence.room.RoomDatabase {
    private static fantastic.philosophyQuiz.dataBase.LocalDB INSTANCE;
    public static final fantastic.philosophyQuiz.dataBase.LocalDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract fantastic.philosophyQuiz.dataBase.dao.MyQuestionDao myQuestionDao();
    
    public LocalDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lfantastic/philosophyQuiz/dataBase/LocalDB$Companion;", "", "()V", "INSTANCE", "Lfantastic/philosophyQuiz/dataBase/LocalDB;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "app-quiz_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final fantastic.philosophyQuiz.dataBase.LocalDB getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}