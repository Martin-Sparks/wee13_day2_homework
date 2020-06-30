package com.example.codeclan.Filing_System.components;

import com.example.codeclan.Filing_System.models.File;
import com.example.codeclan.Filing_System.models.Folder;
import com.example.codeclan.Filing_System.models.User;
import com.example.codeclan.Filing_System.respositories.FileRepository;
import com.example.codeclan.Filing_System.respositories.FolderRepository;
import com.example.codeclan.Filing_System.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args){

        User user1 = new User("Martin");
        userRepository.save(user1);

        Folder folder1 = new Folder("FBI", user1);
        folderRepository.save(folder1);

        File file1 = new File("Case1", "txt", 20, folder1);
        fileRepository.save(file1);





    }
}
