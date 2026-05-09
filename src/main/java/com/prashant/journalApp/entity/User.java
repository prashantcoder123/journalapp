package com.prashant.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "usersjournal")
@Data

public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true) //unique hona chaiye
    @NonNull//not null
    private String userName;
    @NonNull
    private String password;

    @DBRef //2 collection ko conenct krne ke liye
    private List<JournalEntry> journalEntryList = new ArrayList<>();


}
