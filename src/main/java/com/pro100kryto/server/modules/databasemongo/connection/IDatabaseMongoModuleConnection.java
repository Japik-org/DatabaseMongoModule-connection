package com.pro100kryto.server.modules.databasemongo.connection;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import com.pro100kryto.server.module.IModuleConnection;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.jetbrains.annotations.Nullable;

public interface IDatabaseMongoModuleConnection extends IModuleConnection {
    long estimatedCountDocuments(String collectionName);
    long countDocuments(String collectionName);
    long countDocuments(String collectionName, Bson filter);

    @Nullable Document findFirstDocument(String collectionName);
    @Nullable Document findFirstDocument(String collectionName, Bson filter);

    boolean existCollection(String collectionName);
    void createCollection(String collectionName);

    FindIterable<Document> findDocuments(String collectionName) throws IllegalArgumentException;
    FindIterable<Document> findDocuments(String collectionName, Bson filter) throws IllegalArgumentException;

    InsertOneResult insertDocument(String collectionName, Document document) throws MongoException;
    UpdateResult updateDocument(String collectionName, Bson filter, Bson update) throws MongoException;
    UpdateResult replaceDocument(String collectionName, Bson filter, Document document) throws MongoException;
}
