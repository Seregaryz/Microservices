package ru.kpfu.itis.newsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.newsapp.models.FileInfo;


public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageFileName(String storageFileName);
}

