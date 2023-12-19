package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder,Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    //db쿼리로 작성해본다면
    //select * from folder where user_id = 1 and name in('1', '2', '3'); folder DB에서 user_id가 1에서 이름이 1,2,3인 폴더는?
    List<Folder> findAllByuser(User user);


}
