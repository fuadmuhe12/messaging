package com.kortex.messaging.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kortex.messaging.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    public List<Message> findAllByOrderByTimestampAsc();
}
