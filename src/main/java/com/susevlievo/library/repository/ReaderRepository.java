package com.susevlievo.library.repository;

import com.susevlievo.library.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {

    @Query(value = "SELECT * FROM reader " +
            "WHERE CONCAT(' ', upper(first_name), ' ', COALESCE(upper(middle_name), ''), ' ', upper(last_name), ' ') " +
            "LIKE '%' || upper(:name) || '%' OR " +
            "CONCAT(' ', upper(first_name), ' ', upper(last_name), ' ') " +
            "LIKE '%' || upper(:name) || '%'", nativeQuery = true)
    List<Reader> findReadersByFullName(@Param("name") String name);



;

}
