package com.mysite.sbb.jpatest;

import com.mysite.sbb.domain.Question;
import com.mysite.sbb.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JpaTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa(){
        // Given
        Question q1 = new Question();
        q1.setSubject("sbb가 뭐여");
        // When

        // Then
    }
}
