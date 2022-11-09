package com.memospring.memospring;

import org.springframework.data.repository.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemoRepository extends Repository<Memo, Long> {

    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime fromTime, LocalDateTime toTime);
    Memo save(Memo meno);
    void deleteById(Long id);
    Optional<Memo> findById(Long id);
}
