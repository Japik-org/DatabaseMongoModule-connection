package com.pro100kryto.server.modules.databasemongo.connection;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.pro100kryto.server.module.IModuleConnection;
import com.sun.istack.Nullable;

public interface IDatabaseMongoModuleConnection extends IModuleConnection {
    @Nullable
    MongoDatabase getMongoDatabase(String name);
    MongoIterable<String> getListDatabaseNames();
}
