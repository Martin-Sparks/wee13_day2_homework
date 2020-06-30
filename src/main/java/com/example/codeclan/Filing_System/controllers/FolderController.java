package com.example.codeclan.Filing_System.controllers;

import com.example.codeclan.Filing_System.models.File;
import com.example.codeclan.Filing_System.models.Folder;
import com.example.codeclan.Filing_System.models.User;
import com.example.codeclan.Filing_System.respositories.FileRepository;
import com.example.codeclan.Filing_System.respositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value ="/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);

    }
        @GetMapping(value = "/folders/{id}")
        public ResponseEntity getFolders(@PathVariable Long id){
            return new ResponseEntity<> (folderRepository.findById(id), HttpStatus.OK);

    }

    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> postFolders(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/folder/{id}")
    public ResponseEntity<Folder> deleteFolder(@PathVariable Long id) {
        folderRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }


}
