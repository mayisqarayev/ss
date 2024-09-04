package com.TapazApp.repository;

import com.TapazApp.entity.StickerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StickerTypeRepository extends JpaRepository<StickerTypeEntity, String > {

    @Transactional
    @Modifying
    @Query("UPDATE StickerTypeEntity a set a.stickerTypeStatus = false where a.id = ?1")
    void deleteStickerTypeById(String id);

}
