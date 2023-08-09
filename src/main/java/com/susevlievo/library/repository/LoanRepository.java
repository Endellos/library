package com.susevlievo.library.repository;

import com.susevlievo.library.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    @Transactional
    @Modifying
    @Query("update Loan l set l.returned = ?1 where l.id = ?2")
    void updateReturnedById(boolean returned, long id);

    Optional<Loan> findByBook_IdAndReturnedFalse(long id);

    //true=book is not available
    boolean existsByBook_IdAndReturnedFalse(long id);

    List<Loan> findByReader_Id(long id);




}
